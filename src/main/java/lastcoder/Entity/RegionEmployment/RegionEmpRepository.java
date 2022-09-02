package lastcoder.Entity.RegionEmployment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RegionEmpRepository  extends JpaRepository<RegionEmployment, RegionEmploymentMK> {

	
	@Query(value = "select * from regionemployment C group by C.year ", nativeQuery = true)
	List<RegionEmployment> findByRegionEmploymentMKYearGroupByRegionEmploymentMKYear();
	
	@Query(value = "select *\r\n"
			+ "from regionemployment C \r\n"
			+ "group by C.month\r\n"
			+ "order by length(C.month),C.month;", nativeQuery = true)
	List<RegionEmployment> findByRegionEmploymentMKSidocodeAndRegionEmploymentMKYear(String sidocode, String year);

}
