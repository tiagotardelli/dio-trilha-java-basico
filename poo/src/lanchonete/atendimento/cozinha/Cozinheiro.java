package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONA LANCHE NATURAL HAMBURGUER NO BALCAO");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONA SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredienteLanche(){
        System.out.println("SELECIONAR O PÃO, SALADA, OVO, CARNE");
    }

    private void selecionarIngredienteVitamina(){
        System.out.println("SELECIONAR FRUTA, LEITE E SUCO");
    }

    private void lavarIngrediente(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}