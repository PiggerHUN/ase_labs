plugins {
    id("hu.bme.mit.ase.shingler.gradle.application")
}


dependencies {
    implementation(project(":logic"))

    implementation(libs.slf4j.api)
    implementation(libs.picocli)


    runtimeOnly(libs.log4j.slf4j.impl)

    testImplementation(libs.junit.jupiter.api)

    testRuntimeOnly(libs.junit.jupiter.engine)

}

application {
    mainClass = "hu.bme.mit.ase.shingler.similarity.SimilarityApp"
}
