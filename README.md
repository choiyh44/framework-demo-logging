# framework-demo-logging
- 스프링부트는 기본으로 logback 설정을 가지고있다. (in spring-boot-2.5.1.jar)
- 기본 설정만으로 로깅이 훌륭히 동작하지만, 설정을 변경하고 싶을때는
  - 스프링부트에서 제공하는 로깅 프로퍼티들로 설정변경을 할 수 있다.(application.properties나 application.yaml에 등록하면 쉽다.)
    - logging.exception-conversion-word: The conversion word used when logging exceptions. 
    - logging.file.name: If defined, it is used in the default log configuration.
    - logging.file.path: If defined, it is used in the default log configuration.
    - logging.pattern.console: The log pattern to use on the console (stdout).
    - logging.pattern.dateformat: Appender pattern for log date format.
    - logging.pattern.level: The format to use when rendering the log level (default %5p).	
    - 전체항목은 https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.logging, 4.8절 참조
  - 별도의 logback 설정파일을 작성한다.
    - 이 경우 src/main/resources 디렉토리 아래에 logback-spring.xml, logback-spring.groovy, logback.xml, logback.groovy 이름으로 설정파일을 작성하거나
    - logging.config 프로퍼티에 설정한 경로명으로 설정파일을 작성한다.
    - 비추천되는 명칭은 logback.xml이다. 이 이름으로 설정파일 작성하면 spring boot이 logback extension을 사용할 수 없으므로 절대 이 이름으로 설정파일 작성하지 말자.
    - 별도의 logback 설정을 작성할때도 스프링부트에서 제공하는 설정파일을 <include>해서 활용하면 수고를 절약할 수 있다.
    
