
public class PayrollSheet {
	private Double hourQuantities;
	private Double hoursValue;

	public Double getWage() {
		return hourQuantities * hoursValue;
	}
	
	public Double getUnionValue() {
		return (getWage() * 1.03) - getWage();
	}

	public Double getInss() {
		return (getWage() * 1.10) - getWage();
	}

	public Double getIrValue() {

		if (getWage() <= 900) {
			return 0.;
		} else if (getWage() <= 1500) {
			return (getWage() * 1.05) - getWage();
		} else if (getWage() <= 2500) {
			return (getWage() * 1.10) - getWage();
		} else {
			return (getWage() * 1.20) - getWage();
		}
	}

	public Double getFgts() {
		return (getWage() * 1.11) - getWage();
	}

	public Double getTotalDiscount() {
		return getInss() + getIrValue() + getUnionValue();
	}

	public Double getLiquidSalary() {
		return getWage() - getTotalDiscount();
	}

	@Override
	public String toString() {
		return "Salary: " + getWage() + "\n" + "Liquid Salary: " + getLiquidSalary() +  "\n" + "FGTS: " + getFgts() +  "\n" + "Total Discount: " + getTotalDiscount() + "\n" ;
	}

	public Double getHourQuantities() {
		return hourQuantities;
	}

	public void setHourQuantities(Double hourQuantities) {
		this.hourQuantities = hourQuantities;
	}

	public Double getHoursValue() {
		return hoursValue;
	}

	public void setHoursValue(Double hoursValue) {
		this.hoursValue = hoursValue;
	}

}
