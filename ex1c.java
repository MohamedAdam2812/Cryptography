import java.util.*;
class vigenere{
public static void main(String [] parameters){
String s = "hello";
String key = "hai";
int keylen = key.length();
int add = 0;
String secret = "";
String encrypt = "";
int slen = s.length();

for(int i=0;i<slen;i++){
	if(add == keylen){
		add = 0;
	}
	secret+=key.charAt(add);
	add++;
}
System.out.println(s);
System.out.println(secret);

for(int i=0;i<slen;i++){
  int start = s.charAt(i) - 'a';
  int inc = secret.charAt(i) - 'a';
  for(int j=1; j<=inc; j++){
    if(start == 26){
      start = -1;
    }
    start++;
  }
  int ch = start + 'a';
  encrypt+= (char)ch;
}
System.out.println(encrypt);
}

}
