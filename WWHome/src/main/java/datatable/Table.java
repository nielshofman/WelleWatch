package datatable;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private static final Table instance = new Table();
	
	protected Map<String, Map<String, Boolean>> dataTable;
	
	protected Map<String, String> lastKnownChipOnLocation;
	
	public synchronized Map<String, String> getLastKnownChipOnLocation() {
		return lastKnownChipOnLocation;
	}

	public synchronized void setLastKnownChipOnLocation(String location, String chipID) {
		lastKnownChipOnLocation.put(location, chipID);
	}
	
	private Map<String, String> fillLocationMap() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("2", "0");
		result.put("4", "0");
		result.put("6", "0");
		return result;
	}

	public Table() {
		this.dataTable = new HashMap<String, Map<String, Boolean>>();
		this.lastKnownChipOnLocation = fillLocationMap();
	}
	
	public synchronized Map<String, Map<String, Boolean>> getDataTable() {
		return dataTable;
	}
	
	public synchronized void setDataTable(Map<String, Map<String, Boolean>> map) {
		dataTable = map;
	}
	
	public static Table getInstance() {
		return instance;
	}
}
