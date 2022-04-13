
public class Employee {

	private String name;
	private double hour;
	private double totalPay;
	public final static double HOURLY_RATE = 15;
	public final static double OVERTIME_RATE = 16.5;

	public Employee() {

	}

	public Employee(String name, double hour) {
		this.name = name;
		this.hour = hour;
		setTotalPay();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay() {
		double ovrtime_hr;
		if (hour > 40) {
			ovrtime_hr = hour - 40;
			this.totalPay = OVERTIME_RATE * ovrtime_hr + HOURLY_RATE * 40;
		} else {
			this.totalPay = HOURLY_RATE * hour;
		}

	}

}
