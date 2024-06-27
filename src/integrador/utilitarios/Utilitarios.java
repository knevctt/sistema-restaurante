package integrador.utilitarios;

import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilitarios {

    /**
     * Este método 'InserirIcone' é usado para definir o ícone de uma janela
     * JFrame. Ele recebe um JFrame como parâmetro e tenta definir seu ícone de
     * imagem para uma imagem específica. Se ocorrer uma exceção ao tentar
     * definir a imagem do ícone, ela será impressa no console.
     */
    public void InserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\imagens\\icone restaurante.png"));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void LimpaTela(JPanel container) {
        Component conponents[] = container.getComponents();

        for (Component component : conponents) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            } else if (component instanceof JComboBox) {
                ((JComboBox<?>) component).setSelectedIndex(-1);
            }
        }

    }
}
