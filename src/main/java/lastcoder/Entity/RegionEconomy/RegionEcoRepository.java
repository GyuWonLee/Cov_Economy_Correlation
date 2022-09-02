package lastcoder.Entity.RegionEconomy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RegionEcoRepository extends JpaRepository<RegionEconomy, RegionEconomyMK>  {

	
	@Query(value = "select * from regioneconomy C group by C.year", nativeQuery = true)
	List<RegionEconomy> findByRegionEconomyMKYearGroupByRegionEconomyMKYear();
	
	@Query(value = "select *\r\n"
			+ "from regioneconomy C \r\n"
			+ "group by C.month\r\n"
			+ "order by length(C.month),C.month;", nativeQuery = true)
	List<RegionEconomy> findByRegionEconomyMKMonthOrderByRegionEconomyMKYear(String sidocode, String year);
	
//	List<RegionEconomy> findByRegionEconomyMKSidocodeAndRegionEconomyMKYear(String sidocode, String year);

	
	
}
