
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	} 
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int qty = getQtyOrdered();
		if (qty == MAX_NUMBERS_ORDERED)  
			System.out.println("The order is almost full");
		else 
		{
			for (int i = 0; i < MAX_NUMBERS_ORDERED; i++)	//tim vi tri rong
			{
				if (itemsOrder[i] == null)
				{
					itemsOrder[i] = disc;
					break;								
				}
			}
			setQtyOrdered(getQtyOrdered()+1);	//tang so luong dia len 1
			System.out.println("The disc has been added");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++)	//tim gia tri disc
		{
			if (itemsOrder[i] == disc)
			{
				itemsOrder[i] = null;
				break;
			}
		}
		setQtyOrdered(getQtyOrdered()-1);		//giam so luong dia di 1
		System.out.println("The disc has been removed");
	}
	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++)	
				if (itemsOrder[i] != null)
					sum += itemsOrder[i].getCost();
		return sum;
	}
	
	
	
}
