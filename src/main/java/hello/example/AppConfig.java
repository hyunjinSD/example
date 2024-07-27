package hello.example;

import hello.example.discountpolicy.DiscountPolicy;
import hello.example.discountpolicy.RateDiscountPolicy;
import hello.example.member.MemberRepository;
import hello.example.member.MemberService;
import hello.example.member.MemberServiceImpl;
import hello.example.member.MemoryMemberRepository;
import hello.example.order.OrderService;
import hello.example.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
