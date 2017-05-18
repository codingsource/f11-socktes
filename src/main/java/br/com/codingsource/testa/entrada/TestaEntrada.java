package br.com.codingsource.testa.entrada;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		InputStream is;
		try {
			// Abrinddo arquivo para leitura
			is = new FileInputStream("./file/arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// Primeira linja
			String s = br.readLine();

			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("O sistema não pode localizar o arquivo especificado");
		}
	}

}