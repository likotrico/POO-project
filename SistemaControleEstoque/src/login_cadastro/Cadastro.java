/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_cadastro;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

import usuarios.*;

/**
 *
 * @author COMPUTADOR
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form JFCadastro
     */
    public Cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        cmbUsuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtChave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email:");

        jLabel2.setText("Senha:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Administrador" }));
        cmbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Já possui uma conta?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setText("Categoria:");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Chave de Acesso(Apenas Administradores):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnCadastrar)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addComponent(txtChave))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String senha = new String(txtSenha.getPassword());
        if (txtEmail.getText().trim().equals("") || txtNome.getText().trim().equals("") || senha.trim().equals("")) {
            JOptionPane.showMessageDialog(null,"Campo(s) não preenchidos", null, JOptionPane.ERROR_MESSAGE);   
        }
        else {
            if (txtEmail.getText().contains("@") && txtEmail.getText().contains(".com")) {
                if (cmbUsuario.getSelectedItem().equals("Vendedor")) {
                    if (emailVendedorExistente()) {
                        cadastrarVendedor();
                    }
                }
                else {
                    String chave = new String(txtChave.getPassword());
                    
                    if(chave.equalsIgnoreCase("POO")) {
                        if (emailAdmExistente()) {
                            cadastrarAdm();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Chave inválida", null, JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Formato de email inválido", null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void cmbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuarioActionPerformed
    }//GEN-LAST:event_cmbUsuarioActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
    }//GEN-LAST:event_txtNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtChave;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void cadastrarVendedor() {
        Interno vendedor = new Interno();
        vendedor.setEmail(txtEmail.getText());
        vendedor.setNome(txtNome.getText());
        String senha = new String(txtSenha.getPassword());
        vendedor.setSenha(senha);
        vendedor.setTipoInterno(TipoInterno.VENDEDOR);

        try {
        FileWriter fw = new FileWriter("SistemaControleEstoque/src/db/vendedor.csv", true); //criado dentro do projeto, porém da para passar o diretório onde queremos criar
        PrintWriter pw = new PrintWriter(fw);
        pw.print(vendedor.getNome()+";");
        pw.print(vendedor.getEmail()+";");
        pw.println(vendedor.getSenha()+";");
        pw.flush(); //envia dados
        pw.close();
        fw.close();
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        txtEmail.setText("");
        txtNome.setText("");
        txtSenha.setText("");
        txtChave.setText("");
        cmbUsuario.setSelectedIndex(0);
        }   catch (IOException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cadastrarAdm() {
        Interno administrador = new Interno();
        administrador.setEmail(txtEmail.getText());
        administrador.setNome(txtNome.getText());
        String senha = new String(txtSenha.getPassword());       
        administrador.setSenha(senha);
        administrador.setTipoInterno(TipoInterno.ADM);

        try {
            FileWriter fw = new FileWriter("SistemaControleEstoque/src/db/administrador.csv", true); //criado dentro do projeto, porém da para passar o diretório onde queremos criar
            PrintWriter pw = new PrintWriter(fw);
            pw.print(administrador.getNome()+";");
            pw.print(administrador.getEmail()+";");
            pw.println(administrador.getSenha()+";");
            pw.flush(); //envia dados
            pw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            txtEmail.setText("");
            txtNome.setText("");
            txtSenha.setText("");
            txtChave.setText("");
            cmbUsuario.setSelectedIndex(0);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("empty-statement")
    private boolean emailVendedorExistente() {
        String file = "SistemaControleEstoque/src/db/vendedor.csv";
        BufferedReader reader = null;
        String line = "";
        boolean result = true;
        
        try {
            reader = new BufferedReader(new FileReader(file));
            loop: {
                while ((line = reader.readLine()) != null) {
                    String[] row = line.split(";");
                    for (String string : row) {
                        if (string.equals(txtEmail.getText())) {
                            JOptionPane.showMessageDialog(null, "Este email já está em uso. Tente outro.", null, JOptionPane.ERROR_MESSAGE);
                            result = false;
                            break loop;
                        }
                    }
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    @SuppressWarnings("empty-statement")
    private boolean emailAdmExistente() {
        String file = "SistemaControleEstoque/src/db/administrador.csv";
        BufferedReader reader = null;
        String line = "";
        boolean result = true;
        
        try {
            reader = new BufferedReader(new FileReader(file));
            loop: {
                while ((line = reader.readLine()) != null) {
                    String[] row = line.split(";");
                    for (String string : row) {
                        if (string.equals(txtEmail.getText())) {
                            JOptionPane.showMessageDialog(null, "Este email já está em uso. Tente outro.", null, JOptionPane.ERROR_MESSAGE);
                            result = false;
                            break loop;
                        }
                    }
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
}