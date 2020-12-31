import java.util.ArrayList;

public class LinkedDeque<T> implements DequeInterface<T> {

	protected DLLNode<T> front;     // reference to the front of this queue
	protected DLLNode<T> rear;      // reference to the rear of this queue
	protected int numElements = 0; // number of elements in this queue

	public LinkedDeque() {
		front = null;
		rear = null;
	}

	/* Complete the definition of this LinkedDeque class by 
	 * implementing all methods required by the interface DequeInterface. 
	 * Eclipse can add stubs for all the required methods. 
	 */ 


	/* The following private method must be recursive. It traverses
	 * the deque front to rear and builds and returns the string
	 * consisting of deque elements. Use space or comma as a separator.
	 */
	private String makeString(DLLNode<T> list) {
		String empty = " "; 
		if (list == null) { 
			return empty; 
		}
		else 
			empty = empty + list.getInfo().toString() + makeString(list.getForward()); 

		return empty; 
	}

	@Override
	public String toString() {
		// Do not modify this method.
		return makeString(front);
	}

	@Override
	public void enqueueFront(T element) {
		// TODO Auto-generated method stub
		DLLNode<T> newNode = new DLLNode<T>(element); 
		if (rear == null)
			rear = newNode; 
		else {
			newNode.setForward(front);
			front.setBack(newNode);
		}
		front = newNode; 
		numElements++; 
	}

	@Override
	public void enqueueRear(T element) {
		// TODO Auto-generated method stub
		DLLNode<T> newNode = new DLLNode<T>(element); 
		if (front == null)
			front = newNode; 
		else {
			rear.setForward(newNode);
			newNode.setBack(rear);
		}
		rear = newNode; 
		numElements++; 
	}

	@Override
	public T dequeueFront() throws QueueUnderflowException {
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new QueueUnderflowException("Dequeue is empty.");
		else { 
			T element; 
			element = front.getInfo(); 
			front = front.getForward();
			if (front != null) { 
				front.setBack(null);
			}
			if (front == null)
				rear = null; 
			numElements--; 
			return element; 
		}

	}

	@Override
	public T dequeueRear() throws QueueUnderflowException {
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new QueueUnderflowException("Dequeue is empty."); 
		else { 
			T element; 
			element = rear.getInfo();
			if (rear.getBack() == null) { 
				front = null; rear = null; 
			}
			else { 
				rear.getBack().setForward(null); //set back? 
			}

			rear = rear.getBack(); 
			numElements--; 
			return element;  
		}

	}
	@Override
	public T nthFront(int n) {
		// TODO Auto-generated method stub
		DLLNode<T> newNode1 = front;
		if (isEmpty() || n > size() || n <= 0)
			return null;

		else { 
			for (int i = 1; i < n; i++)
				newNode1 = newNode1.getForward(); 
		}
		return newNode1.getInfo(); 	
	}

	@Override
	public T nthRear(int n) {
		// TODO Auto-generated method stub
		DLLNode<T> newNode1 = rear;
		if (isEmpty() || n > size() || n <= 0)
			return null;

		else  {
			for (int i = 1; i < n; i++)
				newNode1 = newNode1.getBack(); 
		}
		return newNode1.getInfo(); 	
	} 


	@Override
	public void enqueueAll(boolean flag, ArrayList<T> elementList) {
		// TODO Auto-generated method stub
		if (flag == true) { 
			for (int a = 0; a < elementList.size(); a++) {
				enqueueFront(elementList.get(a)); 	
			} 
		}
		else if (flag == false) { 
			for (int a = 0; a < elementList.size(); a++) {
				enqueueRear(elementList.get(a));
			} 
		}

	}

	@Override
	public ArrayList<T> dequeueAll(boolean flag, int n) throws QueueUnderflowException, OutOfRangeException {
		// TODO Auto-generated method stub 
		ArrayList<T> arraylist = new ArrayList<T>();
		if (isEmpty())
			throw new QueueUnderflowException("It is empty"); 
		if (n < 0 || n > size())
			throw new OutOfRangeException("n is not valid"); 
		else {  
			if (flag == true)
				for (int a = 0; a < n; a++) {
					T element1 = dequeueFront();
					arraylist.add(element1); 
				}
			else 
				if (flag == false)
					for (int a = 0; a < n; a++) {
						T element2 = dequeueRear();
						arraylist.add(element2); 
					} 
		}
		return arraylist; 	

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (numElements == 0)
			return true; 
		else 
			return false; 
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}
}
