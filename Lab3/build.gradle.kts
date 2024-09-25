plugins {
    kotlin("jvm") version "1.9.22"
    id("jacoco")
    id("org.sonarqube") version "4.0.0.2929"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.0")
    implementation("com.google.guava:guava:31.0.1-jre")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
    }
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}

kotlin {
    jvmToolchain(21)
}

jacoco {
    toolVersion = "0.8.11" // Use the latest stable version of Jacoco
}

sonarqube {
    properties {
        property("sonar.projectKey", "lab-3-Aykhan064")
        property("sonar.projectName", "lab-3-Aykhan064")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.sourceEncoding", "UTF-8")
        property("sonar.language", "kotlin")
    }
}
