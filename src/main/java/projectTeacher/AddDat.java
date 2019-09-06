package projectTeacher;
//Immer noch Komplikationen mit Dateipfade; konnte nicht behoben werden


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static classes.Lehrerdaten.*;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static main.Hauptmenue_Ver05.b;
import static main.Hauptmenue_Ver05.h;

import java.util.List;

public class AddDat extends JFrame 
{
    public static JFrame AddEintrag;
    
    private static void manuellEintragen(String path, List list, DefaultListModel target)
    {
        //        BufferedReader file = new BufferedReader(new FileReader(path));
        //
        //        while (br.readLine() != null) {}
        //        
        //        br.close();
        //
        //        writer.write(TextField.getText());
        //        writer.write("\n");
        //        writer.close();
        
        list.add(TextField.getText());
        target.addElement(TextField.getText());
        AddEintrag.dispose();
    }
    
    public AddDat()
    {           
        int HelpB = (int) (b * 0.35);
        int HelpH = (int) (h * 0.35);
        AddEintrag = new JFrame();
        AddEintrag.setSize(HelpB, HelpH);
        AddEintrag.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - HelpB) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - HelpH) / 2);
        AddEintrag.setResizable(false);
        AddEintrag.setUndecorated(true);
        AddEintrag.setLayout(null);

        JPanel Background = new JPanel();
        Background.setLayout(null);
        Background.setBackground(new Color(200, 225, 250));
        Background.setBorder(createLineBorder(new Color(200, 225, 250, 200), 3));
        Background.setBounds(0, 0, HelpB, HelpH);
        AddEintrag.add(Background);

        JPanel EintragClose = new JPanel();
        EintragClose.setBackground(Background.getBackground());
        EintragClose.setBounds(HelpB-3-30, 3, 30, 30);
        Background.add(EintragClose);

        JLabel X = new JLabel("X");
        X.setFont(new Font("Kelson Sans", Font.BOLD, 18));
        X.setForeground(Color.WHITE);
        EintragClose.add(X);

        JLabel AddLabel = new JLabel("Hinzufügen");
        AddLabel.setFont(new Font("Kelson Sans", Font.BOLD, 18));
        AddLabel.setBounds(20, EintragClose.getY(), EintragClose.getX(), 30);
        AddLabel.setForeground(Color.WHITE);
        Background.add(AddLabel);

        JComboBox ChooseList = new JComboBox(ListNameS);
        ChooseList.setFont(new Font("Kelson Sans", Font.BOLD, 18));
        ChooseList.setBounds(20, AddLabel.getY()+2*45, HelpB-2*20, 30);
        Background.add(ChooseList);
        
        TextField = new TextField();
        TextField.setFont(new Font("Kelson Sans", Font.BOLD, 15));
        TextField.setBounds(20, AddLabel.getY()+3*45, HelpB-2*20, 30);
        Background.add(TextField);

        JPanel Add = new JPanel();
        Add.setBackground(Color.WHITE);
        Add.setBounds(TextField.getX(), AddLabel.getY()+4*45, HelpB-2*20, 30);
        Add.setLayout(new BorderLayout());
        Background.add(Add);

        JLabel Addition = new JLabel("+");
        Addition.setSize(32, 32);
        Addition.setHorizontalAlignment(SwingConstants.CENTER);
        Addition.setFont(new Font("Kelson Sans", Font.BOLD, 20));
        Addition.setForeground(Color.BLACK);
        Add.add(Addition);

        Add.addMouseListener(new MouseAdapter()
        {                         
            @Override
            public void mouseClicked(MouseEvent e)
            {                     
                switch (ChooseList.getSelectedIndex())  
                {
                    case 0:
                    AddDat.manuellEintragen(klassenTextFile, klassenList, TeachModel1);
                    break;

                    case 1:
                    AddDat.manuellEintragen(faecherTextFile, faecherList, TeachModel2);
                    break;
                                              
                    case 2:                    
                    AddDat.manuellEintragen(raumTextFile, raumList, TeachModel3);
                    break;
                                        
                    default:
                    break;
                }
            }   
        }); 

        EintragClose.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                AddEintrag.setVisible(false);
                frame.setEnabled(true);
            }
        });
        
        AddEintrag.setVisible(true);
    }
}
