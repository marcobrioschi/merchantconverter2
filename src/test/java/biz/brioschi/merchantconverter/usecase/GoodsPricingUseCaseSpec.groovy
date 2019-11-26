package biz.brioschi.merchantconverter.usecase

import biz.brioschi.merchantconverter.model.GoodsPrice
import biz.brioschi.merchantconverter.model.GoodsPriceRepository
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper
import spock.lang.Specification

class GoodsPricingUseCaseSpec extends Specification {

    def "When user declare a goods pricing whe store it"() {

        GoodsPrice gpParam

        given:
        IntergalacticStringMapper mapper = Mock()
        GoodsPriceRepository repository = Mock()
        GoodsPricingUseCase useCase = new GoodsPricingUseCase(mapper, repository)

        when:
        useCase.goodsPricing("the_silver", [ "zzz", "yyy" ], 60)

        then:
        1 * mapper.translateSequence([ "zzz", "yyy" ]) >> 42
        1 * repository.addGoodsPrice(_) >> { GoodsPrice gp -> gpParam = gp }
        assert gpParam.getName() == "the_silver"
        assert gpParam.price == 0.7

    }

}
