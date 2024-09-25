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
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport) // Run jacocoTestReport after test
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}

jacoco {
    toolVersion = "0.8.11" // Use the latest stable version of Jacoco
}

sonarqube {
    properties {
        property("sonar.projectKey", "lab-3-Aykhan064")
        property( "sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.login", project.findProperty("sonar.login") ?: "")
    }
}
