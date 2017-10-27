public class Convertir{
	public static void main(String args[]){
	int numero = Integer.parseInt(args[0]);
	int copia = numero;
	int contador =0, a =0;
	String x = "";
	System.out.println("El binario de: "+numero+" es " +Integer.toBinaryString(numero));
	while (numero >0){
		a =  numero %2;
		x = x + ""+a;
		numero = numero /2;
	}
	String binario = new StringBuffer(x).reverse().toString();
	System.out.println("El binario de: "+copia+" es " +binario);
	System.out.println("**********************************");
	
}
}
