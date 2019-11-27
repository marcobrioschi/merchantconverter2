package biz.brioschi.merchantconverter.usecase

import biz.brioschi.merchantconverter.model.IntergalacticStringMapper
import spock.lang.Specification

class SymbolDeclarationUseCaseSpec extends Specification {

    def "Declare a symbol encoding"() {

        given:
        IntergalacticStringMapper mapper = Mock()
        SymbolDeclarationUseCase useCase = new SymbolDeclarationUseCase(mapper)

        when:
        useCase.symbolDeclare("string", "X")

        then:
        1 * mapper.addMapping("string", "X")
        0 * _

    }

}
