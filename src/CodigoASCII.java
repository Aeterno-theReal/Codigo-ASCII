
public class CodigoASCII {
	
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ORANGE = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String boton="HOLA MUNDO";
		for(int i=1; i<=255; i++)
		{
			System.out.print("Codigo ASCII: [" + i + "]; Simbología: " + ((char)i) + "\n");
		}
		
		System.out.println("\033[31m HOLA MUNDO");
		//JTextField.setForeground(Color.red);
		System.out.println(ANSI_RED + "Ejemplo de texto azul y fondo amarillo");
	}

}
