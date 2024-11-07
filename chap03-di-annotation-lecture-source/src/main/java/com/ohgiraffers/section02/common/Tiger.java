package com.ohgiraffers.section02.common;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("호양이도 죽순을 먹어용");
    }
}
