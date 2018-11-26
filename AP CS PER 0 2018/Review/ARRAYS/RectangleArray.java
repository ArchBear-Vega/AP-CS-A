package ARRAYS;

public class RectangleArray {

	private Rectangle[] list;

	public RectangleArray() {
		list = new Rectangle[20];
	}

	public void fillArray(int length, int width) {

		for (int i = 0; i < 20; i++) {

			list[i] = new Rectangle(getRLength(length), getRWidth(width));
		}

	}

	private int getRWidth(int width) {

		return (int) (Math.random() * (width) + 1);
	}

	private int getRLength(int length) {
		return (int) (Math.random() * (length) + 1);
	}

	public void print() {
		for (Rectangle r : list) {
			System.out.println(r);
		}
	}

	public int search(Rectangle item) {
		int i = 0;
		for (Rectangle rec : list) {
			if (rec.equals(item)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public Rectangle largestArea() {
		Rectangle r;
		r = new Rectangle(0, 0);
		for (Rectangle i : list) {
			if (r.findArea() < i.findArea()) {
				r = i;
			}
		}
		return r;

	}

	public Rectangle smallestArea() {
		Rectangle r;
		r = list[0];
		for (Rectangle i : list) {
			if (r.findArea() > i.findArea()) {
				r = i;
			}
		}
		return r;
	}

	public Rectangle largestPerimeter() {
		Rectangle r;
		r = new Rectangle(0, 0);
		for (Rectangle i : list) {
			if (r.findPerimeter() < i.findPerimeter()) {
				r = i;
			}
		}
		return r;
	}

	public Rectangle smallestPerimeter() {
		Rectangle r;
		r = list[0];
		for (Rectangle i : list) {
			if (r.findPerimeter() > i.findPerimeter()) {
				r = i;
			}
		}
		return r;
	}
}
