package Interface;

import DAO.Dependete_DAO;
import Entidades.Dependente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Cadastro_Dependente extends javax.swing.JFrame {

    //inicialização do DAO para interações com o banco 
    Dependete_DAO dp_dao = new Dependete_DAO();
    //Variaveis
    int cod_hospede = 0;

    public Cadastro_Dependente(int cod_hopede01) {
        initComponents();
        cod_hospede = cod_hopede01;
        cod_hosp.setText(String.valueOf(cod_hospede));
        cod_hosp.setVisible(false);
        cod_dp.setVisible(false);
    }

    public void limpar() {
        Pesquisa.setText("");
        Nome.setText("");
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        cod_hosp.setText("");
    }

    //metodo para manipular e remover os caractes especiais;
    public int remove_pontos(String valor) {
        valor = valor.replace(".", "");
        valor = valor.replace("-", "");
        valor = valor.replace("(", "");
        valor = valor.replace(")", "");
        return Integer.parseInt(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pesquisa = new javax.swing.JTextField();
        Botao_Pequisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        cod_hosp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cod_dp = new javax.swing.JTextField();
        Botao_Inserir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Excluir1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Dependente");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Cadastro Dependentes");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Pesquisa:");

        Botao_Pequisar.setText("Pesquisar");
        Botao_Pequisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_PequisarActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nome", "Data Nasc.", "Rg"
            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        cod_hosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_hospActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Rg:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Dia Nasc:");

        Botao_Inserir.setText("Inserir");
        Botao_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_InserirActionPerformed(evt);
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

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Detalhes do cadastro ");

        Excluir1.setText("Voltar");
        Excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir1ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nome))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Pequisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod_hosp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod_dp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Botao_Inserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Excluir)
                .addGap(18, 18, 18)
                .addComponent(Excluir1)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Pequisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_hosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_Inserir)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Excluir1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_PequisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_PequisarActionPerformed
        // Botão Pesquisar
        List<Dependente> list_dependentes = dp_dao.Consulta_dependente(Pesquisa.getText(),cod_hospede);
        //Capturar o modelo padrao da nossa tabela
        DefaultTableModel mod_tab = (DefaultTableModel) Tabela.getModel();
        mod_tab.getDataVector().removeAllElements();
        // mod_tab.fireTableDataChanged(); // notifies the JTable that the model has changed

        for (int i = 0; i <= list_dependentes.size() - 1; i++) {
            mod_tab.addRow(new Object[]{
                list_dependentes.get(i).getiCodDependete(),
                list_dependentes.get(i).getsNome(),
                list_dependentes.get(i).getsDataNascimento(),
                list_dependentes.get(i).getiRG(),});
        }
    }//GEN-LAST:event_Botao_PequisarActionPerformed

    private void Botao_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_InserirActionPerformed

        if (cod_hosp == null) {
            JOptionPane.showMessageDialog(rootPane, "Falha");
        } else {

            //botão inserir     
            //declaração e inicialização do objeto cidade
            Dependente dependente = new Dependente();
            //Realiza o tratamento da data
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String data = jFormattedTextField1.getText();
            //alimenta o objeto cidade com as informações da interface
            dependente.setsNome(Nome.getText());
            dependente.setsDataNascimento(data);
            dependente.setiRG(remove_pontos(jFormattedTextField2.getText()));
            dependente.setiCodHospede(Integer.parseInt(cod_hosp.getText()));

            if (dp_dao.inserir(dependente)) {
                JOptionPane.showMessageDialog(rootPane, "Registro Gravado com Sucesso!");
                // cd.desconectar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falha");
            }
            limpar();
            Botao_PequisarActionPerformed(evt);
    }//GEN-LAST:event_Botao_InserirActionPerformed
    }
    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaActionPerformed


    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        int n = JOptionPane.showConfirmDialog(
                jPanel1,
                "Dejesa Excluir o Registro? ",
                "Excluir",
                JOptionPane.YES_NO_OPTION, 1);
        //JOptionPane.showMessageDialog(null, 
        //    n);
        if (n == 0) {
            Dependete_DAO dc = new Dependete_DAO();
            dc.excluir(Integer.parseInt(cod_dp.getText()));
            JOptionPane.showMessageDialog(jPanel1, "Registro Excluido com Sucesso!");

            limpar();
            Botao_PequisarActionPerformed(evt);
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // retorna para tela de hospede
        Cadastro_Hospede p = new Cadastro_Hospede();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        // evento do mouse na tabela
        // pega a linha selecionada
        int linha = Tabela.getSelectedRow();
        //pega a coluna 0
        int coluna = 0;
        //pega o valor da tabela e passa para a variavel cod
        Object cod = Tabela.getValueAt(linha, coluna);
        // JOptionPane.showMessageDialog(rootPane, Tabela.getValueAt(linha, coluna));
        if (cod != null) {

            Dependete_DAO dc = new Dependete_DAO();
            //cria uma lista do objeto Dependentes

            //Implementar metodo de consulta
            List<Dependente> listdp
                    = dc.Consulta_dependentes_cod(cod,cod_hospede);

            //for para percorrer a lista e alimentar alguma coisa
            for (int i = 0; i < listdp.size(); i++) {
                //Implementar
                Nome.setText(listdp.get(i).getsNome());
                jFormattedTextField2.setText(String.valueOf(listdp.get(i).getiRG()));
                cod_hosp.setText(String.valueOf(listdp.get(i).getiCodHospede()));
                jFormattedTextField1.setText(listdp.get(i).getsDataNascimento());
                cod_dp.setText(String.valueOf(listdp.get(i).getiCodDependete()));
            }

            Excluir.setEnabled(true);
            Alterar.setEnabled(true);
            Botao_Inserir.setEnabled(false);

        }
    }//GEN-LAST:event_TabelaMouseClicked

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // botão inserir
        //declaração e inicialização da classe 
        Dependete_DAO dc = new Dependete_DAO();
        //declaração e incialização
        Dependente d = new Dependente();
        //alimetna o objeto cidade com as informações da interface

        String data = jFormattedTextField1.getText();
        d.setsNome(Nome.getText());
        d.setiRG(remove_pontos(jFormattedTextField2.getText()));
        d.setsDataNascimento(data);
        d.setiCodDependete(Integer.parseInt(cod_dp.getText()));
        if (dc.alterar(d)) {
            JOptionPane.showMessageDialog(jPanel1, "Registro Alterado Com Sucesso!");
            limpar();
            Botao_PequisarActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Erro ao alterar!");
        }

        //tentamos realiar a inserçãono banco em caso de falha mostra a menagem do else
    }//GEN-LAST:event_AlterarActionPerformed

    private void cod_hospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_hospActionPerformed
    }//GEN-LAST:event_cod_hospActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
    }//GEN-LAST:event_NomeActionPerformed

    private void Excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir1ActionPerformed
        
        Cadastro_Hospede p = new Cadastro_Hospede();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Excluir1ActionPerformed

    public void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Dependente(cod_hospede).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Botao_Inserir;
    private javax.swing.JButton Botao_Pequisar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Excluir1;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JTable Tabela;
    private javax.swing.JTextField cod_dp;
    private javax.swing.JTextField cod_hosp;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
