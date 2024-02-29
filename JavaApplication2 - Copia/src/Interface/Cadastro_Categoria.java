package Interface;

import DAO.Categoria_DAO;
import Entidades.Categoria;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cadastro_Categoria extends javax.swing.JFrame {

    public Cadastro_Categoria() {
        initComponents();
        campo_delete.setVisible(false);
        botao_alterar.setEnabled(false);
    }

    public void limpar() {
        campo_valor_diaria.setText("");
        campo_itens.setText("");
        campo_descricao.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campo_pesquisa = new javax.swing.JTextField();
        botao_pesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        campo_valor_diaria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_itens = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_descricao = new javax.swing.JTextField();
        botao_voltar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_inserir = new javax.swing.JButton();
        campo_delete = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("categoria quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Pesquise pela categoria:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        campo_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pesquisaActionPerformed(evt);
            }
        });

        botao_pesquisa.setText("pesquisar");
        botao_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pesquisaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "valor diaria", "itens", "descrição"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Valor diária:");

        campo_valor_diaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_valor_diariaActionPerformed(evt);
            }
        });

        jLabel3.setText("Itens:");

        jLabel4.setText("Descrição:");

        campo_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_descricaoActionPerformed(evt);
            }
        });

        botao_voltar.setText("voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });

        botao_excluir.setText("excluir");
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        botao_alterar.setText("alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        botao_inserir.setText("inserir");
        botao_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_inserirActionPerformed(evt);
            }
        });

        campo_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_deleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Detalhes da categoria");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Categoria do Quarto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_descricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_valor_diaria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_itens))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campo_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_inserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_voltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_pesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_itens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_valor_diaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_voltar)
                    .addComponent(botao_excluir)
                    .addComponent(botao_alterar)
                    .addComponent(botao_inserir))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campo_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pesquisaActionPerformed

    }//GEN-LAST:event_campo_pesquisaActionPerformed

    private void campo_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_descricaoActionPerformed

    }//GEN-LAST:event_campo_descricaoActionPerformed

    private void botao_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_inserirActionPerformed
        // botão inserir
        //declaração e inicialização da classe cidade dao
        Categoria_DAO cd = new Categoria_DAO();
        //declaração e incialização do objeto cidade
        Categoria c = new Categoria();
        //alimetna o objeto cidade com as informações da interface
        c.setDvalor_diaria(Integer.parseInt(campo_valor_diaria.getText()));
        c.setSitens(campo_itens.getText());
        c.setSdescrição(campo_descricao.getText());

        //tentamos realiar a inserçãono banco em caso de falha mostra a menagem do else
        if (cd.inserir(c)) {
            JOptionPane.showMessageDialog(rootPane, "Sucesso");
            limpar();
            this.botao_pesquisaActionPerformed(evt);
            cd.desconectar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falha");
        }
    }//GEN-LAST:event_botao_inserirActionPerformed

    private void campo_valor_diariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_valor_diariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_valor_diariaActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
        Categoria_DAO C_D = new Categoria_DAO();

        Categoria c = new Categoria();
        //alimetna o objeto cidade com as informações da interface
        c.setSdescrição(campo_descricao.getText());
        c.setSitens(campo_itens.getText());
        c.setDvalor_diaria(Double.parseDouble(campo_valor_diaria.getText()));
        c.setIcod_categoria(Integer.parseInt(campo_delete.getText()));

        if (C_D.alterar(c)) {
            JOptionPane.showMessageDialog(null, "alterado com sucesso");
            limpar();
            this.botao_pesquisaActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(null, "falha");
        }

    }//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pesquisaActionPerformed
        // botão de pesquisar
        Categoria_DAO dc = new Categoria_DAO();
        //cria lista cidade e alimenta com banco de dados
        List<Categoria> List_cid = dc.consulta_categoria(campo_pesquisa.getText());

        //capturar o modelo padrão da tabela
        DefaultTableModel mod_tab = (DefaultTableModel) jTable1.getModel();
        mod_tab.getDataVector().removeAllElements();
        for (int i = 0; i <= List_cid.size() - 1; i++) {
            mod_tab.addRow(new Object[]{
                List_cid.get(i).getIcod_categoria(),
                List_cid.get(i).getDvalor_diaria(),
                List_cid.get(i).getSitens(),
                List_cid.get(i).getSdescrição()
            });
        }
    }//GEN-LAST:event_botao_pesquisaActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // evento do mouse na tabela
        Categoria_DAO dc = new Categoria_DAO();
        // pega a linha selecionada
        int linha = jTable1.getSelectedRow();
        //pega a coluna 0
        int coluna = 0;
        //pega o valor da tabela e passa para a variavel cod
        Object cod = jTable1.getValueAt(linha, coluna);
        if (cod != null) {
            //cria uma lista do objeto cidade
            List<Categoria> listp = dc.modifica_categoria(cod);
            //for para percorrer a lista e alimentar alguma coisa
            for (int i = 0; i < listp.size(); i++) {
                campo_descricao.setText(listp.get(i).getSdescrição());
                campo_itens.setText(listp.get(i).getSitens());
                campo_valor_diaria.setText(String.valueOf(listp.get(i).getDvalor_diaria()));
                campo_delete.setText(String.valueOf(listp.get(i).getIcod_categoria()));
            }
        }
        botao_alterar.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
        Categoria_DAO C_D = new Categoria_DAO();

        if (C_D.excluir(Integer.parseInt(campo_delete.getText()))) {
            JOptionPane.showMessageDialog(null, "deletado com sucesso");
            limpar();
            this.botao_pesquisaActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(null, "falha");
        }

    }//GEN-LAST:event_botao_excluirActionPerformed

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        Principal cn = new Principal();
        //define a tela como visivel
        cn.setVisible(true);

        dispose();
    }//GEN-LAST:event_botao_voltarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Principal cn = new Principal();
        //define a tela como visivel
        cn.setVisible(true);

        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void campo_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_deleteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_inserir;
    private javax.swing.JButton botao_pesquisa;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JTextField campo_delete;
    private javax.swing.JTextField campo_descricao;
    private javax.swing.JTextField campo_itens;
    private javax.swing.JTextField campo_pesquisa;
    private javax.swing.JTextField campo_valor_diaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
