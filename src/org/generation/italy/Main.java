package org.generation.italy;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Creo una lista di 5 buoni propositi per il futuro
		ArrayList<String> buoniPropositi = new ArrayList<String>();
		buoniPropositi.add("Fare più attività fisica");
		buoniPropositi.add("Esercitarsi sulla OOP");
		buoniPropositi.add("Specializzarsi nell'ambito della programmazione");
		buoniPropositi.add("Organizzare una vacanza in Spagna");
		buoniPropositi.add("Ottenere la certificazione di inglese");
		
		// Creo un ciclo che continui fino al conseguimento di tutti i propositi
		do {
			
			System.out.println("Buoni propositi da conseguire:");
			
			for (int i = 0; i < buoniPropositi.size(); i++) {
			System.out.println((i + 1) + ") " + buoniPropositi.get(i));
			}
			
		//Inserire il proposito conseguito
			System.out.println("Scrivi il numero del proposito conseguito");
			
			int nLista = sc.nextInt() - 1;
			
			if (nLista >= 0 && nLista < buoniPropositi.size()) {
				buoniPropositi.remove(nLista);
				System.out.println("Proposito conseguito rimosso");
			} else {
				System.out.println("Errore, numero non presente nella lista. Riprovare");
			}
		} while (!buoniPropositi.isEmpty());
		
		System.out.println("Complimenti! Hai conseguito tutti i buoni propositi per il futuro");
		
		sc.close();
		
	}

}
