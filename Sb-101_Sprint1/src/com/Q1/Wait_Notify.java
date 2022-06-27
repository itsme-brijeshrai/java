package com.Q1;

public class Wait_Notify {
	private static final long SLEEP_INTERVAL = 3000;
	   private boolean running = true;
	   private Thread thread;
	   public void start() {
	      System.out.println("Inside start() method");
	      thread = new Thread(new Runnable() {
	         @Override
	         public void run() {
	            System.out.println("Inside run() method");
	            try {
	               Thread.sleep(SLEEP_INTERVAL);
	            } catch(InterruptedException e) {
	               Thread.currentThread().interrupt();
	            }
	            synchronized(Wait_Notify.this) {
	               setRunning(false);
	               Wait_Notify.this.notify();
	            }
	         }
	      });
	      thread.start();
	   }
	public boolean isRunning() {
		return running;
	}
	public void setRunning(boolean running) {
		this.running = running;
	}

public void join() throws InterruptedException {
    print("Inside join() method");
    synchronized(this) {
       while(running) {
          print("Waiting for the peer thread to finish.");
          wait(); //waiting, not running
       }
       print("Peer thread finished.");
    }
 }
 private void print(String s) {
    System.out.println(s);
 }
 public static void main(String[] args) throws InterruptedException {
    Wait_Notify test = new Wait_Notify();
    test.start();
    test.join();
 }
}
