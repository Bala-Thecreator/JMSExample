package com.marlabs.bala;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final ExampleMessageSender sender = new ExampleMessageSender();

		final ExampleMessageReceiver receiver = new ExampleMessageReceiver();
		receiver.startListener();

		for (int i = 1; i <= 5; i++) {
			String m = "Hello world! " + i;
			sender.sendMessage(m);
			Thread.sleep(300);
		}

		sender.destroy();
		receiver.destroy();
	}

}


