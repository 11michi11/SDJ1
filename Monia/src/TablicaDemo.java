import java.util.Random;

public class TablicaDemo {
	
	public static void main(String[] args) {
		Tablica tab = new Tablica(5);
		
		Random rn = new Random(); //generator liczb losowych w Javie
	
		for(int i=0;i<5;i++)
			tab.addElement(rn.nextInt(10));
		
		for(int i=0;i<5;i++) 
			System.out.println(tab.getElement(i));
		
		
		System.out.println("Max value: " + tab.getMax());
		System.out.println("Max element: " + tab.getMaxElement());
		System.out.println("Sum: " + tab.getSum());
		System.out.println("Has all different values: " + tab.hasDifferentValues());
		System.out.println("Is a 2nd elem in 3 first places: " + tab.isAnElementInKFirstIndexes(tab.getElement(2), 3));
		System.out.println("Is a 4th elem in 3 first places: " + tab.isAnElementInKFirstIndexes(tab.getElement(4), 3));
	
		Tablica tabRep = new Tablica(5);
		
		tabRep.addElement(1);
		tabRep.addElement(2);
		tabRep.addElement(2);
		tabRep.addElement(3);
		tabRep.addElement(3);

		System.out.println("\n");
		for(int i=0;i<5;i++) 
			System.out.println(tabRep.getElement(i));
		
		tabRep.deleteRepetitions();

		System.out.println("\n");
		for(int i=0;i<5;i++) 
			System.out.println(tabRep.getElement(i));
	}
}
