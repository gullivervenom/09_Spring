package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary //2개 이상 설정하게 되면 런타임 에러 발생
@Order(1)
public class Panda implements Animal{
    @Override
    public void eat() {
        System.out.println("팬더가 죽순을 냠냠 쩝쩝 먹어용 헤헤");
    }
}
