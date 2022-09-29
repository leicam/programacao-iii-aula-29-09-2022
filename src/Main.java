import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> tabela =
                new Hashtable<String, ArrayList<String>>();

        ArrayList<String> vizinhosJuliano
                = new ArrayList<String>();
        vizinhosJuliano.add("Rhuan");
        vizinhosJuliano.add("Gabriel");
        vizinhosJuliano.add("Felipe");
        vizinhosJuliano.add("Caua");

        ArrayList<String> vizinhosRhuan
                = new ArrayList<String>();
        vizinhosRhuan.add("Adrian");
        vizinhosRhuan.add("Dias");
        vizinhosRhuan.add("Vinicius");

        ArrayList<String> vizinhosCaua
                = new ArrayList<String>();

        vizinhosCaua.add("Harrison");
        vizinhosCaua.add("Juliano");

        tabela.put("Juliano", vizinhosJuliano);
        tabela.put("Rhuan", vizinhosRhuan);
        tabela.put("Cauan", vizinhosCaua);

        for (Map.Entry<String, ArrayList<String>> entry : tabela.entrySet()){
            String chave = entry.getKey();
            ArrayList<String> dados = entry.getValue();

            System.out.println("Chave: " + chave + " Dados: " + dados);
        }
    }
}