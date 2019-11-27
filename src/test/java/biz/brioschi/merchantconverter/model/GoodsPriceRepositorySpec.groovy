package biz.brioschi.merchantconverter.model

import spock.lang.Specification

class GoodsPriceRepositorySpec extends Specification {

    GoodsPriceRepository repository = new GoodsPriceRepository()

    def "Add a new goods price"() {
        when:
        repository.addGoodsPrice( new GoodsPrice( "test", 10.0) )

        then:
        noExceptionThrown()
    }

    def "Redefine a goods price"() {
        when:
        repository.addGoodsPrice( new GoodsPrice("foo", 10.0) )
        repository.addGoodsPrice( new GoodsPrice("foo", 20.0) )

        then:
        thrown(ConverterException.class)
    }

    def "The goods isn't in the repository"() {
        given:
        repository.addGoodsPrice( new GoodsPrice("foo", 10.0) )
        repository.addGoodsPrice( new GoodsPrice("bar", 10.0) )

        when:
        Optional<Double> result = repository.getGoodsPrice("a_name");

        then:
        assert result.isPresent() == false
    }

    def "Read an existing goods price"() {
        given:
        repository.addGoodsPrice( new GoodsPrice("foo", 10.0) )
        repository.addGoodsPrice( new GoodsPrice("bar", 10.0) )

        when:
        Optional<Double> result = repository.getGoodsPrice("foo");

        then:
        assert result.isPresent() == true
        assert result.get() == 10.0
    }

}
