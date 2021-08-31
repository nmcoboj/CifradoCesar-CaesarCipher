
package cifradoCesar;


public class VentanaCodificar extends javax.swing.JFrame {


    public String texto1;
    public VentanaCodificar(String texto) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        texto1=texto;
        
    }
    
    public void enviar(){

    }
    
        public String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCodificar1 = new javax.swing.JButton();
        botonCodificar2 = new javax.swing.JButton();
        javax.swing.JButton botonCodificar3 = new javax.swing.JButton();
        textoFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCodificar1.setText("1 Espacio");
        botonCodificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCodificar1MouseClicked(evt);
            }
        });
        botonCodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCodificar1ActionPerformed(evt);
            }
        });

        botonCodificar2.setText("2 Espacios");
        botonCodificar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCodificar2MouseClicked(evt);
            }
        });
        botonCodificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCodificar2ActionPerformed(evt);
            }
        });

        botonCodificar3.setText("3 Espacios");
        botonCodificar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCodificar3MouseClicked(evt);
            }
        });
        botonCodificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCodificar3ActionPerformed(evt);
            }
        });

        textoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCodificar3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(botonCodificar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCodificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoFinal))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCodificar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCodificar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCodificar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCodificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCodificar1ActionPerformed

    private void botonCodificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCodificar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCodificar2ActionPerformed

    private void botonCodificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCodificar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCodificar3ActionPerformed

    private void botonCodificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCodificar1MouseClicked
        String textofinal= cifradoCesar(texto1, 1);
        this.textoFinal.setText(textofinal);
        
    }//GEN-LAST:event_botonCodificar1MouseClicked

    private void botonCodificar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCodificar2MouseClicked
        String textofinal= cifradoCesar(texto1, 2);
        this.textoFinal.setText(textofinal);
    }//GEN-LAST:event_botonCodificar2MouseClicked

    private void botonCodificar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCodificar3MouseClicked
        String textofinal= cifradoCesar(texto1, 3);
        this.textoFinal.setText(textofinal);
    }//GEN-LAST:event_botonCodificar3MouseClicked

    private void textoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFinalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCodificar1;
    private javax.swing.JButton botonCodificar2;
    private javax.swing.JTextField textoFinal;
    // End of variables declaration//GEN-END:variables
}

