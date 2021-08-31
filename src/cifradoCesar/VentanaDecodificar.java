
package cifradoCesar;

public class VentanaDecodificar extends javax.swing.JFrame {

    public String texto1;
    public VentanaDecodificar(String texto) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        texto1=texto;
    }

    public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonDecodificar1 = new javax.swing.JButton();
        botonDecodificar2 = new javax.swing.JButton();
        botonDecodificar3 = new javax.swing.JButton();
        textoFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonDecodificar1.setText("1 Espacio");
        botonDecodificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDecodificar1MouseClicked(evt);
            }
        });
        botonDecodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDecodificar1ActionPerformed(evt);
            }
        });

        botonDecodificar2.setText("2 Espacios");
        botonDecodificar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDecodificar2MouseClicked(evt);
            }
        });

        botonDecodificar3.setText("3 Espacios");
        botonDecodificar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDecodificar3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonDecodificar3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonDecodificar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonDecodificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonDecodificar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonDecodificar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonDecodificar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDecodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDecodificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDecodificar1ActionPerformed

    private void botonDecodificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDecodificar1MouseClicked
        String textofinal = descifradoCesar(texto1, 1);
        this.textoFinal.setText(textofinal);
    }//GEN-LAST:event_botonDecodificar1MouseClicked

    private void botonDecodificar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDecodificar2MouseClicked
        String textofinal = descifradoCesar(texto1, 2);
        this.textoFinal.setText(textofinal);
    }//GEN-LAST:event_botonDecodificar2MouseClicked

    private void botonDecodificar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDecodificar3MouseClicked
        String textofinal = descifradoCesar(texto1, 3);
        this.textoFinal.setText(textofinal);
    }//GEN-LAST:event_botonDecodificar3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDecodificar1;
    private javax.swing.JButton botonDecodificar2;
    private javax.swing.JButton botonDecodificar3;
    private javax.swing.JTextField textoFinal;
    // End of variables declaration//GEN-END:variables
}
