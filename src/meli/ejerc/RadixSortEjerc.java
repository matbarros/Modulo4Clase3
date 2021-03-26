package meli.ejerc;

import java.util.ArrayList;

import static meli.ejerc.StringUtil.*;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{


		String[] sArr = toStringArray(arr);
		lNormalize(sArr, '0');

		/*for(int i=0;i<listas;i++){
			ArrayList<String> L[i] = new ArrayList<>();
		}*/
		ArrayList<String> L0 = new ArrayList<>();
		ArrayList<String> L1 = new ArrayList<>();
		ArrayList<String> L2 = new ArrayList<>();
		ArrayList<String> L3 = new ArrayList<>();
		ArrayList<String> L4 = new ArrayList<>();
		ArrayList<String> L5 = new ArrayList<>();
		ArrayList<String> L6 = new ArrayList<>();
		ArrayList<String> L7 = new ArrayList<>();
		ArrayList<String> L8 = new ArrayList<>();
		ArrayList<String> L9 = new ArrayList<>();

		int maxlength = maxLength(sArr);

			while(maxlength > 0) {
				int aux = maxlength - 1;
				int aux2;
				for (String s : sArr) {
					//System.out.println("sArr = " + sArr[i].length());
					aux2 = Character.getNumericValue(s.charAt(aux));

					//System.out.println("aux2 = " + aux2);
					switch (aux2) {
						case 0:
							L0.add(s);
							break;
						case 1:
							L1.add(s);
							break;
						case 2:
							L2.add(s);
							break;
						case 3:
							L3.add(s);
							break;
						case 4:
							L4.add(s);
							break;
						case 5:
							L5.add(s);
							break;
						case 6:
							L6.add(s);
							break;
						case 7:
							L7.add(s);
							break;
						case 8:
							L8.add(s);
							break;
						case 9:
							L9.add(s);
							break;
					}
				}



				aux=0;
				for(int i=0;i<arr.length;i++){

					if(!L0.isEmpty()){sArr[i] = L0.get(aux); L0.remove(aux);}
					else if(!L1.isEmpty()){sArr[i] = L1.get(aux);L1.remove(aux);}
					else if(!L2.isEmpty()){sArr[i] = L2.get(aux);L2.remove(aux);}
					else if(!L3.isEmpty()){sArr[i] = L3.get(aux);L3.remove(aux);}
					else if(!L4.isEmpty()){sArr[i] = L4.get(aux);L4.remove(aux);}
					else if(!L5.isEmpty()){sArr[i] = L5.get(aux);L5.remove(aux);}
					else if(!L6.isEmpty()){sArr[i] = L6.get(aux);L6.remove(aux);}
					else if(!L7.isEmpty()){sArr[i] = L7.get(aux);L7.remove(aux);}
					else if(!L8.isEmpty()){sArr[i] = L8.get(aux);L8.remove(aux);}
					else if(!L9.isEmpty()){sArr[i] = L9.get(aux);L9.remove(aux);}


				}
				maxlength--;
			}

			int [] arrOrdenado = toIntArray(sArr);
		System.arraycopy(arrOrdenado, 0, arr, 0, arr.length);



	}

	public static void main(String[] args)
	{

		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);

		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
