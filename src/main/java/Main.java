import Service.ImplReadFromCSV;



public class Main {
	private static final String INPUT_LOCATION="/Users/souvikdey/Test/greeter-junit-unittest/src/main/resources/input";
	private static final String OUTPUT_LOCATION="/Users/souvikdey/Test/greeter-junit-unittest/output/index.html";
	
	public static void main(String[] args) {
		
		ImplReadFromCSV implReadFromCSV=new ImplReadFromCSV();
		implReadFromCSV.setInputFileLocation(INPUT_LOCATION);
		implReadFromCSV.setOutputFileLocation(OUTPUT_LOCATION);
		String dataFromFolder=implReadFromCSV.readFolder();
		implReadFromCSV.saveInFile(dataFromFolder);

	}
	
	
}
