package datatable;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private static final Table instance = new Table();
	
	private MyThread thread1;
	private MyThread thread2;
	private MyThread thread3;
	private boolean threadsMade;
	
	protected Map<String, Map<String, Boolean>> dataTable;
	
	protected Map<String, String> lastKnownChipOnLocation;
	
	public synchronized Map<String, String> getLastKnownChipOnLocation() {
		return lastKnownChipOnLocation;
	}

	public synchronized void setLastKnownChipOnLocation(String location, String chipID) {
		lastKnownChipOnLocation.put(location, chipID);
		if (threadsMade) {
			if (thread1.getLocation().equals(location)) {
				thread1.start();
			} else if (thread2.getLocation().equals(location)) {
				thread2.start();
			} else if (thread3.getLocation().equals(location)) {
				thread3.start();
			}
		} else {
			this.thread1 = new MyThread("2", Table.getInstance());
			this.thread2 = new MyThread("4", Table.getInstance());
			this.thread3 = new MyThread("6", Table.getInstance());
			threadsMade = true;
		}
	}
	
	private Map<String, String> fillLocationMap() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("2", "0");
		result.put("4", "0");
		result.put("6", "0");
		return result;
	}

	public Table() {
		this.threadsMade = false;
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
	private class MyThread extends Thread{
		private String location;
		private Table table;
		
		public MyThread(String location, Table table) {
			this.location = location;
		}
		
		public String getLocation() {
			return location;
		}
		
		public void run() {
			System.out.println("Thread started");
			try {
				MyThread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(table);
			table.setLastKnownChipOnLocation(location, "0");
		}
	}
}
