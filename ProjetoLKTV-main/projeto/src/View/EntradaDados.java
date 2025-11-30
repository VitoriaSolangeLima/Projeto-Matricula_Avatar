package View;

import java.sql.SQLException;
import model.bean.Aluno;
import model.dao.AlunoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EntradaDados extends javax.swing.JFrame {

    public EntradaDados() {
        initComponents();
        txtdeficiencia.setVisible(false);
        txtnomesocial.setVisible(false);

    }
    private void limparCampos() {
    txtnome.setText("");
    txtcpfaluno.setText("");
    txtemail.setText("");
    txtnomesocial.setText("");
    txtdeficiencia.setText("");
    txtendereco.setText("");
    txttelefone.setText("");
    txtnomeresp.setText("");
    txttelefoneresp.setText("");
    txtcpfresp.setText("");
    txtnascimento.setText("");

    // Radio buttons
    rbtnsimdef.setSelected(false);
    rbtnnaodef.setSelected(false);
    rbtnsimnome.setSelected(false);
    rbtnnaonome.setSelected(false);

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        btngtipodef = new javax.swing.ButtonGroup();
        btngnomesocial = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnsair = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnascimento = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        txtcpfaluno = new javax.swing.JFormattedTextField();
        txttelefone = new javax.swing.JFormattedTextField();
        txtnomeresp = new javax.swing.JTextField();
        txttelefoneresp = new javax.swing.JFormattedTextField();
        txtcpfresp = new javax.swing.JFormattedTextField();
        rbtnsimnome = new javax.swing.JRadioButton();
        rbtnnaonome = new javax.swing.JRadioButton();
        rbtnsimdef = new javax.swing.JRadioButton();
        rbtnnaodef = new javax.swing.JRadioButton();
        txtdeficiencia = new javax.swing.JTextField();
        txtnomesocial = new javax.swing.JTextField();
        rbnti = new javax.swing.JRadioButton();
        rbnteletro = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(7, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsair.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnsair.setText("SAIR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        jPanel1.add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 120, 30));

        btnsalvar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 120, 30));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel1.setText("CADASTRO DO ALUNO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 16, 240, 20));

        jLabel2.setText("NOME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 96, -1));
        jPanel1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 530, 30));

        jLabel3.setText("Curso:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 68, -1));

        jLabel4.setText("Data De Nascimento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 138, -1));

        jLabel5.setText("Email do Aluno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 112, -1));

        jLabel6.setText("Tem Nome Social?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 121, -1));

        jLabel7.setText("Tem Algum Tipo de Deficiencia?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jLabel8.setText("Telefone: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 71, -1));

        jLabel9.setText("Nome do Responsável:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 191, -1));

        jLabel10.setText("CPF do Responsável:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 158, -1));

        jLabel11.setText("Telefone do Responsável:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jLabel12.setText("Endereço:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 88, -1));

        try {
            txtnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtnascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 140, 30));

        jLabel13.setText("CPF do Aluno:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 97, -1));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 530, 30));
        jPanel1.add(txtendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 530, 30));

        try {
            txtcpfaluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtcpfaluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, 30));

        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 140, 30));
        jPanel1.add(txtnomeresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 530, 30));

        try {
            txttelefoneresp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txttelefoneresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 140, 30));

        try {
            txtcpfresp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtcpfresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 140, 30));

        btngnomesocial.add(rbtnsimnome);
        rbtnsimnome.setText("Sim");
        rbtnsimnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnsimnomeActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnsimnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        btngnomesocial.add(rbtnnaonome);
        rbtnnaonome.setText("Não");
        rbtnnaonome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnnaonomeActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnnaonome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        btngtipodef.add(rbtnsimdef);
        rbtnsimdef.setText("Sim");
        rbtnsimdef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnsimdefActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnsimdef, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        btngtipodef.add(rbtnnaodef);
        rbtnnaodef.setText("Não");
        jPanel1.add(rbtnnaodef, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));
        jPanel1.add(txtdeficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 200, 30));
        jPanel1.add(txtnomesocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 530, 30));

        rbnti.setText("Técnico em Informática");
        jPanel1.add(rbnti, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        rbnteletro.setText("Técnico em Eletrotécnica");
        rbnteletro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnteletroActionPerformed(evt);
            }
        });
        jPanel1.add(rbnteletro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowGainedFocus

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsairActionPerformed


    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed

        if (txtnome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do aluno é obrigatório.");
            return;
        }

        if (txtcpfaluno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF do aluno é obrigatório.");
            return;
        }

        if (txtemail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O e-mail do aluno é obrigatório.");
            return;
        }

        if (txtendereco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O endereço do aluno é obrigatório.");
            return;
        }

        if (txttelefone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone do aluno é obrigatório.");
            return;
        }

        if (txtnomeresp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do responsável é obrigatório.");
            return;
        }

        if (txttelefoneresp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone do responsável é obrigatório.");
            return;
        }

        if (txtcpfresp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF do responsável é obrigatório.");
            return;
        }
        

        try {
            Aluno aluno = new Aluno();
            AlunoDAO adao = new AlunoDAO();

            aluno.setNomealuno(txtnome.getText());
            aluno.setCpfaluno(txtcpfaluno.getText().replaceAll("\\D", ""));
            aluno.setEmail_aluno(txtemail.getText());
            aluno.setNomesocial_aluno(txtnomesocial.getText());
            aluno.setDeficiente(rbtnsimdef.isSelected());
            aluno.setTipo_deficiencia(txtdeficiencia.getText());
            aluno.setEnderecoaluno(txtendereco.getText());

            // Remove máscara do telefone
            aluno.setTelefonealuno(txttelefone.getText().replaceAll("\\D", ""));
            aluno.setNomeresponsavel(txtnomeresp.getText());
            aluno.setTelefoneresponsavel(txttelefoneresp.getText().replaceAll("\\D", ""));
            aluno.setCpfresponsavel(txtcpfresp.getText().replaceAll("\\D", ""));

            //formatar data
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date data = sdf.parse(txtnascimento.getText());
                aluno.setData_nascimento(data);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data inválida!");
                return;
            }

            adao.create(aluno);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EntradaDados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         limparCampos();

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void rbnteletroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnteletroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnteletroActionPerformed

    private void txtnascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnascimentoActionPerformed

    private void rbtnnaonomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnnaonomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnnaonomeActionPerformed

    private void rbtnsimdefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnsimdefActionPerformed
        if (rbtnsimdef.isSelected()) {
            txtdeficiencia.setVisible(true);
            rbtnsimdef.setVisible(false);
            rbtnnaodef.setVisible(false);

        }
        
    }//GEN-LAST:event_rbtnsimdefActionPerformed

    private void rbtnsimnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnsimnomeActionPerformed
        if (rbtnsimnome.isSelected()) {
            rbtnsimnome.setVisible(false);
            rbtnnaonome.setVisible(false);
            txtnomesocial.setVisible(true);
        }
    }//GEN-LAST:event_rbtnsimnomeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaDados().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngnomesocial;
    private javax.swing.ButtonGroup btngtipodef;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbnteletro;
    private javax.swing.JRadioButton rbnti;
    private javax.swing.JRadioButton rbtnnaodef;
    private javax.swing.JRadioButton rbtnnaonome;
    private javax.swing.JRadioButton rbtnsimdef;
    private javax.swing.JRadioButton rbtnsimnome;
    private javax.swing.JFormattedTextField txtcpfaluno;
    private javax.swing.JFormattedTextField txtcpfresp;
    private javax.swing.JTextField txtdeficiencia;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JFormattedTextField txtnascimento;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomeresp;
    private javax.swing.JTextField txtnomesocial;
    private javax.swing.JFormattedTextField txttelefone;
    private javax.swing.JFormattedTextField txttelefoneresp;
    // End of variables declaration//GEN-END:variables
}
