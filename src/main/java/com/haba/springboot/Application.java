package com.haba.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 아래 annotation은 스프링 부트의 자동 설정
// 스프링 Bean 읽기와 생성을 모두 자동으로 해줍니다
// SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에
// 이 클래스는 항상 프로젝트의 최상단에 위치해야 합니다
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 아래 코드를 통해 내장 WAS를 실행
        // 서버에 톰캣을 설치할 필요가 없게되고, 스프링 부트로 만들어진
        // Jar 파일로 실행하면 됨.
        // 꼭 스프링 부트에서만 내장 WAS를 사용할 수 있는 것은 아니지만
        // 스프링 부트에서는 내장 WAS를 사용하는 것을 권장함.
        // ->  언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때문임
        SpringApplication.run(Application.class, args);
    }
}
