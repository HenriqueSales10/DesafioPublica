
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


 // @author henri


public class Pontuacao extends javax.swing.JFrame {
    
//Declaração das variáveis
int placar, num,maior,menor,qtdMaior,qtdMenor,jogo;
int linha  = 0;
   
    public Pontuacao() {
        initComponents();
        
        //mudança do ícone da aplicação
        URL caminhoIcone = getClass().getResource("/imagens/bola-de-basquete.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
         
         //Personalização do design da tabela
        tblPontuacao.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 15));
        tblPontuacao.getTableHeader().setOpaque(false);
        tblPontuacao.getTableHeader().setBackground(new Color(0,0,0));
        tblPontuacao.getTableHeader().setForeground(new Color(255,255,255));
        tblPontuacao.setRowHeight(25);
        DefaultTableModel modelo = (DefaultTableModel) tblPontuacao.getModel();
        tblPontuacao.setRowSorter(new TableRowSorter(modelo));
                        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPontuacao = new javax.swing.JTable();
        btnMaior = new javax.swing.JButton();
        btnMenor = new javax.swing.JButton();
        btnQtdMin = new javax.swing.JButton();
        btnQtdMax = new javax.swing.JButton();
        txtPontuacao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de pontuação");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pontuação de Maria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jToggleButton1.setText("Cadastrar pontuação");
        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 340, 60));

        jScrollPane1.setBorder(null);

        tblPontuacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPontuacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Jogo", "Pontuação", "Maior pontuação", "Menor pontuação", "Vezes de recorde mín", "Vezes de recorde máx"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPontuacao.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblPontuacao);
        if (tblPontuacao.getColumnModel().getColumnCount() > 0) {
            tblPontuacao.getColumnModel().getColumn(0).setHeaderValue("Jogo");
            tblPontuacao.getColumnModel().getColumn(1).setHeaderValue("Pontuação");
            tblPontuacao.getColumnModel().getColumn(2).setHeaderValue("Maior pontuação");
            tblPontuacao.getColumnModel().getColumn(3).setHeaderValue("Menor pontuação");
            tblPontuacao.getColumnModel().getColumn(4).setHeaderValue("Vezes de recorde mín");
            tblPontuacao.getColumnModel().getColumn(5).setHeaderValue("Vezes de recorde máx");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 416, 1230, 220));

        btnMaior.setBackground(new java.awt.Color(255, 255, 255));
        btnMaior.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMaior.setText("Maior pontuação");
        btnMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiorActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 337, -1, 50));

        btnMenor.setBackground(new java.awt.Color(255, 255, 255));
        btnMenor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMenor.setText("Menor pontuação");
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 337, -1, 50));

        btnQtdMin.setBackground(new java.awt.Color(255, 255, 255));
        btnQtdMin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnQtdMin.setText("Quantidade recordes mínimos");
        btnQtdMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtdMinActionPerformed(evt);
            }
        });
        getContentPane().add(btnQtdMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 337, -1, 50));

        btnQtdMax.setBackground(new java.awt.Color(255, 255, 255));
        btnQtdMax.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnQtdMax.setText("Quantidade recordes máximos");
        btnQtdMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtdMaxActionPerformed(evt);
            }
        });
        getContentPane().add(btnQtdMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 337, -1, 50));

        txtPontuacao.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(txtPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 248, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/basquete-betsul-brasileiros-nbalat.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed


try {
        jogo++;
        //Receber os dados    
        placar = Integer.parseInt(txtPontuacao.getText());
        
        //Validação para saber se o número digitado é positivo
        if (placar > 0){
        
                //if para quando é o primeiro numero digitado    
                if (jogo == 1){
                    maior=placar;
                    menor=placar;
                //    qtdMaior=placar;
                //    qtdMenor=placar;
                }

                //If para quando houver quebra de recorde máximo
                if (placar > maior){
                    maior=placar;
                    qtdMaior++;

                }
                //If para quando houver quebra de recorde mínimo
                 if (placar < menor){
                    menor=placar;
                    qtdMenor++;

                }   

                //Inserir dados na tabela
                   tblPontuacao.setValueAt(jogo, linha, 0);
                   tblPontuacao.setValueAt(placar, linha, 1);
                   tblPontuacao.setValueAt(maior, linha, 2);
                   tblPontuacao.setValueAt(menor, linha, 3);
                   tblPontuacao.setValueAt(qtdMenor, linha, 4);
                   tblPontuacao.setValueAt(qtdMaior, linha, 5);

                linha++;

                //Caso o número seja positivo
                JOptionPane.showMessageDialog(null, "Cadastro de pontuação concluído com sucesso ");
                       
        
        }
        
        //Caso o numero seja negativo
        else{
           jogo--;
           JOptionPane.showMessageDialog(null, "Digite apenas números positivos");
            }
    
        //Caso o try não seja concluido com sucesso
} catch (NumberFormatException e) {
    jogo--;
    JOptionPane.showMessageDialog(null, "Digite apenas números inteiros de até 4 dígitos");
}




        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaiorActionPerformed
        // Mensagem mostrando a maior pontuação
        
    JOptionPane.showMessageDialog(null, "A maior pontuação foi de: " + maior+ " pontos ");
    }//GEN-LAST:event_btnMaiorActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
        // Mensagem mostrando a menor pontuação
            
       JOptionPane.showMessageDialog(null, "A menor pontuação foi de: " + menor + " pontos");

    }//GEN-LAST:event_btnMenorActionPerformed

    private void btnQtdMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtdMinActionPerformed
        // Mensagem mostrando a quantidade de recordes mínimos quebrados
        JOptionPane.showMessageDialog(null, "A quantidade de recordes mínimos quebrados foi de: " + qtdMenor + " vezes");
    }//GEN-LAST:event_btnQtdMinActionPerformed

    private void btnQtdMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtdMaxActionPerformed
        // Mensagem mostrando a quantidade de recordes máximos quebrados
         JOptionPane.showMessageDialog(null, "A quantidade de recordes máximos quebrados foi de: " + qtdMaior + " vezes");
         
    }//GEN-LAST:event_btnQtdMaxActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pontuacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pontuacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pontuacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pontuacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pontuacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaior;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnQtdMax;
    private javax.swing.JButton btnQtdMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblPontuacao;
    private javax.swing.JTextField txtPontuacao;
    // End of variables declaration//GEN-END:variables
}
