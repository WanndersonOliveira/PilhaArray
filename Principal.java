import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		PilhaRubroNegra<String> prb = new PilhaRubroNegra<String>(5);

		prb.pushPreta("JP");
		prb.pushPreta("Pablo");
		prb.pushPreta("Rodrigo");

		prb.mostrarTudo();
		System.out.println("");

		prb.pushVermelha("Jesus");
		System.out.println("");
		prb.mostrarTudo();
		prb.pushVermelha("Pedro");
		System.out.println("");
		prb.mostrarTudo();
		prb.pushVermelha("Carlos");
		System.out.println("");
		prb.mostrarTudo();
		prb.pushVermelha("Plácido");
		System.out.println("");
		prb.mostrarTudo();

		System.out.println("");
		prb.pushPreta("Daniel");

		prb.mostrarTudo();
		//prb.mostrarVermelha();
		//prb.mostrarPreta();
		//System.out.println("Size Vermelha: "+prb.sizeVermelha());
		//System.out.println("Size Preta: "+prb.sizePreta());
		//System.out.println("Tamanho total: "+prb.capacidade);

		/*System.out.println("Tamanho Vermelha: "+prb.sizeVermelha());
		System.out.println("Tamanho Preta: "+prb.sizePreta());

		System.out.println("TOP Vermelha");
		System.out.println(prb.topVermelha());
		System.out.println("TOP Preta");
		System.out.println(prb.topPreta());

		System.out.println("POP Vermelha");
		System.out.println(" "+prb.popVermelha());
		System.out.println("POP Preta");
		System.out.println(" "+prb.popPreta());
		prb.mostrarVermelha();
		System.out.println("");
		prb.mostrarPreta();*/
	}
}
