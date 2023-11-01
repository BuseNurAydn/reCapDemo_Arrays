package reCapDemo_Arrays;

public class Main {

	public static void main(String[] args) {
		//1 -> dizinin elemanlarýný sýraladýk
	    //2 -> elemanlarý topladýk
		//3 -> elemanlarýn en büyüðünü bulduk
		double [] myList = {1.5,3.7,9.1,6.8};
		double total = 0;
		double max =myList[0];     //en büyük sayý 0.indexdeki olsun dedik
		
		for(double number : myList) {
			if(max <number) {
				max = number;
			}
		
		total = total + number;
		System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En büyük= " + max);

	}

}
