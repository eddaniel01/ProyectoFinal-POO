package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class RegisEnfermedad extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegisEnfermedad dialog = new RegisEnfermedad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegisEnfermedad() {
		setTitle("Registro de enfermedades");
		setBounds(100, 100, 548, 384);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(142, 38, 237, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("Denominaci\u00F3n: ");
			lblNewLabel.setBounds(23, 41, 82, 14);
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("C\u00F3digo: ");
			lblNewLabel_1.setBounds(23, 79, 58, 14);
			panel.add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(142, 76, 237, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<<Seleccione>>", "Parasitaria", "Venerea", "Inmunologica"}));
			comboBox.setBounds(77, 139, 156, 20);
			panel.add(comboBox);
			
			JLabel lblNewLabel_2 = new JLabel("Tipo:");
			lblNewLabel_2.setBounds(23, 142, 44, 14);
			panel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("S\u00EDntomas: ");
			lblNewLabel_3.setBounds(23, 189, 71, 14);
			panel.add(lblNewLabel_3);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(77, 197, 376, 80);
			panel.add(textArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
