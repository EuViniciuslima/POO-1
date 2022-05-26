import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.nio.file.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class ExerciciosTexto03
{
    
    public String exercicio3_1() 
    {
        Date dataAtual = new Date();
        return ""+dataAtual;
    }
    
    public String exercicio3_2(Date data)
    {
        Date dataAtual = new Date();
        SimpleDateFormat formatador1 = new SimpleDateFormat("dd/MM/yy");
        return ""+dataAtual;
        
    }
    
    public String[] exercicio3_3() 
    {
        File diretorioDown = new File("D:\\Download");
        String[] conteudo = diretorioDown.list();
        return conteudo;
    }
    
    public String[] exercicio3_4() 
    {
        File diretorioDown = new File("D:\\Download");
        String[] conteudo = diretorioDown.list();
        if (diretorioDown.exists()) {
            for (int i = 0; i <= conteudo.length -1;i++) {
                if (conteudo[i].contains(".")) {
                    conteudo[i] = "A"+ conteudo[i];
                } else {
                    conteudo[i] = "D"+ conteudo[i];
                }
            }
        }
        return conteudo;
    }
    
    public String[] exercicio3_5() 
    {
        File diretorioTest = new File("D:\\Download\\teste");
        diretorioTest.delete();
        String[] conteudo = diretorioTest.list();
        return conteudo;
    }
    
    public void exercicio3_6() 
    {
        JFrame frame = new JFrame("Minha Tela");
        JMenu menu = new JMenu("Menu");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        frame.setJMenuBar(menuBar);
        menuBar.add(menu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setVisible(true);
    }
    
    public void exercicio3_7(String exer) throws Exception
    {
        String[] comando = {"cmd", "/c", "start", exer};
        Runtime.getRuntime().exec(comando);
    }
    
        public void exercicio3_8(String exer) throws Exception
    {
        String[] comando = {"notepad", exer};
        Runtime.getRuntime().exec(comando);
    }
    
    public void exercicio3_9()
    {
        JFrame frame = new JFrame("Minha Tela");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JMenu menu = new JMenu("Menu");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        frame.setJMenuBar(menuBar);
        menuBar.add(menu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setVisible(true);
    }
    
    public String exercicio3_10(String data1, String data2)
    {
        if (data1.compareTo(data2) > 0) {
            return data1;
        }
        return data2;
    }
    
    public String[] exercicio3_11(String[] datas) throws Exception
    {
            Date[] dates = new Date[datas.length];
            for (int k=0; k<datas.length; k++){
                dates[k] = dates[k];
                Date i = dates[k];
                String is = datas[k];
                int j = k-1;
                while (j>=0 && dates[j].compareTo(i)>0){
                    dates[j+1] = dates[j];
                    datas[j+1] = datas[j];
                    j = j-1;
                }
                dates[j+1] = i;
                datas[j+1] = is;
            }
            return datas;
    }
    
    public String exercicio3_12(String data) throws Exception
    {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/mm/yyyy");
        Date dataDia = new Date();
        dataDia = formatador.parse(data);
        data = ""+dataDia;
        data = data.substring(0, 3);
        return data;
    }
}


