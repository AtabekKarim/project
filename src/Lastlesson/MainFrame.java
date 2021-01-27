package Lastlesson;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JLabel jLabel;
    private JLabel jLabelResult;
    private JLabel jLabelAge;
    private JTextField jTextField;
    private JTextField jTextResult;
    private JButton jButton;
    private JComboBox jComboBox;
    private JComboBox jComboPerson;
    private JTextArea jTextArea;
    Integer ages[] = new Integer[100];
    Person persons[] = {
            new Person("Erlan", "Karabaliyev", "junior back end dev"),
            new Person("Bekzat", "Bekzat", "product manager"),
            new Person("Atabek", "Karim", "Senior"),
            new Person("Sanzhar", "Sanzhar", "ios dev"),
    };

    public MainFrame() {

        for (int i = 0; i < 100; i++) {
            ages[i] = i + 1;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(null);

        jLabel = new JLabel("Insert name: ");
        jLabel.setBounds(40, 30, 80, 20);
        add(jLabel);

        jTextField = new JTextField();
        jTextField.setBounds(120, 30, 100, 20);
        add(jTextField);

        jTextResult = new JTextField();
        jTextResult.setBounds(120, 130, 350, 20);
        add(jTextResult);

        jLabelResult = new JLabel("Your result: ");
        jLabelResult.setBounds(40, 130, 80, 20);
        add(jLabelResult);

        jButton = new JButton("Send");
        jButton.setBounds(270, 300, 90, 30);
        add(jButton);

        jLabelAge = new JLabel("Your age is: ");
        jLabelAge.setBounds(40, 60, 80, 20);
        add(jLabelAge);

        jComboBox = new JComboBox(ages);
        jComboBox.setBounds(120, 60, 150, 20);
        add(jComboBox);

        jComboPerson = new JComboBox(persons);
        jComboPerson.setBounds(120, 90, 250, 20);
        add(jComboPerson);

        jTextArea = new JTextArea();
        jTextArea.setBounds(120, 170, 300, 100);
        add(jTextArea);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = (String) jTextField.getText();
                Integer age = (Integer) jComboBox.getSelectedItem();
                Person person = (Person) jComboPerson.getSelectedItem();
                jTextResult.setText("Your name is " +
                        text + " age is " + age + " position is " +
                        person.getPosition());
                jTextArea.append(person + "\n");
            }
        });

    }
}