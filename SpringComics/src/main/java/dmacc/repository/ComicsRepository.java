package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Comic;

@Repository
public interface ComicsRepository extends JpaRepository<Comic, Long> {
}
