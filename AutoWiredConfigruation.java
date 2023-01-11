package com.xworkz.spring.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class AutoWiredConfigruation {

	public AutoWiredConfigruation() {
		System.out.println("constrictor runiing");
	}

	@Bean("ownerName")

	public String HardwareShopOwnerName() {
		return "Bagalkot";
	}

	@Bean("address")
	public String HardwareShopAddress() {
		return "Bagalakot";
	}

	@Bean("name")

	public String HardwareShopName()

	{
		return "Ganesh Hardware Shop";
	}

	@Bean("id")
	public int HardwareShopId() {

		return 10;
	}

	@Bean("gstNo")
	public String HardwareShopGstNo() {
		return "GSTIN123456789";
	}

	@Bean("developer")

	public String softwareDeveloper() {
		return "Java Developer";
	}

	@Bean("name")

	public String softwareName() {
		return "qwerty";
	}

	@Bean("version")

	public String softwareVersion() {
		return "V9.9";

	}

	@Bean("free")

	public Boolean softwareFree() {
		return true;
	}

	@Bean("date")

	public LocalDate softwareDate() {
		return LocalDate.now();
	}

	@Bean("engineername")

	public String softwareEngineerName() {
		return "Hareesha";
	}

	@Bean("engineerCompany")

	public String softwareEngineerCompany() {
		return "amazon";
	}

	@Bean("engineerSalary")

	public Double softwareEngineerSalary() {
		return 633120D;
	}

	@Bean("experience")
	public int softwareEngineerExpperience() {
		return 12;
	}

	@Bean("color")
	public String pencilColor() {
		return "white";
	}

	@Bean("Pencilname")

	public String pencilName() {
		return "lenovo";
	}

	@Bean("type")
	public String penciltype() {
		return "Writing";
	}

	@Bean("pencilprice")
	public Double pencilPrice() {
		return 10.5;
	}

	@Bean("Sharp")
	public Boolean pencilSharp() {
		return false;
	}

	@Bean("stolen")
	public Boolean pencilStolen() {
		return false;
	}

	@Bean("rubberStolen")
	public Boolean rubberStolen() {
		return false;
	}

	@Bean("rubberName")
	public String rubberName() {
		return "lenovo";
	}

	@Bean("rubberType")
	public String rubberType() {
		return "Rubber";
	}

	@Bean("rubberColor")
	public String rubberColor() {
		return "white";
	}

	@Bean("rubberShape")
	public String rubberShape() {
		return "round";
	}

	@Bean("rubberSize")
	public int rubberSize() {
		return 2;
	}

	@Bean("rubberPrice")
	public double rubberPrice() {
		return 102.0;
	}

	@Bean("bekaryName")
	public String bekaryName() {
		return "chadar";
	}

	@Bean("bekaryAddress")
	public String bekaryAddress() {
		return "jupitar";
	}

	@Bean("bekaryOwnerName")
	public String bekaryOwnerName() {
		return "xyzqwerty";
	}

	@Bean("bekaryState")
	public String bekaryState() {
		return "Karnataka";
	}

	@Bean("bekaryProduct")
	public String bekaryProduct() {
		return "Bread";
	}

	@Bean("workers")
	public int bekaryNoOfWorkers() {
		return 10;
	}

	@Bean("area")
	public String bekaryArea() {
		return "Kelmbelli";
	}

	@Bean("bekaryPinCode")
	public int bekaryPinCode() {
		return 587101;
	}

	@Bean("bekaryDate")
	public LocalDate bekarydate() {
		return LocalDate.now();
	}

}
