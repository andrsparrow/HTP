package by.htp.test1.stroki;

public class Main{
	public static void main(String[] args) {
		
//1		В каждом слове текста k-ю букву заменить заданным символом. Если k
//		больше длины слова, корректировку не выполнять.
		Ex1VarA();
//21	 В заданном тексте найти сумму всех встречающихся цифр
//
		Ex21VarA();
//12	В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
//
		Ex12VarA();
		
	}
	
	
	
	public static void Ex1VarA(){
		String ss1=" В каждом слове текста k-ю букву заменить заданным символом. Если k "
				+ "больше длины слова, корректировку не выполнять. ";
		
	System.out.println(ss1);
		
		
		int indexChange=2;
		char changeChar='q';
		int  indexStart=0;
		int  indexEnd=0;
		int spaceCount=0;
		
		StringBuffer buffer = new StringBuffer(ss1);
		
		for(int i=0;i<ss1.length();i++){
			
			if(ss1.charAt(i)==' '&&spaceCount==1){
				indexEnd=i;
				int tempcount=0;
				spaceCount=0;
				//System.out.println(indexStart+" "+indexEnd);
				
				for(int j=indexStart+1;j<indexEnd;j++){
					if(tempcount==indexChange){
						buffer.deleteCharAt(j);
						buffer.insert(j, changeChar);
					}
					tempcount++;
				}
			}
			if(ss1.charAt(i)==' '&&spaceCount==0){
				indexStart=i;
				spaceCount++;
			}
		}
		System.out.println(buffer);
		
	}
	
	public static void Ex21VarA(){
		String text=	"1. В каждом слове текста k-ю букву заменить заданным символом. Если k	"+
						"больше длины слова, корректировку не выполнять."+
						"2. В тексте каждую букву заменить ее порядковым номером в алфавите. При"+
						"выводе в одной строке печатать текст с двумя пробелами между буквами,"+
						"в следующей строке внизу под каждой буквой печатать ее номер."+
						"3. В тексте после буквы Р, если она не последняя в слове, ошибочно "
							+ "напечатана буква А вместо О. Внести исправления в текст."+
						"4. В тексте после k-го символа вставить заданную подстроку."+
						"5. После каждого слова текста, заканчивающегося заданной подстрокой,"+
						"вставить указанное слово."+
						"6. В зависимости от признака (0 или 1) в каждой строке текста удалить указанный символ"
							+ " везде, где он встречается, или вставить его после k-гo символа."+
						"7. Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между"+
						"последовательностями подряд идущих букв оставить хотя бы один пробел."+
						"8. Удалить из текста его часть, заключенную между двумя символами, которые вводятся "
							+ "(например, между скобками «(» и «)» или между звездочками «*» и т. п.)."+
						"9. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.";
		
		int summa=0;
		for(int i=0;i<text.length();i++){
				if(Character.isDigit(text.charAt(i))){
					summa+=Character.getNumericValue(text.charAt(i)); 
				}
			}
		System.out.println(summa);
	}
	
	public static void Ex12VarA(){

		String ss1=" В стихотворении найти аза количество слов, начинающихся и заканчивающихся гласной буквой. ";
		
		System.out.println(ss1);
		
		
		int  indexStart=0;
		int  indexEnd=0;
		int spaceCount=0;
		
		for(int i=0;i<ss1.length();i++){
			
			if(ss1.charAt(i)==' '&&spaceCount==1){
				indexEnd=i;
				spaceCount=0;
				
				if(IsVowel(ss1.charAt(indexStart+1))&  IsVowel(ss1.charAt(indexEnd-1))){
					System.out.println(ss1.substring(indexStart, indexEnd));
				}
			}
			if(ss1.charAt(i)==' '&&spaceCount==0){
				indexStart=i;
				spaceCount++;
			}
		}
	}
	
	private static boolean IsVowel(char symbol){
		if(		symbol=='а'||symbol=='у'||
				symbol=='о'||symbol=='ы'||
				symbol=='и'||symbol=='э'||
				symbol=='я'||symbol=='ю'||
				symbol=='ё'||symbol=='е'||
				
				symbol=='a'||symbol=='e'||
				symbol=='i'||symbol=='o'||
				symbol=='u'||
				
				symbol=='А'||symbol=='У'||
				symbol=='О'||symbol=='Ы'||
				symbol=='И'||symbol=='Э'||
				symbol=='Я'||symbol=='Ю'||
				symbol=='Ё'||symbol=='Е'||
				
				symbol=='A'||symbol=='E'||
				symbol=='I'||symbol=='O'||
				symbol=='U'
				
			){
			return true;
		}
		return false;
	}

}