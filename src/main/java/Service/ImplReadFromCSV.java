package Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import Model.DataModelCSV;
import Model.OutPutData;

public class ImplReadFromCSV {
	private String inputFileLocation=null;
	private String outputFileLocation=null;
	private String headerLocation="/Users/souvikdey/Test/greeter-junit-unittest/src/main/resources/FixedFile/Header.txt";
	private String footerLocation="/Users/souvikdey/Test/greeter-junit-unittest/src/main/resources/FixedFile/Footer.txt";
	
	public  String readFolder(){
	ImplDataToHTML dataTohtml=new ImplDataToHTML();
	File folder = new File(inputFileLocation);
	File[] listOfFiles = folder.listFiles();
	
	if(listOfFiles.length==0) {
		System.out.println("No Files found!");
		return "";
	}
	StringBuilder str=new StringBuilder();
	
	String header=readStaticFiles(headerLocation);
	String footer=readStaticFiles(footerLocation);
	
	for (File file :  listOfFiles) {
	    if (file.isFile()) {
	    	System.out.print("\n Running ===>   "+file.toString());
	    	str.append(header);
	    	str.append("<h4>Input File location : "+file +"</h3>");
	    	String jsonStr = null;
	    	OutPutData output=mapCSVtoObject(file.toString());
			jsonStr = dataTohtml.createTables(output);
			str.append("<div>File size :"+output.getDataSize()+"kb "+"</div>");
			str.append("<div>Row number :"+output.getRowCount()+"</div>");
			
	        str.append(jsonStr);
	        str.append(footer);
	     
	        str.append("<hr>");
	        str.append("</br>");
	       
	    }
	}
	return str.toString();
}	

	public String readStaticFiles(String path){
		Path fileName = Path.of(path);
        
		String actual=null;
        try {
			 actual = Files.readString(fileName);
		} catch (IOException e) {
			e.printStackTrace();
			forceExit("Unable to read Static files of Resource folder");
		}
        return actual;
	}

	public  OutPutData mapCSVtoObject(String fileLocation) {
		  List<DataModelCSV> rows = new ArrayList<DataModelCSV>();
		  List<String[]> r =null;
		  Path path = Paths.get(fileLocation);
		  long size=0;
		  try (CSVReader reader = new CSVReader(new FileReader(fileLocation))) {
	            try {
					r = reader.readAll();
					size=Files.size(path);
				} catch (CsvException e) {
					e.printStackTrace();
					forceExit("CSV is not correct!");
				}
	           
	        } catch (IOException e) {
				e.printStackTrace();
				forceExit("Unable to read files!");
			} 
	
		  for(int i=1;i<r.size();i++) {
			  DataModelCSV newData=new DataModelCSV();
			  stringToDataModelCSVMapper(newData,r.get(i)[0]);
			  rows.add(newData);
		  }
	
		OutPutData op=new OutPutData();
		op.setDataArray(rows.toArray(new DataModelCSV[rows.size()]));
		op.setDataSize(size);
		op.setRowCount(rows.size()-1);
		return op;

	}
	

	public void saveInFile(String toBeSaved) { 
		StringBuilder sb=new StringBuilder();
		sb.append(toBeSaved);
		 try {
			
			Files.writeString(Paths.get(outputFileLocation), sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
			forceExit("Error after Processing files");
		}
		
		
	
	}

	public void stringToDataModelCSVMapper(DataModelCSV csv,String s) {
	
		String[] str=s.split(";");
		try {
			csv.setNo(Integer.parseInt(str[0]));
			csv.setCountry(str[1]);
			csv.setLevelOfDevelopment(str[2]);
			csv.setEuropeanUnionMembership(str[3]);
			csv.setCurrency(str[4]);
			csv.setWomenEntrepreneurshipIndex(Double.parseDouble(str[5]) );
			csv.setEntrepreneurshipIndex(Double.parseDouble(str[6]));
			csv.setInflationRate(Double.parseDouble(str[7]));
			csv.setFemaleLaborForceParticipationRate(Double.parseDouble(str[8]));
	
		} catch (Exception e) {
			forceExit("Incorrect data in the file!!!");
		}
		
	}

	public void forceExit(String str) {
		System.out.println(str);
		System.exit(0);
	}
	
	public String getInputFileLocation() {
		return inputFileLocation;
	}
	public void setInputFileLocation(String inputFileLocation) {
		this.inputFileLocation = inputFileLocation;
	}
	public String getOutputFileLocation() {
		return outputFileLocation;
	}
	public void setOutputFileLocation(String outputFileLocation) {
		this.outputFileLocation = outputFileLocation;
	}
}
