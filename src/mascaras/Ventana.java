package mascaras;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    int cantidad=0;
    Random rnd = new Random();
    int cantProducida = (rnd.nextInt(5000) + 500);
    Empresa empresa[];

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void registrarPedidos(int cantidad, int c) {
        empresa = new Empresa[cantidad];
        for (int i = 0; i < cantidad; i++) {
            Empresa e = new Empresa();
            e.setNombre(JOptionPane.showInputDialog(this, "Ingrese el nombre de la entidad"));
            e.setCantMascaras(c);
            empresa[i] = e;
            JOptionPane.showMessageDialog(this, "Pedido registrado satisfactoriamente");
        }
    }

    public String informe() {
        String mensaje = "";
        mensaje += "Cantidad de mascaras podrucidas a la semana: " + cantProducida + "\n\n";
        if (cantidad == 1) {
            for (int i = 0; i < cantidad; i++) {
                empresa[i].setCantMascaras(cantProducida);
            }
            for (int i = 0; i < cantidad; i++) {
                mensaje += "Nombre de la entidad beneficiada: " + empresa[i].getNombre() + "\n"
                        + "Cantidad de dotación:" + empresa[i].getCantMascaras() + "\n\n";
            }
        } else {
            int p = (int) ((cantidad) * 0.1);
            p += 1;
            int valorAsig = (cantProducida / cantidad);
            int cantidadAsig = valorAsig;
            int v = (int) (cantidadAsig + (valorAsig * 0.2));
            for (int i = 0; i < p; i++) {
                empresa[i].setCantMascaras(v);
            }
            int cantProdu = cantProducida;
            cantProdu -= v;
            int valor = (cantProdu / (cantidad - p));
            for (int i = p; i < cantidad; i++) {
                empresa[i].setCantMascaras(valor);
            }
            for (int i = 0; i < cantidad; i++) {
                mensaje += "Nombre de la entidad beneficiada: " + empresa[i].getNombre() + "\n"
                        + "Cantidad de dotación:" + empresa[i].getCantMascaras() + "\n\n";
            }
        }
        return mensaje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        registrarEntidades = new javax.swing.JButton();
        informe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Dotación de mascaras");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de entidades a registrar: ");

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        registrarEntidades.setText("Registrar Entidades");
        registrarEntidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEntidadesActionPerformed(evt);
            }
        });

        informe.setText("Generar Informe");
        informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registrarEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(informe, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        numero.getText();
    }//GEN-LAST:event_numeroActionPerformed

    private void registrarEntidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEntidadesActionPerformed
        cantidad = Integer.parseInt(numero.getText());
        registrarPedidos(cantidad, 1);
    }//GEN-LAST:event_registrarEntidadesActionPerformed

    private void informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeActionPerformed
        JOptionPane.showMessageDialog(this, informe());
    }//GEN-LAST:event_informeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton informe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField numero;
    private javax.swing.JButton registrarEntidades;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
