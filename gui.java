import javax.swing.*;
import java.awt.GridLayout;
import java.awt.ActionListener;
import java.awt.ActionEvent;

public class gui extends JPanel{
  public gui(){
      setLayout(new GridLayout(3,3));
      initializebuttons();
      JFrame window = new JFrame("Tic-Tac-Toe");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.getContentPane().add(new gui());
      window.setBounds(300,200,300,300);
      window.setVisible(true);
  }

  public void initializebuttons(){
      for(int i = 0; i <= 8; i++){
        buttons[i] = new JButton();
        buttons[i].setText("");
        buttons[i].addActionListener(new buttonListener());
        add(buttons[i]);
      }
  }

  public void resetButtons(){
      for(int i = 0; i <= 8; i++){
        buttons[i].setText("");
      }
  }

  public void actionPerformed(ActionEvent e) {
      JButton buttonClicked = (JButton)e.getSource(); //get the particular button that was clicked
      if(alternate%2 == 0)
        buttonClicked.setText("X");
      else
        buttonClicked.setText("O");

      if(checkForWin() == true){
        JOptionPane.showConfirmDialog(null, "Game Over.");
        resetButtons();
      }

      alternate++;
  }
}
