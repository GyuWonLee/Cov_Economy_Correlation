package lastcoder.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lastcoder.Entity.Compositeeconomicindex.ComRepository;
import lastcoder.Entity.Compositeeconomicindex.Compositeeconomicindex;
import lastcoder.Entity.Cov19.Cov19;
import lastcoder.Entity.Cov19.Cov19Repository;
import lastcoder.Entity.RegionEconomy.RegionEcoRepository;
import lastcoder.Entity.RegionEconomy.RegionEconomy;
import lastcoder.Entity.RegionEmployment.RegionEmpRepository;
import lastcoder.Entity.RegionEmployment.RegionEmployment;
import lastcoder.Entity.Sidocode.SidoCode;
import lastcoder.Entity.Sidocode.SidoRepository;
@RequestMapping("/query")
@RestController
public class QueryController<T> {

	@Autowired
	private ComRepository comRepository;
	@Autowired
	private Cov19Repository cov19Repository;

	@Autowired
	private RegionEcoRepository regionEcoRepository;
	
	@Autowired
	private RegionEmpRepository empRepository;
	
	@Autowired
	private SidoRepository sidoRepository;
	

	@RequestMapping(value = "/Compositeeconomicindex")
	public @ResponseBody List<Compositeeconomicindex> CompositeeconomicindexByID(){
		return comRepository.findByCompositeeconomicindexMKYear("2019");
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Cov19
	@RequestMapping(value = "/Cov19All")
	public @ResponseBody List<Cov19> Covid19All() {
		return cov19Repository.findAll();
	}
	//Cov19's year group by
	@RequestMapping(value = "/Cov19All/year")
	public @ResponseBody List<Cov19> Covid19AllYear() {
		return cov19Repository.findByCov19MKYearGroupByCov19MKYear();
	}
	@RequestMapping(value = "/Cov19Data", method = RequestMethod.POST)
	public @ResponseBody List<Cov19> Covid19Data(@RequestParam("sidocode") String sidocode, @RequestParam("year") String year) {
		return cov19Repository.findByCov19MKSidocodeAndCov19MKYear(sidocode, year);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	//RegionEconomy
	@RequestMapping(value = "/RegionEcoAll")
	public @ResponseBody List<RegionEconomy> RegionEconomyAll() {
		return regionEcoRepository.findAll();
	}
	@RequestMapping(value = "/RegionEcoAll/year")
	public @ResponseBody List<RegionEconomy> RegionEconomyAllYear() {
		return regionEcoRepository.findByRegionEconomyMKYearGroupByRegionEconomyMKYear();
	}
//	@RequestMapping(value = "/RegionEcoData", method = RequestMethod.POST)
//	public @ResponseBody List<RegionEconomy> RegionEcoData(@RequestParam("sidocode") String sidocode, @RequestParam("year") String year) {
//		return regionEcoRepository.findByRegionEconomyMKSidocodeAndRegionEconomyMKYear(sidocode, year);
//	}
	@RequestMapping(value = "/RegionEcoData", method = RequestMethod.POST)
	public @ResponseBody List<RegionEconomy> RegionEcoData(@RequestParam("sidocode") String sidocode, @RequestParam("year") String year) {
		return regionEcoRepository.findByRegionEconomyMKMonthOrderByRegionEconomyMKYear(sidocode, year);
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	//RegionEployment
	@RequestMapping(value = "/RegionEmployAll")
	public @ResponseBody List<RegionEmployment> RegionEmployAll() {
		return empRepository.findAll();
	}
	@RequestMapping(value = "/RegionEmployAll/year")
	public @ResponseBody List<RegionEmployment> RegionEmployAllYear() {
		return empRepository.findByRegionEmploymentMKYearGroupByRegionEmploymentMKYear();
	}	
	@RequestMapping(value = "/RegionEmployData", method = RequestMethod.POST)
	public @ResponseBody List<RegionEmployment> RegionEmployData(@RequestParam("sidocode") String sidocode, @RequestParam("year") String year) {
		return empRepository.findByRegionEmploymentMKSidocodeAndRegionEmploymentMKYear(sidocode, year);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	


	@RequestMapping(value = "/SidoCodeAll")
	public @ResponseBody List<SidoCode> SidoCodeAll() {
		return sidoRepository.findAll();
	}
	
	@RequestMapping(value = "/SidoCodeAll/year", method = RequestMethod.GET)
	public @ResponseBody List<SidoCode> SidoCodeAllYear(@RequestParam("sidocode") String sidocode) {
		return sidoRepository.findBySidoCodeMKSidocode(sidocode);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	

}
