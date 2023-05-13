/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oscar2;

/**
 *
 * @author ottob
 */
public class Oscar2 {

    
    public static void main(String[] args) {
        
            String switcher=null;
        final String path=args[0]; //Első paraméter az elérési út
        final String fileName=args[1]; //Második paraméter a fájlnév
        if(args[2]!=null){switcher=args[2];} //kapcsoló
        try{switcher=args[2];}
        catch(Exception ex){}
        final String dbName="oscar";
        Statements states = new Statements(dbName,path,fileName,switcher);
        states.getOscar();
       
    }
    
    
    
}
