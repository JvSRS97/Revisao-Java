import java.text.DecimalFormat;

public class Produto {// Classe Produto. Obs.: Ao criar uma Produto, deve-se chamar a função "new
                      // Produto();" para alocar os espaços de memória.
    DecimalFormat frmt = new DecimalFormat("#.##");// formato numérico com duas casas decimais
    public String Descricao;
    public double Valor;
    public int Quantidade;

    public Produto(String Descricao, double Valor, int Quantidade) {// construtor do produto. Em caso de utilização do
                                                                    // construtor, o objeto deve ser chamado através do
                                                                    // construtor

        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Quantidade = Quantidade;
    }

    public double Valor_Total() {// retorna o valor total do produto em estoque
        return Valor * Quantidade;
    }

    public void Registrar_Entrada(int Quantidade) {// função para adicionar uma quantidade do produto ao estoque
        this.Quantidade = this.Quantidade + Quantidade;// this é para diferenciar o produto da variável Quantidade que
                                                       // está como parâmetro da função
    }

    public void Registrar_Saida(int Quantidade) {// função para retirar uma quantidade do produto ao estoque
        this.Quantidade = this.Quantidade - Quantidade;
    }

    public void Produto_Info() {// função para imprimir informações do produto
        System.out.print("\n Nome do produto: " + Descricao);
        System.out.print("\n Valor do produto: R$ " + frmt.format(Valor));
        System.out.print("\n Quantidade do produto em estoque: " + Quantidade);
        System.out.println("\n Valor total em estoque: R$ " + frmt.format(Valor_Total()));
    }

}
