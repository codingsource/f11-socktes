package br.com.codingsource.chat;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	private static Socket cliente;

	public static void main(String[] args) throws UnknownHostException, IOException {
		cliente = new Socket("127.0.0.1", 4000);
		
		InputStream is = new FileInputStream("./file/arquivo.txt");
		Scanner s = new Scanner(is);
		PrintStream ps = new PrintStream(cliente.getOutputStream());

		while (s.hasNextLine()) {
			String string = s.nextLine();
			ps.println(string);
		}

		ps.close();
		s.close();
		cliente.close();
	}
}
