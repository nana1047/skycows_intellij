package kr.pe.skycows.springboot.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
    /*
    //final이므로 값을 할당하지 않으면 문법적 오류, 생성자로 초기화함.
    //그래나 뻔한 코드로 코드 복잡도가 높아지므로
    //어노테이션을 이용해 롬복 주입 후 사용해 생성자를 자동으로 만들어 오류를 해결
    public HelloResponseDto(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    */
}
