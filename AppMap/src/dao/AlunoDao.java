package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoDao {

    private static Map<Integer, String> mapaAluno;
    private static Integer id = 0;

    public static void incluir(String aluno) {
        if (mapaAluno == null) {
            mapaAluno = new HashMap<Integer, String>();
        }
        mapaAluno.put(++id, aluno);

    }

    public static List<String> obterLista() {

        if (mapaAluno != null) {
            return new ArrayList<String>(mapaAluno.values());
        }
        return null;
    }

    public static void excluir(Integer id) {
        if (mapaAluno != null) {
            mapaAluno.remove(id);
        }
    }
}
