public class main { 
    public static void main(String[] args) { 
        scanner entrada = new Scanner(System.in);
        
        final double PESO_CORTE1 = 0.30;
        final double PESO_CORTE2 = 0.30;
        final double PESO_CORTE3 = 0.40;

        final double PESO_PARCIAL = 0.70;
        final double PESO_RESTANTE = 0.30;

        final double NOTA_APROBACION = 3.0;
        final double NOTA_MAXIMA = 5.0; 

        System.out.println("===================================");
        System.out.println("        CALCULADORA DE NOTAS       ");
        System.out.println("===================================");

        System.out.println("Ingrese la nota del primer corte: ");
        double corte1 = entrada.nextDouble();

        System.out.println("Igrese la nota del segundo corte: ");
        double corte2 = entrada.nextDouble();

        double aporteCorte1 = corte1 * PESO_CORTE1;
        double aporteCorte2 = corte2 * PESO_CORTE2;

        double aportenecesariaCorte3 = aportenecesariaCorte3 / PESO_CORTE3;

        System.out.println("\n====== RESULTADOS ======"); 

        System.out.println("Aporte corte 1: %.2f%n", aporteCorte1);
        System.out.println("Aporte corte 2: %.2f%n", aporteCorte2);

        System. out.println("Nota necesaria en el corte 3: %.2f%n", notaNecesariaCorte3);

        if (notaNecesariaCorte3 > NOTA_MAXIMA) {

            System.out.println("No es posible aprobar, " + "porque necesita mas de 5.0 en el tercer corte.");

        }  else if (notaNecesariaCorte3 <= 0) {

                System.out.println("Ya tiene asegurada la nota de aprobacion.");
            
        }  else {
            System.out.println("\nAhora vamos a revisar el del tercer corte.");

            System.out.println("Ingrese la nota del parcial del tercer corte: ");

            double aporteParcial = parcial * PESO_PARCIAL;

            double aporteRestante = notaNecesariaCorte3 - aporteParcial;

            double notaRestante = aporteRestante / PESO_RESTANTE;

            System.out.println("\nAporte del parcial: %.2f%n", aporteParcial);
            
            System.out.println("Nota necesaria en el 30% restante %.2f%n, notaRestante");

            if (notaRestante > NOTA_MAXIMA) { 
                System.out.println("\nNo es posible aprobar.");

                System.out.println("Necesitaria mas de 5.0" + "en el 30% restante.");

            }   else if (notaRestante <= 0) { 
                System.out.println("\nSi es posible aprobar.");

                System.out.println("Con la nota del parcial ya" + "alcanza la nota necesaria.");

            }   else { 
                System.out.println("\nSi es posible aprobar.");

                System.out.println("Debe obtener al menos %.2f" + "en el 30% restante.%n", notaRestante);
            }
        }
        
        entrada.close();

    }

}