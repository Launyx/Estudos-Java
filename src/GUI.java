import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Olá, " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem? "));
        JOptionPane.showMessageDialog(null, "Você tem " + age + " anos");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura? "));
        JOptionPane.showMessageDialog(null, "Você tem " + height+ "m de altura");
    }
}
