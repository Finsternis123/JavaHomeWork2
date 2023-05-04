package JavaWork.JavaHomeWork.JavaHomeWork2;
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
public class Task2 {
    public static void main(String[] args) {
        String[] arr = {"c", "b", "a"};
        for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();

		int s = arr.length;
		String temp;
 
		for (int i = 0; i < s / 2; i++) {
		    temp = arr[s - i - 1];
		    arr[s - i - 1] = arr[i];
		    arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}
    

