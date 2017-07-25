import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Bruno
 *
 */
public class Publica {
	public void exibe(String nomeElemento){
		System.out.println("O nome impresso foi " + nomeElemento);
		ArrayList<String> nt = new ArrayList<>();
		nt.add(nomeElemento);
		System.out.println(nt.contains(nomeElemento));
		
	}
}
