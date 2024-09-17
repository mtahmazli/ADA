import java.util.Scanner;
//Affine cipher with encryption function: 𝑒(𝑥) = 3𝑥 + 1 𝑚𝑜𝑑 26
public class Affine {
    public static void main(String[] args) {
      encoder("MURAD TAHMAZLI");


        }
        
public static void encoder(String s){
    
for(int i=0;i<s.length();i++){
char ch= s.charAt(i);
String st=ch+"";
int a=0;
switch (st) {
    case "A":
        a=0;
        break;
        case "B":
        a=1;
        break;
        case "C":
        a=2;
        break;
        case "D":
        a=3;
        break;
        case "E":
        a=4;
        break;
        case "F":
        a=5;
        break;
        case "G":
        a=6;
        break;
        case "H":
        a=7;
        break;
        case "I":
        a=8;
        break;
        case "J":
        a=9;
        break;
        case "K":
        a=10;
        break;
        case "L":
        a=11;
        break;
        case "M":
        a=12;
        break;
        case "N":
        a=13;
        break;
        case "O":
        a=14;
        break;
        case "P":
        a=15;
        break;
        case "Q":
        a=16;
        break;
        case "R":
        a=17;
        break;
        case "S":
        a=18;
        break;
        case "T":
        a=19;
        break;
        case "U":
        a=20;
        break;
        case "V":
        a=21;
        break;
        case "W":
        a=22;
        break;
        case "X":
        a=23;
        break;
        case "Y":
        a=24;
        break;
        case "Z":
        a=25;
        break;
        case " ":
        a=99;
        break;
    default:
        break;
}
if(a==99){
System.out.print(" ");
}
else{
    int result=(3*a+1)-((3*a+1)/26)*26;

System.out.print(result+" ");
}
}

}

    }