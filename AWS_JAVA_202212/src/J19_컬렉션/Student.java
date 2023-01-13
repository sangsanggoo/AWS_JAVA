package J19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor //기본 생성자
//@RequiredArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@AllArgsConstructor //전체 생성자
@Data
public class Student {
	// @Getter 변수하나에만 하고 싶으면 변수 위에 적으면 가능
	private String name; // 이름
	private int year; // 학년

}
