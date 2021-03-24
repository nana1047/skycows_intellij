package kr.pe.skycows.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Getter //gettter자동생성, @Setter는 사용안함:객체불변의 법칙
@NoArgsConstructor //생성자 자동추가 public Posts(){}와 같은 효과
@Builder //해당 클래스의 빌더 패턴 클래스를 생성,
         //생성자함수 위에 사용시 생성자에 포함된 필드만 빌더에 포함, 클래스위에 사용시 전부다 적용.
@Entity //엔티티(객체)로 선언
public class Posts {

    private Long id;
    private String title;
    private String content;
    private String author;
}
