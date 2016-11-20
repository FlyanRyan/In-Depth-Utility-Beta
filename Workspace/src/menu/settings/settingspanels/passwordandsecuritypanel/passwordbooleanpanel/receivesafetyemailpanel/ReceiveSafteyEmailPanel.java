package menu.settings.settingspanels.passwordandsecuritypanel.passwordbooleanpanel.receivesafetyemailpanel;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import menu.settings.settingsbufferpanel.SettingsBufferPanel;
import sql.systemsettings.securitysettings.SecuritySettingsDatabase;

public class ReceiveSafteyEmailPanel extends JPanel
{
	SettingsBufferPanel settingsBufferPanel;
	public static JCheckBox receiveSafteyEmailCheckbox;
	SafteyEmailCountCombobox safteyEmailCountCombobox;
	JLabel secondHalfofMessage = new JLabel(" Failed Attempts");
	
	public ReceiveSafteyEmailPanel(SettingsBufferPanel settingsBufferPanel)
	{
		super();
		this.settingsBufferPanel = settingsBufferPanel;
		initialize();
	}
	
	public void initialize()
	{
		createPanel();
		createCheckbox();
		addComponents();
	}
	
	public void createPanel()
	{
		receiveSafteyEmailCheckbox = new ReceiveSafteyEmailCheckBox(settingsBufferPanel);
		safteyEmailCountCombobox = new SafteyEmailCountCombobox();
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setOpaque(false);
	}
	
	public void createCheckbox()
	{
		receiveSafteyEmailCheckbox.setFocusPainted(false); // removed blue outline when clicked
		receiveSafteyEmailCheckbox.setBorderPainted(false); // remove the border.
	}
	
	public void addComponents()
	{
		add(receiveSafteyEmailCheckbox);
		add(SafteyEmailCountCombobox.safteyEmailCombobox);
		add(secondHalfofMessage);
	}
	
	public static void updateCheckbox()
	{
		SecuritySettingsDatabase securitySettingsDatabase = new SecuritySettingsDatabase();
		receiveSafteyEmailCheckbox.setSelected(securitySettingsDatabase.getReceiveEmailAttemptsValue());
	}
}