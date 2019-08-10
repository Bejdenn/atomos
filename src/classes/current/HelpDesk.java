package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static main.Hauptmenue_Ver05.b;
import static main.Hauptmenue_Ver05.frame;
import static main.Hauptmenue_Ver05.h;

public class HelpDesk extends JFrame {

    public static JPanel HelpExit = new JPanel();

    public HelpDesk() {
        int HelpB = b / 2;
        int HelpH = h / 2;
        int fontsize = b/85;
        JFrame HelpDesk = new JFrame();
        HelpDesk.setSize(HelpB, HelpH);
        HelpDesk.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - HelpB) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - HelpH) / 2);
        HelpDesk.setResizable(false);
        HelpDesk.setUndecorated(true);
        HelpDesk.setLayout(null);

        JPanel Background = new JPanel();
        Background.setLayout(null);
        Background.setBackground(new Color(0, 0, 0));
        Background.setBorder(createLineBorder(new Color(0, 0, 0), 3));
        Background.setBounds(0, 0, HelpB, HelpH);
        HelpDesk.add(Background);

        HelpExit.setBackground(Background.getBackground());
        HelpExit.setBounds(HelpB-3-30, 3, 30, 30);
        Background.add(HelpExit);

        JLabel X = new JLabel("X");
        X.setFont(new Font("Kelson Sans", Font.BOLD, 18));
        X.setForeground(Color.WHITE);
        HelpExit.add(X);

        JPanel HeadLine = new JPanel();
        HeadLine.setLayout(new BorderLayout());
        HeadLine.setBackground(Background.getBackground());
        HeadLine.setBounds(39, 3, HelpExit.getX(), 30);
        Background.add(HeadLine);

        JLabel HeadLineLabel = new JLabel("<html><h2>Hilfefenster</h2></html>");
        HeadLineLabel.setHorizontalAlignment(SwingConstants.LEFT);
        HeadLineLabel.setFont(new Font("Kelson Sans", Font.BOLD, 18));
        HeadLineLabel.setForeground(Color.WHITE);
        HeadLine.add(HeadLineLabel);
             
        JLabel InfoLabel = new JLabel("<html> <p align='justify'>"
                + "Vielen Dank, dass Sie sich zur Erleichterung des organisatorischen Teils "
                + "Ihrer Arbeit als Pädagoge für die TeachersApp entschieden haben. "
                + "Dieses Programm ist in der Bedienung so einfach wie möglich gehalten und vieles erschließt "
                + "sich auf Grund der Namensgebung und der intuitiven Bedienung von selbst. Dennoch steht Ihnen "
                + "für jedes Fenster eine Hilfe zur Verfügung, die Sie über den Hilfebutton (rechts in der Kopfzeile, links neben dem Weiterpfeil) "
                + "erreichen können."
                + "<br> <br>"
                + "Beachten Sie bitte, dass manche Fenster nach dem ersten Besuch, nachdem "
                + "entsprechende Eingaben gemacht wurden, dann bei allen folgenden Aufrufen "
                + "etwas anders aussehen können. "
                + "<br> <br>"
                + "Sie befinden sich gerade auf dem zweigeteilten Eröffnungsfenster. "
                + "Im linken Teil erscheinen alle Klassen und Kurse, die Sie "
                + "angelegt haben. Von hier aus können Sie die einzelnen Klassen und Kurse "
                + "anwählen und erreichen so deren spezifischen Aktivitäten, wie „Stundenplan Klasse“, "
                + "„Sitzplan Klasse“, „Abfrage“ und vieles mehr. <br> Im rechten Teilfenster finden sie die lehrerbezogenen Aktivitäten."
                + "</p> <html>");
         
        JPanel InfoPanel = new JPanel();
        InfoPanel.setLayout(new BorderLayout());
        InfoPanel.setBackground(Background.getBackground());
        InfoPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        InfoPanel.setBounds(10, 45, HelpExit.getX(), h-100);
        Background.add(InfoPanel);
        
        InfoLabel.setFont(new Font("Kelson Sans", Font.BOLD, fontsize));
        InfoLabel.setBackground(Background.getBackground());
        InfoLabel.setBounds(HelpB/4, HeadLine.getWidth(), HelpB-3, HelpH/3-3-HeadLine.getY());
        InfoLabel.setForeground(Color.WHITE);       
        InfoPanel.add(InfoLabel, BorderLayout.PAGE_START);

        HelpExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HelpDesk.setVisible(false);
                frame.setEnabled(true);
            }
        });

        HelpDesk.setVisible(true);
    }
}
