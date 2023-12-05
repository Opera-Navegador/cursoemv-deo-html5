package github;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        String nomes[] = new String[5];
        int quantidade, i;
        int flag = 0;
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos nomes deseja cadastrar: "));

        for (i = 0; i < quantidade; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome: ");

        }

        String elementoBuscando = JOptionPane.showInputDialog("Digite p nome a ser buscado: ");

        for (i = 0; i < quantidade; i++) {

            if (elementoBuscando.equalsIgnoreCase(nomes[i])) {
                JOptionPane.showMessageDialog(null, "O nome se encontra na posição: " + i + " e o nome guardado é: " + nomes[i]);
                flag = 1;
            }

        }

        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "O nome não está cadastrado!");
        }

    }

}

