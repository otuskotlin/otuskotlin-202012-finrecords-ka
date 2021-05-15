plugins {
    kotlin("jvm")
}

group = project.group
version = project.version

dependencies {
    val junitVersion: String by project
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test-junit5"))
    testImplementation(platform("org.junit:junit-bom:$junitVersion"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
