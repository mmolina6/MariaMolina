import java.util.ArrayList;

public class Proj2Main {

	public static void main(String[] args) {
		//Provide your tests below.
		DequeInterface<Integer> dq = new
				LinkedDeque<Integer>(); 

		dq.enqueueFront(2);
		dq.enqueueFront(3);
		dq.enqueueFront(7);
		dq.enqueueRear(4); 
		dq.enqueueRear(9);
		dq.enqueueRear(13);
		System.out.println("Method names: enqueueFront and enqueueRear"); 
		System.out.println("Test inputs: enqueue the elements 2,3,7,4,9,13"); 
		System.out.println("Test result: " + dq.toString()); 

		System.out.println(" "); 

		System.out.println("Method names: dequeueFront and dequeueRear"); 
		System.out.println("Test inputs: " + dq.toString()); 
		dq.dequeueFront();
		dq.dequeueRear();
		System.out.println("Test result: " + dq.toString()); 

		System.out.println(" ");

		DequeInterface<Integer> dq2 = new
				LinkedDeque<Integer>();
		dq2.enqueueFront(5);
		dq2.enqueueFront(9);
		dq2.enqueueFront(10);
		dq2.enqueueFront(11);
		dq2.enqueueFront(15);
		dq2.enqueueFront(18);
		dq2.enqueueFront(2);
		dq2.enqueueFront(6);
		dq2.enqueueRear(11);

		System.out.println("dq2 is: " + dq2.toString()); 
		System.out.println("The size of dq2 is: " + dq2.size());

		System.out.println(" ");

		System.out.println("Method name: nthFront"); 
		System.out.println("Test inputs: 4, 9, 10"); 
		System.out.println("Test result: " + dq2.nthFront(4) + " " + dq2.nthFront(9) + " " + dq2.nthFront(10));

		System.out.println(" ");

		System.out.println("Method name: nthRear"); 
		System.out.println("Test inputs: 8, 2, 13"); 
		System.out.println("Test result: " + dq2.nthRear(8) + " " + dq2.nthRear(2) + " " + dq2.nthRear(13));

		System.out.println(" ");

		System.out.println("Method name: dequeueAll"); 
		System.out.println("Test input: true, 5"); 
		try {
			System.out.println("Test result: " + (dq2.dequeueAll(true, 5)).toString());
		} catch (QueueUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" ");

		System.out.println("Method name: dequeueAll"); 
		System.out.println("Test input: false, 8"); 
		try {
			System.out.println("Test result: " + (dq2.dequeueAll(false, 8)).toString());
		} catch (QueueUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" ");
		System.out.println("Method name: dequeueAll"); 
		System.out.println("Test input: false, 1"); 
		try {
			System.out.println("Test result: " + (dq2.dequeueAll(false, 1)).toString());
		} catch (QueueUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" ");

		ArrayList<Integer> array1 = new ArrayList<Integer>(); 
		array1.add(2); array1.add(5); array1.add(8); array1.add(9); array1.add(15);
		System.out.println("array1 is " + array1); 

		ArrayList<Integer> array2 = new ArrayList<Integer>(); 
		array2.add(45); array2.add(37); array2.add(42); array2.add(74); array2.add(98);
		System.out.println("array2 is " + array2); 

		System.out.println("Method name: enqueueAll"); 
		System.out.println("Test input: false, array1"); 
		dq2.enqueueAll(false, array1); 
		System.out.println("Test result: " + dq2);

		System.out.println(" ");


		System.out.println("Method name: enqueueAll"); 
		System.out.println("Test input: true, array2"); 
		dq2.enqueueAll(true, array2);
		System.out.println("Test result: " + dq2);

		System.out.println(" ");

	}
}
