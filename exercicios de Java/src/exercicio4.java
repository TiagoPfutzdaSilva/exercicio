import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        int salarioMinimo = 1320, salariodoUsuario = 0, salario = 0;
        String salariodoUsuarios = "";
        int i = 0;
        while (i < 1) {
            salariodoUsuarios = JOptionPane.showInputDialog("Digite o seu salário:");
            salariodoUsuario = Integer.parseInt(salariodoUsuarios);

            JOptionPane.showMessageDialog(null, "O seu salário é de  " + salariodoUsuario);

            if(i == 1) {

                salario = salariodoUsuario;

            }else if(salario >= salarioMinimo) {
                
                JOptionPane.showMessageDialog(null, "você recebe mais de 1 Salário Minimo!");
                JOptionPane.showMessageDialog(null, "O seu salário é Justo");


            }else if(salario >= 2640) {

                JOptionPane.showMessageDialog(null, "você recebe mais de 2 Salário Minimo!");
                JOptionPane.showMessageDialog(null, "O seu salário é Justo");

            }else if(salario >= 3960) {

                JOptionPane.showMessageDialog(null, "você recebe mais de 3 Salário Minimo!");
                JOptionPane.showMessageDialog(null, "O seu salário é Justo");

            }else if(salario < salarioMinimo) {

                JOptionPane.showMessageDialog(null, "você não recebe pelo menos 1 Salário Minimo!");
                JOptionPane.showMessageDialog(null, "O seu salário não é Justo");

            }

            i++;

        }

    }
}
