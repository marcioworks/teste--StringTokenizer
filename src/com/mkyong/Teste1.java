package com.mkyong;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import teste.campos;

public class Teste1 {
	@SuppressWarnings("unused")
	public void arquivo() {
		String linha = null;
		String arquivo = "D:\\received_payments_report_2019_10_21.csv";
		List<campos> campos = new ArrayList<campos>();
		

		try {
			// FileReader reader = new FileReader(new FileReader(arquivo));
			BufferedReader reader = new BufferedReader(new FileReader(arquivo));// Localização
																				// do
																				// Arquivo
			BufferedReader leitor = new BufferedReader(reader);
			
			StringTokenizer st = null;
			int i = 1;
			campos c = new campos();

			while ((linha = leitor.readLine()) != null) {
				// UTILIZA DELIMITADOR ; PARA DIVIDIR OS CAMPOS
				StringBuilder recebido = new StringBuilder(); 
				recebido.append(linha);
				recebido.insert(linha.length(), ",");
				String recebido2 = recebido.toString();
				String teste = recebido2.replace(",,", ", ,");
				String teste2 = teste.replace(",,", ", ,");
				
				st = new StringTokenizer(teste2, ",");
				
				
				
				String dados = null;
				if (i >= 1) {

					while (st.hasMoreTokens()) {
						
						dados = st.nextToken();
						c.setCompanyAccount(dados);
						
						

						dados = st.nextToken();
						c.setMerchantAccount(dados);

						dados = st.nextToken();
						c.setPspReference(dados);

						dados = st.nextToken();
						c.setMerchantReference(dados);

						dados = st.nextToken();
						c.setPaymentMethod(dados);

						dados = st.nextToken();
						c.setPaymentMethodVariant(dados);

						dados = st.nextToken();
						c.setCreationDate(dados);

						dados = st.nextToken();
						c.setTimeZone(dados);

						dados = st.nextToken();
						c.setCurrency(dados);

						dados = st.nextToken();
						c.setAmount(dados);

						dados = st.nextToken();
						c.setType(dados);

						dados = st.nextToken();
						c.setRiskScoring(dados);

						dados = st.nextToken();
						c.setShopperInteraction(dados);

						dados = st.nextToken();
						c.setShopperName(dados);

						dados = st.nextToken();
						c.setShopperPAN(dados);

						dados = st.nextToken();
						c.setShopperIP(dados);

						dados = st.nextToken();
						c.setShopperCountry(dados);

						dados = st.nextToken();
						c.setIssuerName(dados);

						dados = st.nextToken();
						c.setIssuerId(dados);

						dados = st.nextToken();
						c.setIssuerCity(dados);

						dados = st.nextToken();
						c.setIssuerCountry(dados);

						dados = st.nextToken();
						c.setAcquirerResponse(dados);

						dados = st.nextToken();
						c.setRawAcquirerResponse(dados);

						dados = st.nextToken();
						c.setAuthorisationCode(dados);

						dados = st.nextToken();
						c.setShopperEmail(dados);

						dados = st.nextToken();
						c.setShopperReference(dados);

						dados = st.nextToken();
						c.set_3DDirectoryResponse(dados);

						dados = st.nextToken();
						c.set_3DAuthenticationResponse(dados);

						dados = st.nextToken();
						c.setCVC2Response(dados);

						dados = st.nextToken();
						c.setAVSResponse(dados);

						dados = st.nextToken();
						c.setBillingStreet(dados);

						dados = st.nextToken();
						c.setBillingHouseNumber(dados);

						dados = st.nextToken();
						c.setBillingCity(dados);

						dados = st.nextToken();
						c.setBillingPostalCode(dados);

						dados = st.nextToken();
						c.setBillingState(dados);

						dados = st.nextToken();
						c.setBillingCountry(dados);

						dados = st.nextToken();
						c.setDeliveryStreet(dados);

						dados = st.nextToken();
						c.setDeliveryHouseNumber(dados);

						dados = st.nextToken();
						c.setDeliveryCity(dados);

						dados = st.nextToken();
						c.setDeliveryPostalCode(dados);

						dados = st.nextToken();
						c.setDeliveryState(dados);

						dados = st.nextToken();
						c.setDeliveryCountry(dados);

						dados = st.nextToken();
						c.setAcquirerReference(dados);

						dados = st.nextToken();
						c.setAlternativeAcquirerReference(dados);

						dados = st.nextToken();
						c.setAcquirer(dados);

						dados = st.nextToken();
						c.setInstallments(dados);

						dados = st.nextToken();
						c.setBINFundingSource(dados);

						dados = st.nextToken();
						c.setMerchantOrderReference(dados);

						dados = st.nextToken();
						c.setReserved4(dados);

						dados = st.nextToken();
						c.setReserved5(dados);

						dados = st.nextToken();
						c.setReserved6(dados);

						dados = st.nextToken();
						c.setReserved7(dados);

						dados = st.nextToken();
						c.setReserved8(dados);

						dados = st.nextToken();
						c.setReserved9(dados);

						dados = st.nextToken();
						c.setReserved10(dados);

					}
					if (i == 1) {
						c = new campos();
						i += 1;
					} else {

						campos.add(c);
					}

				}
			}
			leitor.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 public static void main(String[] args) {
	 Teste1 t = new Teste1();
	 t.arquivo();
	 }

}
