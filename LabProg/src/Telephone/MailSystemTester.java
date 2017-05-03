package Telephone;

import java.util.Scanner;

public class MailSystemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MailSystem mailsystem = new MailSystem(5);
		Scanner sc =new Scanner(System.in);
		Telephone tele= new Telephone();
		Connection connect = new Connection(mailsystem, tele);
		tele.run(connect);
		
		
	
	}

}
