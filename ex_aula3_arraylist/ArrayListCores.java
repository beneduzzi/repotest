import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListCores {
	public static void main(String[] args) {
		String[] cores = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> listaCores = new ArrayList<String>();
		for (String cor : cores) {
			listaCores.add(cor);
		}

		System.out.println("ArrayList: ");
		for (int count = 0; count < listaCores.size(); count++) {
			System.out.print(listaCores.get(count) + " ");
		}

		String[] coresParaRemover = { "RED", "WHITE", "BLUE" };
		List<String> listaRemover = new ArrayList<String>();
		for (String cor : coresParaRemover){
			listaRemover.add(cor);
		}

		removerCores(listaCores, listaRemover);

		System.out.println("\n\nArrayList depois de chamar removeColors: ");
		for (String cor : listaCores) {
			System.out.print(cor + " ");
		}

		String[] coresParaAdicionar = { "GREEN", "YELLOW", "BLACK" };
		for (String cor : coresParaAdicionar) {
			listaCores.add(cor);
		}

		System.out.println("\n\nArrayList com as novas cores: ");
		for (String cor : listaCores) {
			System.out.print(cor + " ");
		}
	}

	private static void removerCores(Collection<String> lista, Collection<String> listaRemover) {
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			if (listaRemover.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
}
