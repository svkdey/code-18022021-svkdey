package Service;

import Model.DataModelCSV;
import Model.OutPutData;

public class ImplDataToHTML {
	public String createTables(OutPutData data) {
		StringBuilder str=new StringBuilder();
		for(DataModelCSV d:data.getDataArray()) {
			str.append(createDataToTableHTML(d));
		}
		
		return str.toString();
		
	}
	public String createDataToTableHTML(DataModelCSV data) {
		StringBuilder sb=new StringBuilder();
		sb.append("<tr valign=top><td style=\"border-style: inset;\"><p><span class=rvts1>");
		sb.append(data.getNo());
		sb.append(getSpan());
		sb.append(data.getCountry());
		sb.append(getSpan());
		sb.append(data.getLevelOfDevelopment());
		sb.append(getSpan());
		sb.append(data.getEuropeanUnionMembership());
		sb.append(getSpan());
		
		sb.append(data.getCurrency());
		sb.append(getSpan());
		
		sb.append(data.getWomenEntrepreneurshipIndex());
		sb.append(getSpan());
		
		sb.append(data.getEntrepreneurshipIndex());
		sb.append(getSpan());
		
		sb.append(data.getInflationRate());
		sb.append(getSpan());
		
		sb.append(data.getFemaleLaborForceParticipationRate());
		
		sb.append("</span></p>\n"
				+ "		</td>\n"
				+ "		</tr>");
		return sb.toString();
		
	}
	
	public String getSpan() {
		StringBuilder sb=new StringBuilder();
		sb.append("</span></p>\n"
				+ "		</td>\n"
				+ "		<td style=\"border-style: inset;\">\n"
				+ "		<p><span class=rvts1>");
		return sb.toString();
	}

}
