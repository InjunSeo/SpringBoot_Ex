package Sptring_Introduction.hellospring;

import Sptring_Introduction.hellospring.repository.MemberRepository;
import Sptring_Introduction.hellospring.repository.MemoryMemberRepository;
import Sptring_Introduction.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
