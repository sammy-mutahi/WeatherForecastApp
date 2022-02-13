apply{
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(Navigation.navigationFragmentUi)
    "implementation"(Navigation.navigationUi)
}