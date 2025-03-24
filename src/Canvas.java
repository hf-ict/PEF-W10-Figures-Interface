import java.util.ArrayList;
import java.util.List;

public class Canvas {

	private List<Figure> figures = new ArrayList<Figure>();
	
	public void addFigure(Figure figure) {
		this.figures.add(figure);
	}
	
	public void print() {
		for(Figure f : this.figures) {
			System.out.println(f.getColor() + ": " + f.getArea());
		}
	}
}
