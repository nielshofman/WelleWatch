package model;

public class Avatar {
	
	private boolean hasRightArmItem;
	private boolean hasLeftArmItem;
	private boolean hasTopPiece;
	private boolean hasBottompiece;
	private boolean hasHat;
	private boolean hasSixthItem;
	
	

	public Avatar() {
		hasRightArmItem = false;
		hasLeftArmItem = false;
		hasTopPiece = false;
		hasBottompiece = false;
		hasHat = false;
		hasSixthItem = false;
	}

	public Avatar(boolean right, boolean left, boolean top, boolean bottom,
			boolean hat, boolean six) {
		this.hasRightArmItem = right;
		this.hasLeftArmItem = left;
		this.hasTopPiece = top;
		this.hasBottompiece = bottom;
		this.hasHat = hat;
		this.hasSixthItem = six;
	}

	public boolean isHasRightArmItem() {
		return hasRightArmItem;
	}



	public void setHasRightArmItem(boolean hasRightArmItem) {
		this.hasRightArmItem = hasRightArmItem;
	}



	public boolean isHasLeftArmItem() {
		return hasLeftArmItem;
	}



	public void setHasLeftArmItem(boolean hasLeftArmItem) {
		this.hasLeftArmItem = hasLeftArmItem;
	}



	public boolean isHasTopPiece() {
		return hasTopPiece;
	}



	public void setHasTopPiece(boolean hasTopPiece) {
		this.hasTopPiece = hasTopPiece;
	}



	public boolean isHasBottompiece() {
		return hasBottompiece;
	}



	public void setHasBottompiece(boolean hasBottompiece) {
		this.hasBottompiece = hasBottompiece;
	}



	public boolean isHasHat() {
		return hasHat;
	}



	public void setHasHat(boolean hasHat) {
		this.hasHat = hasHat;
	}



	public boolean isHasSixthItem() {
		return hasSixthItem;
	}



	public void setHasSixthItem(boolean hasSixthItem) {
		this.hasSixthItem = hasSixthItem;
	}
}
