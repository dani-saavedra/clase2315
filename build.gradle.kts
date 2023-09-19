plugins {
	java
	id("org.springframework.boot") version "2.7.14"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "co.edu.unisabana"
version = "0.0.2-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("net.logstash.logback:logstash-logback-encoder:7.2")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("mysql:mysql-connector-java:8.0.32")
	annotationProcessor("org.projectlombok:lombok:1.18.28")
	testImplementation("com.h2database:h2:2.2.220")
	implementation("org.projectlombok:lombok:1.18.28")
	implementation("io.micrometer:micrometer-registry-new-relic:1.11.3")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
