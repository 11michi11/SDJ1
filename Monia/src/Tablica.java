import java.util.Arrays;

public class Tablica {

	/*
	 * Okej, mam problem. S¹ dwie opcje zrobienia tego zadania. Albo ustalamy, ¿e
	 * rozmiar tablicy siê nie zmienia i nasza domyœlna wartoœæ to 0 Albo zmianiamy
	 * rozmiar tablicy gdy j¹ modyfikujemy. Ja przyjmê t¹ pierwsz¹.
	 */

	// Pole o nazwie 'numbers' typu tablicy intów, prywatne
	private int[] numbers;
	// Zmianna przechowuj¹ca obecn¹ liczbê elementów w tablicy (oraz równie¿ obacny
	// index)
	private int numberOfElements;
	private int maxNumberOfNumbers;

	// Konstruktor, przyjumuje jeden parametr typu int
	public Tablica(int maxNumberOfNumbers) {
		// Inicjalizuje, czyli przypisuje do pola klasy (this) now¹, pust¹ tablice
		this.numbers = new int[maxNumberOfNumbers];
		this.numberOfElements = 0;
		this.maxNumberOfNumbers = maxNumberOfNumbers;
	}

	public void addElement(int value) {
		if (numberOfElements + 1 <= maxNumberOfNumbers) {
			this.numbers[numberOfElements] = value;
			this.numberOfElements++;
		}
	}

	public int getElement(int index) {
		return numbers[index];
	}

	public int getSum() {
		int sum = 0;
		for (int e : numbers)
			sum += e;
		return sum;
	}

	// Zwraca najwiêksz¹ WARTOŒÆ
	public int getMax() {
		int max = numbers[0];
		for (int e : numbers)
			if (e > max)
				max = e;
		return max;
	}

	// Zwraca najwiêkszy ELEMENT, taka jest rów¿nica, bo pytali w zadaniu
	// Czyli to zwraca referencjê na zmienn¹ (obiekt)
	public int getMaxElement() {
		int maxIndex = 0;
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] > numbers[maxIndex])
				maxIndex = i;
		return numbers[maxIndex];
	}

	public boolean isAnElementInKFirstIndexes(int x, int k) {
		for (int i = 0; i <= k; i++)
			if (numbers[i] == x)
				return true;
		return false;
	}

	// Sprawdza czy jest ró¿nowartoœciowa. Sortuje tablice,
	// nastêpnie sprawdza czy ka¿dy element jest rózny od nastêpnego
	// Zrobi³em .clone, ¿eby zrobiæ kopie tablicy i j¹ modyfikowaæ
	public boolean hasDifferentValues() {
		int[] array = numbers.clone();
		Arrays.sort(numbers);

		for (int i = 0; i < array.length - 1; i++)
			if (numbers[i] == numbers[i + 1])
				return false;
		return true;
	}

	// Usuwa wszystkie wyst¹pienie danej wartoœci
	// Najpierw sprawdza, ile jest takich wartoœci (counter)
	// Nastepnie tworzy now¹ listê, a odpowiednio zmniejszonej wielkoœci
	// i kopiuje wszystko oprócz danej wartoœci
	// To ca³e robienie nowej tablicy jest po to, ¿eby nie by³o dziur w tablicy
	public void delete(int x) {
		int[] array = new int[numbers.length];

		int indx = 0;
		for (int e : numbers)
			if (e != x) {
				array[indx] = e;
				indx++;
			}
		this.numbers = array;
	}

	// Usuwa powtarzaj¹ce siê elementy
	// Najpierw sortuje tablice, potem sprawdza ile jest pojedynczych elementów
	// Tworzy tablicê odpowiedniej wielkoœci i kopiuje wartoœci
	public void deleteRepetitions() {
		Arrays.sort(numbers);

		int[] array = new int[numbers.length];
		int index = 0;

		for (int i = 0; i < numbers.length - 1; i++)
			if (numbers[i] != numbers[i + 1]) {
				array[index] = numbers[i];
				index++;
			}
		array[index] = numbers[numbers.length-1]; //dodaj ostatni element
		this.numbers = array;
	}

}
