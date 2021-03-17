package Sptring_Introduction.hellospring;

import Sptring_Introduction.hellospring.aop.TimeTraceAop;
import Sptring_Introduction.hellospring.repository.MemberRepository;
import Sptring_Introduction.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


/*  JBA
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    /*
    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }


/*    @Bean
    public MemberRepository memberRepository() {
 *//*       return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);*//*
*//*      return new JdbcTemplateMemberRepository(dataSource); *//*
        return new JbaMemberRepository(em);
    }*/

}
