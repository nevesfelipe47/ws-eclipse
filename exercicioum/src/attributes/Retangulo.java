package attributes;

public class Retangulo {

	public double width;
	public double height;

	public double areaCalculo() {
		return width * height;
	}

	public double perimetroCalculo() {
		return 2 * (width + height);
	}

	public double diagonalCalculo() {
		return Math.sqrt(width * width + height * height);

	}
}
