/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14j;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Garaxe {

    int numeroCoches = 0;
    float matricula;
    float preciototal;
    float cartos = 0;
    float horas = 0;

    public void comparador() {
        if (numeroCoches < 5) {
            do {numeroCoches++;
                matricula = Float.parseFloat(JOptionPane.showInputDialog("Insira a matricula"));
                cartos = Float.parseFloat(JOptionPane.showInputDialog("Insira cartos"));
                precio();
                if (cartos >= preciototal) {
                    float volta = cartos - preciototal;
                    JOptionPane.showMessageDialog(null, "Factura: " + "Matrícula " + matricula + " Tempo: " + horas + " Prezo: " + preciototal + "Cartos recibidos: " + cartos + " Cartos devoltos: " + volta);
                numeroCoches--;
                } else {
                    JOptionPane.showMessageDialog(null, "saldo insuficiente, inténtelo de nuevo");
                    
                }

            } while (numeroCoches < 5);
        };

    }

    public float precio() {
        horas = Float.parseFloat(JOptionPane.showInputDialog("Insira horas"));
        if (horas < 3) {
            preciototal = horas * 0.5f;
        } else {
            preciototal = 1.5f + (horas - 3) * 0.2f;
        };

        return preciototal;
    }
;
}
