val newBuildDir: Directory =
    rootProject.layout.buildDirectory
        .dir("../../build")
        .get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
    project.layout.buildDirectory.value(newSubprojectBuildDir)
}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}

plugins {
    id("vkid.manifest.placeholders") version "1.1.0" apply true
}

val localProperties = java.util.Properties()
val localPropertiesFile = rootProject.file("local.properties")
if (localPropertiesFile.exists()) {
    localProperties.load(localPropertiesFile.reader())
}

vkidManifestPlaceholders {
    init(
        clientId = localProperties["VKIDClientID"] as String,
        clientSecret = localProperties["VKIDClientSecret"] as String,
    )
}