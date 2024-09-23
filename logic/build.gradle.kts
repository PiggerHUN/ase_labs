plugins {
    id("hu.bme.mit.ase.shingler.gradle.application")
}

dependencies {
    implementation("libs.slf4j.api")
    implementation("libs.picocli")
    implementation(project(":lib"))

    runtimeOnly("libs.log4j.slf4j.impl")

    testImplementation("libs.junit.jupiter.api")

    testRuntimeOnly("libs.junit.jupiter.engine")

}


