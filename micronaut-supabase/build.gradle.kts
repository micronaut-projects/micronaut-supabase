plugins {
    id("io.micronaut.build.internal.supabase-module")
}
dependencies {
    api(mn.micronaut.http.client.core)
    testImplementation(mn.micronaut.http.client)

    // Serialization
    annotationProcessor(mnSerde.micronaut.serde.processor)
    api(mnSerde.micronaut.serde.api)
    api(mn.jackson.annotations)
    testImplementation(mnSerde.micronaut.serde.jackson)

    // Validation
    annotationProcessor(mnValidation.micronaut.validation.processor)
    api(mnValidation.validation) // jakarta.validation:jakarta.validation-api
    compileOnly(mnValidation.micronaut.validation)
    testImplementation(mnValidation.micronaut.validation)

    testImplementation(mn.micronaut.http.server.netty)
    testImplementation(platform(mnTest.boms.testcontainers))
    testImplementation(libs.testcontainers)
    testImplementation(libs.testcontainers.junit.jupiter)
}
