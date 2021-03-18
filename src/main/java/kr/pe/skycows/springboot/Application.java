package kr.pe.skycows.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication //어노테이션을 추가해서 boot app으로 만듬
public class Application {
    //run은 당연히 static
    public static void main(String[] args){
        //해당 어플리케이션의 Application.class과 아규먼트를 집어 넣어 주면 스프링부트 설정끝
        SpringApplication.run(Application.class, args);
    }
}



