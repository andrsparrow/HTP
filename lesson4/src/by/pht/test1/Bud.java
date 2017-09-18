package by.pht.test1;

public class Bud {
	private String color;
	private double size;
	private Petal[] petal;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Petal[] getPetal() {
		return petal;
	}

	public void setPetal(Petal[] petal) {
		this.petal = petal;
	}

	public Bud(double size, Petal petal, int countOfPetal) {
		super();
		this.color = petal.getColor();
		this.size = size;
		this.petal = new Petal[countOfPetal];
		for (int i = 0; i < countOfPetal; i++) {
			this.petal[i] = petal;

		}

	}

	@Override
	public String toString() {
		return "Bud \n	   color=" + color + ", \n	   size of Bud=" + size + ", \n	   petals=" + (petal.length) + " ,"
				+ petal[0];
	}

}
