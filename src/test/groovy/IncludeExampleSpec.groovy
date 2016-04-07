import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import ratpack.test.ApplicationUnderTest
import ratpack.test.http.TestHttpClient
import spock.lang.Specification

class IncludeExampleSpec extends Specification {

	ApplicationUnderTest aut = new GroovyRatpackMainApplicationUnderTest()

	@Delegate
	TestHttpClient client

	def setup() {
		client = aut.getHttpClient()
	}

	def "check hellow"() {
		when:
		def resp = getText()

		then:
		resp == "Hello World"
	}

	def "check user include"() {
		when:
		def resp = getText("users")

		then:
		resp == "GET on users"
	}

	def "check catch all "() {
		when:
		def resp = getText("junk")

		then:
		resp == "Catch All"
	}

	def "check stuff include"() {
		when:
		def resp = getText("stuff")

		then:
		resp == "Catch All"
		//This happens due to the ordering of includes vs the handlers block in ratpack.groovy
	}
}
