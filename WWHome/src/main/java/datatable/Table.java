package datatable;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private static final Table instance = new Table();
	
	private Map<String, Map<Integer, Boolean>> dataTable;
	
	public Table() {
		this.dataTable = new HashMap<String, Map<Integer, Boolean>>();
	}
	
	public Map<String, Map<Integer, Boolean>> getDataTable() {
		return dataTable;
	}
	
	public static Table getInstance() {
		return instance;
	}
}
