package ejercicio06;

import adicionales.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double volver, planeta, peso, cteP1=0.38, cteP2=0.91, cteP3=1, cteP4=0.38, cteP5=2.53, cteP6=1.06, cteP7=0.92, cteP8=1.2, pesoP1, pesoP2,pesoP3, pesoP4, pesoP5, pesoP6, pesoP7, pesoP8;
		String p1="Mercurio", p2="Venus", p3="Tierra", p4="Marte", p5="Júpiter", p6="Saturno", p7="Urano", p8="Neptuno";
		
		do {
			System.out.println("\n\t¿Cuánto pesas en cada planeta?");
			System.out.println("\n****************************************************");
			System.out.println("\nPlaneta 1: "+p1+" .");
			System.out.println("\nPlaneta 2: "+p2+" .");
			System.out.println("\nPlaneta 3: "+p3+" .");
			System.out.println("\nPlaneta 4: "+p4+" .");
			System.out.println("\nPlaneta 5: "+p5+" .");
			System.out.println("\nPlaneta 6: "+p6+" .");
			System.out.println("\nPlaneta 7: "+p7+" .");
			System.out.println("\nPlaneta 8: "+p8+" .");
			System.out.println("\nPresiona 0 para terminar.");
			System.out.println("\n¿En que planeta desea calcular su peso?");
			planeta=Leer.datoDouble();
			
			if (planeta==1) {
				
				switch ("p1") {
				
				case "p1":
					
					System.out.println("\n¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP1=peso*cteP1;
					System.out.println("\nSu peso en "+p1+" es de "+pesoP1);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
					
				case "p2":
					
					System.out.println("\n¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP2=peso*cteP2;
					System.out.println("\nSu peso en "+p2+" es de "+pesoP2);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
					
				case "p3":
					
					System.out.println("\n¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP3=peso*cteP3;
					System.out.println("\nSu peso en "+p3+" es de "+pesoP3);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
					
				case "p4":
					
					System.out.println("\n¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP4=peso*cteP4;
					System.out.println("\nSu peso en "+p4+" es de "+pesoP4);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
				
				case "p5":
					
					System.out.println("\n¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP5=peso*cteP5;
					System.out.println("\nSu peso en "+p5+" es de "+pesoP5);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
					
				case "p6":
					
					System.out.println("\n¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP6=peso*cteP6;
					System.out.println("\nSu peso en "+p6+" es de "+pesoP6);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
					
				case "p7":
					
					System.out.println("\n¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP7=peso*cteP7;
					System.out.println("Su peso en "+p7+" es de "+pesoP7);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
					
				case "p8":
					
					System.out.println("¿Cuál es su peso?");
					peso=Leer.datoDouble();
					
					pesoP8=peso*cteP8;
					System.out.println("Su peso en "+p8+" es de "+pesoP8);
					
					//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
					System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
					volver=Leer.datoInt(); break;
				
				}
			}
				
				if (planeta==2) {
					
					switch ("p2") {
					
					case "p1":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP1=peso*cteP1;
						System.out.println("Su peso en "+p1+" es de "+pesoP1);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
						
					case "p2":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP2=peso*cteP2;
						System.out.println("Su peso en "+p2+" es de "+pesoP2);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
						
					case "p3":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP3=peso*cteP3;
						System.out.println("Su peso en "+p3+" es de "+pesoP3);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
						
					case "p4":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP4=peso*cteP4;
						System.out.println("Su peso en "+p4+" es de "+pesoP4);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
					
					case "p5":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP5=peso*cteP5;
						System.out.println("Su peso en "+p5+" es de "+pesoP5);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
						
					case "p6":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP6=peso*cteP6;
						System.out.println("Su peso en "+p6+" es de "+pesoP6);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
						
					case "p7":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP7=peso*cteP7;
						System.out.println("Su peso en "+p7+" es de "+pesoP7);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
						
					case "p8":
						
						System.out.println("¿Cuál es su peso?");
						peso=Leer.datoDouble();
						
						pesoP8=peso*cteP8;
						System.out.println("Su peso en "+p8+" es de "+pesoP8);
						
						//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
						System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
						volver=Leer.datoInt(); break;
					
					}
				}
				
					if (planeta==3) {
						
						switch ("p3") {
						
						case "p1":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP1=peso*cteP1;
							System.out.println("Su peso en "+p1+" es de "+pesoP1);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
							
						case "p2":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP2=peso*cteP2;
							System.out.println("Su peso en "+p2+" es de "+pesoP2);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
							
						case "p3":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP3=peso*cteP3;
							System.out.println("Su peso en "+p3+" es de "+pesoP3);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
							
						case "p4":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP4=peso*cteP4;
							System.out.println("Su peso en "+p4+" es de "+pesoP4);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
						
						case "p5":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP5=peso*cteP5;
							System.out.println("Su peso en "+p5+" es de "+pesoP5);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
							
						case "p6":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP6=peso*cteP6;
							System.out.println("Su peso en "+p6+" es de "+pesoP6);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
							
						case "p7":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP7=peso*cteP7;
							System.out.println("Su peso en "+p7+" es de "+pesoP7);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
							
						case "p8":
							
							System.out.println("¿Cuál es su peso?");
							peso=Leer.datoDouble();
							
							pesoP8=peso*cteP8;
							System.out.println("Su peso en "+p8+" es de "+pesoP8);
							
							//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
							System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
							volver=Leer.datoInt(); break;
						
						}
					}
						
						if (planeta==4) {
							
							switch ("p4") {
							
							case "p1":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP1=peso*cteP1;
								System.out.println("Su peso en "+p1+" es de "+pesoP1);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
								
							case "p2":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP2=peso*cteP2;
								System.out.println("Su peso en "+p2+" es de "+pesoP2);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
								
							case "p3":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP3=peso*cteP3;
								System.out.println("Su peso en "+p3+" es de "+pesoP3);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
								
							case "p4":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP4=peso*cteP4;
								System.out.println("Su peso en "+p4+" es de "+pesoP4);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
							
							case "p5":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP5=peso*cteP5;
								System.out.println("Su peso en "+p5+" es de "+pesoP5);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
								
							case "p6":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP6=peso*cteP6;
								System.out.println("Su peso en "+p6+" es de "+pesoP6);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
								
							case "p7":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP7=peso*cteP7;
								System.out.println("Su peso en "+p7+" es de "+pesoP7);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
								
							case "p8":
								
								System.out.println("¿Cuál es su peso?");
								peso=Leer.datoDouble();
								
								pesoP8=peso*cteP8;
								System.out.println("Su peso en "+p8+" es de "+pesoP8);
								
								//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
								System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
								volver=Leer.datoInt(); break;
							
							}
						}
					
							if (planeta==5) {
								
								switch ("p5") {
								
								case "p1":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP1=peso*cteP1;
									System.out.println("Su peso en "+p1+" es de "+pesoP1);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
									
								case "p2":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP2=peso*cteP2;
									System.out.println("Su peso en "+p2+" es de "+pesoP2);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
									
								case "p3":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP3=peso*cteP3;
									System.out.println("Su peso en "+p3+" es de "+pesoP3);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
									
								case "p4":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP4=peso*cteP4;
									System.out.println("Su peso en "+p4+" es de "+pesoP4);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
								
								case "p5":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP5=peso*cteP5;
									System.out.println("Su peso en "+p5+" es de "+pesoP5);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
									
								case "p6":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP6=peso*cteP6;
									System.out.println("Su peso en "+p6+" es de "+pesoP6);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
									
								case "p7":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP7=peso*cteP7;
									System.out.println("Su peso en "+p7+" es de "+pesoP7);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
									
								case "p8":
									
									System.out.println("¿Cuál es su peso?");
									peso=Leer.datoDouble();
									
									pesoP8=peso*cteP8;
									System.out.println("Su peso en "+p8+" es de "+pesoP8);
									
									//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
									System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
									volver=Leer.datoInt(); break;
								
								}
							}
								
								if (planeta==6) {
									
									switch ("p6") {
									
									case "p1":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP1=peso*cteP1;
										System.out.println("Su peso en "+p1+" es de "+pesoP1);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
										
									case "p2":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP2=peso*cteP2;
										System.out.println("Su peso en "+p2+" es de "+pesoP2);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
										
									case "p3":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP3=peso*cteP3;
										System.out.println("Su peso en "+p3+" es de "+pesoP3);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
										
									case "p4":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP4=peso*cteP4;
										System.out.println("Su peso en "+p4+" es de "+pesoP4);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
									
									case "p5":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP5=peso*cteP5;
										System.out.println("Su peso en "+p5+" es de "+pesoP5);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
										
									case "p6":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP6=peso*cteP6;
										System.out.println("Su peso en "+p6+" es de "+pesoP6);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
										
									case "p7":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP7=peso*cteP7;
										System.out.println("Su peso en "+p7+" es de "+pesoP7);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
										
									case "p8":
										
										System.out.println("¿Cuál es su peso?");
										peso=Leer.datoDouble();
										
										pesoP8=peso*cteP8;
										System.out.println("Su peso en "+p8+" es de "+pesoP8);
										
										//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
										System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
										volver=Leer.datoInt(); break;
									
									}
								}
							
									if (planeta==7) {
										
										switch ("p7") {
										
										case "p1":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP1=peso*cteP1;
											System.out.println("Su peso en "+p1+" es de "+pesoP1);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
											
										case "p2":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP2=peso*cteP2;
											System.out.println("Su peso en "+p2+" es de "+pesoP2);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
											
										case "p3":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP3=peso*cteP3;
											System.out.println("Su peso en "+p3+" es de "+pesoP3);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
											
										case "p4":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP4=peso*cteP4;
											System.out.println("Su peso en "+p4+" es de "+pesoP4);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
										
										case "p5":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP5=peso*cteP5;
											System.out.println("Su peso en "+p5+" es de "+pesoP5);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
											
										case "p6":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP6=peso*cteP6;
											System.out.println("Su peso en "+p6+" es de "+pesoP6);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
											
										case "p7":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP7=peso*cteP7;
											System.out.println("Su peso en "+p7+" es de "+pesoP7);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
											
										case "p8":
											
											System.out.println("¿Cuál es su peso?");
											peso=Leer.datoDouble();
											
											pesoP8=peso*cteP8;
											System.out.println("Su peso en "+p8+" es de "+pesoP8);
											
											//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
											System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
											volver=Leer.datoInt(); break;
										
										}
									}
									
										if (planeta==8) {
											
											switch ("p8") {
											
											case "p1":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP1=peso*cteP1;
												System.out.println("Su peso en "+p1+" es de "+pesoP1);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
												
											case "p2":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP2=peso*cteP2;
												System.out.println("Su peso en "+p2+" es de "+pesoP2);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
												
											case "p3":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP3=peso*cteP3;
												System.out.println("Su peso en "+p3+" es de "+pesoP3);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
												
											case "p4":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP4=peso*cteP4;
												System.out.println("Su peso en "+p4+" es de "+pesoP4);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
											
											case "p5":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP5=peso*cteP5;
												System.out.println("Su peso en "+p5+" es de "+pesoP5);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
												
											case "p6":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP6=peso*cteP6;
												System.out.println("Su peso en "+p6+" es de "+pesoP6);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
												
											case "p7":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP7=peso*cteP7;
												System.out.println("Su peso en "+p7+" es de "+pesoP7);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
												
											case "p8":
												
												System.out.println("¿Cuál es su peso?");
												peso=Leer.datoDouble();
												
												pesoP8=peso*cteP8;
												System.out.println("Su peso en "+p8+" es de "+pesoP8);
												
												//Esto de volver al menú de planetas es para que no salga el texto del tirón y tengas que ir arriba a ver el peso.
												System.out.println("\nPresiona cualquier número para volver a la elección de planeta.");
												volver=Leer.datoInt(); break;
											
											}
										
			}
			
		} while (planeta!=0);
		
	}

}
