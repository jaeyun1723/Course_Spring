package kfy.kfyspring;

import kfy.kfyspring.repository.MemberRepository;
import kfy.kfyspring.repository.MemoryMemberRepository;
import kfy.kfyspring.service.MemberService;
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
