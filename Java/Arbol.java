public class Arbol(){
	private float altura;
	private float edad;
	private int anillos;
	public static String[] climas;

	static{
	climas = new String[3];
	climas[0] = "Bosque de coniferas";
	climas[1] = "Selva";
	climas[2] = "Tundra";
	}

	public Arbol(){}
	public Arbol(float h){
		this.altura = h;
	}

	public calcEdad(){
		float edad = 10;
		this.edad = anillos;
	}

	public String toString(){
		return "El árbol tiene: " + edad + "años";
	}

	public class Jardin(){
		public static void main(String[] args){
			new Arbol pino = new Arbol(100);
			pino.calcEdad(15);
		}
	}
}