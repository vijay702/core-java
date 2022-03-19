package com.multithreading;




class Book extends Thread{
public void run(){
		
		for(int i =1;i<=5;i++) {
			
			System.out.println("Updating DataBase");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}



class Number extends Thread {
	
public void run(){
		
		for(int i=1 ; i<=5;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


public class MultithreadingExample {
	
	

	
	

	public static void main(String[] args) throws InterruptedException {
		
		Book book = new Book();
		Number num = new Number();
		
		//book.updateDb();
		book.start();
		
		//num.print();
		num.start();
		
		book.join();
		num.join();
		
		System.out.println("Bye !!!....");
		
		

	}

}
