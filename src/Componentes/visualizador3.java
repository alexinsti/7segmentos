/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/BeanForm.java to edit this template
 */
package Componentes;

/**
 *
 * @author damm
 */
public class visualizador3 extends javax.swing.JPanel {

    /**
     * Creates new form visualizador3
     */
    public visualizador3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        visualizador1 = new Componentes.Visualizador();
        visualizador2 = new Componentes.Visualizador();
        visualizador3 = new Componentes.Visualizador();

        jPanel1.setMinimumSize(new java.awt.Dimension(530, 280));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));
        jPanel1.add(visualizador1);
        jPanel1.add(visualizador2);
        jPanel1.add(visualizador3);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    
    int variablePrueba=250;
    
    public void setNumero3(int numero){
        if(numero>999){
            visualizador1.setNumero(9);
            visualizador2.setNumero(9);
            visualizador3.setNumero(9);
        }else{
            //trabajo con cadenas para hacerlo más rápido
            String cadenaAux=String.valueOf(numero);

            //concateno "" para hacerlos string
            visualizador1.setNumero(Integer.valueOf(cadenaAux.charAt(0)+""));
            visualizador2.setNumero(Integer.valueOf(cadenaAux.charAt(1)+""));
            visualizador3.setNumero(Integer.valueOf(cadenaAux.charAt(2)+""));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private Componentes.Visualizador visualizador1;
    private Componentes.Visualizador visualizador2;
    private Componentes.Visualizador visualizador3;
    // End of variables declaration//GEN-END:variables
}
