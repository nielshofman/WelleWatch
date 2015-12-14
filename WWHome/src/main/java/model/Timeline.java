package model;

public class Timeline {
	
	private boolean period1;
	private boolean period2;
	private boolean period3;
	private boolean period4;
	private boolean period5;
	private boolean period6;

	public Timeline() {
		period1 = false;
		period2 = false;
		period3 = false;
		period4 = false;
		period5 = false;
		period6 = false;
	}
	
	public Timeline(boolean period1, boolean period2, boolean period3,
			boolean period4, boolean period5, boolean period6) {
		this.period1 = period1;
		this.period2 = period2;
		this.period3 = period3;
		this.period4 = period4;
		this.period5 = period5;
		this.period6 = period6;
	}

	public boolean isPeriod1() {
		return period1;
	}

	public void setPeriod1(boolean period1) {
		this.period1 = period1;
	}

	public boolean isPeriod2() {
		return period2;
	}

	public void setPeriod2(boolean period2) {
		this.period2 = period2;
	}

	public boolean isPeriod3() {
		return period3;
	}

	public void setPeriod3(boolean period3) {
		this.period3 = period3;
	}

	public boolean isPeriod4() {
		return period4;
	}

	public void setPeriod4(boolean period4) {
		this.period4 = period4;
	}

	public boolean isPeriod5() {
		return period5;
	}

	public void setPeriod5(boolean period5) {
		this.period5 = period5;
	}

	public boolean isPeriod6() {
		return period6;
	}

	public void setPeriod6(boolean period6) {
		this.period6 = period6;
	}
}
