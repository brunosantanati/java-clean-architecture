package escola;

/*
 * Na classe Email, se eu tiver dois e-mails com o mesmo endereço, é do mesmo e-mail que eu estou falando. 
 * Então não existe essa diferenciação, nós não temos um Id e nenhum atributo que diferencie.
 * Então a classe Email não é uma entidade. Esse tipo de classe em que o que interessa é só um valor que ele tem, 
 * se esse valor for igual consideramos que os objetos, as instâncias são iguais segue outro padrão, que é chamado de Value Object.
 */
public class Email {

	private String endereco;

	public Email(String endereco) {
		if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail invalido!");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
