package biz.brioschi.merchantconverter.shell;

import biz.brioschi.merchantconverter.shell.MerchantShellVisitor;
import biz.brioschi.merchantconverter.antlr.merchantshellLexer;
import biz.brioschi.merchantconverter.antlr.merchantshellParser;
import biz.brioschi.merchantconverter.model.GoodsPriceRepository;
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.Optional;

public class MerchantShell {

    private final IntergalacticStringMapper mapper = new IntergalacticStringMapper();
    private final GoodsPriceRepository priceRepository = new GoodsPriceRepository();

    public Optional<String> parseLine(String line) {
        try {
            merchantshellLexer lexer = new merchantshellLexer(CharStreams.fromString(line));
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            merchantshellParser parser = new merchantshellParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());
            merchantshellParser.StartContext ctx = parser.start();
            MerchantShellVisitor visitor = new MerchantShellVisitor(mapper, priceRepository);
            Optional<String> result = visitor.visitStart(ctx);
            return result;
        } catch (ParseCancellationException e) {
            return MerchantShellVisitor.getDefaultErrorMessage();
        }
    }

}
