package enumeration;

public enum SituacaoJuiz {

	DISPONIVEL("Disponivel"), 
	SUSPENSO("Suspenso - devido a puni��o pelo STJD");
	
	private String descricao;

	private SituacaoJuiz(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	
}
