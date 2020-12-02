package ejercicio05;

import adicionales.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sala, volver, precio1=6, precio2=7, precio3=8, precio4=9, entradas1, entradas2, entradas3, entradas4, precioF1, precioF2, precioF3, precioF4;
		String peli1="Toy Story", peli2="Rey León", peli3="Dumbo", peli4="El Libro de la Selva";
		
		
		do {
			
			System.out.println("\nSala 1: "+peli1+" (presiona 1)");
			System.out.println("\nSala 2: "+peli2+" (presiona 2)");
			System.out.println("\nSala 3: "+peli3+" (presiona 3)");
			System.out.println("\nSala 4: "+peli4+" (presiona 4)");
			System.out.println("\nPresiona 0 para terminar");
			
			System.out.println("\nIntroduzca número de sala o 0 para terminar.");
			sala=Leer.datoInt();
			
			if (sala==1)
			
				switch ("sala1") {
			
				case"sala1":
				
					System.out.println("\nPelícula: "+peli1);
					System.out.println("\nPrecio/unidad: "+precio1+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas1=Leer.datoInt();
					precioF1=precio1*entradas1;
					System.out.println("\nEl precio total de las entradas es "+precioF1+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala2":
					
					System.out.println("\nPelícula: "+peli2);
					System.out.println("\nPrecio/unidad: "+precio2+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas2=Leer.datoInt();
					precioF2=precio2*entradas2;
					System.out.println("\nEl precio total de las entradas es "+precioF2+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala3":
					
					System.out.println("\nPelícula: "+peli3);
					System.out.println("\nPrecio/unidad: "+precio3+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas3=Leer.datoInt();
					precioF3=precio3*entradas3;
					System.out.println("\nEl precio total de las entradas es "+precioF3+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt(); break;
				
				case"sala4":
					
					System.out.println("\nPelícula: "+peli4);
					System.out.println("\nPrecio/unidad: "+precio4+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas4=Leer.datoInt();
					precioF4=precio4*entradas4;
					System.out.println("\nEl precio total de las entradas es "+precioF4+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				}
			
			if (sala==2)
				
				switch ("sala2") {
			
				case"sala1":
				
					System.out.println("\nPelícula: "+peli1);
					System.out.println("\nPrecio/unidad: "+precio1+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas1=Leer.datoInt();
					precioF1=precio1*entradas1;
					System.out.println("\nEl precio total de las entradas es "+precioF1+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala2":
					
					System.out.println("\nPelícula: "+peli2);
					System.out.println("\nPrecio/unidad: "+precio2+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas2=Leer.datoInt();
					precioF2=precio2*entradas2;
					System.out.println("\nEl precio total de las entradas es "+precioF2+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala3":
					
					System.out.println("\nPelícula: "+peli3);
					System.out.println("\nPrecio/unidad: "+precio3+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas3=Leer.datoInt();
					precioF3=precio3*entradas3;
					System.out.println("\nEl precio total de las entradas es "+precioF3+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
				
				case"sala4":
					
					System.out.println("\nPelícula: "+peli4);
					System.out.println("\nPrecio/unidad: "+precio4+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas4=Leer.datoInt();
					precioF4=precio4*entradas4;
					System.out.println("\nEl precio total de las entradas es "+precioF4+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				}
			
			if (sala==3)
				
				switch ("sala3") {
			
				case"sala1":
					
					System.out.println("\nPelícula: "+peli1);
					System.out.println("\nPrecio/unidad: "+precio1+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas1=Leer.datoInt();
					precioF1=precio1*entradas1;
					System.out.println("\nEl precio total de las entradas es "+precioF1+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala2":
					
					System.out.println("\nPelícula: "+peli2);
					System.out.println("\nPrecio/unidad: "+precio2+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas2=Leer.datoInt();
					precioF2=precio2*entradas2;
					System.out.println("\nEl precio total de las entradas es "+precioF2+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala3":
					
					System.out.println("\nPelícula: "+peli3);
					System.out.println("\nPrecio/unidad: "+precio3+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas3=Leer.datoInt();
					precioF3=precio3*entradas3;
					System.out.println("\nEl precio total de las entradas es "+precioF3+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala4":
					
					System.out.println("\nPelícula: "+peli4);
					System.out.println("\nPrecio/unidad: "+precio4+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas4=Leer.datoInt();
					precioF4=precio4*entradas4;
					System.out.println("\nEl precio total de las entradas es "+precioF4+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				}
			
			if (sala==4)
				
				switch ("sala4") {
			
				case"sala1":
				
					System.out.println("\nPelícula: "+peli1);
					System.out.println("\nPrecio/unidad: "+precio1+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas1=Leer.datoInt();
					precioF1=precio1*entradas1;
					System.out.println("\nEl precio total de las entradas es "+precioF1+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala2":
					
					System.out.println("\nPelícula: "+peli2);
					System.out.println("\nPrecio/unidad: "+precio2+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas2=Leer.datoInt();
					precioF2=precio2*entradas2;
					System.out.println("\nEl precio total de las entradas es "+precioF2+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala3":
					
					System.out.println("\nPelícula: "+peli3);
					System.out.println("\nPrecio/unidad: "+precio3+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas3=Leer.datoInt();
					precioF3=precio3*entradas3;
					System.out.println("\nEl precio total de las entradas es "+precioF3+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				case"sala4":
					
					System.out.println("\nPelícula: "+peli4);
					System.out.println("\nPrecio/unidad: "+precio4+" €.");
					System.out.println("\n¿Cuántas entradas desea?");
					entradas4=Leer.datoInt();
					precioF4=precio4*entradas4;
					System.out.println("\nEl precio total de las entradas es "+precioF4+" €.");
					System.out.println("\nPulsa cualquier número para salir");
					volver=Leer.datoInt();break;
					
				}
			if(sala>4) {
				
				System.out.println("\nNo hay tantas salas en este cine.");
				
			}
			
			if(sala<0) {
				
				System.out.println("\nNo hay salas con números negativos en este cine.");
				
			}
			
		}while (sala!=0);
			
		}
	}


