package escola;

/*
 * A classe Aluno, como eu tinha dito antes, tem o atributo CPF para diferenciar dois alunos. 
 * Porque o fato de dois alunos terem o mesmo nome não significa que é a mesma pessoa, então precisamos ter outro atributo, 
 * que é um identificador único, que no caso é o próprio CPF da pessoa.
 * E nós vimos que esse tipo de classe é chamada de entidade, que é uma classe em que temos como diferenciar duas instâncias 
 * baseado em algum atributo.
 */
public class Aluno {

	private String cpf;
	private String nome;
	private Email email;

}
