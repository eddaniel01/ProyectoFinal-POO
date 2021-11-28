package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logico.Paciente;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton RegistrarBTN;
	private JButton CancelarBTN;
	private JTextField NombreTXT;
	private JTextField CedulaTXT;
	private JComboBox GeneroCBX;
	private JTextField NacimientoTXT;
	private JTextField TelefonoTXT;
	private JTextField DireccionTXT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegPaciente dialog = new RegPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegPaciente() {
		setResizable(false);
		setTitle("Registro Publucacion");
		setBounds(100, 100, 416, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 11, 62, 14);
		contentPanel.add(lblNewLabel);
		
		NombreTXT = new JTextField();
		NombreTXT.setBounds(10, 37, 387, 20);
		contentPanel.add(NombreTXT);
		NombreTXT.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula:");
		lblNewLabel_1.setBounds(10, 77, 62, 14);
		contentPanel.add(lblNewLabel_1);
		
		CedulaTXT = new JTextField();
		CedulaTXT.setBounds(10, 102, 180, 20);
		contentPanel.add(CedulaTXT);
		CedulaTXT.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Genero:");
		lblNewLabel_2.setBounds(231, 77, 62, 14);
		contentPanel.add(lblNewLabel_2);
		
		GeneroCBX = new JComboBox();
		GeneroCBX.setModel(new DefaultComboBoxModel(new String[] {"<<Seleccione>>", "Masculino", "Femenino", "No indentificado"}));
		GeneroCBX.setBounds(231, 102, 166, 20);
		contentPanel.add(GeneroCBX);
		
		JLabel Nacimiento = new JLabel("Fecha de Nacimiento:");
		Nacimiento.setBounds(10, 149, 123, 14);
		contentPanel.add(Nacimiento);
		
		NacimientoTXT = new JTextField();
		NacimientoTXT.setBounds(10, 174, 180, 20);
		contentPanel.add(NacimientoTXT);
		NacimientoTXT.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		lblNewLabel_3.setBounds(231, 149, 72, 14);
		contentPanel.add(lblNewLabel_3);
		
		TelefonoTXT = new JTextField();
		TelefonoTXT.setBounds(231, 174, 166, 20);
		contentPanel.add(TelefonoTXT);
		TelefonoTXT.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion:");
		lblNewLabel_4.setBounds(10, 217, 86, 14);
		contentPanel.add(lblNewLabel_4);
		
		DireccionTXT = new JTextField();
		DireccionTXT.setBounds(10, 242, 387, 20);
		contentPanel.add(DireccionTXT);
		DireccionTXT.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				RegistrarBTN = new JButton("Registrar");
				RegistrarBTN.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Paciente paciente = null;
						String nombre= NombreTXT.getText();
						String cedula= CedulaTXT.getText();
						String genero= (String) GeneroCBX.getSelectedItem();
						String fechaNacimiento= NacimientoTXT.getText();
						String telefono= TelefonoTXT.getText();
						String direccion= DireccionTXT.getText();
						paciente= new Paciente(cedula, nombre, genero, fechaNacimiento, direccion, telefono, null, null);
					    Limpiar();
					}

				
				});
				RegistrarBTN.setActionCommand("OK");
				buttonPane.add(RegistrarBTN);
				getRootPane().setDefaultButton(RegistrarBTN);
			}
			{
				CancelarBTN = new JButton("Cancelar");
				CancelarBTN.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				CancelarBTN.setActionCommand("Cancel");
				buttonPane.add(CancelarBTN);
			}
		}
		
	}
	
	public void Limpiar() {
			NombreTXT.setText("");
			CedulaTXT.setText("");
			GeneroCBX.setSelectedIndex(0);
			NacimientoTXT.setText("");
			TelefonoTXT.setText("");
			DireccionTXT.setText("");
	}
}
