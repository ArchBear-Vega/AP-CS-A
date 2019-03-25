package INTERFACE.warmup;

public class Trio implements MenuItem {
	
	private Sandwich w;
	private Salad s;
	private Drink d;
	
	public Trio(Sandwich w, Salad s, Drink d) {
		this.w = w;
		this.s = s;
		this.d = d;
	}
	
	public String getName() {
		return w.getName() + "/" + s.getName() + "/" + d.getName() + "Trio";
	}
	
	public double getPrice() {
		if(w.getPrice() < s.getPrice() && w.getPrice() < d.getPrice()) {
			return s.getPrice() + d.getPrice();
		} else if(s.getPrice() < w.getPrice() && s.getPrice() < d.getPrice()) {
			return w.getPrice() + d.getPrice();
		} else {
			return s.getPrice() + w.getPrice();
		}
	}
	
}
