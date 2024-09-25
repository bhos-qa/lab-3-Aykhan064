plugins {
    kotlin("jvm") version "1.9.22"
    id("jacoco")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.0")
}

tasks.jacocoTestReport {
    dependsOn(tasks.test) 
    reports {
        xml.required.set(true) 
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }
}

kotlin {
    jvmToolchain(21)
}
