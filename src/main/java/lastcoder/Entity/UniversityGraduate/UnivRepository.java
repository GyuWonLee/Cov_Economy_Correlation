package lastcoder.Entity.UniversityGraduate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnivRepository extends JpaRepository<UniversityGraduate, UniversityGraduateMK> {

}
