
package Laberinto;

import java.util.Scanner;


public  class Menu {
    
    public static void main(String[] args) {
        
  
        
        
            int menu;
        System.out.println("-------------Bienvenido al Menu Principal--------------");
        System.out.println("1.JUGAR");
        System.out.println("2.CREAR MAPA");
        System.out.println("3.Reportes");
        System.out.println("4.VISUALIZAR MAPA");
        System.out.println("5.SALIR ");
        
          
        Scanner scanner = new Scanner(System.in);
        menu = scanner.nextInt();
    
        
        switch (menu){
        case 1:{
        Jugar.juego();
        }
        
        case 2:{
        CrearMapa.creacion();
        
        break;
        }
        
        case  3:{
        
        Reportes.reporte();
        } 
        
        case  4:{
        Mapa.mapas();
        }  
        case 5:{
            System.out.println("Vuelve Pronto");
        break;
        
        }
        }
        }
        
        
    
    public static class Jugar {

        public static void juego() {
            int comando;
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Que comando desea ejecutar");
            System.out.println("1.  MOVER");
            System.out.println("2. ORO REQUERIDO");
            System.out.println("3. ORO");
            System.out.println("4. LEVANTAR");
            System.out.println("5. MIRAR");
            System.out.println("6. SALIR");
            comando= scanner.nextInt();
            switch (comando){
                case 1:{
                
                }
                case 2:{
                    
                }
                case 3:{
                }
                case 4:{
                }
                case 5:{
                    CrearMapa.creacion();
                }
                case 6:{   
                    
                break;
                }
            }
        }

    }

    public static class CrearMapa {

        public static void creacion() {
            int filas;
            int columnas;
            int seleccion;
            int  oro;
            String nombre;
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre que le desea colocar a su laberinto");
            nombre = scanner.next();
            System.out.println("Ingrese la cantidad de oro necesaria para salir");
            oro = scanner.nextInt();
            
            System.out.println("Ingrese la cantidad de filas que tendra el laberinto");
            filas = scanner.nextInt();
            System.out.println("Ingrese la cantidad de columnas que tendra el laberinto");
            columnas = scanner.nextInt();
            
            String[][] tablero = new String[filas][columnas];
               
              for (int i = 0; i < filas; i++){
               
              for (int j = 0; j < columnas; j++){
               tablero[0][0]= "#";
                  System.out.println("Ingrese que desea en esta casilla ( "+i+","+j + ") ");
                  String contenido;
                  contenido = scanner.nextLine();
                  tablero[i][j] = contenido;
              
              }
              }
              
                System.out.println("Desea ver el laberinto creado?");
                System.out.println("1.Si 2.No");
                seleccion = scanner.nextInt();
                   if (seleccion == 1){
                   for (int i = 0; i < filas; i++){
              for (int j = 0; j < columnas; j++)
                  System.out.print(tablero[i][j] +"\t");
          
                    System.out.println("");
                    
                   }
        
       
       }
        }               
    }
    public static class Reportes {

        public static void reporte() {
         
        
        }

        }
    

    public static class Mapa {
        int i= 0;
        int j =0;
        
        
        public static void mapas() {
            Scanner scanner = new Scanner(System.in);
            int seleccion;
            System.out.println("Escoja el mapa que desea visualizar");
            
            System.out.println("1. Mapa Predeterminado");
            
            System.out.println("2. Mapa Creado");
            seleccion= scanner.nextInt();
            
            if(seleccion==1){
                String[][] tablero = new String[30][30];
            
             for (int i = 0; i < 30; i++){
            for(int j = 0; j < 30; j++){
                
                if(j == 0 || j==29 ){
                    tablero[i][j] = "#";
                 
                    }else if( i == 0 || i==29 || ( j ==0 || j == 29)){
                        tablero[i][j]= "#";
                        
                        }else if (i == 0 || i == 29 ){
                            tablero[i][j] ="#";
                         
                            }else if ((j == 9 || j == 11) || (j == 13 || j == 15)||(j == 25 || j == 27)){
                                tablero [i][j] ="#";
                                }else if (( j == 1 ||j == 2) || (j==4 || j == 5) || (j == 6 || j == 7) ){
                                    tablero [i][j] = "O";
                                    }else if (i == 2){
                                        tablero [i][j]= "#";
                                        }else if (( i == 28 || i == 27 ) || ( i == 22 || i == 20 )){
                                            tablero [i][j]= "O";
                                          }else if (i ==13  || i ==18){
                                                tablero [i][j] = "O";
                                                }else if ((i == 1 || i == 3) || (i== 4 || i==5 ) ||(i ==6 || i ==7)){
                                                    tablero [i][j]= "O";
                                                    }else if ((i == 8 || i == 9 ) ||( i ==10 || i == 11 ) || (i == 12 || i == 13)){
                                                     tablero[i][j]= "#";
                                                        }else if ((i == 16 || i == 17) || (i== 18 || i==19 ) ||(i ==21 || i ==23)){
                                                            tablero[i][j]= "O";
                                                            } else if ((i == 26 || i == 25) || (i== 24 || i==23 ) ||(i ==14 || i ==15)){
                                                                tablero[i][j]= "O";
                                                                }
            if ((i== 1 && j == 0) || (i== 0 && j == 8) ||(i==1 && j ==29)||(i==29 && j==14) ||(i== 20 && j==29) ){
            tablero[i][j]= "S";
                }else if (i==3 &&( j==3 || j== 8|| j==9 || j == 13 || j== 17)){
                    tablero[i][j] = "G";
                    }else if ((i==4 && j==11)||(i==5 && j==1)){
                        tablero[i][j]="G";
                        }else if (j==28&&( i==7|| i== 8|| i==28 )){
                            tablero[i][j]= "G";
                            }else if (j==27&&(i==9 || i==16)){
                                 tablero[i][j]="G";
                                 }                          
          
        

        
            }        
            
          }
       for (int i = 0; i < 30; i++){
              for (int j = 0; j < 30; j++)
                  System.out.print(tablero[i][j] +"");
          
                    System.out.println("");
      
    }     
       }else{
               CrearMapa.creacion();
                
                
            }
        }
          
    
}
}
        

