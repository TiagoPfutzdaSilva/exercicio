import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        int numero = 0, media = 0, numeromenor = 0, numeromaior = 0;
        String numeros = "";
        int i = 0;
        while (i < 3) {
            numeros = JOptionPane.showInputDialog("Digite um número:");
            numero = Integer.parseInt(numeros);

            JOptionPane.showMessageDialog(null, "O número escolido foi  " + numero);

            media = media + numero;

            if(i == 0) {
                
                numeromenor = numero;

                numeromaior = numero;

            }else if(numero < numeromenor) {

                numeromenor = numero;

            }else if(numero > numeromaior) {

                numeromaior = numero;

            }

            i++;

            }

            int m = media / 3;
            JOptionPane.showMessageDialog(null, "A média das idades é : " + m);
            JOptionPane.showMessageDialog(null, "o número menor é : " + numeromenor);
            JOptionPane.showMessageDialog(null, "o número maior é : " + numeromaior);

        }
    }