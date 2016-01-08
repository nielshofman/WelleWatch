package datatable;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private static final Table instance = new Table();
	
	private MyThread thread1;
	private MyThread thread2;
	private MyThread thread3;
	
	protected Map<String, Map<String, Boolean>> dataTable;
	
	protected Map<String, String> lastKnownChipOnLocation;
	
	public synchronized Map<String, String> getLastKnownChipOnLocation() {
		return lastKnownChipOnLocation;
	}

	public synchronized void setLastKnownChipOnLocation(String location, String chipID) {
		lastKnownChipOnLocation.put(location, chipID);
		if (thread1.getLocation().equals(location)) {
			thread1.start();
		} else if (thread2.getLocation().equals(location)) {
			thread2.start();
		} else if (thread3.getLocation().equals(location)) {
			thread3.start();
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
		this.thread1 = new MyThread("2");
		this.thread2 = new MyThread("4");
		this.thread3 = new MyThread("6");
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
		
		public MyThread(String location) {
			this.location = location;
		}
		
		public String getLocation() {
			return location;
		}
		
		public void run() {
			System.out.println("Thread started");
			try {
				MyThread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Table.getInstance().setLastKnownChipOnLocation(location, "0");
		}
	}
}
