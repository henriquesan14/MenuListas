
public class Lista {
	Contato[] contatos=new Contato[100];
	int n=0;
	
	
	public boolean isVazia(){
		return (n==0);
	}

	public boolean isCheia(){
		return (n==contatos.length);
	}
	
	public int tamanho(){
		return n;
	}
	
	public Contato buscar(int pos){
		if ((pos>=n)||(pos<0)){return null;}
		
		return  contatos[pos];
	}
	
	public boolean compara(Contato contato1, Contato contato2){
		
		return (contato1.getNome().equals(contato2.getNome()))&&(contato1.getTelefone().equals(contato2.getTelefone()));
	}
	
	public int getPosicao(Contato contato){
		for(int i=0;i<n;i++)
			if (compara(contatos[i], contato))
				return i;
		
		return -1;
	}
	
	public void deslocaDireita(int pos){
		for (int i=n;i>pos;i--)
			contatos[i]=contatos[i-1];
	}
	
	 boolean inserir (int pos, Contato contato){
		if (isCheia()||(pos>n)||(pos<0))
			return false;
		deslocaDireita(pos);
		contatos[pos]=contato;
		n++;
		return true;
	}
	
	public void deslocaEsquerda(int pos){
		for(int i=pos;i<n-1;i++)
			contatos[i]=contatos[i+1];
	}
	
	public boolean remover(int pos){
		if(pos>=n||pos<0)
			return false;
		
		deslocaEsquerda(pos);
		n--;
		return true;
	}
	
	public void exibirLista(){
		for (int i=0;i<n;i++){
			System.out.println("\nContato"+(i+1)+"\nNome: "+contatos[i].getNome()+"\nTelefone: "+contatos[i].getTelefone());
		}
	}




}	




