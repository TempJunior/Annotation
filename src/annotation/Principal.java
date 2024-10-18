package annotation;

import java.lang.annotation.Annotation;

public class Principal {
    public static void main(String[] args) {
        Class<TabelaNome> nome = TabelaNome.class;

        if(nome.isAnnotationPresent(Tabela.class)){
            Annotation annotation = nome.getAnnotation(Tabela.class);
            Tabela tabela = (Tabela) annotation;

            System.out.println("Nome na tabela: " + tabela.nome());
        }
    }

}
