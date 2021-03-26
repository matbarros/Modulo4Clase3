package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{

		String cons = String.valueOf(c);
		for(int i=0;i<n-1;i++){
			cons = cons+ c;
		}
		return cons;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{

		int dif = n - s.length();

		if(dif>0) {
			String aux = replicate(c, dif) + s;
			return aux;
		}
		else {
			return s;
		}
	}
	//idem lpad, pero agregando caracteres a
	//la derecha.

	public static String rpad (String s,char c,int n){
		int dif = n - s.length();

		System.out.println(s);
		if(dif>0) {
			String aux = s + replicate(c, dif);
			return aux;
		}
		else {
			return s;
		}
	}

	//Retorna una cadena idéntica a s pero sin espacios a la izquierda.

	public static String ltrim (String s){

		String aux="";
		for(int i = 0;i < s.length(); i++) {

			if (s.charAt(i)!='0') {
				aux += s.charAt(i);

			}
		}
	return aux;
	}

//idem ltrim, pero sin espacios a la derecha.

	public static String rtrim (String s){

		String aux="";

		for(int i = s.length()-1;i >= 0; i--) {

			if (s.charAt(i)!='0') {
				aux += s.charAt(i);

			}
		}
		return aux;
	}

	//idem lpad, pero sin espacios a derecha ni izquierda.

	public static String trim(String s){
		ltrim(s);
		rtrim(s);
		return s;
	}

	/*Retorna la posición de la n-ésima
	ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s =
		“John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
	segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9. */

	public static int indexOfN(String s,char c,int n){

		int aux=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == c){
				aux++;
				if(aux==n){return i;}
			}
		}
		return aux;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{

		String[] arrString = new String[arr.length];
		for(int i=0;i<arr.length;i++){
			arrString[i] = String.valueOf(arr[i]);
		}
		return arrString;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] iArr = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			iArr[i] = Integer.parseInt(arr[i]);

		}
		return iArr;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{

		int max=0;
		for (int i=0;i<arr.length;i++){

			if(i==0){
				max = arr[i].length();
			}
			if(arr[i].length() > max){
				max = arr[i].length();
			}

		}
		return max;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
	String [] aux = arr;
	String[] aux2 = arr;
		int large = maxLength(arr);

		for(int i=0;i<arr.length;i++){
			arr[i] = lpad(arr[i],large,c);
		}

		/*
		System.out.println("arr = " + arr[1]);


		for(int i=0;i<arr.length;i++){
			arr[i] = ltrim(arr[i]);
		}

		for(int i=0;i<arr.length;i++){
			arr[i] = rpad(arr[i],c,large);
		}

		for(int i=0;i<arr.length;i++){
			arr[i] = rtrim(arr[i]);
			System.out.println("arr = " + arr[i]);
		}


*/


	}
}
