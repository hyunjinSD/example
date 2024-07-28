package hello.example.discountpolicy;

import hello.example.member.Grade;
import hello.example.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 5;
    private int discountPercent2 = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.BASIC) {
            return price * discountPercent / 100;
        } else if(member.getGrade() == Grade.VIP) {
            return price * discountPercent2 / 100;
        }else {
            return 0;
        }
    }
}
