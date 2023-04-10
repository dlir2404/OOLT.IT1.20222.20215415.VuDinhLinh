
public class Test {
	public static void main(String[] args) {
		MyDate a = new MyDate();
		MyDate b = new MyDate(22, 1, 4);
		MyDate c = new MyDate("January 22 2004");
		MyDate d = new MyDate();
		
		System.out.println("===========test1===============");
		a.print();

		System.out.println("===========test2===============");
		b.print();
		
		System.out.println("===========test3===============");
		c.print();
	
		System.out.println("===========test4===============");
		d.accept();
		d.print();
		
	}
}
