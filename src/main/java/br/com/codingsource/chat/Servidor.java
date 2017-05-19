package br.com.codingsource.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class Servidor {

	private static PrintStream ps;

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(4000);
		System.out.println("Porta 4000 aberta!");
		Socket cliente = null;
		Scanner entrada = null;
		
		do {
			cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());

			entrada = new Scanner(cliente.getInputStream());

			ps = new PrintStream("./file/outFileServidor.txt");

			System.out.println(entrada.nextLine());
			ps.println(entrada.nextLine());
		} while (entrada.hasNextLine());

		entrada.close();
		servidor.close();
	}
}
