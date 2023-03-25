package com.example.sampleclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//위의 예는 일반적인 스프링 부트 응용 프로그램을 보여줍니다.
// 클래스 경로에 spring-cloud-starter-netflix-eureka-client가 있으면 애플리케이션이 자동으로 유레카 서버에 등록됩니다.
public class SampleClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleClientServiceApplication.class, args);
    }

}
