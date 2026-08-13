import java.util.*;
class cipher{
  public static void main(String [] parameters){
	String sample = "zebra";
	int shift = 3;
	System.out.println("Original value: "+sample);
	System.out.println("shift value: "+3);
	sample = sample.toLowerCase();
	String res = "";
	int i;
	int s = 1;
	int hash = 0;
	for(i=0; i<sample.length(); i++){
		hash = sample.charAt(i);
		while(s <= shift){
			hash++;
			if(hash == 123){
				hash = 97;
			}
			s++;
		}
		s = 1;
		res+=(char)hash;
	}
	System.out.println("cipher text: "+res);
	}
}
