/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author u07880060103
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
    }
    public static void limpar(JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            //instanceof
            if (componentes[i] instanceof JTextField) {
                ((JTextField)componentes[i]).setText("");
            } 
            if (componentes[i] instanceof JComboBox) {
                ((JComboBox)componentes[i]).setSelectedIndex(-1);
            }
            if (componentes[i] instanceof JCheckBox) {
                ((JCheckBox)componentes[i]).setSelected(false);
            }
            if (componentes[i] instanceof JFormattedTextField) {
                ((JFormattedTextField)componentes[i]).setText("");
            } 
            if (componentes[i] instanceof JPasswordField) {
                ((JPasswordField)componentes[i]).setText("");
            } 
        }
    }
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    public static boolean perguntar(String cad) {
        //tem q terminar
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }
    public static int strToInt(String num) {
        return Integer.parseInt(num);
    }
    public static String intToStr(int num) {
        return String.valueOf(num);
    }
    public static double strToDouble(String num) {
        //tem q terminar
        return 0;
    }
    public static String doubleToStr(double num) {
        //tem q terminar
        return "";
    }
    public static Date strToDate(String data) {
        //tem q terminar
        return null;
    }
    public static String dateToString(Date data) {
        //tem q terminar
        return "";
    }
    //primeiro commit a ser feito - Pacotes tools e view; Util.java finalizado.
    //segundo commit a ser feito - Tela principal e Telas do cadastros finalizados.
    //terceiro commit a ser feito - Telas de cadastros usando o Util.java.
}
