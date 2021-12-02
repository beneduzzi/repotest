import java.util.ArrayList;
import java.util.Iterator;

public class CadClientes{
	
	public static void main(String[] args) throws Exception{
		//declarando o ArrayList...
		ArrayList<Cliente> lista = new ArrayList<Cliente>();

		Cliente c1 = new Cliente();
		c1.setCpf("123.123.123-12");
		c1.setNome("Marcos");
		//adicionando objeto na lista
		lista.add(c1);

		Cliente c2 = new Cliente();
		c2.setCpf("234.234.234-23");
		c2.setNome("Ana");
		lista.add(c2);
		
		Cliente c3 = new Cliente();
		c3.setCpf("345.345.345-34");
		c3.setNome("Lucas");
		lista.add(c3);
		
		System.out.println("Percorrendo toda a lista");
		//declara o iterator para percorrer a lista
		//lista.iterator() devolve um ponteiro para o início da lista
		Iterator <Cliente> it = lista.iterator();
		while(it.hasNext()){
			//pega o próximo elemento da lista
			Cliente cli = it.next();
			System.out.println("Cliente: " + cli.getNome() + "   CPF: " + cli.getCpf());
		}

		//Dois objetos com o mesmo conteúdo não são o mesmo objeto!
		//tentar remover um item desta forma não funciona 
		Cliente cRemover = new Cliente();
		cRemover.setCpf("234.234.234-23");
		cRemover.setNome("Ana");		
		if(lista.contains(cRemover)){
			System.out.println("\nCliente a ser removido encontrado comparando objetos");
		}

		//Removendo um item da lista
		Iterator <Cliente> it2 = lista.iterator();
		while(it2.hasNext()){
			if(it2.next().getCpf().equals(c2.getCpf())){
				System.out.println("\nCliente a ser removido encontrado comparando o conteudo dos objetos");
				it2.remove();
			}
		}

		System.out.println("\nPercorrendo novamente a lista");
		Iterator <Cliente> it3 = lista.iterator();
		while(it3.hasNext())
		{
			Cliente cli = it3.next();
			System.out.println("Cliente: " + cli.getNome() + "   CPF: " + cli.getCpf());
		}
	}
}
