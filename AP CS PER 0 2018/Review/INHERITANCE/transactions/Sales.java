package INHERITANCE.transactions;

public class Sales extends Transaction {

	public static final double DISCOUNT = .9;

	private boolean isCredit;

	public Sales(String description, int numItems, double itemCost, boolean isCredit) {
		super(description, numItems, itemCost);
		// TODO Auto-generated constructor stub
		this.isCredit = isCredit;
	}

	public boolean isCredit() {
		return isCredit;
	}

	
	@Override
	public double getTotal() {
		
		double cost = isCredit() ? (super.getItemCost() * super.getNumItems()) : (super.getItemCost() * super.getNumItems()) * DISCOUNT;
		double tax = cost * Transaction.TAX_RATE;
		return cost + tax;
	}
}
