package hello.example;

import hello.example.discountpolicy.DiscountPolicy;
import hello.example.discountpolicy.RateDiscountPolicy;
import hello.example.member.MemberRepository;
import hello.example.member.MemberService;
import hello.example.member.MemberServiceImpl;
import hello.example.member.MemoryMemberRepository;
import hello.example.order.OrderService;
import hello.example.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
