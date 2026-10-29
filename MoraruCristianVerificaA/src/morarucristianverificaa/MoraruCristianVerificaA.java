/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morarucristianverificaa;

/**
 *
 * @author moraru.cristianadria
 */

//VERIFICA MORARU CRISTIAN FILA A

public class MoraruCristianVerificaA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
       Prodotto p1 = new Prodotto("pane",2.2,4.50,5);
       
       System.out.println(p1.ToString());
       
       Prodotto p2 = new Prodotto("acqua",0.500,1.50,7);
       
       System.out.println(p2.ToString());
       
       p1.vendiProdotto(2);
        
       System.out.println("------------------------------------"
                          + "\nil numero di pezzi attuale del prodotto dopo la vendita' e' di: "
                          + p1.getNPezzi() + " : p1");
       
       p2.vendiProdotto(4);
        
       System.out.println("il numero di pezzi attuale del prodotto dopo la vendita' e' di: "
                          + p2.getNPezzi() + " : p2");
       
       p1.rifornisciProdotto(5);
        
       System.out.println("------------------------------------"
                          + "\nil numero di pezzi attuale del prodotto dopo il rifornimento e' di: "
                          + p1.getNPezzi() + " : p1");
       
       p2.rifornisciProdotto(3);
        
       System.out.println("il numero di pezzi attuale del prodotto dopo il rifornimento e' di: "
                          + p2.getNPezzi() + " : p2");
       
       System.out.println("------------------------------------"
                          + "\nil prodotto p1 e' uguale al prodotto p2?: " + p1.equals(p2));
    }
    
}
