package br.com.codingsource.testa.entrada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is;
		Scanner entrada = null;
		try {
			is = new FileInputStream("./file/arquivo.txt");
			entrada = new Scanner(System.in);

			System.out.println("Digite sua mensagem:");
			while (entrada.hasNextLine()) {
				System.out.println(entrada.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel localizar o arquivo especificado!");
		} finally {
			entrada.close();
		}
	}

}
