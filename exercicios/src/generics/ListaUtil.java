package generics;

import java.util.List;

public class ListaUtil {

	public static Object getultimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getultimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C getultimo3(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
