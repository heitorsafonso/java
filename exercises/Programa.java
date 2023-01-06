public class Programa {
    public static void main(String[] args) {
        double salario = 2800.0;
        double imposto;

        if (salario >= 1900.0 && salario <= 2800.0) {
            imposto = salario * 0.075;
            System.out.println("IR é de 7.5%");
            System.out.println("O valor do IR é R$" + imposto);
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            imposto = salario * 0.15;
            System.out.println("O IR é de 15%");
            System.out.println("O valor do IR é R$" + imposto);
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            imposto = salario * 0.225;
            System.out.println("O IR é de 22,5%");
            System.out.println("O valor do IR é R$" + imposto);
        } else{
            System.out.println("Não paga imposto de renda");
        }
    }
}