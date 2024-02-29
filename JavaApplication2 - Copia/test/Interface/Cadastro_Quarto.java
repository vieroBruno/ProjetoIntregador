/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DAO.Categoria_DAO;
import DAO.Quarto_DAO;
import Entidades.Categoria;
import Entidades.Quarto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suporte
 */
public class Cadastro_Quarto extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadastro
     */
    /*ArrayList de pessoas vai guardar o cadastro das pessoas*/
    public Cadastro_Quarto() {
        
        initComponents();
        jTextField1.setVisible(false);
        buscaCategoria("");
    }
    
    //metodo para buscar categorias e 
    //alimentar ComboBox
    public void buscaCategoria(String pesquisa){
        //apresantamos a classe categoria dao
        Categoria_DAO cat = new Categoria_DAO();
        //realizamos a consulta das categorias
        List<Categoria> lista_categoria=cat.consulta_categoria(pesquisa);
        for(int i=0; i<=lista_categoria.size()-1;i++){
            jComboBox1.addItem(lista_categoria.get(i).getSdescrição());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telacadastro = new javax.swing.JPanel();
        Numero = new javax.swing.JLabel();
        Andar = new javax.swing.JLabel();
        CodCategoria = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        TxtAndar = new javax.swing.JTextField();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Inserir = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jpesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        Txtpesquisar = new javax.swing.JTextField();
        Numero1 = new javax.swing.JLabel();
        Excluir1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        Titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Quartos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Numero.setText("Numero:");

        Andar.setText("Andar:");

        CodCategoria.setText("Cod_categoria:");

        TxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroActionPerformed(evt);
            }
        });

        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Titulo.setText("Cadastro Quarto");

        jpesquisar.setText("pesquisar");
        jpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpesquisarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "cod_quarto", "numero", "andar", "cod_categoria"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        Txtpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpesquisarActionPerformed(evt);
            }
        });

        Numero1.setText("Digite o codigo do quarto:");

        Excluir1.setText("Voltar");
        Excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Titulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Titulo1.setText("Detalhes do Cadastro Quarto");

        javax.swing.GroupLayout telacadastroLayout = new javax.swing.GroupLayout(telacadastro);
        telacadastro.setLayout(telacadastroLayout);
        telacadastroLayout.setHorizontalGroup(
            telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telacadastroLayout.createSequentialGroup()
                .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(telacadastroLayout.createSequentialGroup()
                        .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Numero)
                            .addComponent(Andar))
                        .addGap(1, 1, 1)
                        .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAndar)
                            .addComponent(TxtNumero)))
                    .addGroup(telacadastroLayout.createSequentialGroup()
                        .addComponent(Numero1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txtpesquisar)
                        .addGap(10, 10, 10)
                        .addComponent(jpesquisar))
                    .addGroup(telacadastroLayout.createSequentialGroup()
                        .addComponent(CodCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telacadastroLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Inserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Excluir1))
                    .addGroup(telacadastroLayout.createSequentialGroup()
                        .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telacadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telacadastroLayout.setVerticalGroup(
            telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telacadastroLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpesquisar)
                    .addComponent(Numero1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero))
                .addGap(18, 18, 18)
                .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Andar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telacadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alterar)
                    .addComponent(Inserir)
                    .addComponent(Excluir)
                    .addComponent(Excluir1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jpesquisar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telacadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telacadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroActionPerformed
        
    }//GEN-LAST:event_TxtNumeroActionPerformed

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        Quarto qt = new Quarto();
        Quarto_DAO liae = new Quarto_DAO();
        System.out.println("AKI");
        qt.setTxtNumero(Integer.parseInt(TxtNumero.getText()));
        qt.setTxtAndar(Integer.parseInt(TxtAndar.getText()));
        //apresantamos a classe categoria dao
        Categoria_DAO cat = new Categoria_DAO();
        //realizamos a consulta das categorias
        List<Categoria> lista_categoria=cat.consulta_categoria(jComboBox1.getSelectedItem().toString());
        qt.setTxtCodCategoria(lista_categoria.get(0).getIcod_categoria());
        
        System.out.println("AKI3");
        if (liae.inserir(qt)) {
            JOptionPane.showMessageDialog(rootPane, "Sucesso");
            System.out.println("AKI2");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falha");
        }

    }//GEN-LAST:event_InserirActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Quarto_DAO qdao = new Quarto_DAO();
        
        if (qdao.excluir(Integer.parseInt(jTextField1.getText()))) {
            JOptionPane.showMessageDialog(null,
                    "Deletado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Falha ao Deletar");
        }
        TxtAndar.setText("");
        TxtNumero.setText("");
    }//GEN-LAST:event_ExcluirActionPerformed

    private void jpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpesquisarActionPerformed
        Quarto_DAO qc = new Quarto_DAO();
        // cria lista cidade e alimenta com consulta
        // do banco de dados
        List<Quarto> list_qto = qc.consulta_quarto(Txtpesquisar.getText());

        //Capturar o modelo padrao da nossa tabela
        DefaultTableModel mod_tab = (DefaultTableModel) tabela.getModel();
        mod_tab.getDataVector().removeAllElements();
        for (int i = 0; i <= list_qto.size() - 1; i++) {
            mod_tab.addRow(new Object[]{
                list_qto.get(i).getiCod(),
                list_qto.get(i).getTxtNumero(),
                list_qto.get(i).getTxtAndar(),
                list_qto.get(i).getTxtCodCategoria()});
        }

    }//GEN-LAST:event_jpesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        // evento do mouse na tabela
         Categoria_DAO cat = new Categoria_DAO();
        Quarto_DAO qd = new Quarto_DAO();
        // pega a linha selecionada
        int linha = tabela.getSelectedRow();
        //pega a coluna 0
        int coluna = 0;
        //pega o valor da tabela e passa para a variavel cod
        Object cod = tabela.getValueAt(linha, coluna);
        if (cod != null) {
            //cria uma lista do objeto cidade
            List<Quarto> listq = qd.consulta_quarto(
                    Integer.parseInt(cod.toString()));//Implementar metodo de consulta
            //for para percorrer a lista e alimentar alguma coisa
            for (int i = 0; i < listq.size(); i++) {
                //Implementar
                TxtAndar.setText(String.valueOf(listq.get(i).getTxtAndar()));
                //realizamos a consulta das categorias
                List<Categoria> lista_categoria  =cat.consulta_categoria(String.valueOf(listq.get(i).getTxtCodCategoria()));
//                jComboBox1.setSelectedItem(lista_categoria.get(0).getSdescrição().toString());
                TxtNumero.setText(String.valueOf(listq.get(i).getTxtNumero()));
                jTextField1.setText(String.valueOf(listq.get(i).getiCod()));
            }
        }
        //jButton3.setEnabled(true);
    }//GEN-LAST:event_tabelaMouseClicked

    private void TxtpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtpesquisarActionPerformed

    private void Excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir1ActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Excluir1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
 
    }//GEN-LAST:event_AlterarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Quarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JLabel Andar;
    private javax.swing.JLabel CodCategoria;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Excluir1;
    private javax.swing.JButton Inserir;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Numero1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JTextField TxtAndar;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField Txtpesquisar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jpesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JPanel telacadastro;
    // End of variables declaration//GEN-END:variables


}