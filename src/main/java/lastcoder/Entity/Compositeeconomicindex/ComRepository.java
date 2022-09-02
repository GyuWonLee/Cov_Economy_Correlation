package lastcoder.Entity.Compositeeconomicindex;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComRepository extends JpaRepository<Compositeeconomicindex, CompositeeconomicindexMK> {
		
	List<Compositeeconomicindex> findByCompositeeconomicindexMKYear(String year);
}
	