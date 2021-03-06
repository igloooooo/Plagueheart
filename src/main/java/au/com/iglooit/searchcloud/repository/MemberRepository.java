package au.com.iglooit.searchcloud.repository;

import au.com.iglooit.searchcloud.domain.Member;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Member entity.
 */
public interface MemberRepository extends JpaRepository<Member,Long> {

}
