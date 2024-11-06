package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data > 위의 5 가지를 한 번에 등록하게 만드는 키워드이다.
// 하지만 Lombok 자체의 버그가 많아 권장하지 않음
public class MemberDTO {

    private int no;
    private String id;
    private String pwd;
    private String name;


}
/* title. */
/* comment. */
/* index. */