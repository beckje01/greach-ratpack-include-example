import static ratpack.groovy.Groovy.ratpack

ratpack {
	bindings {
	}

	include("stuff.groovy")

	handlers {
		get {
			render "Hello World"
		}
		all {
			render "Catch All"
		}
	}

	include("users.groovy")
}


