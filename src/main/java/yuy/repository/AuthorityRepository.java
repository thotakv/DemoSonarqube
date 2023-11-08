package yuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yuy.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
