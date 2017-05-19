package br.com.codingsource.testa.entrada;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./file/arquivo.txt")));
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