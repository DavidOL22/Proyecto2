package proyectocolas;

import java.util.Scanner;
import java.util.LinkedList;

public class ProyectoColas {

    static LinkedList<cola>cola1=new LinkedList();
    static LinkedList<cola>cola2=new LinkedList();
    static LinkedList<cola>cola3=new LinkedList();
    
    public static void main(String[] args) {
       
        if(cola1.size()==0&&cola2.size()==0&&cola3.size()==0){
            System.out.println("Todas las cajas estan disponibles");
            
        menu();
        
        }
    }
    
    public static void menu(){
        
        Scanner entrada= new Scanner(System.in);
        int e= 1;
        
        while(e!=0){
           
            System.out.println("------------------------------------------------");
            System.out.println("MENU");
            System.out.println("Digite la opcion que desea seleccionar");
            System.out.println("1- Ingresar a una caja");
            System.out.println("2- Mostrar cajas");
            System.out.println("3- Avanzar en la fila");
            System.out.println("0- Salir");
            System.out.println("------------------------------------------------");
            e=entrada.nextInt();
            
            switch(e){
                
                case 1: 
                    ingresarFila();
                    break;
                   
                case 2: 
                    verFilas();
                    break;
                    
                case 3:
                    avanzarFila();
                    break;
            
            }
        
        
        }
    
    }
    
    public static void ingresarFila(){
        /**
        Scanner e = new Scanner(System.in);
        cola nom = new cola();
        
         
        System.out.println("Digite el nombre de la persona que desea agregar a la fila");
        nom.setNombre(e.next());
        System.out.println(nom.mostrarNombre());
        cola1.addLast(nom);
        */
        if(cola1.size()==0&&cola2.size()==0&&cola3.size()==0){
            
            Scanner e = new Scanner(System.in);
            cola nom = new cola();
        
            System.out.println("Digite el nombre de la persona que desea agregar a la fila");
            nom.setNombre(e.next());
            cola1.addLast(nom);
            System.out.println("Se agrego a la fila 1");
            
           }else if (cola1.size()>cola2.size()){
               Scanner e = new Scanner(System.in);
               cola nom = new cola();
               
               System.out.println("Digite el nombre de la persona que desea agregar a la fila");
               nom.setNombre(e.next());
               System.out.println(nom.mostrarNombre() + "A la fila 2");
               cola2.addLast(nom);
           
           }else if (cola1.size()>cola2.size() && cola2.size()<=cola3.size() ){
               Scanner e = new Scanner(System.in);
               cola nom = new cola();
               
               System.out.println("Digite el nombre de la persona que desea agregar a la fila");
               nom.setNombre(e.next());
               System.out.println(nom.mostrarNombre() + " A la fila 2");
               cola2.addLast(nom);
           
           }else if(cola2.size()>cola3.size()){
               Scanner e = new Scanner(System.in);
               cola nom = new cola();
               
               System.out.println("Digite el nombre de la persona que desea agregar a la fila");
               nom.setNombre(e.next());
               System.out.println(nom.mostrarNombre() + " A la fila 3");
               cola3.addLast(nom);
               
           }else if(cola1.size()==cola2.size()){
               Scanner e = new Scanner(System.in);
               cola nom = new cola();
               
               System.out.println("Digite el nombre de la persona que desea agregar a la fila");
               nom.setNombre(e.next());
               System.out.println(nom.mostrarNombre() + " A la fila 1");
               cola1.addLast(nom);
           }
            
            
    }
    
    public static void verFilas(){

        System.out.println("Personas en la fila 1");
        for(int i=0;i<cola1.size();i++){
      
            cola p = cola1.get(i);
            System.out.println((i+1) + "-" + p.getNombre());     
         }
        
           if(cola1.size()==0){
               System.out.println("La fila 1 esta vacia");
           
           }
        
         System.out.println("Personas en la fila 2");
        for(int i=0;i<cola2.size();i++){
      
            cola j = cola2.get(i);
            System.out.println((i+1) + "-" + j.getNombre());       
         }
           if(cola2.size()==0){
               System.out.println("La fila 2 esta vacia");
           
           }
           
         System.out.println("Personas en la fila 3");
        for(int i=0;i<cola3.size();i++){
      
            cola x = cola3.get(i);
            System.out.println((i+1) + "-" + x.getNombre());       
         }
            if(cola3.size()==0){
               System.out.println("La fila 3 esta vacia");
           }
    }
    
    public static void avanzarFila(){
        
        if(cola1.size()>=0){
            
           cola avanzar =new cola();
           avanzar=(cola) cola1.removeFirst();
        
           System.out.println(avanzar.getNombre() + " Ha salido de la fila 1");
        }else{
            System.out.println("La fila 1 esta vacia");
        }
        
        if(cola2.size()>=0){
            
             cola avanzar2 = new cola();
             avanzar2=(cola) cola2.removeFirst();
        
           System.out.println(avanzar2.getNombre() + " Ha salido de la fila 2");
        }else{
            System.out.println("La fila 2 esta vacia");
        }
        if(cola3.size()>=0){
            
             cola avanzar3 = new cola();
             avanzar3=(cola) cola3.removeFirst();
        
           System.out.println(avanzar3.getNombre() + " Ha salido de la fila 3");
        }else{
            System.out.println("La fila 3 esta vacia");
        }
    }
    
}
