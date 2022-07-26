package com.conference;

import com.conference.date_220728.ChangeStringToNumber;
import com.conference.test.완주하지못한선수;

public class Main {
    public static void main(String[] args) {
        /* 프로그램 메인 */
        /* 메소드이름 , 좋은 방법 없을까!?
            문제가 뭐냐?
            메인에서 돌릴 메서드는 동일하고
            메소드는 하나에 하나의 역할만한다.
        */

        /*
            같은 부모를 가진 클래스(자식 클래스를 말하는것임)는
            부모클래스의 틀에 자식 객체를 주입(자식 객체를 생성) 받아서
            동일하게 사용할 수 있다
            그래서,?
            결론은 유연하게 사용할 수 있다.
            메인에는
            해당 클래스를 생성하면 생성자함수로 출력하는 함수를 만들어
            장단점이있다
            인터페이스, abstract를 사용하는 이유는
            추상화를 하기 위해서이다.

            추상화를 하면 뭐가좋냐 ? 이걸 이펙티브자바를 보면서 공부하자!!!!
        */

        ChangeStringToNumber cst = new ChangeStringToNumber();
        int result = cst.solution("1twothree4three");
        System.out.println(result);

        System.out.println("test1test2".replace("test", "3"));
    }
}
