
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class CadastroDados extends javax.swing.JInternalFrame {

    public CadastroDados() {
        initComponents();

        // Comando para desabilitar os botões ao inicializar a interface
        habilitarBotoes(false);
    }

    // Formatar a data atual para o padrão brasileiro:
    DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnPetShop = new javax.swing.JPanel();
        jpnCabecalho = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jpnDadosCliente = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblTipoServiço = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jftTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        cbxTipoServico = new javax.swing.JComboBox<>();
        txtData = new javax.swing.JTextField();
        jpnDadosPet = new javax.swing.JPanel();
        lblTipoPet = new javax.swing.JLabel();
        lblNomePet = new javax.swing.JLabel();
        lblRaçaPet = new javax.swing.JLabel();
        lblIdadePet = new javax.swing.JLabel();
        cbxTipoPet = new javax.swing.JComboBox<>();
        txtNomePet = new javax.swing.JTextField();
        txtRacaPet = new javax.swing.JTextField();
        jftIdadePet = new javax.swing.JFormattedTextField();
        jpnBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setTitle("Cadastro de Dados");
        setPreferredSize(new java.awt.Dimension(700, 600));
        setVisible(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CADASTRO");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoPetShop.png"))); // NOI18N

        javax.swing.GroupLayout jpnCabecalhoLayout = new javax.swing.GroupLayout(jpnCabecalho);
        jpnCabecalho.setLayout(jpnCabecalhoLayout);
        jpnCabecalhoLayout.setHorizontalGroup(
            jpnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnCabecalhoLayout.setVerticalGroup(
            jpnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do cliente:"));
        jpnDadosCliente.setToolTipText("");
        jpnDadosCliente.setName(""); // NOI18N

        lblNome.setText("Nome:");

        lblTelefone.setText("Telefone:");

        lblEmail.setText("Email:");

        lblData.setText("Data:");

        lblTipoServiço.setText("Tipo de serviço:");

        try {
            jftTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbxTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banho", "Tosa", "Hospedagem" }));

        txtData.setEditable(false);
        txtData.setText(LocalDate.now().format(data));

        javax.swing.GroupLayout jpnDadosClienteLayout = new javax.swing.GroupLayout(jpnDadosCliente);
        jpnDadosCliente.setLayout(jpnDadosClienteLayout);
        jpnDadosClienteLayout.setHorizontalGroup(
            jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoServiço, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(lblEmail)
                    .addComponent(lblTelefone)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addGroup(jpnDadosClienteLayout.createSequentialGroup()
                        .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnDadosClienteLayout.setVerticalGroup(
            jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDadosClienteLayout.createSequentialGroup()
                .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(jftTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoServiço)
                    .addComponent(cbxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpnDadosPet.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do pet:"));

        lblTipoPet.setText("Tipo:");

        lblNomePet.setText("Nome animal:");

        lblRaçaPet.setText("Raça:");

        lblIdadePet.setText("Idade (anos):");

        cbxTipoPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cachorro", "Gato", "Hamster", "Coelho", "Papagaio", "Peixe", "Porquinho da Índia" }));

        try {
            jftIdadePet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpnDadosPetLayout = new javax.swing.GroupLayout(jpnDadosPet);
        jpnDadosPet.setLayout(jpnDadosPetLayout);
        jpnDadosPetLayout.setHorizontalGroup(
            jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDadosPetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDadosPetLayout.createSequentialGroup()
                        .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRaçaPet)
                            .addComponent(lblNomePet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePet)
                            .addComponent(txtRacaPet)))
                    .addGroup(jpnDadosPetLayout.createSequentialGroup()
                        .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnDadosPetLayout.createSequentialGroup()
                                .addComponent(lblIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnDadosPetLayout.createSequentialGroup()
                                .addComponent(lblTipoPet)
                                .addGap(54, 54, 54)
                                .addComponent(cbxTipoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnDadosPetLayout.setVerticalGroup(
            jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDadosPetLayout.createSequentialGroup()
                .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoPet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePet)
                    .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaçaPet)
                    .addComponent(txtRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDadosPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdadePet)
                    .addComponent(jftIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR DADOS");
        btnSalvar.setPreferredSize(new java.awt.Dimension(170, 40));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(105, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setPreferredSize(new java.awt.Dimension(105, 40));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(105, 40));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBotoesLayout.createSequentialGroup()
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnPetShopLayout = new javax.swing.GroupLayout(jpnPetShop);
        jpnPetShop.setLayout(jpnPetShopLayout);
        jpnPetShopLayout.setHorizontalGroup(
            jpnPetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPetShopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnPetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDadosPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnPetShopLayout.setVerticalGroup(
            jpnPetShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPetShopLayout.createSequentialGroup()
                .addComponent(jpnCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDadosPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnDadosCliente.getAccessibleContext().setAccessibleName("Dados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpnPetShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnPetShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        setBounds(280, 0, 700, 605);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ModeloPetShop instanciaCompartilhada = ModeloPetShop.getInstanciaCompartilhada();

        // Salvar os dados do Cliente:
        int id = instanciaCompartilhada.incrementaId();
        String nome = txtNome.getText();
        String telefone = jftTelefone.getText();
        String email = txtEmail.getText();
        String data = instanciaCompartilhada.gerarDataFormatada();
        String tipoServico = cbxTipoServico.getSelectedItem().toString();

        // Salvar os dados do Pet:
        String tipoPet = cbxTipoPet.getSelectedItem().toString();
        String nomePet = txtNomePet.getText();
        String racaPet = txtRacaPet.getText();
        String idadePet = jftIdadePet.getText();

        ModeloPetShop novoRegistro = new ModeloPetShop(id, nome, telefone, email,
                tipoServico, data, tipoPet, nomePet, racaPet, idadePet);

        instanciaCompartilhada.cadastrarDados(novoRegistro);

        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!",
                "Mensagem de sucesso", JOptionPane.INFORMATION_MESSAGE);

        TabelaDados atualizar = new TabelaDados();
        atualizar.atualizaTabela();
        apagaTudo();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        apagaTudo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitarBotoes(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void apagaTudo() {
        // Apagar os dados do Cliente:
        txtNome.setText("");
        jftTelefone.setText("");
        txtEmail.setText("");

        // Apagar os dados do Pet:
        txtNomePet.setText("");
        txtRacaPet.setText("");
        jftIdadePet.setText("");

        // Apagar os dados das ComboBox:
        cbxTipoServico.setSelectedIndex(0);
        cbxTipoPet.setSelectedIndex(0);

        habilitarBotoes(false);
    }

    public void habilitarBotoes(boolean setReset) {
        txtNome.setEnabled(setReset);
        jftTelefone.setEnabled(setReset);
        txtEmail.setEnabled(setReset);
        txtData.setEnabled(setReset);
        cbxTipoServico.setEnabled(setReset);
        cbxTipoPet.setEnabled(setReset);
        txtNomePet.setEnabled(setReset);
        txtRacaPet.setEnabled(setReset);
        jftIdadePet.setEnabled(setReset);

        btnSalvar.setEnabled(setReset);
    }

    public String obterTxtNome() {
        return txtNome.getText();
    }

    public String obterJftTelefone() {
        return jftTelefone.getText();
    }

    public String obterTxtEmail() {
        return txtEmail.getText();
    }

    public String obterTxtData() {
        return txtData.getText();
    }

    public String obterCbxTipoServico() {
        return cbxTipoServico.getSelectedItem().toString();
    }

    public String obterCbxTipoPet() {
        return cbxTipoPet.getSelectedItem().toString();
    }

    public String obterTxtNomePet() {
        return txtNomePet.getText();
    }

    public String obterTxtRacaPet() {
        return txtRacaPet.getText();
    }

    public String obterJftIdadePet() {
        return jftIdadePet.getText();
    }

    public void resetarJpnPetShop() {
        // De alguma forma resetar o JpnPetShop
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLafDark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(CadastroDados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroDados().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxTipoPet;
    private javax.swing.JComboBox<String> cbxTipoServico;
    private javax.swing.JFormattedTextField jftIdadePet;
    private javax.swing.JFormattedTextField jftTelefone;
    private javax.swing.JPanel jpnBotoes;
    private javax.swing.JPanel jpnCabecalho;
    private javax.swing.JPanel jpnDadosCliente;
    private javax.swing.JPanel jpnDadosPet;
    private javax.swing.JPanel jpnPetShop;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdadePet;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomePet;
    private javax.swing.JLabel lblRaçaPet;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipoPet;
    private javax.swing.JLabel lblTipoServiço;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextField txtRacaPet;
    // End of variables declaration//GEN-END:variables
}
