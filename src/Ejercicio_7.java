import javax.swing.JOptionPane;
public class Ejercicio_7 {
    public static void main (String[] args){
        char NuevaNota;
        short Nota;
        Nota=Short.parseShort(JOptionPane.showInputDialog("Igresa tu nota obtenida con un valor de 1 a 20"));
        if (Nota>=19 && Nota<=20){
           JOptionPane.showMessageDialog(null, "Su nota es A");
        }else if (Nota>=16 && Nota<=18){
           JOptionPane.showMessageDialog(null, "Su nota es B"); 
        }else if (Nota>=13 && Nota<=15){
           JOptionPane.showMessageDialog(null, "Su nota es C");
        }else if (Nota>=10 && Nota<=12){
           JOptionPane.showMessageDialog(null, "Su nota es D");
        }else if (Nota>=1 && Nota<=9){
           JOptionPane.showMessageDialog(null, "Su nota es E");
        }else {
           JOptionPane.showMessageDialog(null, "Nota no permitida");
        }
    }
}
