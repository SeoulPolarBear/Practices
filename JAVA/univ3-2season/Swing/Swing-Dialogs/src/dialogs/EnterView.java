package dialogs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class EnterView extends JDialog
{
private DefaultListModel model;
private JTextField txtFirstname = new JTextField();
private JTextField txtLastname = new JTextField();

public EnterView(DefaultListModel model)
{
super(null, "Enter a name", Dialog.ModalityType.APPLICATION_MODAL);
this.model = model;
setSize(400, 200);
setLocationRelativeTo(null);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
createView();
setVisible(true);
}

private void createView()
{
setLayout(new BorderLayout());
JPanel panel = new JPanel(new BorderLayout(0, 20));
panel.setBorder(new EmptyBorder(20, 20, 20, 20));
panel.add(createTop(), BorderLayout.NORTH);
panel.add(createBottom());
add(panel);
}

private JPanel createTop()
{
JPanel panel = new JPanel(new GridLayout(2, 1, 0 ,10));
panel.add(createLine("First name", txtFirstname));
panel.add(createLine("Last name", txtLastname));
return panel;
}

private JPanel createBottom()
{
JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
panel.add(createButton("OK", 90, 25, this::ok));
panel.add(createSpace());
panel.add(createButton("Close", 90, 25, this::close));
return panel;
}

private JPanel createLine(String text, JTextField field)
{
JPanel panel = new JPanel(new BorderLayout());
JLabel label = new JLabel(text);
label.setPreferredSize(new Dimension(90, 22));
panel.add(label, BorderLayout.WEST);
panel.add(field);
return panel;
}

private JButton createButton(String text, int width, int height, ActionListener listener)
{
JButton cmd = new JButton(text);
cmd.addActionListener(listener);
cmd.setPreferredSize(new Dimension(width, height));
return cmd;
}

private JLabel createSpace()
{
JLabel label = new JLabel();
label.setPreferredSize(new Dimension(10, 20));
return label;
}

private void clear()
{
txtFirstname.setText("");
txtLastname.setText("");
txtFirstname.requestFocus();
}

private void ok(ActionEvent e)
{
String firstname = txtFirstname.getText().trim();
String lastname = txtLastname.getText().trim();
if (firstname.length() > 0 && lastname.length() > 0)
{
model.addElement(new Name(firstname, lastname));
clear();
}
else JOptionPane.showMessageDialog(this, "You must enter both first name and last name", "Error", JOptionPane.WARNING_MESSAGE);
}

private void close(ActionEvent e)
{
	dispose();
}
}


