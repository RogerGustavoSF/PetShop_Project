import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TabelaDados extends javax.swing.JInternalFrame {

    public TabelaDados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTabelaDados = new javax.swing.JTable();
        jpnBotoes = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setTitle("Tabela de Dados");
        setPreferredSize(new java.awt.Dimension(1280, 628));

        jTabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Email", "Tipo de Serviço", "Data de atendimento", "Tipo de Pet", "Nome do Pet", "Raça do Pet", "Idade do Pet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTabela.setViewportView(jTabelaDados);

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Atualizar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExcluirPasta.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (jTabelaDados.getSelectedRow() != -1) {

            Integer nome = jTabelaDados.getSelectedRow();

            String nomeUser = jTabelaDados.getValueAt(nome, 1).toString();
            Integer confirmacao = JOptionPane.showConfirmDialog(null,
                    "Tem certeza que deseja excluir os dados de " + nomeUser + " e de seu pet?",
                    "Confirmação de exclusão de dados",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacao == 0) {
                DefaultTableModel dtmContatos = (DefaultTableModel) jTabelaDados.getModel();
                dtmContatos.removeRow(jTabelaDados.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (jTabelaDados.getSelectedRow() != -1) {
            Integer linhaSelecionada = jTabelaDados.getSelectedRow();

            if (linhaSelecionada != -1) {
                String nome = jTabelaDados.getValueAt(linhaSelecionada, 1).toString();
                String telefone = jTabelaDados.getValueAt(linhaSelecionada, 2).toString();
                String email = jTabelaDados.getValueAt(linhaSelecionada, 3).toString();
                String tipoServico = jTabelaDados.getValueAt(linhaSelecionada, 4).toString();
                String tipoPet = jTabelaDados.getValueAt(linhaSelecionada, 5).toString();
                String nomePet = jTabelaDados.getValueAt(linhaSelecionada, 6).toString();
                String racaPet = jTabelaDados.getValueAt(linhaSelecionada, 7).toString();
                String idadePet = jTabelaDados.getValueAt(linhaSelecionada, 8).toString();

                int confirmacao = JOptionPane.showConfirmDialog(null,
                        "Tem certeza que deseja editar os dados de " + nome + " e de seu pet?",
                        "Confirmação de edição de contato",
                        JOptionPane.YES_NO_OPTION);

                if (confirmacao == JOptionPane.YES_OPTION) {
                    // Alternar o estado de edição das células
                    boolean estaEditando = jTabelaDados.isEditing();
                    jTabelaDados.editCellAt(-1, -1);
                    jTabelaDados.setEditingColumn(-1);
                    jTabelaDados.setEditingRow(-1);
                    // jTabelaDados.setEditable(!estaEditando);

                    JOptionPane.showMessageDialog(null, "Agora você pode editar os dados diretamente na tabela. Clique em 'Editar' novamente para salvar as alterações.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    public void atualizaTabela() {
        DefaultTableModel dtm = (DefaultTableModel) jTabelaDados.getModel();
        dtm.setRowCount(0);

        ModeloPetShop instanciaCompartilhada = ModeloPetShop.getInstanciaCompartilhada();
        ArrayList<ModeloPetShop> listaDados = instanciaCompartilhada.listaDados();

        for (ModeloPetShop dados : listaDados) {
            dtm.addRow(new Object[]{
                dados.getId(),
                dados.getNome(),
                dados.getTelefone(),
                dados.getEmail(),
                dados.getTipoServico(),
                dados.getData(),
                dados.getTipoPet(),
                dados.getNomePet(),
                dados.getRacaPet(),
                dados.getIdadePet()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTabelaDados;
    private javax.swing.JPanel jpnBotoes;
    // End of variables declaration//GEN-END:variables

}
