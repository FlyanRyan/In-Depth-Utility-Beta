package menu.notes;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import menu.buffer.BufferPanel;

/**
 * @author ZackEvans
 * Class: Notes
 * 
 * panel that holds all notes components
 */

public class Notes extends JPanel
{
	public static final int Window_Width = 700;
	public static final int Window_Height = 500;
	public static final int btnLn1 = 75; // first line of buttons
	public static final int btnLn2 = 175; // Second line of buttons
	public static final int btnLn3 = 275; // Third lane of buttons
	public static final int leftRow = -75; // left verticle row
	public static final int rightRow = 125; // right verticle row
	public static final int btnWidth = 150; // button width
	public static final int btnHeight = 50; // button height
	public static final int btnPadding = 25; // space between the buttons
	private NotesList notesList;
	private AddNoteBtn addNoteBtn;
	BufferPanel bufferPanel; // create bufferPanel object
	
	/**
	 * Constructor: Notes
	 * @param bufferPanel
	 * 
	 * Call super Run panel hierarchy 
	 * Inharet bufferPanel object
	 * 
	 */
	
	public Notes (BufferPanel bufferPanel)
	{
		super();
		this.bufferPanel = bufferPanel;
	}
	
	/**
	 * Function: paintComponent*
	 * 
	 * 
	 * 
	 */
	
	public void paintComponent(Graphics g)
	{
		// have list be repainted
		// have notes body be repainted
	}
	
	/**
	 * Function: initialize
	 * 
	 * call function to create panel
	 * 
	 */
	
	public void initialize()
	{
		createComponents();
		initializeComponents();
		layoutComponents();
	}
	
	/**
	 * Function: create Components
	 * 
	 * create objects
	 * set location and size of components
	 */
	
	public void createComponents()
	{
		notesList = new NotesList(bufferPanel);
		addNoteBtn = new AddNoteBtn(bufferPanel);
		
		notesList.setBounds(0,50,250,445);
		addNoteBtn.setBounds(280,20,30,30);
	}
	
	/**
	 * Function: initializeComponents
	 * 
	 * call initialize methods
	 * 
	 */
	
	public void initializeComponents()
	{
		notesList.initialize();
		addNoteBtn.initialize();
	}
	
	/**
	 * Function: layoutComponents
	 * 
	 * set panel layout not nothing
	 * set size of panel
	 * add components to panel
	 * 
	 */
	
	
	public void layoutComponents()
	{
		setLayout(null);
		setPreferredSize(new Dimension(Window_Width,Window_Height-20));
		
		add(notesList);
		add(addNoteBtn);
	}
}
