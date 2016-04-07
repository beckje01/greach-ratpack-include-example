import static ratpack.groovy.Groovy.ratpack

ratpack {
	handlers {
		path("users") {
			byMethod {
				get {
					render "GET on users"
				}
				post {
					render "POST on users"
				}
			}
		}
	}
}