package biz.brioschi.merchantconverter.usecase

import biz.brioschi.merchantconverter.model.IntergalacticStringMapper
import spock.lang.Specification

class SymbolConversionUseCaseSpec extends Specification {

    def "When the user ask decode numbers"() {

        given:
        IntergalacticStringMapper mapper = Mock()
        SymbolConversionUseCase useCase = new SymbolConversionUseCase(mapper)

        when:
        useCase.symbolConversion([ "a", "z" ])

        then:
        1 * mapper.translateSequence([ "a", "z" ])
        0 *_

    }

}
