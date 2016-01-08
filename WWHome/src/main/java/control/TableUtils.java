package control;

import java.util.HashMap;
import java.util.Map;

import datatable.Table;
import model.Avatar;
import model.Timeline;

public class TableUtils {
	
	public static final String ONE = "1";
	public static final String TWO = "2";
	public static final String THREE = "3";
	public static final String FOUR = "4";
	public static final String FIVE = "5";
	public static final String SIX = "6";

	private static Table table = Table.getInstance();
	
	public static synchronized Timeline getTimeline(String chipID) {
		Map<String, Map<String,Boolean>> map = table.getDataTable();
		Timeline result = null;
		if (map.containsKey(chipID)) {
			result = new Timeline(map.get(chipID).get(ONE), map.get(chipID).get(TWO), map.get(chipID).get(THREE),
				map.get(chipID).get(FOUR), map.get(chipID).get(FIVE), map.get(chipID).get(SIX));
			result.setChipID(chipID);
		} else {
			result = new Timeline();
			result.setChipID(chipID);
		}
		return result;
	}
	
	public static synchronized void setLastKnownPosition(String location, String chipID) {
		table.setLastKnownChipOnLocation(location, chipID);
	}
	
	public static synchronized Avatar getCharacter(String chipID) {
		Map<String, Map<String,Boolean>> map = table.getDataTable();
		Map<String,Boolean> entries;
		boolean one = false;
		boolean two = false;
		boolean three = false;
		boolean four = false;
		boolean five = false;
		boolean six = false;
		Avatar result = null;
		if (map.containsKey(chipID)) {
			entries = map.get(chipID);
			for (String s : entries.keySet()) {
				if (s.equals(ONE)) {
					one = entries.get(s);
				} else if(s.equals(TWO)) {
					two = entries.get(s);
				} else if(s.equals(THREE)) {
					three = entries.get(s);
				} else if(s.equals(FOUR)) {
					four = entries.get(s);
				} else if(s.equals(FIVE)) {
					five = entries.get(s);
				} else if(s.equals(SIX)) {
					six = entries.get(s);
				}
			}
			result = new Avatar(one, two, three, four, five, six);
		} else {
			result = new Avatar();
		}
		return result;
	}
	
	public static synchronized void resetTableEntry(String chipID) {
		Map<String, Map<String, Boolean>> map = table.getDataTable();
		map.replace(chipID, getStandardMap());
		table.setDataTable(map);
	}
	
	public static synchronized void changeTableEntry(String chipID, String location) {
		Map<String, Map<String, Boolean>> map = table.getDataTable();
		if (map.containsKey(chipID)) {
			Map<String, Boolean> columns = map.get(chipID);
			if (columns.containsKey(location)) {
				columns.replace(location, true);
				map.replace(chipID, columns);
			} else {
				//Error
			}
		} else {
			Map<String, Boolean> columns = getStandardMap();
			if (columns.containsKey(location)) {
				columns.replace(location, true);
				map.put(chipID, columns);
			} else {
				//Error
			}
		}
		table.setDataTable(map);
	}
	
	public static synchronized Table getTable() {
		return table;
	}
	
	public static Map<String, Boolean> getStandardMap() {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (int i = 1; i < 7; i++) {
			map.put("" + i, false);
		}
		return map;
	}
}
