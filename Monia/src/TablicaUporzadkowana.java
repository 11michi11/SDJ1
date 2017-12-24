import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TablicaUporzadkowana {

	private int[] numbers;
	private int numberOfElements;

	public TablicaUporzadkowana(int maxNumberOfNumbers) {
		this.numbers = new int[maxNumberOfNumbers];
		this.numberOfElements = 0;
	}

	// Wstawia liczbê do uporz¹dkowanej tablicy
	public void add(int x) {
		if(numberOfElements+1 <= numbers.length) {
			int index = 0;
			// Szuka odpowiedniego miejsca
			for (int i = 0; i < numbers.length; i++)
				if (numbers[i] >= x) {
					index = i;
					break;
				}
			// Przesuwa resztê tablicy, ¿eby zrobiæ miejsce
			for (int i = index + 1; i < numbers.length - 1; i++)
				numbers[i] = numbers[i - 1];
	
			// wstawia element w odpowiednie miejsce
			numbers[index] = x;
		}
	}

	public void deleteAtIndex(int index) {
		// Tworzy now¹ tablicê, o jeden element mniejsz¹
		int[] array = new int[numbers.length - 1];

		int inx = 0;
		// Kopiuje do nowej tablicy wszytkie elemnty, oprócz tego na podanym indeksie
		for (int i = 0; i < numbers.length; i++)
			if (i != index) {
				array[inx] = numbers[i];
				inx++;
			}
		// Przypisuje now¹ tablicê do pola
		this.numbers = array;
	}

	public void delete(int value) {
		// Tworzy now¹ tablicê, o jeden element mniejsz¹
		int[] array = new int[numbers.length - 1];
		boolean flag = true; // flaga sprawdzaj¹ca czy element juz zosta³ usuniety
		int index = 0;

		// Kopiuje do nowej tablicy wszytkie elemnty, oprócz tego JEDNEGO o danej
		// wartoœci
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] == value && flag) {
				continue;
			} else {
				array[index] = numbers[i];
				index++;
			}
		// Przypisuje now¹ tablicê do pola
		this.numbers = array;
	}

	public void deleteAll(int value) {
		//Liczy iloœæ elementów do usuniêcia
		int counter = 0;
		for (int e : numbers)
			if (e == value)
				counter++;
		//Tworzy tablicê odpowiedniej wielkoœci
		int[] array = new int[numbers.length - counter];
		int index = 0;
		//Kopiuje wszystkie wartoœci oprócz podanej
		for(int e:numbers)
			if(e != value) {
				array[index] = e;
				index++;
			}
		
		this.numbers = array;
	}
	
	public boolean isAnElementInKFirstIndexes(int x, int k) {
		for (int i = 0; i <= k; i++)
			if (numbers[i] == x)
				return true;
		return false;
	}
	
	//To samo co wczeœniej, tylko nie musimy sortowaæ
	public void deleteRepetitions() {
		int numberOfDistinctElements = 0;
		for (int i = 0; i < numbers.length - 1; i++)
			if (numbers[i] != numbers[i + 1])
				numberOfDistinctElements++;
		
		int[] array = new int[numberOfDistinctElements];
		int index = 0;

		for (int i = 0; i < numbers.length - 1; i++)
			if (numbers[i] != numbers[i + 1]) {
				array[index] = numbers[i];
				index++;
			}

		this.numbers = array;
	}

}
