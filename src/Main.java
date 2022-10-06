import javax.management.Query;
import java.util.*;

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
        tabela.put("Caua", vizinhosCaua);

        showData(tabela);

        System.out.println(pesquisaEmLargura(tabela, "Rhuan"));
    }

    private static String pesquisaEmLargura(Hashtable<String, ArrayList<String>> tabela, String verticeInicial){
        Queue<String> fila = new LinkedList<String>();
        ArrayList<String> verificados = new ArrayList<String>();

        fila = enfileirar(fila, (ArrayList<String>)tabela.get(verticeInicial));

        while(fila.size() > 0){
            String pessoa = fila.poll();

            if ("Felipe".equals(pessoa))
                return "Felipe foi encontrado!";

            if (verificados.contains(pessoa))
                continue;

            fila = enfileirar(fila, (ArrayList<String>)tabela.get(pessoa));
            verificados.add(pessoa);
        }

        return "Felipe não foi encontrado!";
    }

    private static Queue<String> enfileirar(Queue<String> fila, ArrayList<String> lista){
        if (lista == null)
            return fila;

        for (String item : lista){
            fila.offer(item);
        }

        return fila;
    }

    private static void showData(Hashtable<String, ArrayList<String>> tabela){
        for (Map.Entry<String, ArrayList<String>> entry : tabela.entrySet()){
            String chave = entry.getKey();
            ArrayList<String> dados = entry.getValue();

            System.out.println("Chave: " + chave + " Dados: " + dados);
        }
    }
}