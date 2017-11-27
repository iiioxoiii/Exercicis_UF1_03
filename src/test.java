import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.*;

public class test {


    public static void main(String[] args) {

        //test.liniaEuros();
        //test.fontMonedes();
        //test.contarCaracters();
        //test.reconstrueixFrase("cuanto peor mejor para todos y cuanto peor para todos mejor mejor para mí el suyo beneficio político");
        //test.taulaDeMultiplicar();
        //test.Permutacion2();
        //test.llargadaFile();
        //test.dibuixaTriangle();
        //test.veurePathiLlistaDirIFiles();
        //test.veurePropietats2();
        //test.professors();
        //test.tresEnters();
        //test.binariDecimal();
        //test.bitllets();

        //test.array1();
        //test.array2();
        //test.array3();
        //test.array4();
        //test.array5();
        //test.array6();
        //test.array7();
        //test.array8();
        //test.array9();
        //test.array10();

        //test.array2D1();
        //test.array2D2();
        //test.array2D3();
        //test.array2D4();
        //test.array2D5();
        //test.array2D6();
        //test.array2D7();
        //test.array2D8();

    }



    /* 1. Llegeix 10 enters i guarda'ls a un array i quan acabis els imprimeixes per pantalla amb un for.*/

    public static void array1() {
        System.out.println("Escriu 10 enters:");
        Scanner sc = new Scanner(System.in);

        int[] enters = new int[10];

        String numeros = sc.nextLine();

        String[] strArray = numeros.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        for (int enter : intArray) {
            System.out.println(enter);

        }
    }

    /*2. Genera 10 nombres positius aleatoris i guarda'ls a un array.
    Després busca el màxim i el mínim dels valors continguts dins aquest Array.*/

    public static void array2(){
        int [] array = new int [10];
        for(int i=0; i < array.length; i++ ) {
            array[i] = randomWithRange(0, 10);
        }
        int min=10;
        int max=0;

        for(int i=0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
            if (array[i] >= max) {
                max = array[i];
            }
        }

        System.out.println("min:" +min);
        System.out.println("max" + max);
        for(int e:array){
            System.out.println(e);
        }
    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    /* 3. Donat un array de 5 elements digues sí és creixent o decreixent.
    Ex: creixent {0,3, 5, 6, 9}, decreixent {34, 23, 19, 18, 3}
     */

    public static void array3(){
        int [] arrayA= {0,3,5,6,9};
        int [] arrayB= {34,23,19,18,3};

        int valorA = 0;
        int valorB = 0;

        for(int i=0; i < arrayA.length-1; i++){
            if(arrayA[i]<arrayA[i+1]){
                valorA++;
            }
        }

        for(int i=0; i < arrayB.length-1; i++){
            if(arrayB[i]>arrayB[i+1]){
                valorB++;
            }
        }

        if(valorA == arrayA.length-1){
            System.out.println("Ascendent");
        }

        if(valorB == arrayB.length-1){
            System.out.println("Descendent");
        }

    }

    /* 4. Fes la suma de dos arrays posició a posició. Això significa que has d'introduir dos arrays
    d'igual tamany i en un tercer hi has de posar la suma element a element.*/

    public static void array4(){
        int [] arrayA= {0,3,5,6,9};
        int [] arrayB= {34,23,19,18,3};

        int [] arrayC = new int[arrayA.length];
        for (int i=0; i < arrayC.length; i++){
            arrayC[i]=arrayB[i]+arrayA[i];
        }

        for(int e:arrayC){
            System.out.println(e);
        }
    }

    /*5. Introdueix un Array d'enters i calcula el % d'elements que són més grans que la mitjana aritmètica dels
    elements de la taula. Escriu els elements de l'Array, la mitjana i el nombre d'elements més grans que la mitjana.*/

    public static void array5(){
        int [] arrayA={4,3,2,56,34,23};

        int mitjana=0;

        for(int i=0; i < arrayA.length; i++){
            mitjana = mitjana + arrayA[i];
        }

        mitjana = Math.round(mitjana/arrayA.length);

        for(int i=0; i<arrayA.length;i++){
            if(arrayA[i]>mitjana){
                System.out.println(arrayA[i]);
            }
        }

    }

    /* 6. Donat un vector de nombres enters, determina si algun element està repetit.*/

    public static void array6(){
        int [] arrayA={4,5,2,56,35,34,23};

        boolean sortida = false;
        int repetit=0;

        for(int n:arrayA){
            for(int i=0; i < arrayA.length; i++){
                if (n==arrayA[i]){
                    repetit++;
                    if (repetit > 1){
                        sortida = true;
                    }
                }
            }
            repetit = 0;
        }

        if (sortida){
            System.out.println("Com a mínim ha un element repetit");
        }else{
            System.out.println("No hi ha cap element repetit");
        }

    }

    /*7. Escriu un programa anomenat Fusio que, donats dos vectors de nombres enters
    ordenats, en crei un de nou amb el contingut dels dos originals també ordenat.
    Defineix la longitud dels dos vectors originals amb dos constants definides a
    l'inici del codi, de manera que canviant només els valors de les constants
    el programa ha de seguir funcionant bé.*/

    public static void array7(){
        int []arrayA={3,5,6,8,9};
        int []arrayB={5,8,10,15,20};

        int [] arrayC = new int [arrayA.length+arrayB.length];

        for(int i = 0; i < arrayA.length;i++){
            arrayC[i]=arrayA[i];
        }

        for(int i = 0; i < arrayB.length; i++){
            int x = i+arrayA.length;
            arrayC[x] =arrayB[i];
        }

        //Ordena el array
        Arrays.sort(arrayC);

        for(int element: arrayC){
            System.out.println(element);
        }

    }

    /* 8. Escriu un programa que donat un vector que guarda els pesos de 20 persones
    * (valors enters positius entre 50 i 100), escrigui per pantalla un histograma que representi el nombre de
    * persones per cada pes especificat.
    * Consideracions:
    *
    * A l'histograma només apareixeran els pesos amb una o més persones.
    * El vector de pesos s'ha de definir en el codi, NO cal preguntar-los a l'usuari.
    * Els vector de pesos no està ordenat.
    * PISTA: usar el mètode Arrays.sort(...) per
    * ordenar-lo.
    *
    * Exemple:
    *
    * pesos[20]={55,61,65,70,55,61,65,70,61,70,61,70,70,65,65,65,65,65,65,65}
    *
    * Histograma
    * --------------------------------------
    * 55 **
    * 61 ****
    * 65 *********
    * 70 *****
    ... ...
    */

    public static void array8(){

        int pesos[]= {55,61,65,70,55,61,65,70,61,70,61,70,70,65,65,65,65,65,65,65};

        Arrays.sort(pesos);

        int aux = -1;

        System.out.println("Histograma");
        System.out.println("--------------------------------------");
        for(int i=0; i < pesos.length;i++) {

            if (pesos[i] == aux) {

            } else {
                System.out.print(pesos[i]);

                for (int z = 0; z < pesos.length; z++) {
                    if (pesos[i] == pesos[z]) {
                        System.out.print("*");
                    }
                }

                System.out.println("");
                aux = pesos[i];

            }

        }
    }

    /*9. Implementa l'algorisme de la búsqueda binària o dicotòmica:
    S'utilitza quan el vector en el qual volem determinar l'existència d'un element està prèviament ordenat.
    Aquest algoritme redueix el temps de cerca considerablement, ja que disminueix exponencialment el nombre
    d'iteracions necessàries.

    Està altament recomanat per buscar a un vector de grans dimensions. Per exemple, en un contenint 50.000.000
    elements, realitza com a màxim 26 comparacions (en el pitjor dels casos).

    Per implementar aquest algorisme es compara l'element a buscar amb un element qualsevol de l'array
    (normalment l'element central): si el valor d'aquest és més gran que el de l'element buscat es repeteix el
    procediment a la part de l'array que va des de l'inici de aquest fins l'element pres, en cas contrari es pren
    la part de l'array que va des de l'element pres fins al final. D'aquesta manera obtenim intervals cada vegada
    més petits, fins que s'obtingui un interval indivisible. Si l'element no es troba dins d'aquest últim llavors
    es dedueix que l'element buscat no es troba en tot l'array.*/

    public static void array9(){

        //Creo un array de 50 milions de num
        int [] array = new int[50000000];

        //L'array s'ompla d'enters consecutius
        for(int i=0; i< array.length; i++){
            array[i]=i;
        }

        /*Es desordenen
        Random r = new Random();
        for (int i = array.length; i > 0; i--) {
            int posicion = r.nextInt(i);
            int tmp = array[i-1];
            array[i - 1] = array[posicion];
            array[posicion] = tmp;
        }*/

        // Es cerca el valor
        int valorOcult = 250000000;


        //Es marca el crono
        long time_start = System.currentTimeMillis();

        System.out.println(test.cerca(array,valorOcult));

        //Es marca el final
        long time_end = System.currentTimeMillis();
        System.out.println("temps emprat: "+(time_end - time_start) + " milisegons");




    }

    public static int cerca(int  vector[], int dato){
        int n = vector.length;
        int centro,inf=0,sup=n-1;
        int cicles=0;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(vector[centro]==dato) {
                return cicles;
            }
            else if(dato < vector[centro] ){
                sup=centro-1;
            }
            else {
                inf=centro+1;
            }
        cicles++;
        }

        return -1;
    }

    /*10. Implementar l'algorisme d'ordenació Bubble Sort (ordenació de bombolla, en anglès): funciona revisant cada
    element de la llista a ordenar amb el següent, intercanviant-de posició si estan en l'ordre equivocat. Cal revisar
    diverses vegades tota la llista fins que no es necessitin més intercanvis, la qual cosa significa que la llista està
    ordenada.*/

    public static void array10() {

        //Creo un array de 50 milions de num
        int[] array = new int[20];

        //L'array s'ompla d'enters consecutius
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //Es desordenen
        Random r = new Random();
        for (int i = array.length; i > 0; i--) {
            int posicion = r.nextInt(i);
            int tmp = array[i - 1];
            array[i - 1] = array[posicion];
            array[posicion] = tmp;
        }

        int [] array2 = bubbleSort(array);

        for (int e:array2) {
            System.out.println(e);
        }



    }

    public static int [] bubbleSort(int [] array ){

        int index = array.length;
        for(int x=0; x < array.length; x++) {
            index=index-1;
            for (int i = 0; i < index; i++) {
                int a = array[i];
                int b = array[i + 1];
                if (a > b) {
                    array[i + 1] = a;
                    array[i] = b;
                }
            }
        }
        return array;
    }


    //ARRAYS BIDIMENSIONALS

    /* 1. Crea una matriu d'enters de 10x10 i omple-la amb números aleatoris. Després demana un número per teclat i
    busca si apareix a la matriu.*/

    public static void array2D1(){
        int array[][] = new int [10][10];

        //S'omple amb valor aleatoris
        for(int filas=0; filas < array.length; filas++){
            for(int col=0; col < array[filas].length; col++){
                array[filas][col]=randomRango(100,1000);
            }
        }

        //Es pregunta un valor per pantalla
        System.out.println("Posa un valor enter:");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        for(int filas=0; filas < array.length; filas++){
            for(int col=0; col < array[filas].length; col++){
                if(array[filas][col]==valor){
                    System.out.println("El número " + valor+ " està a la fila "+ filas + " columna " + col);
                }
            }
        }
    }

    public static int randomRango(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    /*2. Fer un programa que llegeixi el nombre de files i el nombre de columnes d'una taula bidimensional numèrica
    entera, llegeixi la taula i l'escrigui.*/

    public static void array2D2() {
        int array[][] = new int [10][10];

        //S'omple amb valor aleatoris
        for(int filas=0; filas < array.length; filas++){
            for(int col=0; col < array[filas].length; col++){
                array[filas][col]=randomRango(100,1000);
            }
        }

        for(int filas=0; filas < array.length; filas++){
            System.out.println("");
            for(int col=0; col < array[filas].length; col++){
                array[filas][col]=randomRango(100,1000);
                int a = array[filas][col];
                System.out.print(a + " ");
            }
        }


    }

    /*3. Fer un programa que llegeixi una taula bidimensional quadrada numèèrica real i escrigui la seva diagonal*/

    public static void array2D3() {
        int array[][] = new int[10][10];

        //S'omple amb valor aleatoris
        for (int filas = 0; filas < array.length; filas++) {
            for (int col = 0; col < array[filas].length; col++) {
                array[filas][col] = randomRango(100, 1000);
            }
        }

        for(int filas=0; filas < array.length; filas++){
            System.out.println("");
            for(int col=0; col < array[filas].length; col++){
                array[filas][col]=randomRango(100,1000);
                int a = array[filas][col];
                if(filas == col){
                    System.out.print(a+" ");
                }else{
                    System.out.print("*** ");
                }
            }
        }


    }

    /*4. Fer un programa que llegeixi una taula numèèrica real i escrigui la taula transposada. La taula transposada
    s'obté  canviant les files per les columnes.*/

    public static void array2D4() {
        int array[][] = new int[10][10];

        //S'omple amb valor aleatoris
        for (int filas = 0; filas < array.length; filas++) {
            System.out.println("");
            for (int col = 0; col < array[filas].length; col++) {
                array[filas][col] = randomRango(100, 1000);
                System.out.print(array[filas][col]+"   ");
            }
        }
        System.out.println("");
        System.out.println("");


        for(int filas = 0; filas < array.length; filas++){
            System.out.println("");
            for (int col = 0; col < array[filas].length; col++) {
                System.out.print(array[col][filas]+ "   ");
            }
        }

    }

    /* 5 .Donat un nombre enter major que zero, crea la matriu identitat de dimensió el nombre enter donat.
    (http://ca.wikipedia.org/wiki/Matriu_identitat)*/

    public static void array2D5(){
        int num = 8;

        int [][] taula = new int[num][num];
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula.length; j++) {
                if(j==i){
                    taula[i][j]=1;
                }else{
                    taula[i][j]=0;
                }
            }
        }

        //Pinta la solucio
        for (int i = 0; i < taula.length; i++) {
            System.out.println();
            for (int j = 0; j < taula.length; j++) {
                System.out.print(taula[i][j] + " ");

            }
        }

    }

    /*6. Donades dues taules quadrades numèriques enteres de dimensió n, calcula la seva suma. La suma de les taules
    s'efectua assignant a cada element de la nova taula la suma dels elements que ocupen la mateix fila i la mateixa
    columna.*/

    public static void array2D6() {
        int arrayA[][] = new int [10][10];
        int arrayB[][] = new int [10][10];
        int arrayC[][] = new int [10][10];

        //S'omple amb valor aleatoris
        for(int filas=0; filas < arrayA.length; filas++){
            for(int col=0; col < arrayA[filas].length; col++){
                arrayA[filas][col]=randomRango(100,200);
                arrayB[filas][col]=randomRango(100,200);
            }
        }

        for(int filas=0; filas < arrayA.length; filas++){
            System.out.print("\n");
            for(int col=0; col < arrayA[filas].length; col++){
                arrayC[filas][col]=arrayA[filas][col]+arrayB[filas][col];
                System.out.print(arrayC[filas][col]+"\t");
            }
        }
    }

    /*7. Donades dues taules quadrades numèriques enteres de dimensió n, calcula la taula producte d'ambdues.
    El producte de les taules s'efectua assignant a cada element la contracció de la fila i la columna ocupada per ell.
    (http://ca.wikipedia.org/wiki/Multiplicaci%C3%B3_de_matrius)*/

    public static void array2D7(){
        int arrayA[][] = new int [10][10];
        int arrayB[][] = new int [10][10];
        int arrayC[][] = new int [10][10];



        //S'omple amb valor aleatoris
        for(int filas=0; filas < arrayA.length; filas++){
            for(int col=0; col < arrayA[filas].length; col++){
                arrayA[filas][col]=randomRango(1,100);
                arrayB[filas][col]=randomRango(200,400);
            }
        }

        //Observem la taula A
        for(int filas=0; filas < arrayA.length; filas++){
            System.out.println("");
            for(int col=0; col < arrayA[filas].length; col++){
                int a = arrayA[filas][col];
                System.out.print(a + " ");
            }
        }

        System.out.println();

        //Observem la taula B
        for(int filas=0; filas < arrayB.length; filas++){
            System.out.println("");
            for(int col=0; col < arrayB[filas].length; col++){
                int a = arrayB[filas][col];
                System.out.print(a + " ");
            }
        }

        //Omplo la taula C amb 1
        for(int filas=0; filas < arrayC.length; filas++){
            for(int col=0; col < arrayC.length; col++){
                arrayC[filas][col]= 1;
            }
        }



        for (int x = 0; x < arrayC.length;x++) {
            for (int y = 0; y < arrayC.length; y++) {

                int subproducte = 1;
                for (int a = 0; a < arrayA.length; a++) {
                    subproducte=subproducte*arrayA[x][a];
                }
                for (int a = 0; a <arrayB.length ; a++) {
                    subproducte = subproducte*arrayB[a][x];
                }

                arrayC[x][y]=subproducte;

            }
        }


        System.out.println();

        //Observem la taula C
        for(int filas=0; filas < arrayC.length; filas++){
            System.out.println("");
            for(int col=0; col < arrayC.length; col++){
                int a = arrayC[filas][col];
                System.out.print(a + " ");
            }
        }

    }


    /*8. Donada una taula quadrada numèrica d'enters de dimensió n, determina si és simètrica. Una taula quadrada és
    simètrica si el elements simètrics respecte de la diagonal principal són iguals.
     */

    public static void array2D8(){

        int [][]arraySimetric = {{5,6,7},{6,5,8},{7,8,5}};

        boolean esSimetrica = true;

        for (int i = 0; i < arraySimetric.length; i++) {
            for (int j = 0; j < arraySimetric.length; j++) {
                System.out.println(arraySimetric[i][j]+"-"+arraySimetric[j][i]);

                if (arraySimetric[i][j] != arraySimetric[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }

            int aux= arraySimetric[0][0];
            for (int j = 0; j < arraySimetric.length ; j++) {
                if (arraySimetric[j][j]!= aux){
                    esSimetrica = false;
                    break;
                }
            }
        }
        System.out.println(esSimetrica);


    }


    /*Problema 5) Escriu un programa anomenat Bitllets que donat un import en euros (sense cèntims)
    ens indiqui el mínim nombre de bitllets i la quantitat d'euros sobrants que es pot utilitzar per a
    obtindre-la. Els bitllets d'euro són de: 500, 200, 100, 50, 20, 10 i 5 euros.*/



    public static void bitllets(){
        System.out.println("Entra quantitat d'euros:");
        Scanner sc = new Scanner(System.in);
        int quatitat = sc.nextInt();

        int b500 = quatitat/500;
        int b200 =(quatitat%500)/200;
        int b100 =((quatitat%500)%200)/100;
        int b50 =(((quatitat%500)%200)%100)/50;
        int b20 =((((quatitat%500)%200)%100)%50)/20;
        int b10 = (((((quatitat%500)%200)%100)%50)%20)/10;


        System.out.println(b500+ " bitllets de 500€");
        System.out.println(b200+ " bitllets de 200€");
        System.out.println(b100+ " bitllets de 100€");
        System.out.println(b50+ " bitllets de 20€");
        System.out.println(b20+ " bitllets de 10€");
        System.out.println(b10+ " bitllets de 5€");

    }

    /*Codifica un programa que donats tres enters que representen hores, minuts i segons,
    sumi un segon i doni el resultat en el mateix format. (1,5 punts)*/
    public static void tresEnters(){
        Scanner sc = new Scanner(System.in);
        int hores = sc.nextInt();
        int minuts = sc.nextInt();
        int segons = sc.nextInt();

        System.out.println(hores+" "+minuts+" "+segons);

        if((segons+1) == 60){
            segons = 0;
            minuts = minuts + 1 ;
            if (minuts == 60){
                minuts= 0;
                hores = hores +1;
            }
        }else{
            segons = segons +1;
        }

        System.out.println(hores+"h "+minuts+"' "+segons+"''");

    }

    /* Problema 4) Donat un nombre en codi binari, fes un programa que n’extregui
    l’equivalent en decimal.*/

    public static void binariDecimal(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu el num binari:");
        String srt = sc.next();

        int total = Integer.parseInt(srt, 2);
        System.out.println(total);
    }


    public static void professors(){
        String [][] llista = {
                {"Juan Izquierdo","M3","DAM","2001"},
                {"Xavi Mohamed", "M3", "DAM", "2010"},
                {"Lluerna Salada","M5","DAW","1999"},
                {"Juan Izquierdo","M2","DAM","2007"},
                {"Abel Cases","M4","EPS","1998"},
                {"Juan Izquierdo","M3","DAM","2005"}};

        //Es compten els registres que coincideixen: M3 i DAM
        int num=0;

        for (int i = 0; llista.length > i; i++){

            String modul = "M3";
            String cicle = "DAM";

            //S'avalua la condició
            if(llista[i][1].equals(modul) && llista[i][2].equals(cicle)){
                num++;
            }
        }

        //Amb el num de coincidències es crea un array per posar els noms
        // dels profes. Tornem a avalua la llista però ara ho copiem a l'array nou.
        String profesM3DAM [] =  new String[num];

        //Es copien els noms al nou array fent una altra vegada la rutina...
        int z = 0;

        for (int i = 0; i < llista.length; i++){

            String modul = "M3";
            String cicle = "DAM";


            //S'avalua la condició i es copia el nom al nou array
            if(llista[i][1].equals(modul) && llista[i][2].equals(cicle)){
                profesM3DAM[z]=llista[i][0];
                z++;
            }
        }


        //Vale! Ya tenim un array amb tots els profes coincidents.
        //Anem a veure com queda la cosa
        System.out.println("Les coincidències de profes a M3 i DAM són: ");

        for(String a:profesM3DAM){
            System.out.println(a);
        }



        //Ara creem un array on apuntarem amb un enter les coincidències de tots entre tots
        //El que tingui més coincidències és el que ha fet més cursos.
        int [] repeticioNoms = new int[profesM3DAM.length];

        //Primer l'omplim amb 0;
        for(int i:repeticioNoms){
            i=0;
        }


        //Després comparem tots els elements amb tots.
        //Apuntem el valor de coincidència de
        //cada element:
        for(int i=0; i < profesM3DAM.length;i++){
            String nom = profesM3DAM[i];
            for (int x=0; x < profesM3DAM.length;x++) {
                String nom2 = profesM3DAM[x];
                if (nom2.equals(nom)) {
                    repeticioNoms[i] = repeticioNoms[i] + 1;
                }
            }
        }

        //PROFE QUE MÉS VEGADES HA FET: M3 i DAM
        //Es mostra el nom del profe que més vegades ha sortit llistat a
        //la taula de coincidències M3 i DAM.
        System.out.println("El profe que més vegades ha donat M3 de DAM es:");

        int max = 0;

        for(int i:repeticioNoms){
            if(i>max){
                max=i;
            }
        }

        //Finalment pintem el nom del "registre" amb valor "max".
        boolean sortir= false;
        for(int i=0; (i < repeticioNoms.length) && !sortir; i++){
            if(repeticioNoms[i]==max){
                System.out.println(profesM3DAM[i]);
                sortir = true;
            }
        }
        //PROFE MÉS ANTIC DE LA LLISTA
        //Agafarem la primera taula i es cerca l'any més antic
        int anyMenor = 2017;
        int any = 0;
        String sortida="";

        for(int i=0; i < llista.length; i++){
            any = Integer.parseInt(llista[i][3]);
            if(any <= anyMenor){
                anyMenor=any;
                sortida=llista[i][0];
            }
        }

        System.out.println("El profe que porta més temps és: ");
        System.out.println(sortida+ " - "+anyMenor);
    }







    public static void liniaEuros(){

        double quantitat=0;

        //Mida en mm;
        double midaMoneda= 23.25;
        double diametreTerra = 12742.;
        double distanciaTerraLluna = 384400.;

        //Pregunta quantitat
        System.out.print("Quantitat:");
        Scanner sc = new Scanner(System.in);

        //Càlcul
        quantitat = sc.nextDouble();
        quantitat = quantitat*midaMoneda;
        System.out.println("La distancia en mm es de "+ quantitat);

        //Ho passem a kilòmetres
        quantitat = quantitat/1000000;

        System.out.println("La distància en Km es de " + quantitat);

        //En comparació amb el diametre de la terra
        double nVegades = quantitat/diametreTerra;
        System.out.println("La línia donarà " + nVegades+ " voltes a la terra");

        //En comparació amb la distància de la terra amb la lluna
        nVegades = quantitat/distanciaTerraLluna;
        System.out.println("La línia d'euros és equivalent a " + nVegades+ " la distància de la terra amb la lluna");
    }

    public static void fontMonedes(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantitat:");


        Double quantitat =  sc.nextDouble();

        Double anys =(quantitat/31536000.);
        Double dies = ((quantitat%31536000.)/86400.);
        Double hores = (((quantitat%31536000.)%86400.)/3600);
        Double minuts = ((((quantitat%31536000.)%86400.)/3600)/60);
        Double segons =((((quantitat%31536000.)%86400.)/3600)%60);

        Integer anysArrodonit = anys.intValue();
        Integer diesArrodonit = dies.intValue();
        Integer horesArrodonit = hores.intValue();
        Integer minutsArrodonit = minuts.intValue();
        Integer segonsArrodonit = segons.intValue();

        System.out.println("La font estarà expulsant euros durant \n"
                + anysArrodonit + " anys \n"
                + diesArrodonit + " dies \n"
                + horesArrodonit + " hores \n"
                + minutsArrodonit + " minuts \n"
                + segonsArrodonit + " segons.");
    }

    public static void contarCaracters(){

        String frase = "cuanto peor mejor para todos y cuanto peor para todos mejor mejor para mí el suyo beneficio político";

        int contadorParaules = 0;
        for (int i=0; i < frase.length(); i++){
            if (frase.charAt(i) == ' ' &&  frase.charAt(i+1)!=' ') {
                    contadorParaules++;
            }
        }

        System.out.println(contadorParaules+1);

    }

    public static void reconstrueixFrase(String f) {

        //separa per paraules
        String[] words = f.split("\\s+");

        List<String> wordsList = Arrays.asList(words);
        Collections.shuffle(wordsList);
        for(String e: wordsList){
            System.out.print(e + " ");
        }

    }

    public static void Permutacion2 () {

        String[] elementos = "cuanto peor mejor para todos y cuanto peor para todos mejor mejor para mí el suyo beneficio político".split("\\s+");
        int n = 18;                  //Tipos para escoger
        int r = elementos.length;   //Elementos elegidos
        test.Perm2(elementos, "", n, r);
    }

    public static void Perm2(String[] elem, String act, int n, int r) {
        if (n == 0) {
            //System.out.println(act);

            FileWriter fichero = null;
            PrintWriter pw = null;

            try {
                fichero = new FileWriter("sortica.txt",true);
                pw =new PrintWriter(fichero);
                pw.print(act  +'\n');

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Nuevamente aprovechamos el finally para
                    // asegurarnos que se cierra el fichero.
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }


        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) { // Controla que no haya repeticiones
                    Perm2(elem, act + elem[i] + " ", n - 1, r);
                }
            }
        }
    }

    //Retorna un array de n llargada amb números aleatoris entre 0 i n-1 sense repetir
    public static ArrayList<Integer> randomArray(int n){

        ArrayList<Integer> llistaNum = new ArrayList<Integer>();

        for (int i=0; i < n; i++) {
            llistaNum.add(i);
        }

        Collections.shuffle(llistaNum);
        return llistaNum;
    }

    public static int randomMinMax(int a, int b){

        int n= 0;
        Random r = new Random();
        for (int i = 0 ; i <= b; i++) {
            double ii = (Math.floor(Math.random() * (b - a)) + a);
            n = ((int) ii);
        }

        return n;
    }

    public static void taulaDeMultiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica el num:" );

        int num = sc.nextInt();

        for (int i = 10; i > -1; i--){
            System.out.println(num + "x" + i + "=" + i*num);
        }
    }

    public static void llargadaFile() {
        try {
            File f = new File("arxiu.txt");
            Scanner sc = new Scanner(f);
            String mida = sc.next();
            System.out.println(mida);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public static void dibuixaTriangle() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int y = x*2;
        for(int contador= 0; contador<=(x-1); contador++) {

            for(int espacios = x - 1; espacios >=contador; espacios-- ) {
                System.out.print(" ");
            }

            for(int asteriscos= 0; asteriscos <= (1*contador + contador); asteriscos++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void veurePathiLlistaDirIFiles(){
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
            File ff = new File(path);

            File [] ll = ff.listFiles();

            for(File f: ll ){
                if(f.isFile()){
                    System.out.print("File-");
                }else{
                    System.out.print("Dir-");
                }
                System.out.println(f.getName());

            }



        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(path);
    }

    public static void veurePropietats(){
        Properties p = System.getProperties();
        p.list(System.out);

    }

    public static void veurePropietatsUsuari(){
        Properties a = System.getProperties();
        String x = a.getProperty("user.name");
        System.out.print(x);
    }
        /*int num = 0 + (int)(Math.random() * (words.length-1));
        System.out.println(words[num]);
        num = 0 + (int)(Math.random() * (words.length-1));
        System.out.println(words[num]);
        num = 0 + (int)(Math.random() * (words.length-1));
        System.out.println(words[num]); */

}
