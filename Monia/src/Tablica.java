import java.util.Arrays;

public class Tablica {

	/*
	 * Okej, mam problem. S� dwie opcje zrobienia tego zadania. Albo ustalamy, �e
	 * rozmiar tablicy si� nie zmienia i nasza domy�lna warto�� to 0 Albo zmianiamy
	 * rozmiar tablicy gdy j� modyfikujemy. Ja przyjm� t� pierwsz�.
	 */

	// Pole o nazwie 'numbers' typu tablicy int�w, prywatne
	private int[] numbers;
	// Zmianna przechowuj�ca obecn� liczb� element�w w tablicy (oraz r�wnie� obacny
	// index)
	private int numberOfElements;
	private int maxNumberOfNumbers;

	// Konstruktor, przyjumuje jeden parametr typu int
	public Tablica(int maxNumberOfNumbers) {
		// Inicjalizuje, czyli przypisuje do pola klasy (this) now�, pust� tablice
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

	// Zwraca najwi�ksz� WARTO��
	public int getMax() {
		int max = numbers[0];
		for (int e : numbers)
			if (e > max)
				max = e;
		return max;
	}

	// Zwraca najwi�kszy ELEMENT, taka jest r�w�nica, bo pytali w zadaniu
	// Czyli to zwraca referencj� na zmienn� (obiekt)
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

	// Sprawdza czy jest r�nowarto�ciowa. Sortuje tablice,
	// nast�pnie sprawdza czy ka�dy element jest r�zny od nast�pnego
	// Zrobi�em .clone, �eby zrobi� kopie tablicy i j� modyfikowa�
	public boolean hasDifferentValues() {
		int[] array = numbers.clone();
		Arrays.sort(numbers);

		for (int i = 0; i < array.length - 1; i++)
			if (numbers[i] == numbers[i + 1])
				return false;
		return true;
	}

	// Usuwa wszystkie wyst�pienie danej warto�ci
	// Najpierw sprawdza, ile jest takich warto�ci (counter)
	// Nastepnie tworzy now� list�, a odpowiednio zmniejszonej wielko�ci
	// i kopiuje wszystko opr�cz danej warto�ci
	// To ca�e robienie nowej tablicy jest po to, �eby nie by�o dziur w tablicy
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

	// Usuwa powtarzaj�ce si� elementy
	// Najpierw sortuje tablice, potem sprawdza ile jest pojedynczych element�w
	// Tworzy tablic� odpowiedniej wielko�ci i kopiuje warto�ci
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
