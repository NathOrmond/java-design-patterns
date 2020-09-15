package behavioural.observer;

import java.util.Scanner;

public class RunObserver {

	private static IObservable subject;
	private static IObserver observer;
	
	public static void main(String[] args) {
		subject = new ConcreteObservable();
		observer = new ConcreteObserver(subject);
		subject.registerObserver(observer);
		
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.print("Enter Input");
		while((input = sc.next()) != "0") { 
			subject.setState(input);
		}
		
		System.out.print("Exit");
	}
	
}
