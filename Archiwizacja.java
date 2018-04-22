/**
Twój program powinien umożliwiać wprowadzenie następujących danych:
- ilość stron dokumentacji w firmie
- ilość segregatorów
- stawkę brutto per pudło
Twój program powinien na wyjściu podawać dane dotyczące:
- miesięcznego kosztu przechowywania dokumentacji w wartości netto (przyjmij 30
dni jako długość miesiąca)
- rocznego kosztu przechowywania dokumentacji w wartości netto
- kosztu przechowywania pojedynczego segregatora
  
W drugim kroku rozwiń powyższy program o dodatkową daną, która będzie mówić o
koszcie netto obsługi pojedynczego segregatora z dokumentacją. Twój program powinien
przekazać informacje, czy przy zadanych danych wejściowych usługa archiwizacji jest
opłacalna, tzn. miesięczny koszt netto usługi archiwizacyjnej będzie nie większy niż 1,21
kosztu netto obsługi dokumentacji w segregatorach.  
  */
package sda.java9.wpj.basics.Archiw;

import java.util.Scanner;

class Archiwizacja
{
	public static void main (String [] args)
	{
		System.out.println("Witaj, podaj ile stron dokumentacji posiadasz w swojej firmie:");
		Scanner input = new Scanner(System.in);
		double page = input.nextDouble();
		double box = page / 2000;
		
		System.out.println("Podaj ilośc segregatorów jakie posiadacie w swojej firmie:");
		Scanner input2 = new Scanner(System.in);
		double binder = input.nextDouble();
		double dataPageInBinder = page / binder;
		
		System.out.println("Obecna stawka brutto za archiwizację jednego pudła wynosi:");
		Scanner input3 = new Scanner(System.in);
		double brutto = input.nextDouble();
		double netto = brutto - (brutto * 0.26);
		
		double nettoMonth = (box * netto) * 30;
		System.out.println("Miesieczny koszt przechowywania dokumentacji netto wynosi: " + nettoMonth);
		
		double nettoYear = 12*(box * netto) * 30;
		System.out.println("Roczny koszt przechowywania dokumentacji netto wynosi: " + nettoYear);
		
		double binderBrutto = (brutto * box) / binder;
		System.out.println("Koszt przechowywania pojedyńczego segregatora brutto wynosi: " + binderBrutto);
		
		double binderNetto = (netto * box) / binder; 
		System.out.println("Koszt przechowywania pojedyńczego segregatora netto wynosi: " + binderNetto);
		
		if ((binderNetto *30) > 1.21)
			{
			System.out.println("Niestety, przy takich parametrach usluga archiwizacyjna jest nie oplacalna");
			} 
		else
			{
			System.out.println("Przy podanych parametrach usluga archiwizacyjna jest oplacalna");
			}
	}	
}