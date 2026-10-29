/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morarucristianverificaa;

import java.util.Objects;

/**
 *
 * @author moraru.cristianadria
 */

public class Prodotto 
{
   private String nome;
   private double peso,prezzo;
   private int nPezzi;
   
   /**
    * 
    * @param nome
    * @param peso
    * @param prezzo
    * @param nPezzi 
    */
   
   public Prodotto(String nome, double peso, double prezzo, int nPezzi)
    {
    this.nome=nome;
    this.peso=peso;
    this.prezzo=prezzo;
    this.nPezzi=nPezzi;   
    }
   
   /**
    * 
    * @return 
    */
   
   public String getNome()
    {
       return nome;
    }
   
   /**
    * 
    * @return 
    */
   
   public double getPeso()
    {
       return peso;
    }
   
   /**
    * 
    * @return 
    */
   
   public double getPrezzo()
    {
       return prezzo;
    }
   
   /**
    * 
    * @return 
    */
   
   public int getNPezzi()
    {
       return nPezzi;
    }
   
   /**
    * 
    * @param n 
    */
   
   public void vendiProdotto(int n)
   {
       if(nPezzi>=n)
       {
        this.nPezzi=nPezzi-n; 
       }
       else 
       {
           System.out.println("------------------------------------" + 
                   "\nimpossibile vendere prodotti non disponibili");   
       }
   }
   
   /**
    * 
    * @param n 
    */
   
   public void rifornisciProdotto(int n)
   {     
        this.nPezzi=nPezzi+n; 
       
   }
   
   /**
    * 
    * @return 
    */
   
   public String ToString()
    {
        return "il nome del prodotto e': " + nome + "\nil prodotto pesa: " + peso + "kg" + "\nil prodotto costa: " 
                + prezzo + " euro" + "\nci sono attualmente: " + nPezzi + 
                " pezzi del prodotto ";           
    }
   
    /**
    * 
    * @return 
    */
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.prezzo) ^ (Double.doubleToLongBits(this.prezzo) >>> 32));
        hash = 41 * hash + this.nPezzi;
        return hash;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prodotto other = (Prodotto) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.prezzo) != Double.doubleToLongBits(other.prezzo)) {
            return false;
        }
        if (this.nPezzi != other.nPezzi) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
   
   
   
}


