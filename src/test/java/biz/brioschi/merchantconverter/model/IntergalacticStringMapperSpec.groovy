package biz.brioschi.merchantconverter.model


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
        thrown(ConverterException)
    }

    def "I add a string with two different symbol mapping"() {
        when:
        mapper.addMapping("zxkkjd", "V")
        mapper.addMapping("zxkkjd", "X")

        then:
        thrown(ConverterException)
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
        thrown(ConverterException)

        where:
        sequence                        |_
        [ "aav" ]                       |_
        [ "aax", "aav", "aai" ]         |_
        [ "aax", "zzv", "zzi" ]         |_
        [ "zzx", "aav", "zzi" ]         |_
        [ "zzx", "zzv", "aai" ]         |_

    }

    @Unroll
    def "I translate a sequence with all elements known but invalid [#sequence]"(def sequence) {

        given:
        populateMapperWith_zz()

        when:
        mapper.translateSequence(sequence)

        then:
        thrown(ConverterException)

        where:
        sequence                        |_
        [ ]                             |_
        [ "zzx", "zzm" ]                |_
        [ "zzc", "zzi", "zzm" ]         |_
        [ "zzi", "zzi", "zzi", "zzi" ]  |_

    }

    @Unroll
    def "I translate a sequence with all elements known [#sequence=#value]"(def sequence, int value) {

        given:
        populateMapperWith_zz()

        when:
        int result = mapper.translateSequence(sequence)

        then:
        assert result == value

        where:
        sequence                                                                        |   value

        // 10 Random,  (goolge generator)
        [ "zzm", "zzm", "zzm", "zzc", "zzd", "zzl", "zzx", "zzx", "zzi" ]               |       3471
        [ "zzm", "zzm", "zzm", "zzd", "zzc", "zzc", "zzx", "zzi" ]                      |       3711
        [ "zzc", "zzc", "zzc", "zzx", "zzc", "zzi", "zzx" ]                             |       399
        [ "zzm", "zzm", "zzx", "zzx", "zzx", "zzv" ]                                    |       2035
        [ "zzd", "zzc", "zzc", "zzc", "zzl", "zzx", "zzx", "zzv", "zzi", "zzi" ]        |       877
        [ "zzm", "zzd", "zzx" ]                                                         |       1510
        [ "zzd", "zzc", "zzl", "zzx", "zzx", "zzx", "zzi" ]                             |       681
        [ "zzm", "zzm", "zzl", "zzx", "zzx", "zzi", "zzi", "zzi" ]                      |       2073
        [ "zzm", "zzm", "zzd", "zzc", "zzc", "zzx", "zzv" ]                             |       2715
        [ "zzm", "zzd", "zzc", "zzc", "zzx", "zzi", "zzx" ]                             |       1719

        // Napoléon Bonaparte
        [ "zzm", "zzd", "zzc", "zzc", "zzl", "zzx", "zzi", "zzx" ]                      |       1769
        [ "zzm", "zzd", "zzc", "zzc", "zzx", "zzc", "zzi", "zzx" ]                      |       1799
        [ "zzm", "zzd", "zzc", "zzc", "zzc", "zzi", "zzv" ]                             |       1804
        [ "zzm", "zzd", "zzc", "zzc", "zzc", "zzx", "zzv" ]                             |       1815
        [ "zzm", "zzd", "zzc", "zzc", "zzc", "zzx", "zzx", "zzi" ]                      |       1821

    }

}
