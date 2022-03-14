apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(project(Modules.coreUi))
    "implementation"(Coil.coilCompose)
    "implementation"(Location.location)
}