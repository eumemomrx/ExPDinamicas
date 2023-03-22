package view;

import br.edu.fateczl.pdinamicas.Pilha;

public class Main {

	public static void main(String[] args) throws Exception {
		Pilha p = new Pilha();
		int[] vet = {100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92};
		int tam = vet.length;
		for (int i=0; i<tam; i++) {
			if (p.isEmpty()) {
				p.push(vet[i]-10);
			}else if(vet[i] % 5 == 0){
				p.push(vet[i]/5); 
			}else if(vet[i]% 3 ==0) {
				p.push(vet[i]*3);
			}else {
				int v1 = p.pop();
				System.out.println(v1/2);
			}
		}
	}

}
