package Model;

import com.opencsv.bean.CsvBindByPosition;

public class DataModelCSV {
	  @CsvBindByPosition(position = 0)
	private int no;
	  @CsvBindByPosition(position = 1)
	private String country;
	  @CsvBindByPosition(position = 2)
	private String levelOfDevelopment;
	  @CsvBindByPosition(position = 3)
	private String europeanUnionMembership;
	  @CsvBindByPosition(position = 4)
	private String currency;
	  @CsvBindByPosition(position = 5)
	  private double womenEntrepreneurshipIndex;
	  @CsvBindByPosition(position = 6)
	  private double entrepreneurshipIndex;
	  @CsvBindByPosition(position = 7)
	private double inflationRate;
	  @CsvBindByPosition(position = 8)
	private double femaleLaborForceParticipationRate;
	public double getWomenEntrepreneurshipIndex() {
		return womenEntrepreneurshipIndex;
	}
	public void setWomenEntrepreneurshipIndex(double womenEntrepreneurshipIndex) {
		this.womenEntrepreneurshipIndex = womenEntrepreneurshipIndex;
	}
	public double getEntrepreneurshipIndex() {
		return entrepreneurshipIndex;
	}
	public void setEntrepreneurshipIndex(double entrepreneurshipIndex) {
		this.entrepreneurshipIndex = entrepreneurshipIndex;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLevelOfDevelopment() {
		return levelOfDevelopment;
	}
	public void setLevelOfDevelopment(String levelOfDevelopment) {
		this.levelOfDevelopment = levelOfDevelopment;
	}
	public String getEuropeanUnionMembership() {
		return europeanUnionMembership;
	}
	public void setEuropeanUnionMembership(String europeanUnionMembership) {
		this.europeanUnionMembership = europeanUnionMembership;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getInflationRate() {
		return inflationRate;
	}
	public void setInflationRate(double inflationRate) {
		this.inflationRate = inflationRate;
	}
	public double getFemaleLaborForceParticipationRate() {
		return femaleLaborForceParticipationRate;
	}
	public void setFemaleLaborForceParticipationRate(double femaleLaborForceParticipationRate) {
		this.femaleLaborForceParticipationRate = femaleLaborForceParticipationRate;
	}
	@Override
	public String toString() {
		return "DataModelCSV [no=" + no + ", country=" + country + ", levelOfDevelopment=" + levelOfDevelopment
				+ ", europeanUnionMembership=" + europeanUnionMembership + ", currency=" + currency
				+ ", womenEntrepreneurshipIndex=" + womenEntrepreneurshipIndex + ", entrepreneurshipIndex="
				+ entrepreneurshipIndex + ", inflationRate=" + inflationRate + ", femaleLaborForceParticipationRate="
				+ femaleLaborForceParticipationRate + "]";
	}
	
	
	  
	  
	
}
