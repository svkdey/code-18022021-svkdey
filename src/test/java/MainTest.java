import org.junit.Before;
import org.junit.Test;

import Model.DataModelCSV;
import Service.ImplReadFromCSV;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MainTest {
	private   String INPUT_LOCATION="/Users/souvikdey/Test/greeter-junit-unittest/src/main/resources/input";
	private   String OUTPUT_LOCATION="/Users/souvikdey/Test/greeter-junit-unittest/output/filename.txt";
	
	ImplReadFromCSV bean=null;
	@Before
	public void init() {
		bean=new ImplReadFromCSV();
		bean.setInputFileLocation(INPUT_LOCATION);
		bean.setOutputFileLocation(OUTPUT_LOCATION);
	}
	@Test
	public void test_stringToDataModelCSVMapper() {
		String test="4;Austria;Developed;Member;Euro;54.9;64.9;0.9;67.1";
		DataModelCSV csv=new DataModelCSV();
		bean.stringToDataModelCSVMapper(csv, test);
		Assert.assertEquals(csv.getNo(), 4);
		Assert.assertEquals(csv.getCountry(), "Austria");
		Assert.assertEquals(csv.getLevelOfDevelopment(), "Developed");
		Assert.assertEquals(csv.getEuropeanUnionMembership(), "Member");
		Assert.assertEquals(csv.getCurrency(), "Euro");
		Assert.assertEquals(csv.getWomenEntrepreneurshipIndex(), 54.9);
		Assert.assertEquals(csv.getEntrepreneurshipIndex(), 64.9);
		Assert.assertEquals(csv.getInflationRate(), 0.9);
		Assert.assertEquals(csv.getFemaleLaborForceParticipationRate(), 67.1);
		
	}
	
	
	@Test
	public void test_saveInFile() {
		bean.saveInFile("save in file envoked!");
	}
	@Test
	public void test_readFolder() {
		String s=bean.readFolder();
		System.out.println(s);
	}

}
