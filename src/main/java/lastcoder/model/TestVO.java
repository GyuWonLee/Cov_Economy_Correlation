package lastcoder.model;

import org.springframework.stereotype.Component;

@Component("TestVO")
public class TestVO {

	private double year2012;
	private double year2013;
	private double year2014;
	private double year2015;
	private double year2016;
	private double year2017;
	private double year2018;
	private double year2019;
	private double year2020;
	
	public TestVO() {
		
	}

	public TestVO(double year2012, double year2013, double year2014, double year2015, double year2016, double year2017,
			double year2018, double year2019, double year2020) {
		this.year2012 = year2012;
		this.year2013 = year2013;
		this.year2014 = year2014;
		this.year2015 = year2015;
		this.year2016 = year2016;
		this.year2017 = year2017;
		this.year2018 = year2018;
		this.year2019 = year2019;
		this.year2020 = year2020;
	}

	public double getYear2012() {
		return year2012;
	}

	public void setYear2012(double year2012) {
		this.year2012 = year2012;
	}

	public double getYear2013() {
		return year2013;
	}

	public void setYear2013(double year2013) {
		this.year2013 = year2013;
	}

	public double getYear2014() {
		return year2014;
	}

	public void setYear2014(double year2014) {
		this.year2014 = year2014;
	}

	public double getYear2015() {
		return year2015;
	}

	public void setYear2015(double year2015) {
		this.year2015 = year2015;
	}

	public double getYear2016() {
		return year2016;
	}

	public void setYear2016(double year2016) {
		this.year2016 = year2016;
	}

	public double getYear2017() {
		return year2017;
	}

	public void setYear2017(double year2017) {
		this.year2017 = year2017;
	}

	public double getYear2018() {
		return year2018;
	}

	public void setYear2018(double year2018) {
		this.year2018 = year2018;
	}

	public double getYear2019() {
		return year2019;
	}

	public void setYear2019(double year2019) {
		this.year2019 = year2019;
	}

	public double getYear2020() {
		return year2020;
	}

	public void setYear2020(double year2020) {
		this.year2020 = year2020;
	}

	
	
	
}
