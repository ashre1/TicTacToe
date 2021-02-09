
//package com.practice.example.caluculator;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeFrame extends JFrame {

    private String whoseturn = "X";
    private String playerone = "Player One";
    private String playertwo = "Player Two";
    private int playeronecount = 0;
    private int playertwocount = 0;
    private String playerturn = "";

    public TicTacToeFrame() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        getPlayerNames();
        setScore();
        playerturn();
    }

    private void makeEnable() {
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }

    private void playerturn() {
        if (whoseturn.equalsIgnoreCase("X")) {
            playerturn = playerone;
        } else {
            playerturn = playertwo;
        }
        jlabel_score.setText(playerone + " Score is " + String.valueOf(playeronecount) + "    " + playerturn + "   move's   " + playertwo + " Score is " + String.valueOf(playertwocount));

    }

    private void tiegame() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        if (one != "" && two != "" && three != "" && four != "" && five != "" && six != "" && seven != "" && eight != "" && nine != "") {
            JOptionPane.showMessageDialog(null, "Game is tie");
            resetgame();
            makeEnable();

        }
    }

    private void setScore() {

        jlabel_score.setText(playerone + " Score is " + String.valueOf(playeronecount) + "    " + playerturn + "   move's   " + playertwo + " Score is " + String.valueOf(playertwocount));

    }

    private void getPlayerNames() {
        playerone = JOptionPane.showInputDialog(this, "Enter player one name", "player name", JOptionPane.INFORMATION_MESSAGE);
        playertwo = JOptionPane.showInputDialog(this, "Enter player two name", "player name", JOptionPane.INFORMATION_MESSAGE);
        if (playerone.equals("")) {
            playerone = "Player One";
        }
        if (playertwo.equals("")) {
            playertwo = "Player Two";
        }
    }

    private void determinewhoseturn() {
        if (whoseturn.equalsIgnoreCase("X")) {
            whoseturn = "O";
        } else {
            whoseturn = "X";
        }
    }

    private void xwins() {
        JOptionPane.showMessageDialog(null, playerone + " " + "wins");

        playeronecount++;
        resetgame();
        setScore();
        makeEnable();

    }

    private void owins() {
        JOptionPane.showMessageDialog(null, playertwo + " " + "wins");

        playertwocount++;
        resetgame();
        setScore();
        makeEnable();
    }

    private void resetgame() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
    }

    private void determineIfWin() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        if (one == "X" && two == "X" && three == "X") {
            xwins();
        }
        if (four == "X" && five == "X" && six == "X") {
            xwins();
        }
        if (seven == "X" && eight == "X" && nine == "X") {
            xwins();
        }
        if (one == "X" && four == "X" && seven == "X") {
            xwins();
        }
        if (two == "X" && five == "X" && eight == "X") {
            xwins();
        }
        if (three == "X" && six == "X" && nine == "X") {
            xwins();
        }
        if (three == "X" && five == "X" && seven == "X") {
            xwins();
        }
        if (one == "X" && five == "X" && nine == "X") {
            xwins();
        }

        //if o win
        if (one == "O" && two == "O" && three == "O") {
            owins();
        }
        if (four == "O" && five == "O" && six == "O") {
            owins();
        }
        if (seven == "O" && eight == "O" && nine == "O") {
            owins();
        }
        if (one == "O" && four == "O" && seven == "O") {
            owins();
        }
        if (two == "O" && five == "O" && eight == "O") {
            owins();
        }
        if (three == "O" && six == "O" && nine == "O") {
            owins();
        }
        if (three == "O" && five == "O" && seven == "O") {
            owins();
        }
        if (one == "O" && five == "O" && nine == "O") {
            owins();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jlabel_score = new javax.swing.JLabel();
        panel_grid = new javax.swing.JPanel();
        jpanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jpanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jpanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jpanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jpanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jpanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jpanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jpanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jpanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe ");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(600, 600));

        Panel1.setBackground(new java.awt.Color(153, 153, 153));
        Panel1.setForeground(new java.awt.Color(153, 153, 153));
        Panel1.setLayout(new java.awt.BorderLayout());

        jlabel_score.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_score.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_score.setText("Place holder for scores");
        Panel1.add(jlabel_score, java.awt.BorderLayout.PAGE_END);

        panel_grid.setBackground(new java.awt.Color(153, 153, 153));
        panel_grid.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jpanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_1);

        jpanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_2);

        jpanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_3.setForeground(new java.awt.Color(255, 255, 255));
        jpanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_3);

        jpanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jpanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_4);

        jpanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jpanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_5);

        jpanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jpanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_6);

        jpanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_7.setToolTipText("");
        jpanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jpanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_7);

        jpanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jpanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_8);

        jpanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jpanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        panel_grid.add(jpanel_9);

        Panel1.add(panel_grid, java.awt.BorderLayout.CENTER);

        getContentPane().add(Panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.red);
        } else {
            jButton3.setForeground(Color.blue);
        }
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();
        jButton3.setEnabled(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.red);
        } else {
            jButton6.setForeground(Color.blue);
        }
        jButton6.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.red);
        } else {
            jButton1.setForeground(Color.blue);
        }
        jButton1.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.red);
        } else {
            jButton2.setForeground(Color.blue);
        }
        jButton2.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton4.setForeground(Color.red);
        } else {
            jButton4.setForeground(Color.blue);
        }
        jButton4.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton5.setForeground(Color.red);
        } else {
            jButton5.setForeground(Color.blue);
        }
        jButton5.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton7.setForeground(Color.red);
        } else {
            jButton7.setForeground(Color.blue);
        }
        jButton7.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.red);
        } else {
            jButton8.setForeground(Color.blue);
        }
        jButton8.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.red);
        } else {
            jButton9.setForeground(Color.blue);
        }
        jButton9.setEnabled(false);
        determinewhoseturn();
        determineIfWin();
        tiegame();
        playerturn();

    }

    public static void main(String args[]) {

        new TicTacToeFrame().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jlabel_score;
    private javax.swing.JPanel jpanel_1;
    private javax.swing.JPanel jpanel_2;
    private javax.swing.JPanel jpanel_3;
    private javax.swing.JPanel jpanel_4;
    private javax.swing.JPanel jpanel_5;
    private javax.swing.JPanel jpanel_6;
    private javax.swing.JPanel jpanel_7;
    private javax.swing.JPanel jpanel_8;
    private javax.swing.JPanel jpanel_9;
    private javax.swing.JPanel panel_grid;
    // End of variables declaration//GEN-END:variables
}
