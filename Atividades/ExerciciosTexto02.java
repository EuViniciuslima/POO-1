import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.nio.file.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.lang.*;


public class ExerciciosTexto02
{   
    public int[] exercicio2_2(int umNumero, int outroNumero) {
        int[] resultado = new int[2];
        if (umNumero > outroNumero){
            resultado[0] = outroNumero;
            resultado[1] = umNumero;
        } else {
            resultado[1] = outroNumero;
            resultado[0] = umNumero;
        }
        return resultado;
    }
    
    public int[] exercicio2_3(int a, int b, int c)
    {
        if(a>b & a>c){
            if(b>c) return new int[]{a, b, c};
            return new int[]{a, b, c};
        }else if(b>a & b>c){
            if(a>c) return new int[]{b, a, c};
            return new int[]{b, c, a};
        }else if(c>a & c>b){
            if(a>b) return new int[]{c, a, b};
            return new int[]{c, b, a};
        }
        
        return new int[]{a, b, c};
    }
    
    public double exercicio2_4(double x) {
        return Math.sqrt(x);       
    }
    
    public boolean exercitio2_5(String nome1, String nome2) {
        if (nome1.indexOf(nome2) == -1) return false; 
    
        return true;
    }
    
    public String[] exercicio2_6(String a, String b){
        if (a.compareTo(b)<0) return new String[]{a, b};
        return new String[]{b, a};
    }
    
    public String[] exercicio2_7(String a, String b, String c)
    {   
        if(a.compareTo(b)<0 & a.compareTo(c)<0){
            if(b.compareTo(c)<0) return new String[]{a, b, c};
            return new String[]{a, c, b};
        }else if(b.compareTo(a)<0 & b.compareTo(c)<0){
            if(a.compareTo(c)<0) return new String[]{b, a, c};
            return new String[]{b, c, a};
        }else if(c.compareTo(a)<0 & c.compareTo(b)<0){
            if(a.compareTo(b)<0) return new String[]{c, a, b};
            return new String[]{c, b, a};
        }
        
        return new String[]{a, b, c};
    }
    
    public String exercicio2_8(String[] args) {
    String str = "JoaoMarcos";
    StringBuilder strb = new StringBuilder(str);
    str = strb.reverse().toString();
    return str;
    }
    
    public String[] exercicio2_9(String[] nome)
    {   
        
        for(int i=0; i<nome.length; i++){
            nome[i] = nome[i].toUpperCase();
        }
        
        return nome;
    }
    
    public String[] exercicio2_10(String[] names)
    {   
        String[] maius = new String[names.length];
        
        for(int i=0; i<names.length; i++){
            maius[i] = names[i].toUpperCase();
        }
        
        return maius;
    }
    
    public int[] exercicio2_11(int[] num)
    {   
        int troca;
        
        for(int i=0; i<num.length-1; i++){
            if(num[i]<num[i+1]){
                troca = num[i+1];
                num[i+1] = num[i];
                num[i] = troca;
            }
        }
        
        return num;
    }
    
    public int exercicio2_12(int[] num)
    {   
        int troca;
        int qtd = 0;
        
        for(int i=0; i<num.length-1; i++){
            if(num[i]<num[i+1]){
                troca = num[i+1];
                num[i+1] = num[i];
                num[i] = troca;
                qtd++;
            }
        }
        
        return qtd;
    }
    public int exercicio2_13(String[] strings)
    {   
        String troca;
        int qtd = 0;
        
        for(int i=0; i<strings.length-1; i++){
            if(strings[i].compareTo(strings[i+1])>0){
                troca = strings[i+1];
                strings[i+1] = strings[i];
                strings[i] = troca;
                qtd++;
            }
        }
        
        return qtd;
    }
    
    public String[] exercicio2_13b(String[] palavras)
    {   
        String troca;
        int qtd = 0;
        
        for(int i=0; i<palavras.length-1; i++){
            if(palavras[i].compareTo(palavras[i+1])>0){
                troca = palavras[i+1];
                palavras[i+1] = palavras[i];
                palavras[i] = troca;
                qtd++;
            }
        }
        
        return palavras;
    }
    
    public int[] exercicio2_14(int[] num)
    {   
        while(exercicio2_12(num)>0){
            num = exercicio2_11(num);
        }
        
        return num;
    }
    
    public String[] exercicio2_15(String[] strings)
    {   
        while(exercicio2_13(strings)>0){
            strings = exercicio2_13b(strings);
        }
        
        return strings;
    }
    
     public String[] ordenarPalavras(String[] palavras){
        for(int i=1; i<palavras.length; i++){
            String k = palavras[i];
            int j = i-1;
            while(j>=0 && palavras[j].compareTo(k)>0){
                palavras[j+1] = palavras[j];
                j = j-1;
            }
            palavras[j+1] = k;
        }
        
        return palavras;
    }
}

