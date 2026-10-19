plugins {
    id("io.micronaut.build.internal.supabase-base")
    id("io.micronaut.build.internal.bom")
}
micronautBuild {
    // New module: there is no previously published release to compare against.
    binaryCompatibility {
        enabled.set(false)
    }
}
