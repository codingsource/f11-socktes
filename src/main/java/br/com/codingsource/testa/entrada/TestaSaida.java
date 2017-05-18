package br.com.codingsource.testa.entrada;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaSaida {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("./file/saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw =  new BufferedWriter(osw);
		
		bw.write("caelum");
		
		bw.close();
	}

}