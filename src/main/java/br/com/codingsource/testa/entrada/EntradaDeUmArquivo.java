package br.com.codingsource.testa.entrada;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("./file/arquivo.txt");
		Scanner entrada = new Scanner(is);
		PrintStream ps = new PrintStream("./file/outPrintStream.txt");		
		do {
			String string = entrada.nextLine();
			ps.println(string);
		} while (entrada.hasNextLine());
		entrada.close();
	}

}
