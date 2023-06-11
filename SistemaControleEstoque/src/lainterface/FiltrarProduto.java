package lainterface;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import estoque.Estoque;
import estoque.Informacoes;
import estoque.Produto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author COMPUTADOR
 */
public class FiltrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form FiltrarProduto
     */
    

    public FiltrarProduto(Estoque estoque) {
        initComponents(estoque);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(Estoque estoque) {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Dia", "Mês", "Ano", "Prédio", "Lado", "Nível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProdutos);

        jLabel1.setText("Código do Produto:");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt, estoque);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFiltrar))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnFiltrar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        this.setResizable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt, Estoque estoque) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (validarProduto() == false) {
            int codigo = Integer.parseInt(txtProduto.getText().trim());
            filtrar(codigo, estoque);
        } else {
            JOptionPane.showMessageDialog(null, "Código do produto inválido", null, JOptionPane.ERROR_MESSAGE);
        }
        txtProduto.setText("");
    }//GEN-LAST:event_btnFiltrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], Estoque estoque) {
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
            java.util.logging.Logger.getLogger(FiltrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiltrarProduto(estoque).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables

    private void filtrar(int codigo, Estoque estoque) {
        DefaultTableModel dtmProdutos = (DefaultTableModel) tableProdutos.getModel();
        int qtd_predios = estoque.pegarNumeroPredios();
        int qtd_lados = estoque.pegarNumeroLados();
        int qtd_niveis = estoque.pegarNumeroNiveis();
        int a;
        qtd_predios -= 1;
        qtd_lados -= 1;
        qtd_niveis -= 1; 
        ArrayList<Informacoes> array = new ArrayList<>();
        //COLOCANDO TODOS OS PRODUTOS COM O CÓDIGO NO ARRAYLIST
        for(int i = 0; i <= qtd_predios; i++){
            for(int j = 0; j <= qtd_lados; j++){
                for(int k = 0; k <= qtd_niveis; k++){
                    a = estoque.pegarCodigoProduto(i, j, k);
                    if(a == codigo){
                        Informacoes inf_aux = new Informacoes(i, j, k, new Produto(codigo, estoque.pegarDiaValidade(i, j, k), estoque.pegarMesValidade(i, j, k), estoque.pegarAnoValidade(i, j, k)));
                        array.add(inf_aux);
                    }
                }
            }
        }
        //ORDENAR POR DATA
        int count = 0;
        if(array.size() > 0){
            while(count != array.size()-1){
                count = 0;
                for(int i = 0; i < array.size() - 1; i++){
                    if(i != array.size()-1){
                        if(array.get(i).getProdutoAno() > array.get(i+1).getProdutoAno()){
                            Informacoes inf_aux = array.get(i);
                            array.set(i, array.get(i+1));
                            array.set(i+1, inf_aux);
                        }
                        else if(array.get(i).getProdutoAno() == array.get(i+1).getProdutoAno()){
                            if(array.get(i).getProdutoMes() > array.get(i+1).getProdutoMes()){
                                Informacoes inf_aux = array.get(i);
                                array.set(i, array.get(i+1));
                                array.set(i+1, inf_aux);
                            }
                            else if(array.get(i).getProdutoMes() == array.get(i+1).getProdutoMes()){
                                if(array.get(i).getProdutoDia() > array.get(i+1).getProdutoDia()){
                                    Informacoes inf_aux = array.get(i);
                                    array.set(i, array.get(i+1));
                                    array.set(i+1, inf_aux);
                                }else count += 1;
                            }
                            else count += 1;
                        }
                        else count += 1;
                    }
                }
            }
        }
        for (Informacoes informacoes : array) {
            // Enviando os dados coletados para a tabela
            int codProduto = estoque.pegarCodigoProduto(informacoes.getPredio(), informacoes.getLado(), informacoes.getNivel());
            Object[] dados = {codProduto, informacoes.getProdutoDia(), informacoes.getProdutoMes(), informacoes.getProdutoAno(), informacoes.getPredio() + 1, informacoes.getLado() + 1, informacoes.getNivel() + 1};
            dtmProdutos.addRow(dados);
        }
    }

    private boolean validarProduto() {
    char [] letras = txtProduto.getText().toCharArray();
    for (char l : letras) {
        if(l != '0' && l != '1' && l != '2' && l != '3' && l != '4' && l != '5'&& l != '6' && l != '7' && l != '8' && l != '9') {
            return true;
        } 
    }
    return false;
}

}
