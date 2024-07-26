package hello.example.discountpolicy;

import hello.example.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int Price);
}
