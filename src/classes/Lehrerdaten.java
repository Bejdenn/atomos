package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.BorderFactory.createLineBorder;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;

public class Lehrerdaten {

	public static JFrame frame;
	static JList jListData;
	static JList jListTeach;
	public static TextField TextField;
	static int reader0 = 0, reader1 = 0, reader2 = 0;
	static String[] KlassenLokal = new String[64];
	static int index0 = 0, int index1 = 0;

	static int AusgewaehlteListe;
	static int lehrerID = 1; // LehrerID

	public static SQLite.Database db;

	public static ArrayList<String> fach = new ArrayList();
	public static ArrayList<String> Klassen = new ArrayList();
	public static ArrayList<String> Raum = new ArrayList();

	public static String[] ListNameS = { "Klassenliste", "Fächerliste", "Raumliste", "Sprechstunden" };

	public static DefaultListModel DefaultModel, DataModel1, DataModel2, DataModel3, DataModel4;
	public static DefaultListModel TeachModel1, TeachModel2, TeachModel3, TeachModel4;

	public static String faecherTextFile = new File("FaecherText.txt").getAbsolutePath();
	public static String klassenTextFile = new File("KlassenText.txt").getAbsolutePath();
	public static String raumTextFile = new File("RaumText.txt").getAbsolutePath();

	public static List<String> faecherList = new ArrayList<>();
	public static List<String> klassenList = new ArrayList<>();
	public static List<String> raumList = new ArrayList<>();

	private void createList(String path, List list, DefaultListModel target) throws IOException {
		try (BufferedReader file = new BufferedReader(new FileReader(path));) {
			String line;
			int addTo = 0;

			while ((line = file.readLine()) != null) {
				list.add(line);
				target.addElement(list.get(addTo));
				addTo++;
			}
		}
	}

	private static void move(List<String> list, DefaultListModel target) {
		list.add(jListData.getSelectedValue().toString());
		target.addElement(jListData.getSelectedValue());
	}

	// TODO: Hier noch änderungen machen - auf die Liste (x)
	private static void deleteEntry(DefaultListModel removeList, List list) throws FileNotFoundException, IOException {
		if (jListTeach.getSelectedIndex() != -1) {
			list.remove(jListTeach.getSelectedIndex());
			removeList.remove(jListTeach.getSelectedIndex());
		}

	}

	private static void saveToTextFile(String path, List list) throws IOException, Exception {
		File txt = new File(path);

		if (txt.delete() == true) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}

		File overwrite = new File(path);
		overwrite.createNewFile();

		if (overwrite.createNewFile() == true) {
			System.out.println("Success");
		}

		FileWriter writer = new FileWriter(path, false);

		int listSize = 0;
		while (listsize != list.size()) {
			System.out.println("Old: " + list.get(listsize));

			writer.write(list.get(listsize).toString());
			writer.write("\n");

			listsize++;
		}

		writer.close();

		list.clear();

		frame.dispose();
	}

	public Lehrerdaten() throws Exception {
		int i;

		int b = (int) (Toolkit.getDefaultToolkit().getScreenSize().width * 0.75);
		int h = (int) (Toolkit.getDefaultToolkit().getScreenSize().height * 0.75);

		String[] DataEmpty = {};
		String[] TeachEmpty = {};

		DefaultModel<E> = new DefaultListModel<E>();
		DataModel1 = new DefaultListModel();
		DataModel2 = new DefaultListModel();
		DataModel3 = new DefaultListModel();
		DataModel4 = new DefaultListModel();

		TeachModel1 = new DefaultListModel();
		TeachModel2 = new DefaultListModel();
		TeachModel3 = new DefaultListModel();
		TeachModel4 = new DefaultListModel();

		frame = new JFrame();
		frame.setSize(b, h);
		frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - b) / 2,
				(Toolkit.getDefaultToolkit().getScreenSize().height - h) / 2);
		frame.setResizable(false);
		frame.setUndecorated(true);
		// TODO: on close call a method to save from list to file! (x)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(0, 0, b, h);
		MainPanel.setBackground(new Color(200, 225, 250));
		MainPanel.setLayout(null);
		frame.add(MainPanel);

		JPanel ExitPanel = new JPanel();
		ExitPanel.setOpaque(false);
		ExitPanel.setBounds(b - 30, 4, 30, 30);
		MainPanel.add(ExitPanel);

		ExitPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Lehrerdaten.saveToTextFile(klassenTextFile, klassenList);
					Lehrerdaten.saveToTextFile(faecherTextFile, faecherList);
					Lehrerdaten.saveToTextFile(raumTextFile, raumList);
					frame.dispose();

				} catch (Exception ex) {
					Logger.getLogger(Lehrerdaten.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		JLabel Beenden = new JLabel("X");
		Beenden.setFont(new Font("Kelson Sans", Font.BOLD, 18));
		Beenden.setForeground(new Color(100, 100, 100));
		ExitPanel.add(Beenden);

		JPanel[] MainButtons = new JPanel[4];

		int MainWidth = b / 4;
		int MainHeight = 50;

		JPanel SideArea = new JPanel();
		SideArea.setLayout(new BoxLayout(SideArea, BoxLayout.Y_AXIS));
		SideArea.setBounds((int) (0.2 * MainWidth), (int) ((h / 2) - MainHeight * 2), MainWidth, MainHeight * 5);
		MainPanel.add(SideArea);

		for (i = 0; i < MainButtons.length; i++) {
			MainButtons[i] = new JPanel();
			MainButtons[i].setSize(MainWidth, MainHeight);
			MainButtons[i].setBackground(new Color(200, 200, 200));
			MainButtons[i].setBorder(createLineBorder(Color.BLACK, 1));
			MainButtons[i].setLayout(new FlowLayout(CENTER, 10, 13));
			SideArea.add(MainButtons[i]);
		}

		JPanel AddObj = new JPanel();
		AddObj.setSize(MainWidth, MainHeight);
		AddObj.setBackground(new Color(80, 80, 80));
		AddObj.setBorder(createLineBorder(Color.BLACK, 1));
		AddObj.setLayout(new FlowLayout(CENTER, 10, 13));
		SideArea.add(AddObj);

		JLabel AddObjLabel = new JLabel("Eintrag hinzufügen", SwingConstants.CENTER);
		AddObjLabel.setFont(new Font("Kelson Sans", Font.BOLD, 15));
		AddObjLabel.setForeground(Color.WHITE);
		AddObj.add(AddObjLabel);

		AddObj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddDat daten = new AddDat();
			}
		});

		JLabel[] ListName = new JLabel[4];

		for (i = 0; i < ListName.length; i++) {
			ListName[i] = new JLabel(ListNameS[i], SwingConstants.CENTER);
			ListName[i].setFont(new Font("Kelson Sans", Font.BOLD, 15));
			ListName[i].setForeground(Color.BLACK);
			MainButtons[i].add(ListName[i]);
		}

		jListData = new JList(DataEmpty);
		jListData.setBounds((int) (SideArea.getX() + SideArea.getWidth() + 100), (int) (h * 0.2), (int) (b / 5),
				(int) (h * 0.70));
		jListData.setFont(new Font("Kelson Sans", Font.BOLD, 16));
		jListData.setModel(DefaultModel);
		jListData.setBackground(new Color(200, 200, 200));
		jListData.setFixedCellHeight(50);
		MainPanel.add(jListData);

		jListTeach = new JList(TeachEmpty);
		jListTeach.setBounds(jListData.getWidth() + jListData.getX() + 100, (int) (h * 0.2), (int) (b / 5),
				(int) (h * 0.70));
		jListTeach.setFont(new Font("Kelson Sans", Font.BOLD, 16));
		jListTeach.setModel(DefaultModel);
		jListTeach.setBackground(new Color(200, 200, 200));
		jListTeach.setFixedCellHeight(50);
		MainPanel.add(jListTeach);

		JLabel DatenbankLabel = new JLabel("Datenbank");
		DatenbankLabel.setBounds(jListData.getX(), jListData.getY() - 50, jListData.getWidth(), 50);
		DatenbankLabel.setBorder(createLineBorder(Color.BLACK, 1));
		DatenbankLabel.setFont(new Font("Kelson Sans", Font.BOLD, 20));
		MainPanel.add(DatenbankLabel);

		JLabel EigenLabel = new JLabel("Eigene Liste");
		EigenLabel.setBounds(jListTeach.getX(), jListTeach.getY() - 50, jListData.getWidth(), 50);
		EigenLabel.setBorder(createLineBorder(Color.BLACK, 1));
		EigenLabel.setFont(new Font("Kelson Sans", Font.BOLD, 20));
		MainPanel.add(EigenLabel);

		JPanel MoveButton = new JPanel();
		MoveButton.setBackground(Color.WHITE);
		MoveButton.setBounds(((jListData.getX() + jListData.getWidth()) + (jListTeach.getX())) / 2 - 16, h / 2, 32, 32);
		MoveButton.setLayout(new BorderLayout());
		MainPanel.add(MoveButton);

		JLabel MoveLabel = new JLabel("→");
		MoveLabel.setSize(32, 32);
		MoveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MoveLabel.setFont(new Font("Kelson Sans", Font.BOLD, 20));
		MoveLabel.setForeground(Color.BLACK);
		MoveButton.add(MoveLabel);

		JPanel MinusButton = new JPanel();
		MinusButton.setBackground(Color.WHITE);
		MinusButton.setBounds(jListTeach.getX(), jListTeach.getY() + jListTeach.getHeight() + 20, 32, 32);
		MinusButton.setLayout(new BorderLayout());
		MainPanel.add(MinusButton);

		JLabel MinusLabel = new JLabel("-");
		MinusLabel.setSize(32, 32);
		MinusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MinusLabel.setFont(new Font("Kelson Sans", Font.BOLD, 20));
		MinusLabel.setForeground(Color.BLACK);
		MinusButton.add(MinusLabel);

		initList(klassenTextFile, klassenList, TeachModel1);
		initList(faecherTextFile, faecherList, TeachModel2);
		initList(raumTextFile, raumList, TeachModel3);

		db = new SQLite.Database("PS");
		Klassen = db.accessData("select distinct classes.description from classes", 1);
		db.close();

		String[] KlassenWin = new String[Klassen.size()];

		for (i = 0; i < KlassenWin.length; i++) {
			KlassenWin[i] = Klassen.get(i);
			DataModel1.addElement(KlassenWin[i]);
		}

		db = new SQLite.Database("PS");
		fach = db.accessData("select subjects.description from subjects", 1);
		db.close();

		String[] faecher = new String[fach.size()];

		for (i = 0; i < faecher.length; i++) {
			faecher[i] = fach.get(i);
			DataModel2.addElement(faecher[i]);
		}

		db = new SQLite.Database("PS");
		Raum = db.accessData("select distinct rooms.number from rooms", 1);
		db.close();

		String[] raeume = new String[Raum.size()];

		for (i = 0; i < raeume.length; i++) {
			raeume[i] = Raum.get(i);
			DataModel3.addElement(raeume[i]);
		}

		MainButtons[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jListData.setModel(DataModel1);
				jListTeach.setModel(TeachModel1);
				AusgewaehlteListe = 1;
			}
		});

		MainButtons[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jListData.setModel(DataModel2);
				jListTeach.setModel(TeachModel2);
				AusgewaehlteListe = 2;
			}
		});

		MainButtons[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				{
					jListData.setModel(DataModel3);
					jListTeach.setModel(TeachModel3);
					AusgewaehlteListe = 3;
				}
			}
		});

		MainButtons[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				{
					jListData.setModel(DataModel4);
					jListTeach.setModel(TeachModel4);
					AusgewaehlteListe = 4;
				}
			}
		});

		MoveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (jListData.getSelectedIndex() != -1) {
					if (AusgewaehlteListe == 1) {
						Lehrerdaten.move(klassenList, TeachModel1);
					}
					if (AusgewaehlteListe == 2) {
						Lehrerdaten.move(faecherList, TeachModel2);
					}
					if (AusgewaehlteListe == 3) {
						Lehrerdaten.move(raumList, TeachModel3);
					}
				}
			}
		});

		// TODO: Hier noch änderungen machen - auf die Liste (x)
		MinusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if (jListTeach.getSelectedIndex() != -1)

						if (AusgewaehlteListe == 1) {
							Lehrerdaten.deleteEntry(TeachModel1, klassenList);
						} else if (AusgewaehlteListe == 2) {
							Lehrerdaten.deleteEntry(TeachModel2, faecherList);
						} else if (AusgewaehlteListe == 3) {
							Lehrerdaten.deleteEntry(TeachModel3, raumList);
						}
				} catch (IOException ex) {
					Logger.getLogger(Lehrerdaten.class.getName()).log(Level.SEVERE, null, ex);
				} catch (Exception ex) {
					Logger.getLogger(Lehrerdaten.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		});

		frame.validate();

		frame.setVisible(true);
	}
}
