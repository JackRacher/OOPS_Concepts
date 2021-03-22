package simple_OOPS_Program;

public class Address {

	private String hNo;
	private String colname;
	private String cityName;
	public Address(String hNo, String colname, String cityName) {
		this.hNo = hNo;
		this.colname = colname;
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", colname=" + colname + ", cityName=" + cityName + "]";
	}
	
	
}
