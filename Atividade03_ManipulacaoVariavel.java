import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {
    public static void main(String[] args) {
        
        // Criação de Variáveis
        String nomeProduto = "Notebook"; // Nome do produto
        double precoUnitario = 3500.00; // Preço unitário do produto em reais
        int quantidadeComprada = 5; // Quantidade de produtos comprados
        double taxaImposto = 0.18; // Taxa de imposto (18%)
        double margemLucro = 0.25; // Margem de lucro desejada (25%)

        // Operações Simples
        double valorTotalSemImposto = precoUnitario * quantidadeComprada; // Valor total sem impostos
        double valorImposto = valorTotalSemImposto * taxaImposto; // Valor do imposto
        double valorTotalComImposto = valorTotalSemImposto + valorImposto; // Valor total com impostos

        double precoVenda = valorTotalComImposto * (1 + margemLucro); // Preço de venda para alcançar a margem de lucro

        // Desafio Extra: Arredondamento e Formatação
        DecimalFormat df = new DecimalFormat("R$ #,##0.00"); // Formato de moeda

        String valorTotalComImpostoFormatado = df.format(valorTotalComImposto); // Valor total com impostos formatado
        String precoVendaFormatado = df.format(precoVenda); // Preço de venda formatado

        // Mensagem Final
        String mensagemFinal = "Produto: " + nomeProduto + "\nValor total com impostos: " + valorTotalComImpostoFormatado +
                "\nPreço de venda sugerido: " + precoVendaFormatado;

        // Exibição de Resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: R$ " + df.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Taxa de Imposto: " + (taxaImposto * 100) + "%");
        System.out.println("Margem de Lucro: " + (margemLucro * 100) + "%");
        System.out.println("Valor Total Sem Impostos: " + df.format(valorTotalSemImposto));
        System.out.println("Valor do Imposto: " + df.format(valorImposto));
        System.out.println("Valor Total Com Impostos: " + valorTotalComImpostoFormatado);
        System.out.println("Preço de Venda Sugerido: " + precoVendaFormatado);
        System.out.println();
        System.out.println(mensagemFinal);
    }
}