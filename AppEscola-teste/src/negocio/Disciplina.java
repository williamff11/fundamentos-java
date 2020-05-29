package negocio;

public class Disciplina {

    private String descricao;
    private float cargaHoraria;
    private Professor professor;
    private Curso curso;

    public Disciplina(String descricao) {
        this.cargaHoraria = 50;
        this.descricao = descricao;
    }


    public void imprimir() {
        this.imprimir(true);
    }

    public void imprimir(boolean detalhado) {
        System.out.println("Descricao: " + descricao);
        System.out.println("Carga Horaria: " + cargaHoraria);
        if (detalhado) {
            System.out.println("Professor: " + professor);
            System.out.println("Curso: " + curso);
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
