
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TelaPetShop extends javax.swing.JFrame {

    public TelaPetShop() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MenuDeAcesso = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemServicos = new javax.swing.JMenuItem();
        jMenuTabelaDados = new javax.swing.JMenu();
        jMenuItemVerDados = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemGerarRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pet Shop");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 52)); // NOI18N
        jLabel1.setText("                         Olá, seja bem vindo");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 52)); // NOI18N
        jLabel5.setText("                           ao Pet Palace!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BoasVindas.png"))); // NOI18N

        jDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemServicos.setText("Serviços");
        jMenuItemServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServicosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemServicos);

        MenuDeAcesso.add(jMenuCadastro);

        jMenuTabelaDados.setText("Tabela de Dados");

        jMenuItemVerDados.setText("Ver Dados");
        jMenuItemVerDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerDadosActionPerformed(evt);
            }
        });
        jMenuTabelaDados.add(jMenuItemVerDados);

        MenuDeAcesso.add(jMenuTabelaDados);

        jMenuRelatorio.setText("Relatório");

        jMenuItemGerarRelatorio.setText("Gerar relatório");
        jMenuItemGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarRelatorioActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemGerarRelatorio);

        MenuDeAcesso.add(jMenuRelatorio);

        setJMenuBar(MenuDeAcesso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServicosActionPerformed

        CadastroDados telaCadastroDados = new CadastroDados();
        jDesktop.add(telaCadastroDados);
        telaCadastroDados.setVisible(true);
    }//GEN-LAST:event_jMenuItemServicosActionPerformed

    private void jMenuItemGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarRelatorioActionPerformed

        ModeloPetShop dadosLista = new ModeloPetShop();
        ArrayList<ModeloPetShop> listaDados = dadosLista.listaDados();

        Integer tamanhoArray = listaDados.size();
        System.out.println("Tamanho lista: " + tamanhoArray);

        if (tamanhoArray == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum item cadastrado na lista");
        } else {
            for (ModeloPetShop dados : listaDados) {
                Integer id = dados.getId();
                String nome = dados.getNome();
                String telefone = dados.getTelefone();
                String email = dados.getEmail();
                String dataAtendimento = dados.getData();
                String tipoServico = dados.getTipoServico();
                String tipoPet = dados.getTipoPet();
                String nomePet = dados.getNomePet();
                String racaPet = dados.getRacaPet();
                String idadePet = dados.getIdadePet();

                // Chamando o método adicionarAtendimento com os dados do cliente:
                adicionarAtendimento(id, nome, telefone, email, dataAtendimento, tipoServico, tipoPet, nomePet, racaPet, idadePet);
            }

            JOptionPane.showMessageDialog(
                    null, "Relatório gerado com sucesso!",
                    "Mensagem de sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void adicionarAtendimento(Integer id, String nome, String telefone, String email,
            String dataAtendimento, String tipoServico, String tipoPet, String nomePet, String racaPet, String idadePet) {
        String caminhoArquivo = "C:\\Users\\roger\\OneDrive\\Área de Trabalho\\SENAC Disciplinas\\UC8 - Java\\NetBeansProjects\\Challenge\\src\\Relatório.txt";
        File arquivoTexto = new File(caminhoArquivo);

        try {
            boolean arquivoNovo = arquivoTexto.createNewFile();

            try (FileWriter escrever = new FileWriter(caminhoArquivo, true)) {
                if (arquivoNovo) {
                    escrever.write("Atendimentos efetuados:\n");
                }
                escrever.write("\nID: " + id);
                escrever.write("\nNome: " + nome);
                escrever.write("\nTelefone: " + telefone);
                escrever.write("\nEmail: " + email);
                escrever.write("\nData de atendimento: " + dataAtendimento);
                escrever.write("\nTipo de serviço: " + tipoServico);
                escrever.write("\nTipo de pet: " + tipoPet);
                escrever.write("\nNome do pet: " + nomePet);
                escrever.write("\nRaça do pet: " + racaPet);
                escrever.write("\nIdade do pet: " + idadePet);
                escrever.write("\n");
                System.out.println("Dados do atendimento adicionados ao arquivo com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo!");
        }
    }//GEN-LAST:event_jMenuItemGerarRelatorioActionPerformed

    private void jMenuItemVerDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerDadosActionPerformed
        TabelaDados telaTabelaDados = new TabelaDados();
        jDesktop.add(telaTabelaDados);
        telaTabelaDados.setVisible(true);
    }//GEN-LAST:event_jMenuItemVerDadosActionPerformed

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
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPetShop.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPetShop().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuDeAcesso;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemGerarRelatorio;
    private javax.swing.JMenuItem jMenuItemServicos;
    private javax.swing.JMenuItem jMenuItemVerDados;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuTabelaDados;
    // End of variables declaration//GEN-END:variables
}
