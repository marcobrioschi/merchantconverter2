package biz.brioschi.merchantconverter.usecase

import biz.brioschi.merchantconverter.model.GoodsPriceRepository
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper
import spock.lang.Specification

class GoodsTradingUseCaseSpec extends Specification {

    def "When user asks about the price the system calculate them"() {

        given:
        IntergalacticStringMapper mapper = Mock()
        GoodsPriceRepository repository = Mock()
        GoodsTradingUseCase useCase = new GoodsTradingUseCase(mapper, repository)

        when:
        Optional<Double> result = useCase.goodsTrading("foobar", ["111", "444" ])

        then:
        mapper.translateSequence([ "111", "444" ]) >> 50
        repository.getGoodsPrice("foobar") >> Optional.of(0.2 )
        assert result.get() == 10

    }

    def "If the goods isn't in the repository return an empty Optional"() {

        given:
        IntergalacticStringMapper mapper = Mock()
        GoodsPriceRepository repository = Mock()
        GoodsTradingUseCase useCase = new GoodsTradingUseCase(mapper, repository)

        when:
        Optional<Double> result = useCase.goodsTrading("java", ["RR", "T" ])

        then:
        mapper.translateSequence([ "RR", "T" ]) >> 50
        repository.getGoodsPrice("java") >> Optional.empty()
        assert result.isPresent() == false

    }

}
