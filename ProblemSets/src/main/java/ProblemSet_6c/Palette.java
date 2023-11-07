package ProblemSet_6c;

import java.lang.StringBuilder;

public class Palette {
	private P_COLOUR[] primaryColours = null;
	public Palette () {
		this.primaryColours = new P_COLOUR[3];
	}
	public Palette (P_COLOUR[] colourArray) throws IllegalArgumentException {
		super();
		this.primaryColours = new P_COLOUR[3];
		if (colourArray.length > 3) {
			throw new IllegalArgumentException("Array too long");
		}
		for (int i = 0; i < colourArray.length; i++) {
			if (colourArray[i] != null) {
				this.addColour(colourArray[i]);
			}
		}
	}
	public void addColour(P_COLOUR colour) throws IllegalArgumentException {
		for (int i = 0; i < this.primaryColours.length; i++) {
			if (colour == this.primaryColours[i]) {
				throw new IllegalArgumentException("Colour already added");
			} else if (this.primaryColours[i] == null && colour != null) {
				this.primaryColours[i] = colour;
				return;
			}
		}
		throw new IllegalArgumentException("No space in array");
	}
	public String getColours() {
		StringBuilder colours = new StringBuilder();
		for (int i = 0; i < this.primaryColours.length; i++) {
			if (this.primaryColours[i] != null) {
				colours.append(this.primaryColours[i]).append(", ");
			}
		}
		if (colours.isEmpty()) {
			return "No colours added";
		}
		return colours.toString().substring(0, colours.length() - 2);
	}
	public String mixColours() {
		boolean red = false;
		boolean yellow = false;
		boolean blue = false;
		for (int i = 0; i < this.primaryColours.length; i++) {
			if (this.primaryColours[i] != null) {
				if (this.primaryColours[i].equals(P_COLOUR.RED)) {
					red = true;
				} else if (this.primaryColours[i].equals(P_COLOUR.YELLOW)) {
					yellow = true;
				} else if (this.primaryColours[i].equals(P_COLOUR.BLUE)) {
					blue = true;
				}
			}
		}
		if (red && yellow && blue) {
			return "BLACK";
		} else if (red && yellow && !blue) {
			return "ORANGE";
		} else if (red && !yellow && blue) {
			return "PURPLE";
		} else if (!red && yellow && blue) {
			return "GREEN";
		} else if (!red && !yellow && blue) {
			return "BLUE";
		} else if (!red && yellow && !blue) {
			return "YELLOW";
		} else if (red && !yellow && !blue) {
			return "RED";
		} else {
			return "";
		}
	}
	public String display() {
		return this.getColours() + " = " + this.mixColours();
	}
}
