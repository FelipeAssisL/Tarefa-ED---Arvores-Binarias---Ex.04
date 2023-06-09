package view;

import br.edu.fateczl.arvoreint.Arvore;

public class main {

	public static void main(String[] args) throws Exception {
		int[] vet = {7, 8, 3, 4, 2, 1, 6, 5};
		Arvore arvore = new Arvore();
		for(int i : vet) {
			arvore.insert(i);
		}
		arvore.remove(7);
		arvore.remove(6);
		System.out.print("Pré-ordem: ");
		arvore.prefixSearch();
		System.out.println(" ");
		System.out.print("Pós-ordem: ");
		arvore.postfixSearch();
		System.out.println(" ");
		System.out.print("Em ordem: ");
		arvore.infixSearch();
	}
}