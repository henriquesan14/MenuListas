
public class Lista2 {
	Aluno primeiro=null;
	Aluno ultimo=null;
	int total=0;
	
	
	public boolean isVazia(){
		if(total==0){
			return true;
		}
		return false;
	}
	
	public void inserirNoInicio(Aluno a){
		if (isVazia()){
			primeiro=ultimo=a;
		}
		else{
			a.proximo=primeiro;
			primeiro=a;
		}
		total++;
	}
	
	public void inserirNoFim(Aluno a){
		if (isVazia()){
			primeiro=ultimo=a;
		}
		else{
			ultimo.proximo=a;
			ultimo=a;
		}
		total++;
	}
	
	public void exibirLista(){
		Aluno temp=primeiro;
		if(isVazia()==false){
			for (int i=0;i<total;i++){
				System.out.println("Aluno "+i+" |nome: "+temp.nome+" |idade: "+temp.idade);
				temp=temp.proximo;
			}
		}
	}
	
	public int tamanho(){
		return total;
	}
	
	public void removeAluno(Aluno a){
		Aluno temp=primeiro;
		Aluno anterior=null;
		
		if(total==0){
			System.out.println("lista vazia");
			return;
		}
		
		if (total==1){
			primeiro=null;
			return;
		}
	
		for(int i=0;i<total;i++){
			if(a.nome.equals(temp.nome)){
				anterior.proximo=temp.proximo;
				total--;
				return;
			}else{
				System.out.println("to andando");
				anterior=temp;
				temp=temp.proximo;
			}
		}
		
		
	}
	
	
	
	
	
}
