

/**
 * Created by Monko on 15.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        String g4="*****";
        String g3="***";
        String left="*";
        String space = "   ";
        String line1="";
        String line2="";
        String line3="";
        String line4="";
        String line5="";
        int i=0;
        String word="";
        for(i=0;i<args.length;i++){
            word+=args[i];
            word+=" ";
        }
        char[] letters=word.toCharArray();



        for(i=0;i<word.length();i++) {
           char letter1= letters[i];
           switch (letter1) {
               case 'a':
                   line1 += g4;
                   line2 += left + space + left;
                   line3 += g4;
                   line4 += left + space + left;
                   line5 += left + space + left;
                   break;
               case 'b':
                   line1 += g4;
                   line2 += left + space + left;
                   line3 += g3+"  ";
                   line4 += left + space + left;
                   line5 += g4;
                   break;
               case 'c':
                   line1 += g4;
                   line2 += left + space + " ";
                   line3 += left + space + " ";
                   line4 += left + space + " ";
                   line5 += g4;
                   break;
               case 'd':
                   line1 += g3+"  ";
                   line2 += left + space + left;
                   line3 += left + space + left;
                   line4 += left + space + left;
                   line5 += g3+"  ";
                   break;
               case 'e':
                   line1 += g4;
                   line2 += left + space + " ";
                   line3 += g4;
                   line4 += left + space + " ";
                   line5 += g4;
                   break;
               case 'f':
                   line1 += g4;
                   line2 += left + space + " ";
                   line3 += g4;
                   line4 += left + space + " ";
                   line5 += left + space + " ";
                   break;
               case 'g':
                   line1 += g4;
                   line2 += left + space + " ";
                   line3 += left + "  **";
                   line4 += left + space + left;
                   line5 += g4;
                   break;
               case 'h':
                   line1 += left + space + left;
                   line2 += left + space + left;
                   line3 += g4;
                   line4 += left + space + left;
                   line5 += left + space + left;
                   break;
               case 'i':
                   line1 += left;
                   line2 += left;
                   line3 += left;
                   line4 += left;
                   line5 += left;
                   break;
               case 'j':
                   line1 += " " + space + left;
                   line2 += " " + space + left;
                   line3 += left + space + left;
                   line4 += left + space + left;
                   line5 += g4;
                   break;
               case 'k':
                   line1 += left + "  " + left+" ";
                   line2 += left + " " + left+"  ";
                   line3 += left + left+"   ";
                   line4 += left + " " + left+"  ";
                   line5 += left + "  " + left+" ";
                   break;
               case 'l':
                   line1 += left + space + " ";
                   line2 += left + space + " ";
                   line3 += left + space + " ";
                   line4 += left + space + " ";
                   line5 += g4;
                   break;
               case 'm':
                   line1 += left + space + left;
                   line2 += left + left + " " + left + left;
                   line3 += left + " " + left + " " + left;
                   line4 += left + space + left;
                   line5 += left + space + left;
                   break;
               case 'n':
                   line1 += left + space + left;
                   line2 += left + left + "  " + left;
                   line3 += left + " " + left + " " + left;
                   line4 += left + "  " + left + left;
                   line5 += left + space + left;
                   break;
               case 'o':
                   line1 += g4;
                   line2 += left + space + left;
                   line3 += left + space + left;
                   line4 += left + space + left;
                   line5 += g4;
                   break;
               case 'p':
                   line1 += g4;
                   line2 += left + space + left;
                   line3 += g4;
                   line4 += left + space + " ";
                   line5 += left + space + " ";
                   break;
               case 'q':
                   line1 += g4;
                   line2 += left + space + left;
                   line3 += g4;
                   line4 += " " + space + left;
                   line5 += " " + space + left;
                   break;
               case 'r':
                   line1 += g4;
                   line2 += left + space + left;
                   line3 += g4;
                   line4 += left + " " + left + "  ";
                   line5 += left + "  " + left + " ";
                   break;
               case 's':
                   line1 += g4;
                   line2 += left + space+" ";
                   line3 += g4;
                   line4 += space +" " +left;
                   line5 += g4;
                   break;
               case 't':
                   line1 += g4;
                   line2 += "  " + left + "  ";
                   line3 += "  " + left + "  ";
                   line4 += "  " + left + "  ";
                   line5 += "  " + left + "  ";
                   break;
               case 'u':
                   line1 += left + space + left;
                   line2 += left + space + left;
                   line3 += left + space + left;
                   line4 += left + space + left;
                   line5 += g4;
                   break;
               case 'v':
                   line1 += left + space + left;
                   line2 += " " + left + " " + left + " ";
                   line3 += " " + left + " " + left + " ";
                   line4 += "  " + left + "  ";
                   line5 += "  " + left + "  ";
                   break;
               case 'w':
                   line1 += left + space + left;
                   line2 += left + space + left;
                   line3 += left + " " + left + " " + left;
                   line4 += left + left + " " + left + left;
                   line5 += left + space + left;
                   break;
               case 'x':
                   line1 += left + space + left;
                   line2 += " " + left + " " + left + " ";
                   line3 += "  " + left + "  ";
                   line4 += " " + left + " " + left + " ";
                   line5 += left + space + left;
                   break;
               case 'y':
                   line1 += left + space + left;
                   line2 += " " + left + " " + left + " ";
                   line3 += "  " + left + "  ";
                   line4 += " " + left + "   ";
                   line5 += left + space + " ";
                   break;
               case 'z':
                   line1 += g4;
                   line2 += "   " + left + " ";
                   line3 += "  " + left + "  ";
                   line4 += " " + left + "   ";
                   line5 += g4;
                   break;
               case ' ':
                   line1 += "  ";
                   line2 += "  ";
                   line3 += "  ";
                   line4 += "  ";
                   line5 += "  ";
                   break;
           }
            line1+=" ";
            line2+=" ";
            line3+=" ";
            line4+=" ";
            line5+=" ";
       }
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        }
    }

