package datatable;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private static final Table instance = new Table();
	
	protected Map<String, Map<String, Boolean>> dataTable;
	
	public Table() {
		this.dataTable = new HashMap<String, Map<String, Boolean>>();
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
