import java.util.*; 

class Hill { static int[][] k = {{3,3},{2,5}}; 

static int inv(int n) { 
    for(int i=0;i<26;i++) 
        if(n*i%26==1) return i; 
    return 0; 
} 
 
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
 
    System.out.print("Enter message: "); 
    String s = sc.nextLine().toUpperCase().replace(" ",""); 
 
    if(s.length()%2!=0) s+="X"; 
 
    String enc="", dec=""; 
 
    for(int i=0;i<s.length();i+=2) { 
        int a=s.charAt(i)-'A', b=s.charAt(i+1)-'A'; 
 
        enc+=(char)((3*a+3*b)%26+'A'); 
        enc+=(char)((2*a+5*b)%26+'A'); 
    } 
 
    int d=(k[0][0]*k[1][1]-k[0][1]*k[1][0]+26)%26; 
    int x=inv(d); 
 
    int a=k[1][1]*x%26, b=-k[0][1]*x%26; 
    int c=-k[1][0]*x%26, e=k[0][0]*x%26; 
 
    for(int i=0;i<enc.length();i+=2) { 
        int p=enc.charAt(i)-'A', q=enc.charAt(i+1)-'A'; 
 
        dec+=(char)((a*p+b*q+26)%26+'A'); 
        dec+=(char)((c*p+e*q+26)%26+'A'); 
    } 
 
    System.out.println("Encrypted: "+enc); 
    System.out.println("Decrypted: "+dec); 
} 
  

} 
