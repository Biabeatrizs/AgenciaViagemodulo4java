package br.com.crud.teste;

import br.com.crud.dao.PacotesDAO;
import br.com.crud.model.Pacotes;


public class Pacote {

	public static void main(String[] args) {
		PacotesDAO pacotesDAO = new PacotesDAO();
		
	
		Pacotes pacote = new Pacotes();
		pacote.setIdPacotes(8);
		pacote.setOrigem("Beto carreiro");
		pacote.setDestino("Pernambo");
		pacote.setPreço(700);
		pacote.setDataIda("30/10/2022");
		pacote.setDataVolta("o5/11/2022");
		
		

		pacotesDAO.save(pacote);
		
		
		 /*Pacotes pacote = new Pacotes();
		    pacote.setIdPacotes(1);
			pacote.setOrigem("Belo Horizonte");
			pacote.setDestino("Porto de Galinhas");
			pacote.setPreço(900);
			pacote.setDataIda("13/02/2023");
			pacote.setDataVolta("20/02/2023");
			
			
			
		pacotesDAO.update(pacote);*/
		
	
		// pacotesDAO.removeById(2);
		
		
		for (Pacotes a : pacotesDAO.getPacotes()) {
			System.out.println("Id: " + a.getIdPacotes()  + "\nOrigem: " + a.getOrigem() + "\nDestino: " + a.getDestino() + "\nPreço: R$ " + a.getPreço() + "\nData Ida: " + a.getDataIda() + "\nData Volta: " + a.getDataVolta());
		}
	}
}