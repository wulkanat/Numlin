package complex

val Double.j get() = ComplexDouble(0.0, this)
val Int.j get() = TODO()