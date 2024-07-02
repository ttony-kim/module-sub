Main에 주입해주는 Module 프로젝트
===============================
### 1. build.gradle
```java
dependencies {
  ...
  implementation 'org.springframework.boot:spring-boot-starter-web:3.2.5'
  ...
}
```
spring 프로젝트 이기 때문에 __version 명시__
### 2. ModuleConfig.java
``` java
@AutoConfiguration
@ComponentScan
@EntityScan("org.example")
@EnableJpaRepositories("org.example")
public class ModuleConfig {
}
```
__@ComponentScan__ : ModuleConfig 파일이 있는 path 부터 하위 위치까지 Component를 scan하기 위해   
__@EntityScan, @EntityJpaRepositories__ : Main프로젝트에서 Entity와 JpaRepository를 읽어 @Bean으로 생성

### 3. org.springframework.boot.autoconfigure.AutoConfiguration.imports
```
org.example.ModuleConfig
```
__Path__: /resources/META-INF/spring   
Main에서 Run시 __ModuleConfig 파일을 읽기__ 위해 설정

#### 참고

> https://lordofkangs.tistory.com/316   
> https://velog.io/@kkywalk2/%EB%8B%A4%EB%A5%B8-package%EC%9D%98-spring-component-%EC%8A%A4%EC%BA%94%ED%95%98%EA%B8%B0
