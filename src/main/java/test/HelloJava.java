package test;

import java.util.ArrayList;
import java.util.Random;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's together jebi!");
		randomGame();
	}
	
	public static void randomGame() {
		ArrayList a = new ArrayList<String>();
		a.add("��");
		a.add("ȫ");
		a.add("��");
		a.add("��");
		
		a.add("��");
		
		
		int i = a.size();
		
		Random rnd = new Random();
		
		int j = rnd.nextInt(i);
		String st = a.get(j).toString();
		
		System.out.println(st);
		
		
	}

}
