package main;

import Fragenkatalog.Fragenkatalog;
import Klassenliste.Klassenselecter;
import Klassenliste.Main;
import Notenliste.*;
import Notenliste.NotenVerwalter;
import Notenliste.NotenlisteJFrame;
import Sitzplan.NewClass;
import Stundenplan.Stundenplan;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.*;

@SuppressWarnings("serial")
public class Hauptmenue_Ver05
{
    static int lid = 1;
    public static int i;
    public int ClassSize;
    public static ArrayList<String> KursID;

    public static void main(String[] args) throws Exception 
    {
//        int panelsize = b/8;
//        int fontsize = b/50;

        AppFrame frame = new AppFrame();
     
        List <AppSeparator> BaseSeparatorList = new ArrayList<AppSeparator>();
        BaseSeparatorList.add(new AppSeparator(0, 30, frame.getWidth(), frame.getHeight()));
//        BaseSeparatorList.add(new AppSeparator(mainPanel.borderSize, (int) round(h*0.1), b-2*rand, 400)));
//        MainSeperator[0]);
        frame.addComponentList(BaseSeparatorList);
//        MainSeperator[1] = new JSeparator();
//        MainSeperator[1].setOrientation(VERTICAL);
//        MainSeperator[1].setBounds((int) round(b*0.35), MainSeperator[0].getY()+rand, 400, (h-2*rand)-MainSeperator[0].getY());
//        mainpanel.add(MainSeperator[1]);
//
//        MainSeperator[2] = new JSeparator();
//        MainSeperator[2].setOrientation(VERTICAL);
//        MainSeperator[2].setBounds((int) round(b*0.65), MainSeperator[0].getY()+rand, 400, (h-2*rand)-MainSeperator[0].getY());
//        mainpanel.add(MainSeperator[2]);
//        
//        for(i = 0; i < MainSeperator.length; i++)
//        {
//            MainSeperator[i].setBackground(new Color(100, 100, 100));
//        }
//        
//        JLabel[] LabelMain  = new JLabel[4];
//        String[] LabelContent = {"<html>Die App <br> für den Lehrer</html>", "Ihre Klassen und Kurse", "Daten anzeigen", "Daten editieren"};
//        
//        JPanel [] LabelPanel = new JPanel[4];
//        
//        LabelPanel[0] = new JPanel();       
//        LabelPanel[0].setBounds(MainSeperator[1].getX(), rand, MainSeperator[2].getX()-MainSeperator[1].getX(), MainSeperator[0].getY());
//        
//        LabelPanel[1] = new JPanel();       
//        LabelPanel[1].setBounds(rand, MainSeperator[0].getY(), MainSeperator[1].getX(), MainSeperator[0].getY());
//        
//        LabelPanel[2] = new JPanel();       
//        LabelPanel[2].setBounds(MainSeperator[1].getX()+rand, MainSeperator[0].getY(), MainSeperator[2].getX()-MainSeperator[1].getX(), MainSeperator[0].getY());
//        
//        LabelPanel[3] = new JPanel();       
//        LabelPanel[3].setBounds(MainSeperator[2].getX(), MainSeperator[0].getY(), b-MainSeperator[2].getX()-rand, MainSeperator[0].getY());
//        
//        for(i = 0; i < LabelPanel.length; i++)
//        {
//            LabelPanel[i].setLayout(new BorderLayout());
//            LabelPanel[i].setBackground(mainpanel.getBackground());
//            mainpanel.add(LabelPanel[i]);
//        } 
//        
//        LabelMain[0] = new JLabel(LabelContent[0]);
//        LabelMain[0].setHorizontalAlignment(SwingConstants.CENTER);
//        
//        LabelMain[1] = new JLabel(LabelContent[1]);
//        LabelMain[1].setHorizontalAlignment(SwingConstants.CENTER);
//        
//        LabelMain[2] = new JLabel(LabelContent[2]);
//        LabelMain[2].setHorizontalAlignment(SwingConstants.CENTER);
//        
//        LabelMain[3] = new JLabel(LabelContent[3]);
//        LabelMain[3].setHorizontalAlignment(SwingConstants.CENTER);
//        
//     
//        for(i = 0; i < LabelMain.length; i++)
//        {
//            LabelMain[i].setFont(new Font("Kelson Sans", Font.BOLD, fontsize));
//            LabelMain[i].setForeground(GRAU);
//            LabelPanel[i].add(LabelMain[i]);
//        }
//      
//        JPanel Exit = new JPanel();
//        Exit.setBackground(mainpanel.getBackground());
//        Exit.setBounds(b-rand-30, LabelPanel[0].getY(), 30, 30);
//        mainpanel.add(Exit, BorderLayout.LINE_END);
//        
//        Exit.addMouseListener(new MouseAdapter() 
//        {
//            @Override
//            public void mouseClicked(MouseEvent e) 
//            {
//                System.exit(0);
//            }
//        });
//        
//        JLabel X = new JLabel("X");
//        X.setFont(new Font("Kelson Sans", Font.BOLD, 18));
//        X.setForeground(new Color(100, 100, 100));
//        Exit.add(X);
//        
//        Datenbank db = new Datenbank();
//        ArrayList <Integer>lidnamearr = db.datenAbfragen("select distinct teacher.surname from teacher where id=" + lid);
//        ArrayList <String> lidvornamearr = db.datenAbfragen("select distinct teacher.name from teacher where id=" + lid);
//        int lidname = lidnamearr.get(0);
//        String lidvorname = (String) lidvornamearr.get(0);
//        
//        JLabel LogIn = new JLabel("Angemeldet: " + lidname + " " + lidvorname);
//        LogIn.setFont(new Font("Kelson Sans", Font.BOLD, 15));
//        LogIn.setForeground(new Color(100, 100, 100));
//        LogIn.setBounds(15, LabelMain[0].getHeight()/2, 300, 50);
//        mainpanel.add(LogIn);
//        
//        JPanel Help = new JPanel();
//        Help.setBackground(mainpanel.getBackground());
//        Help.setBounds(b-rand-30-30, LabelPanel[0].getY(), 30, 30);
//        mainpanel.add(Help);
//
//        JLabel HelpLabel = new JLabel("?");
//        HelpLabel.setFont(new Font("Kelson Sans", Font.BOLD, 18));
//        HelpLabel.setForeground(new Color(100,100,100));
//        Help.add(HelpLabel);
//
//        Help.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                HelpDesk helpDesk = new HelpDesk();
//            }
//        });
//        
//        ArrayList<String> Klasse;
//        db = new SQLite.Database("PS");
//        Klasse = db.accessData("select distinct classes.description from classes join courses on classes.id=courses.class where courses.teacher=" + lid, 1);
//        db.close();
//        
//        
//        int ClassSize = Klasse.size();
//        System.out.print(ClassSize);
//        
//        JLabel ClassCreateLabel = new JLabel("<html>Neue Klasse<br>hinzufügen</html>", CENTER);
//        ClassCreateLabel.setSize(100, 100);
//        ClassCreateLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//        ClassCreateLabel.setForeground(Color.BLACK);
//        
//        JPanel NewClassCreate = new JPanel();
//        NewClassCreate.setBackground(new Color(200, 200, 200));
//        NewClassCreate.setBounds((int) (0.035*b), (int) (0.075*b+MainSeperator[0].getY()+LabelMain[1].getHeight()), panelsize, panelsize);
//        NewClassCreate.setLayout(new BorderLayout());
//        NewClassCreate.add(ClassCreateLabel);
//        
//        NewClassCreate.addMouseListener(new MouseAdapter() 
//        {
//            @Override
//            public void mouseClicked(MouseEvent e) 
//            {                       
//                try {
//                    Klassenselecter pasc = new Klassenselecter();
//                    Klassenselecter.main(args);
//                } catch (Exception ex) {
//                    Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        
//        if (ClassSize == 0)
//        {
//            mainpanel.add(NewClassCreate);
//        }
//        
//        else
//        {
//            JPanel[] KursPanel = new JPanel[ClassSize];
//            String[] KursName = new String[KursPanel.length];
//            JLabel[] KursLabel = new JLabel[KursName.length];
//            
//            int y = 0;
//            while (y < ClassSize) 
//            {
//                KursName[y] = Klasse.get(y);
//                y++;
//            }
//        
//            for (i = 0; i < ClassSize; i++) 
//            {
//                KursPanel[i] = new JPanel(new BorderLayout());
//                KursPanel[i].setBackground(new Color(200, 200, 200));
//            
//                KursLabel[i] = new JLabel(KursName[i], CENTER);
//                KursLabel[i].setSize(200, 50);
//                KursLabel[i].setFont(LabelMain[0].getFont());
//                KursLabel[i].setForeground(Color.BLACK);
//                
//               
//
//                if(i == 0)
//                {
//                    KursPanel[i].setBounds(NewClassCreate.getBounds());
//                    KursPanel[i].add(KursLabel[i]);
//                    mainpanel.add(KursPanel[i]);
//                    KursPanel[i].addMouseListener(new MouseAdapter() 
//                            {
//                                @Override
//                                public void mouseClicked(MouseEvent e) 
//                                {                       
//                                    try {       
//                                        String [] temp = new String[2];
//                                        temp[0] = KursName[0];
//                                        
//                                        Main.main(temp);
//                                    } catch (Exception ex) {
//                                        Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                }
//                            });
//                }
//                if(i == 1)
//                {
//                    KursPanel[i].setBounds((int) (panelsize+0.075*b), KursPanel[i-1].getY(), panelsize, panelsize);
//                    KursPanel[i].add(KursLabel[i]);
//                    mainpanel.add(KursPanel[i]);
//                    KursPanel[i].addMouseListener(new MouseAdapter() 
//                    {
//                        @Override
//                        public void mouseClicked(MouseEvent e) 
//                        {                       
//                            try {       
//                                String [] temp = new String[2];
//                                temp[0] = KursName[1];
//                            
//                                Main.main(temp);
//                            } catch (Exception ex) {
//                                Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        }
//                    });
//                    
//                }
//
//                if(i == 2)
//                {
//                        KursPanel[i].setBounds(KursPanel[i-2].getX(), (int) (KursPanel[i-2].getY()+0.045*b+panelsize), panelsize, panelsize);
//                        KursPanel[i].add(KursLabel[i]);
//                        mainpanel.add(KursPanel[i]);
//                        KursPanel[i].addMouseListener(new MouseAdapter() 
//                            {
//                                @Override
//                                public void mouseClicked(MouseEvent e) 
//                                {                       
//                                    try {       
//                                        String [] temp = new String[2];
//                                        temp[0] = KursName[2];
//                                       
//                                        Main.main(temp);
//                                    } catch (Exception ex) {
//                                        Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                }
//                            });
//                }
//                        
//                if(i == 3)
//                {
//                        KursPanel[i].setBounds(KursPanel[i-2].getX(), (int) (KursPanel[i-1].getY()), panelsize, panelsize);
//                        KursPanel[i].add(KursLabel[i]);
//                        mainpanel.add(KursPanel[i]);
//                        KursPanel[i].addMouseListener(new MouseAdapter() 
//                            {
//                                @Override
//                                public void mouseClicked(MouseEvent e) 
//                                {                       
//                                    try {       
//                                        String [] temp = new String[2];
//                                        temp[0] = KursName[3];
//                                 
//                                        Main.main(temp);
//                                    } catch (Exception ex) {
//                                        Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                }
//                            });
//                }
//
//                if(i == 4)
//                {
//                        KursPanel[i].setBounds(KursPanel[i-2].getX(), (int) (KursPanel[i-1].getY()+panelsize+0.045*b), panelsize, panelsize);
//                        KursPanel[i].add(KursLabel[i]);
//                        mainpanel.add(KursPanel[i]);
//                        KursPanel[i].addMouseListener(new MouseAdapter() 
//                            {
//                                @Override
//                                public void mouseClicked(MouseEvent e) 
//                                {                       
//                                    try {       
//                                        String [] temp = new String[2];
//                                        temp[0] = KursName[4];
//                                  
//                                        Main.main(temp);
//                                    } catch (Exception ex) {
//                                        Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                }
//                            });
//                }
//                        
//                if(i == 5)
//                {
//                        KursPanel[i].setBounds(KursPanel[i-2].getX(), (int) (KursPanel[i-1].getY()), panelsize, panelsize);
//                        KursPanel[i].add(KursLabel[i]);
//                        mainpanel.add(KursPanel[i]);
//                        KursPanel[i].addMouseListener(new MouseAdapter() 
//                            {
//                                @Override
//                                public void mouseClicked(MouseEvent e) 
//                                {                       
//                                    try {       
//                                        String [] temp = new String[2];
//                                        temp[0] = KursName[5];
//                           
//                                        Main.main(temp);
//                                    } catch (Exception ex) {
//                                        Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                }
//                            });
//                } 
//            }
//        }
//
//        JPanel [] AnzeigePanel = new JPanel[4];
//        for (i = 0; i < AnzeigePanel.length; i++) 
//        {
//            AnzeigePanel[i] = new JPanel();
//            AnzeigePanel[i].setBackground(NewClassCreate.getBackground());
//            AnzeigePanel[i].setLayout(new BorderLayout());    
//        }
//        
//        AnzeigePanel[0].setBounds(b/2 - panelsize/2, NewClassCreate.getY(), panelsize, panelsize);
//        mainpanel.add(AnzeigePanel[0]);
//        AnzeigePanel[1].setBounds(AnzeigePanel[0].getX(), (int) (NewClassCreate.getY()+0.045*b+panelsize), panelsize, panelsize);
//        mainpanel.add(AnzeigePanel[1]);
//        AnzeigePanel[2].setBounds(AnzeigePanel[0].getX(), (int) (AnzeigePanel[1].getY()+panelsize+0.045*b), panelsize, panelsize);
//        mainpanel.add(AnzeigePanel[2]);
//
//        JLabel TerminLabel = new JLabel("<html>Notenverwalter</html>", CENTER);
//        TerminLabel.setSize(100, 100);
//        TerminLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//        TerminLabel.setForeground(Color.BLACK);
//        AnzeigePanel[0].add(TerminLabel);
//        
//        AnzeigePanel[0].addMouseListener(new MouseAdapter() 
//        {
//            @Override
//            public void mouseClicked(MouseEvent e) 
//            {                       
//                try {
//                    new NotenVerwalter().setVisible(true);
//                } catch (Exception ex) {
//                    Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//
//        JLabel StundenPlanLabel = new JLabel("<html>Stundenplan<br>Lehrer</html>", CENTER);
//        StundenPlanLabel.setSize(100, 100);
//        StundenPlanLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//        StundenPlanLabel.setForeground(Color.BLACK);
//        AnzeigePanel[1].add(StundenPlanLabel);
//        
//        AnzeigePanel[1].addMouseListener(new MouseAdapter() 
//        {
//            @Override
//            public void mouseClicked(MouseEvent e) 
//            {                       
//                try {
//                    Stundenplan plan = new Stundenplan(lid);
//                } catch (Exception ex) {
//                    Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//
//        JLabel KalenderLabel = new JLabel("<html>Jahreskalender</html>", CENTER);
//        KalenderLabel.setSize(100, 100);
//        KalenderLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//        KalenderLabel.setForeground(Color.BLACK);
//        AnzeigePanel[2].add(KalenderLabel);
//        
//        JPanel [] EditierPanel = new JPanel[6];
//        
//        for (i = 0; i < EditierPanel.length; i++) 
//        {
//            EditierPanel[i] = new JPanel();
//            EditierPanel[i].setBackground(NewClassCreate.getBackground());
//            EditierPanel[i].setLayout(new BorderLayout());
//            
//            if (i == 0)
//            {
//                EditierPanel[i].setBounds((int) (0.035*b)+MainSeperator[2].getX() , AnzeigePanel[0].getY(), panelsize, panelsize);
//                mainpanel.add(EditierPanel[i]);
//                
//                JLabel FragEditLabel = new JLabel("<html>Fragenkatalog<br>erstellen</html>", CENTER);
//                FragEditLabel.setSize(100, 100);
//                FragEditLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//                FragEditLabel.setForeground(Color.BLACK);
//                EditierPanel[i].add(FragEditLabel);
//                
//                                
//                EditierPanel[i].addMouseListener(new MouseAdapter() 
//                {
//                    @Override
//                    public void mouseClicked(MouseEvent e) 
//                    {                                               
//                        try {
//                            Fragenkatalog Ask = new Fragenkatalog(lid);
//                        } catch (Exception ex) {
//                            Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                });
//                
//            }
//            
//            if (i == 1)
//            {
//                EditierPanel[i].setBounds((int) (panelsize+0.075*b)+MainSeperator[2].getX(), AnzeigePanel[0].getY(), panelsize, panelsize);
//                mainpanel.add(EditierPanel[i]); 
//                
//                JLabel LehrStundLabel = new JLabel("<html>Abfragefenster<br>editieren</html>", CENTER);
//                LehrStundLabel.setSize(100, 100);
//                LehrStundLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//                LehrStundLabel.setForeground(Color.BLACK);
//                EditierPanel[i].add(LehrStundLabel);
//                
//                
//            }
//
//            if (i == 2)
//            {
//                EditierPanel[i].setBounds((int) EditierPanel[i-2].getX(), AnzeigePanel[1].getY(), panelsize, panelsize);
//                mainpanel.add(EditierPanel[i]);
//                
//                JLabel EinzelabEdit = new JLabel("<html>Sitzplan<br>editieren</html>", CENTER);
//                EinzelabEdit.setSize(100, 100);
//                EinzelabEdit.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//                EinzelabEdit.setForeground(Color.BLACK);
//                EditierPanel[i].add(EinzelabEdit);  
//                
//                EditierPanel[i].addMouseListener(new MouseAdapter() 
//                {
//                    @Override
//                    public void mouseClicked(MouseEvent e) 
//                    {
//                        try {
//                            NewClass sitzplan = new NewClass();
//                            NewClass.main(args);
//                        } catch (Exception ex) {
//                            Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                });
//                
//            }
//
//            if (i == 3)
//            {
//                EditierPanel[i].setBounds((int) EditierPanel[i-2].getX(), AnzeigePanel[1].getY(), panelsize, panelsize);
//                mainpanel.add(EditierPanel[i]);
//                
//                JLabel LehrerDatLabel = new JLabel("<html>Lehrerdaten</html>", CENTER);
//                LehrerDatLabel.setSize(100, 100);
//                LehrerDatLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//                LehrerDatLabel.setForeground(Color.BLACK);
//                EditierPanel[3].add(LehrerDatLabel);               
//                
//                EditierPanel[i].addMouseListener(new MouseAdapter() 
//                {
//                    @Override
//                    public void mouseClicked(MouseEvent e) 
//                    {
//                        try {
//                            Lehrerdaten LehrDat = new Lehrerdaten();
//                        } catch (Exception ex) {
//                            Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                });
//            }       
//
//            if (i == 4)
//            {
//                EditierPanel[i].setBounds((int) EditierPanel[i-2].getX(), AnzeigePanel[2].getY(), panelsize, panelsize);
//                mainpanel.add(EditierPanel[i]);
//                
//                JLabel EinstellungenLabel = new JLabel("<html>Notenliste<br>editieren</html>", CENTER);
//                EinstellungenLabel.setSize(100, 100);
//                EinstellungenLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize - 6));
//                EinstellungenLabel.setForeground(Color.BLACK);
//                EditierPanel[4].add(EinstellungenLabel);  
//                
//                EditierPanel[i].addMouseListener(new MouseAdapter() 
//                {
//                    @Override
//                    public void mouseClicked(MouseEvent e) 
//                    {
//                        try {
//                            new NotenlisteJFrame().setVisible(true);
//                        } catch (Exception ex) {
//                            Logger.getLogger(Hauptmenue_Ver05.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                });
//            }
//        
//            if(i == 5)
//            {   
//                if(ClassSize == 0)
//                {
//                    break;
//                }
//                else
//                {
//                    EditierPanel[i] = NewClassCreate;
//                    EditierPanel[i].setBounds((int) EditierPanel[i-2].getX(), AnzeigePanel[2].getY(), panelsize, panelsize);
//                    mainpanel.add(EditierPanel[i]);
//                }
//            }
//        }
//        
        //</editor-fold>
        
        frame.setVisible(true);
    }      
}