* @Configuration = replaces applicationContext.xml
* @Bean = defines spring beans
* Setter and cTor injection
*********
5 Scopes:
Valid in any configuration
- Singleton: default | one instance per spring container 
  - @Scope requires AOP jar
- Propotypes: new bean per request | guaranteed unique instance
Valid only in web-aware spring project
- Request: per HTTP request
- Session: per User Session
- Global: 

- @Autowire
# Sterotypes
- We had Beans configured in AppConfig and dependencies Autowired. Let's remove it using (technically all still Beans or Components):
  - @Component
  - @Repository
  - @Service
  - Also @Controller
-- @Bean applicable only at method level not class level (at class level only sterotype annotation is applicable)
 - https://stackoverflow.com/questions/10604298/spring-component-versus-bean  
 # XML Configuration
 - Autowire - spring automatically autowires, by Name, by type, by ctor, no or none