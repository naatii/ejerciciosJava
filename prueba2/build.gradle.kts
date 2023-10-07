plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.mockito/mockito-core
    testImplementation ("org.mockito', name: 'mockito-core', version: '5.5.0")
    testImplementation("org.testng:testng:7.1.0")

}

tasks.test {
    useJUnitPlatform()
}