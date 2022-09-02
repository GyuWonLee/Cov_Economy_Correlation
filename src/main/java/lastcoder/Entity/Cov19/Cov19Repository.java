package lastcoder.Entity.Cov19;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface Cov19Repository extends JpaRepository<Cov19, Cov19MK>  {

	@Query(value = "select * from cov19 C group by C.year ", nativeQuery = true)
	List<Cov19> findByCov19MKYearGroupByCov19MKYear();
	
	List<Cov19> findByCov19MKSidocodeAndCov19MKYear(String sidocode, String year);
}
