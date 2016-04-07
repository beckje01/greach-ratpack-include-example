import static ratpack.groovy.Groovy.ratpack

ratpack {
	handlers {
		path("stuff") {
			byMethod {
				get {
					render "GET on stuff"
				}
				post {
					render "POST on stuff"
				}
			}
		}
	}
}