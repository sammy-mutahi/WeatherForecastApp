apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(Lint.lintApi)
    "implementation"(Lint.lintCheck)
}