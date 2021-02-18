package Model;

import java.util.Arrays;

public class OutPutData {
	private DataModelCSV dataArray[]=null;;
	private Long dataSize;
	private int rowCount;
	@Override
	public String toString() {
		return "OutPutData [dataArray=" + Arrays.toString(dataArray) + ", dataSize=" + dataSize + ", rowCount="
				+ rowCount + "]";
	}
	public DataModelCSV[] getDataArray() {
		return dataArray;
	}
	public void setDataArray(DataModelCSV[] dataArray) {
		this.dataArray = dataArray;
	}
	public Long getDataSize() {
		return dataSize;
	}
	public void setDataSize(Long dataSize) {
		this.dataSize = dataSize;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	
	
}
