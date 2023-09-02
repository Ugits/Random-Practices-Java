package Decryption;
import java.util.HashMap;
import java.util.Map;

public class LevelFive {
    
    // Field
    
    static String answer = "programmeringärskoj";
    static String wierdText =  "SVZPCZ DZ VOV QN HDLO ÖOVÅ ON? GÄ, KÄL KGDMAEF XVXXVÅF VEE XJÅÅV OFL VLVMJEÖQHV RVQHÖLFL. OFE KÄL ÄUHQN ÅGÄZOF SVZ VEE PVHEÖQHE AZÄÅZVRRFZV RVQHÖLFL EÖMM VEE ÅCZV MCQV AZÄXMFR. KÄL SVZ VMMEQN OFL PCZQEV AZÄÅZVRRFZVZFL DSFL ÄR RVQHÖLFL ÖLEF FBÖQEFZVOF ZFLE PJQÖQHE. "+
                            "KÄL EÖMMQHZÖSQ ÄUHQN OFL PCZQEV XTÅÅ-ZDEELÖLÅFL ON KÄL HÄZZÖÅFZVOF PFM QÄR XVXXVÅF KVOF ÅGÄZE. KÄL ÖLQNÅ ÄUHQN VEE AÄEFLEÖVMFL KÄQ FL VLVMJEÖQH RVQHÖL MNÅ MNLÅE XÄZEÄR ZFLE QÖPPFZETÅÅVLOF. "+
                            "VLEV, PCZ FEE CÅÄLXMÖUH, VEE OF PTLOVRFLEVMV ZFMVEÖÄLFZLV RFMMVL QAFUÖPÖHV MGTO Ö OFL SFEFLQHVAMÖÅV KVZRÄLÖL ÄUK RTQÖHQHVAVLOFE SVZ RÄEEVÅMÖÅV PCZ FEE QNOVLE TEEZJUH ÄUK QNOVLV PCZDLOZÖLÅVZ. Ö QN PVMM QHTMMF RVQHÖLFL HTLLV HÄRAÄLFZV ÖLSFUHMVOF ÄUK SFEFLQHVAMÖÅV RTQÖHQEJUHFL VS SÖMHFL HÄRAMFBÖEFE FMMFZ MDLÅO QÄR KFMQE. -VOV MÄSFMVUF, 1842 ";
    static String newWierdText;
       
    static HashMap<Character, Character> crypticHashMap(){
        /** Key == Normal letter & Value == Cryptic letter fmdjmplltmIåjomvhdy
         */
        HashMap<Character, Character> cryptoMap = new HashMap<>();
        cryptoMap.put('a', 'V');    
        cryptoMap.put('b', 'X');   
        cryptoMap.put('c', 'U');   
        cryptoMap.put('d', 'O');    
        cryptoMap.put('e', 'F');    
        cryptoMap.put('f', 'P');   
        cryptoMap.put('g', 'Å');    
        cryptoMap.put('h', 'K');   
        cryptoMap.put('i', 'Ö');    
        cryptoMap.put('j', 'G');    
        cryptoMap.put('k', 'H');    
        cryptoMap.put('l', 'M');   
        cryptoMap.put('m', 'R');    
        cryptoMap.put('n', 'L');    
        cryptoMap.put('o', 'Ä');    
        cryptoMap.put('p', 'A');    
        cryptoMap.put('q', '*');      
        cryptoMap.put('r', 'Z');    
        cryptoMap.put('s', 'Q');    
        cryptoMap.put('t', 'E');   
        cryptoMap.put('u', 'T');   
        cryptoMap.put('v', 'S');   
        cryptoMap.put('w', '*');      
        cryptoMap.put('x', 'B');   
        cryptoMap.put('y', 'J');   
        cryptoMap.put('z', '*');      
        cryptoMap.put('å', 'N');   
        cryptoMap.put('ä', 'D');    
        cryptoMap.put('ö', 'C');    
        cryptoMap.put(' ', ' ');    
        
        return cryptoMap;
    }
    
    public static void main(String[] args) {
        
        
        // Make HashMap
        HashMap<Character, Character> cryptoMap = new HashMap<>();
        cryptoMap = crypticHashMap();
        // newWierdText = your string!
        newWierdText = answer;
        for (Map.Entry<Character, Character> crypto : cryptoMap.entrySet()) {
            Character normal = crypto.getKey();
            Character cryptic = crypto.getValue();
            // what way do you want the translation to be?
            // .replace(oldChar, newChar)
            newWierdText = newWierdText.replace(normal, cryptic);
        }
        System.out.println(newWierdText); //Print - Generated text
        //String capitalizedText = newWierdText.toUpperCase();
        
        // Right answer : AZÄÅZVRRFZÖLÅDZQHÄG
                    
    }
}
        
        


        
        

         
        
        
        


        



