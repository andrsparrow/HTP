package by.pht.test1.electricals;

public class Device {
	
	private String name;
	private double power;
	private boolean isPlugged;
	@Override
	public String toString() {
		return "Device name=" + name + ", \n\t\tpower=" + power + ", \n\t\tisPlugged=" + isPlugged ;
	}
	public Device(String name, double power, boolean isPlugged) {
		super();
		this.name = name;
		this.power = power;
		this.isPlugged = isPlugged;
	}
	public Device(double power) {
		super();
		this.name = "NO NAME_"+this.hashCode();
		this.power = power;
	}
	public Device(double power, boolean isPlugged) {
		super();
		this.name = "NO NAME_"+this.hashCode();
		this.power = power;
		this.isPlugged = isPlugged;
	}
	public Device(String name, double power) {
		super();
		this.name = name;
		this.power = power;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(power);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	
	
	public void plugIn(){
		isPlugged=true;
		System.out.println("//////////////////");
		System.out.println("device plugged in");
	}
	public void plugOut(){
		isPlugged=false;
		System.out.println("//////////////////");
		System.out.println("device plugged out");
	}
	
	
	
	
	
	
	
	

}
