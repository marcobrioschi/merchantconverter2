package biz.brioschi.merchantconverter.model

import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

class IntergalacticStringMapperSpec extends Specification{

    IntergalacticStringMapper mapper = new IntergalacticStringMapper()

    def "I add a mapping for the first time"() {
        when:
        mapper.addMapping("jkfdkj", "I")

        then:
        noExceptionThrown();
    }

    def "I redefine a symbol mapping twice"() {
        when:
        mapper.addMapping("komokm", "V" )
        mapper.addMapping("alalal", "V" )

        then:
        thrown(MapperException)
    }

    def "I add a string with two different symbol mapping"() {
        when:
        mapper.addMapping("zxkkjd", "V")
        mapper.addMapping("zxkkjd", "X")

        then:
        thrown(MapperException)
    }

    private void populateMapperWith_zz() {
        ["I", "V", "X", "L", "C", "D", "M"].each {
            mapper.addMapping("zz${it.toLowerCase()}", it)
        }
    }

    @Unroll
    def "I translate a sequence with not all the elements known [#sequence]"(def sequence) {

        given:
        populateMapperWith_zz()

        when:
        mapper.translateSequence(sequence)

        then:
        thrown(MapperException)

        where:
        sequence                        |_
        [ "aav" ]                       |_
        [ "aax", "aav", "aai" ]         |_
        [ "aax", "zzv", "zzi" ]         |_
        [ "zzx", "aav", "zzi" ]         |_
        [ "zzx", "zzv", "aai" ]         |_

    }

    // TODO: aggiungere un po' di casi
    def "I translate a sequence with all elements known but invalid (also the empty sequence)"() {

        given:
        populateMapperWith_zz()

        when:
        mapper.translateSequence([ "zzx", "zzm" ])

        then:
        thrown(MapperException)

    }

    @Ignore
    def "I translate a sequence with all elements known"() {
        expect:
        assert true == false
    }

}
