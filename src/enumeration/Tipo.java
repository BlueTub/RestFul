package enumeration;

public enum Tipo {
	
    ARBITRO("�rbitro"), CBF("CBF"), STJD("STJD"), CLUBE("Clube");

    private String tipo;

    private Tipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
