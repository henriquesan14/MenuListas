import java.util.Scanner;



public class Principal {
	
	
	
	public static void main(String[] args) {
		menu();
		
	}

	public static void menu(){
			int opc;
			Scanner entrada=new Scanner(System.in);
			System.out.println("Qual lista você deseja implementar? ");
			System.out.println("1-Lista Sequencial ");
			System.out.println("2-Lista Encadeada ");
			System.out.println("3-Sair ");
			opc=entrada.nextInt();
			switch(opc){
			case 1: listaSeq();break;
			case 2: listaEnc();break;
			case 3: System.out.println("Encerrado!");break;
			default:System.out.println("Opção Inválida!");menu();
			}
		
	}
	
	public static void listaSeq(){
		Scanner entrada=new Scanner(System.in);
		int op,pos,posicao;
		String opcao,nome,tel;
		System.out.println("Deseja criar lista sequencial? SIM/NAO");
		opcao=entrada.nextLine();
		if (opcao.equalsIgnoreCase("sim")){
			Lista listasequencial=new Lista();
			do{
			System.out.println("O que você deseja fazer? ");
			System.out.println("1-Inserir elemento");
			System.out.println("2-Remover elemento ");
			System.out.println("3-Exibir a lista ");
			System.out.println("4-Retornar ao menu anterior ");
			op=entrada.nextInt();
			Contato c1=new Contato();
			switch(op){
			case 1: 
				System.out.println("Qual nome do contato ?");
				nome=entrada.next();
				c1.setNome(nome);
				System.out.println("Qual número do contato ?");
				tel=entrada.next();
				c1.setTelefone(tel);
				System.out.println("Qual posição vc quer inserir ?");
				pos=entrada.nextInt();
				listasequencial.inserir(pos, c1);			
				break;
			case 2: 
				System.out.println("Qual elemento você quer remover?");
				posicao=entrada.nextInt();
				listasequencial.remover(posicao);
				break;
			case 3:
				listasequencial.exibirLista();
				break;
			case 4: menu();break;
			default:System.out.println("Opção inválida");
			}
			}while(op!=4);
		}else{menu();}
		
	}
	
	public static void listaEnc(){
		Scanner entrada=new Scanner(System.in);
		int op,idade;
		String opcao,aluno;
		System.out.println("Deseja criar lista encadeada? SIM/NAO");
		opcao=entrada.nextLine();
		if (opcao.equalsIgnoreCase("sim")){
			Lista2 listaencadeada=new Lista2();
			do{
			System.out.println("O que você deseja fazer? ");
			System.out.println("1-Inserir elemento");
			System.out.println("2-Remover elemento ");
			System.out.println("3-Exibir a lista ");
			System.out.println("4-Retornar ao menu anterior ");
			op=entrada.nextInt();
			Aluno a1=new Aluno();
			switch(op){
			case 1:  
			System.out.println("Qual nome do aluno? ");
			aluno=entrada.next();
			a1.nome=aluno;
			System.out.println("Qual idade do aluno? ");
			idade=entrada.nextInt();
			a1.idade=idade;
			listaencadeada.inserirNoInicio(a1);
			break;
			case 2: listaencadeada.removeAluno(a1);break;
			case 3:listaencadeada.exibirLista();break;
			case 4:menu();break;
			default:System.out.println("Opção inválida");
			}
			}while(op!=4);
		}else{menu();}
		
		
	}
	

	
		
	
	

}
