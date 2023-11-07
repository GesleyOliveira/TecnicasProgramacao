
package GUI;

import javax.swing.JOptionPane;
import Classes.*;
import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.plaf.OptionPaneUI;

public class Cadastro extends javax.swing.JFrame {

    Controle controle;// Objeto que armazena as listas de Pessoas criadas.

    
    boolean editar=false;//Variavel de controle para marcar que o form está em modo de edição.
    
    public Cadastro() {
        initComponents();
        inicializa();
    }
    private void inicializa(){
        //Instancia o objeto controle e carrega o combox Genero
        controle=new Controle();
        cbox_genero.removeAllItems();
        for(EnumGenero var: EnumGenero.values())
            cbox_genero.addItem(var.toString());
        
    }
    
    private void carregaLista(){
        
        String aux;
        Pessoa pessoa;
        lista.removeAll();
        Object tipo=null;
        List<String> listaAux;
        
        switch (cbox_tipo.getItemAt(cbox_tipo.getSelectedIndex())){
            case "Professor":
                tipo=Professor.class;
                break;
            case "Administrativo":
                tipo=Administrativo.class;  
                break;
            case "Aluno Colegial":
                tipo=Colegial.class;
                break;
            case "Aluno Fundamental":
                tipo=Fundamental.class;  
                break;
        }
        
         listaAux= controle.pesquisaListaPessoas(tipo);
         for(int i=0;i < listaAux.size();i++){
             lista.add(listaAux.get(i));
         }
       }
    
    private void modoEdicao(boolean modoEdicao){
       
        if(modoEdicao){
            
            bto_cadastrar.setText("Editar");
            editar=true;
            cbox_tipo.setEnabled(false);
            
            int indice= lista.getSelectedIndex();
            Pessoa pessoaAux=controle.getPessoa(indice);
            String nome[]=pessoaAux.getNome().split(" ",2);
            
            Object tipoPessoa= pessoaAux.getClass();
            if(tipoPessoa.equals(Professor.class)|| tipoPessoa.equals(Administrativo.class)){
                txtb_Nome.setText( nome[1]);
            }
            else{
                txtb_Nome.setText( nome[0]+" "+nome[1]);
            }
            txtb_Idade.setText(String.valueOf(pessoaAux.getIdade()));
            cbox_genero.setSelectedIndex(pessoaAux.getGenero().ordinal());
            
        }
        else{
            bto_cadastrar.setText("Cadastrar");
            editar=false;
            cbox_tipo.setEnabled(true);
        }
    }
    private void limparTela(){
        txtb_Nome.setText("");
        txtb_Idade.setText("0");
        cbox_genero.setSelectedIndex(0);
    }
    
            
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lista = new java.awt.List();
        bto_cadastrar = new javax.swing.JButton();
        bto_deletar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbox_tipo = new javax.swing.JComboBox<>();
        cbox_genero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtb_Idade = new javax.swing.JTextField();
        txtb_Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSalvar = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuLogin = new javax.swing.JMenuItem();
        jMenuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        bto_cadastrar.setText("Cadastrar");
        bto_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_cadastrarActionPerformed(evt);
            }
        });

        bto_deletar.setText("Deletar");
        bto_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_deletarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo");

        cbox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Administrativo", "Aluno Colegial", "Aluno Fundamental", "TODOS" }));
        cbox_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbox_tipoItemStateChanged(evt);
            }
        });
        cbox_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_tipoActionPerformed(evt);
            }
        });

        cbox_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMININO" }));

        jLabel3.setText("Genero:");

        jLabel2.setText("Idade:");

        txtb_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb_NomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Cadastro de Alunos e Funcionários ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtb_Idade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbox_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(bto_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bto_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtb_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bto_cadastrar)
                    .addComponent(bto_deletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Geral", jPanel2);

        jLabel12.setText("Usuário Logado:");

        lblUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuarioLogado.setText("null");

        jMenu1.setText("Arquivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuSalvar.setText("Salvar");
        jMenuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSalvar);

        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAbrir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sala Virtual");

        jMenuLogin.setText("Login");
        jMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLoginActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuLogin);

        jMenuLogout.setText("Logout");
        jMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogoutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuLogout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblUsuarioLogado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalvarActionPerformed
        try {
            String filename = File.separator;
            JFileChooser fc = new JFileChooser(new File(filename));
            fc.showSaveDialog(jPanel2);
            File selFile= fc.getSelectedFile();
            
            if(selFile.isFile())
                //controle.salvar(selFile.toString());
                Serializador.gravar(selFile.toString(), controle);
            else
                //controle.salvar(selFile.toString()+".dat");
                Serializador.gravar(selFile.toString()+".dat", controle);
            
            JOptionPane.showMessageDialog(rootPane, "Salvo!");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        //Adicione as funcionalidades para necessarias para serializar e salvar o objeto Controle controle em arquivo
        
    }//GEN-LAST:event_jMenuSalvarActionPerformed

    private void txtb_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtb_NomeActionPerformed

    private void cbox_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_tipoActionPerformed
        //Pesquisa pelo tipo selecionado
        carregaLista();
    }//GEN-LAST:event_cbox_tipoActionPerformed

    private void cbox_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbox_tipoItemStateChanged

    }//GEN-LAST:event_cbox_tipoItemStateChanged

    private void bto_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_deletarActionPerformed
        //Remove a Pessoa Selecionada da lista

        //Retorna o índice da lista
        int indice= lista.getSelectedIndex();
        //Se o índice for = -1 nenhum item da lista foi selecionado
        if(indice !=-1){
            controle.removerPessoa(indice);
            carregaLista();
        }
        else
        JOptionPane.showMessageDialog(rootPane, "Selecione um item da lista!");
    }//GEN-LAST:event_bto_deletarActionPerformed

    private void bto_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_cadastrarActionPerformed
        
        String nome;
        int idade;
        EnumGenero genero;

        if(txtb_Nome.getText().isEmpty() || txtb_Idade.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos, antes de prosseguir!");
            return ;
        }

        if(JOptionPane.showConfirmDialog(rootPane, "Deseja prosseguir?")== JOptionPane.NO_OPTION){
            modoEdicao(false);

        }else{
               
            nome=txtb_Nome.getText();
            idade=Integer.parseInt(txtb_Idade.getText());

            if(cbox_genero.getItemAt(cbox_genero.getSelectedIndex()).equals(EnumGenero.MASCULINO.toString()))
            genero=EnumGenero.MASCULINO;
            else
            genero=EnumGenero.FEMININO;

            limparTela();

            if(editar==false){
                //Adiciona novos itens
                try{
                switch (cbox_tipo.getItemAt(cbox_tipo.getSelectedIndex())){
                    case "Professor":
                    controle.addProfessor(nome, genero, idade);
                    break;
                    case "Administrativo":
                    controle.addFuncionarioAdm(nome, genero, idade);
                    break;
                    case "Aluno Colegial":
                    controle.addAlunoColegial(nome, genero, idade);
                    break;
                    case "Aluno Fundamental":
                    controle.addAlunoFundamental(nome, genero, idade);
                    break;

                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "Erro: " + e);
                }
            }
                else{//Edita o item selecionado
                //Retorna o índice da lista
                int indice= lista.getSelectedIndex();
                //Se o índice for = -1 nenhum item da lista foi selecionado
                if(indice !=-1){
                    try{
                    controle.editarPessoa(indice, nome, genero, idade);
                } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: A idade deve ser um número válido.");
                }
                }
                else
                JOptionPane.showMessageDialog(rootPane, "Selecione um item!");

                //Após o item ser editado o modo de edição deve ser alterado para false.
                modoEdicao(false);
            }
            carregaLista();
        }
        
    }//GEN-LAST:event_bto_cadastrarActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // Edita o item
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja editar seleção?")== JOptionPane.YES_OPTION){
            modoEdicao(true);
        }
    }//GEN-LAST:event_listaActionPerformed

    private void jMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLoginActionPerformed
        
        new Login(controle, controle.pesquisaListaPessoas(null)).setVisible(true);
        lblUsuarioLogado.setText(controle.getUsuarioLogado());
    }//GEN-LAST:event_jMenuLoginActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        lblUsuarioLogado.setText(controle.getUsuarioLogado());
    }//GEN-LAST:event_formWindowGainedFocus

    private void jMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogoutActionPerformed
       try{
        JOptionPane.showMessageDialog(rootPane, controle.logout());
        lblUsuarioLogado.setText("null");
       }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
       }
    }//GEN-LAST:event_jMenuLogoutActionPerformed

    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        try {
            String filename = File.separator;
            JFileChooser fc = new JFileChooser(new File(filename));
            Component jPanel2 = null;
            fc.showOpenDialog(jPanel2);
            File selFile= fc.getSelectedFile(); 
            Object arquivo;
            arquivo = Serializador.ler(selFile.toString());
            this.controle = (Controle) arquivo;
            carregaLista();
            JOptionPane.showMessageDialog(rootPane, "Carregado!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    //Adicione as funcionálidades para abrir o arquivo serializado e restaurar o objeto Controle controle.
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_cadastrar;
    private javax.swing.JButton bto_deletar;
    private javax.swing.JComboBox<String> cbox_genero;
    private javax.swing.JComboBox<String> cbox_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuLogin;
    private javax.swing.JMenuItem jMenuLogout;
    private javax.swing.JMenuItem jMenuSalvar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblUsuarioLogado;
    private java.awt.List lista;
    private javax.swing.JTextField txtb_Idade;
    private javax.swing.JTextField txtb_Nome;
    // End of variables declaration//GEN-END:variables

}
