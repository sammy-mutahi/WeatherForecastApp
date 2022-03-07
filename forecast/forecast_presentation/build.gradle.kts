apply{
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(Coil.coilCompose)
}