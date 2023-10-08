package kfy.kfyspring.repository;

import java.util.List;
import java.util.Optional;
import kfy.kfyspring.domain.Member;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional : null 반환도 생각
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
