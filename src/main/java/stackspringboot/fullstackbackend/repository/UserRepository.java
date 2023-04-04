package stackspringboot.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stackspringboot.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
