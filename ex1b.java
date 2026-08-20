/*import java.util.*;
class playfair{
public static void main(String [] parameters){
String s = "hemanth";
String toencrypt = "Adam";
int len = 0;
int index1 = 0;
int index2 = 1;
int kr1 = 0;
int kc1 = 0;
int kr2 = 0;
int kc2 = 0;
String encrypt = "";
s = s.toLowerCase();
String rs = "";
for (int a = 0; a < s.length(); a++) {
    char u = s.charAt(a);         
    if(rs.indexOf(u) == -1){       
       rs+=u;
    }   
}

int row = 5; int col = 5;
char [] arr = new char[25];
int size = 0;
int c = 0;
int alpha = 97;
for(int i=0;i<arr.length;i++){
	if(len != rs.length()){
 		arr[i] = rs.charAt(len++);
 	}
 	else{
 		while(c < rs.length()){
 			if((char)alpha == arr[c]){
 				alpha++;
 			}
 			c++;
 		}
 		c = 0;
 		if((char)alpha == 'j')
 		  alpha++;
 		arr[i] = (char)alpha;
 		alpha++;
 	}
}
int y=0;

char[][] matrix = new char[row][col];
for(int i=0; i<row; i++){
 	for(int j=0; j<col; j++){
 			matrix[i][j] = arr[y++];
 		
 	}
}

while(index2 < toencrypt.length()){
    for(int i=0; i<row; i++){
     	for(int j=0; j<col; j++){
     			if(matrix[i][j] == toencrypt.charAt(index1)){
     			    kr1 = i;
     			    kc1 = j;
     			    index1+=2;
     			}
    }
    }
    for(int i=0; i<row; i++){
     	for(int j=0; j<col; j++){
     			if(matrix[i][j] == toencrypt.charAt(index2)){
     			    kr2 = i;
     			    kc2 = j;
     			    index2+=2;
     			}
    }
    }
    for(int i=1;i<=2;i++){
        if(kc1 == 5){
          kc1 = 1;
        }
        kc1++;
    }
    encrypt+=matrix[kr1][kc1];
    for(int i=1;i<=2;i++){
        if(kc2 == -1){
          kc2 = 5;
        }
        kc2--;
    }
    encrypt+=matrix[kr2][kc2];
    
} 	
 for(int i=0; i<row; i++){
     	for(int j=0; j<col; j++){
     			System.out.printf("%c ",matrix[i][j]);
    }
    System.out.println();
    }
System.out.print(encrypt);
}

} */

import java.util.*;

class playfair {
public static void main(String [] parameters) {
String s = "playfair";
String toencrypt = "oc";
int len = 0;
int index1 = 0;
int index2 = 1;
int kr1 = 0;
int kc1 = 0;
int kr2 = 0;
int kc2 = 0;
String encrypt = "";
s = s.toLowerCase();
String rs = "";

for (int a = 0; a < s.length(); a++) {
    char u = s.charAt(a);         
    if(rs.indexOf(u) == -1) {       
       rs += u;
    }   
}

int row = 5; 
int col = 5;
char [] arr = new char[25];
int size = 0;
int c = 0;
int alpha = 97;

for(int i = 0; i < arr.length; i++) {
    if(len != rs.length()) {
        arr[i] = rs.charAt(len++);
    }
    else {
        while(c < rs.length()) {
            if((char)alpha == arr[c]) {
                alpha++;
            }
            c++;
        }

        c = 0;

        if((char)alpha == 'j')
            alpha++;

        arr[i] = (char)alpha;
        alpha++;
    }
}

int y = 0;

char[][] matrix = new char[row][col];

for(int i = 0; i < row; i++) {
    for(int j = 0; j < col; j++) {
        matrix[i][j] = arr[y++];
    }
}

while(index2 < toencrypt.length()) {

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            if(matrix[i][j] == toencrypt.charAt(index1)) {
                kr1 = i;
                kc1 = j;
            }
        }
    }

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            if(matrix[i][j] == toencrypt.charAt(index2)) {
                kr2 = i;
                kc2 = j;
            }
        }
    }

    for(int i = 1; i <= 2; i++) {
        if(kc1 == 4) {
            kc1 = -1;
        }
        kc1++;
    }

    encrypt += matrix[kr1][kc1];

    for(int i = 1; i <= 2; i++) {
        if(kc2 == 0) {
            kc2 = 5;
        }
        kc2--;
    }

    encrypt += matrix[kr2][kc2];

    index1 += 2;
    index2 += 2;
}     

for(int i = 0; i < row; i++) {
    for(int j = 0; j < col; j++) {
        System.out.printf("%c ", matrix[i][j]);
    }
    System.out.println();
}

System.out.print(encrypt);
}
}

