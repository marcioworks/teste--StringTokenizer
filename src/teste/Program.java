//package teste;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class Program {
//
//	@SuppressWarnings("null")
//	public static void main(String[] args) {
//
//		String arquivo = "D:\\received_payments_report_2019_10_21.csv";
//		String conteudo = "";
//		String[] colunas = null;
//		String[] dados = null;
//
//		Integer linha = 0;
//
//		
//		HashMap<Integer, String> map = new HashMap<>();
//		HashMap<String, String> lista = new HashMap<>();
//
//		try {
//			BufferedReader bReader = new BufferedReader(new FileReader(arquivo));
//			StringBuffer bufSaida = new StringBuffer();
//
//			while ((conteudo = bReader.readLine()) != null) {
//				map.put(linha, conteudo);
//				linha++;
//			}
//
//			bReader.close();
//
//		} catch (FileNotFoundException e1) {
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//
//		 for(int i = 0; i < linha;i++){
//		 //System.out.println(map.get(i));
//		 }
//		 
//		
//	
//		
//
//		colunas = map.get(0).split(",");
//		System.out.println(colunas.length);
//		dados = map.get(1).split(",");
//		System.out.println(dados.length);
//		for (int i = 0; i < dados.length; i++) {
//			System.out.print(dados[i] + ",");
//		}
//		 
//		
//		 
//		
//	}
//
//}
