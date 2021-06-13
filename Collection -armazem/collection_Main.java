import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class collection_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);

		List<String> produtoEstocados = new ArrayList<String>();

		String addProduto;
		int options;

		
		do
		{
			System.out.println("\n\tControle de Estoque\n"
					+ "(1)Armazenar dados\n(2)Remover dados\n(3)Atualizar dados\n(4)Apresentar todos os dados");
			options = read.nextInt();
			switch (options) {
			case 1:
				read.next();
				System.out.println("\nDigite aqui o item que você quer incluir: ");
				addProduto = read.next();
				produtoEstocados.add(addProduto);
				break;
				
			case 2:
				do
				{
					read.next();
					System.out.println("\nDigite aqui o item que você quer remover: ");
					addProduto = read.next();
					if(produtoEstocados.contains(addProduto))
					{
						produtoEstocados.remove(addProduto);
					}
					else
					{
						System.out.println("\nEste produto não consta na lista. Tente de novo.\n"
								+ "Digite (1) Para tentar novamente\n(0) Para sair");
						options = read.nextInt();
					}
				}while(options==1);
				break;
				
			case 3:
				do
				{
					read.next();
					System.out.println("\nDigite aqui o item que você quer atualizar: ");
					addProduto = read.next();
					for(String verificar:produtoEstocados)
					{
						System.out.println(verificar);
					}
					
					if(produtoEstocados.contains(addProduto))
					{
						produtoEstocados.remove(addProduto);
						produtoEstocados.add(addProduto);
					}
					else
					{
						System.out.println("\nEste produto não consta na lista. Tente de novo.\n"
								+ "Digite (1) Para tentar novamente\n(0) Para sair");
						options = read.nextInt();
					}
				}while(options==1);
				break;
				default:
					System.out.println("\nOpção inválida.");

			}
			System.out.println("\n\tControle de Estoque\n"
					+ "(1)Armazenar dados\n(2)Remover dados\n(3)Atualizar dados\n(4)Apresentar todos os dados");
			options = read.nextInt();
		}while(options!=0);
		

	}
}
