package biz.brioschi.merchantconverter.shell;

import biz.brioschi.merchantconverter.antlr.merchantshellBaseVisitor;
import biz.brioschi.merchantconverter.antlr.merchantshellParser;
import biz.brioschi.merchantconverter.model.ConverterException;
import biz.brioschi.merchantconverter.model.GoodsPriceRepository;
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper;
import biz.brioschi.merchantconverter.usecase.GoodsPricingUseCase;
import biz.brioschi.merchantconverter.usecase.GoodsTradingUseCase;
import biz.brioschi.merchantconverter.usecase.SymbolConversionUseCase;
import biz.brioschi.merchantconverter.usecase.SymbolDeclarationUseCase;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MerchantShellVisitor extends merchantshellBaseVisitor {

    private final static  String ERROR_MESSAGE = "I have no idea what you are talking about";

    public static Optional<String> getDefaultErrorMessage() {
        return Optional.of(ERROR_MESSAGE);
    }

    private final IntergalacticStringMapper mapper;
    private final GoodsPriceRepository priceRepository;

    public MerchantShellVisitor(IntergalacticStringMapper mapper, GoodsPriceRepository priceRepository) {
        this.mapper = mapper;
        this.priceRepository = priceRepository;
    }

    @Override
    public Optional<String> visitStart(merchantshellParser.StartContext ctx) {
        return visitCommandline(ctx.commandline());
    }

    @Override
    public Optional<String> visitCommandline(merchantshellParser.CommandlineContext ctx) {
        if (ctx.symboldeclaration() != null) {
            return visitSymboldeclaration(ctx.symboldeclaration());
        } else if (ctx.symbolconversion() != null) {
            return visitSymbolconversion(ctx.symbolconversion());
        } else if (ctx.goodspricing() != null) {
            return visitGoodspricing(ctx.goodspricing());
        } else if (ctx.goodstrading() != null) {
            return visitGoodstrading(ctx.goodstrading());
        } else {
            return getDefaultErrorMessage();
        }
    }

    @Override
    public Optional<String> visitSymboldeclaration(merchantshellParser.SymboldeclarationContext ctx) {
        try {
            String symbol = ctx.symbol.getText();
            String romanChar = ctx.ROMANCHAR().getText();
            SymbolDeclarationUseCase useCase = new SymbolDeclarationUseCase(mapper);
            useCase.symbolDeclare(symbol, romanChar);
            return Optional.empty();
        } catch (ConverterException e) {
            return getDefaultErrorMessage();
        }
    }

    @Override
    public Optional<String> visitSymbolconversion(merchantshellParser.SymbolconversionContext ctx) {
        try {
            List<String> symbols = ctx.symbols
                    .stream()
                    .map(tk -> tk.getText())
                    .collect(Collectors.toList());
            SymbolConversionUseCase useCase = new SymbolConversionUseCase(mapper);
            int value = useCase.symbolConversion(symbols);
            String response = symbols.stream().collect(Collectors.joining(" "));
            response += " is ";
            response += String.valueOf(value);
            return Optional.of(response);
        } catch (ConverterException e) {
            return getDefaultErrorMessage();
        }
    }

    @Override
    public Optional<String> visitGoodspricing(merchantshellParser.GoodspricingContext ctx) {
        try {
            List<String> symbols = ctx.symbols
                    .stream()
                    .map(tk -> tk.getText())
                    .collect(Collectors.toList());
            String goodsName = ctx.goods.getText();
            int credits = Integer.valueOf( ctx.credits.getText() );
            GoodsPricingUseCase useCase = new GoodsPricingUseCase(mapper, priceRepository);
            useCase.goodsPricing(goodsName, symbols, credits);
            return Optional.empty();
        } catch (ConverterException e) {
            return getDefaultErrorMessage();
        }
    }

    @Override
    public Optional<String> visitGoodstrading(merchantshellParser.GoodstradingContext ctx) {
        try {
            List<String> symbols = ctx.symbols
                    .stream()
                    .map(tk -> tk.getText())
                    .collect(Collectors.toList());
            String goodsName = ctx.goods.getText();
            GoodsTradingUseCase useCase = new GoodsTradingUseCase(mapper, priceRepository);
            Optional<BigDecimal> value = null;
            value = useCase.goodsTrading(goodsName, symbols);
            if (value.isPresent()) {
                String response = symbols.stream().collect(Collectors.joining(" "));
                response += " " + goodsName + " is ";
                response += value.get().toString();
                response += " Credits";
                return Optional.of(response);
            } else {
                return getDefaultErrorMessage();
            }
        } catch (ConverterException e) {
            return getDefaultErrorMessage();
        }
    }

}
