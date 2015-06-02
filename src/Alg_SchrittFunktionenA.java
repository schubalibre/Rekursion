// Datei Alg_SchrittFunktionenA.java
/* ------------------------------------------------------------------------
Jede der Methoden alg00, alg01, ... repraesentiert einen Algorithmus (von
dem hier nicht verraten wird, welches algorithmische Problem er loest).
Der int-Parameter n gibt die Groesse des Problems an, das bearbeitet wird.
Es wird angenommen, dass nur Aufrufe der Methode schritt() "Zeit kosten",
und dass der Zeitbedarf aller anderen Befehle vernachlaessigt werden kann.

Zu jedem Algorithmus  void algXX(int n)  soll
eine Schrittfunktion  int  stpXX(int n)  entwickelt werden.

Die Schrittfunktion stpXX soll berechnen, wie viele Schritte (Aufrufe der
Methode schritt()) der Algorithmus algXX macht.

Beispiel: Wenn der Algorithmen-Aufruf
alg12(17)
bewirkt, dass die Methode schritt() 137 mal aufgerufen wird,
dann sollte der zugehoerige Schrittfunktionen-Aufruf
stp12(17)
als Ergebnis 137 liefern.
------------------------------------------------------------------------ */
import java.lang.reflect.Method;
import static java.lang.Math.*;

class Alg_SchrittFunktionenA { // "A" wie "Aufgabe"
   // ---------------------------------------------------------------------
   // Die Algorithmen alg00, alg01, ...
   // ---------------------------------------------------------------------
   static public void alg00(int n) {
      for (int i=1; i<=n; i++) schritt();
   } // alg00
   // ---------------------------------------------------------------------
   static public void alg01(int n) {
      for (int i=1; i<=n; i++) schritt();
      for (int i=1; i<=n; i++) schritt();
   } // alg01
   // ---------------------------------------------------------------------
   static public void alg02(int n) {
      for (int i=1; i<=n; i++) {
         for (int j=1; j<=n; j++) {
            schritt();
         }
      }
   } // alg02
   // ---------------------------------------------------------------------
   static public void alg03(int n) {
      for (int i=1; i<=n; i++) {
         for (int j=1; j<=n; j++) {
            for (int k=1; k<=n; k++) {
               schritt();
            }
         }
      }
   } // alg03
   // ---------------------------------------------------------------------
   static public void alg04(int n) {
      for (int i=1; i<=n/2; i++) {
         for (int j=1; j<=n; j++) {
            for (int k=1; k<=n/2; k++) {
               schritt();
            }
         }
      }
   } // alg04
   // ---------------------------------------------------------------------
   static public void alg05(int n) {
      for (int i=1; i<=3; i++) {
         for (int j=1; j<=n/2; j++) {
            for (int k=1; k<=4; k++) {
               schritt();
            }
         }
      }
   } // alg05
   // ---------------------------------------------------------------------
   static public void alg06(int n) {
      for (int i=1; i<=n; i++) {
         for (int j=1; j<=i; j++) {
            schritt();
         }
      }
   } // alg06
   // ---------------------------------------------------------------------
   static public void alg07(int n) {
      for (int i=1; i<=n; i++) {
         for (int j=1; j<=n; j++) {
            for (int k=1; k<=3*n; k++) {
               schritt();
            }
         }
      }

      for (int i=1; i<=5*n; i++) {
         for (int j=1; j<=n; j++) {
            schritt();
         }
      }

      for (int i=1; i<=4*n; i++) {
         schritt();
      }

      for (int i=1; i<=7; i++) {
         schritt();
      }

   } // alg07
   // ---------------------------------------------------------------------
   static public void alg08(int n) {
      for (int i=1; i<=n*n; i++) {
         for (int j=1; j<=n*n*n; j++) {
            schritt();
         }
      }
   } // alg08
   // ---------------------------------------------------------------------
   static public void alg09(int n) {
      schritt();
      if (n>1) {
         alg09(n-1);
      }
   } // alg09
   // ---------------------------------------------------------------------
   static public void alg10(int n) {
      schritt();
      if (n>1) {
         alg10(n-1);
         alg10(n-1);
      }
   } // alg10
   // ---------------------------------------------------------------------
   static public void alg11(int n) {
      schritt();
      if (n>1) {
         alg11(n-1);
         alg11(n-1);
         alg11(n-1);
      }
   } // alg11
   // ---------------------------------------------------------------------
   static public void alg12(int n) {
      schritt();
      if (n>1) {
         alg12(n-1);
         alg12(n-1);
         alg12(n-1);
         alg12(n-1);
      }
   } // alg12
   // ---------------------------------------------------------------------
   static public void alg13(int n) {
      if (n<=1) {
         schritt();
      } else {
         alg13(n-1);
         alg13(n-1);
      }
   } // alg13
   // ---------------------------------------------------------------------
   static public void alg14(int n) {
      if (n<=1) {
         schritt();
      } else {
         alg14(n-1);
         alg14(n-1);
         alg14(n-1);
      }
   } // alg14
   // ---------------------------------------------------------------------
   static public void alg15(int n) {
      schritt();
      if (n<=1) return;
      alg15(n/2);
   } // alg15
   // ---------------------------------------------------------------------
   static public void alg16(int n) {
      schritt();
      if (n<=2) return;
      alg16(n/3);
   } // alg16
   // ---------------------------------------------------------------------
   static public void alg17(int n) {
      if (n==0) return;
      if (n==1) {
         schritt();
         return;
      }

      alg17(n/2);
      alg17(n - n/2);
      for (int i=1; i<=n; i++) schritt();
   }
   // ---------------------------------------------------------------------
   // Die SchrittFunktionen stp00, stp01, ...  ("stp" wie "step")
   // der Algorithmen       alg00, alg01, ...
   // ---------------------------------------------------------------------
   static public int stp00(int n) {return n;} // MUSS ERSETZT WERDEN
   static public int stp01(int n) {return 2*n;} // MUSS ERSETZT WERDEN
   static public int stp02(int n) {return n*n;} // MUSS ERSETZT WERDEN
   static public int stp03(int n) {return n*n*n;} // MUSS ERSETZT WERDEN
   static public int stp04(int n) {return (n/2)*n*(n/2);} // MUSS ERSETZT WERDEN
   static public int stp05(int n) {return 12*(n/2);} // MUSS ERSETZT WERDEN
   static public int stp06(int n) {return (n+n*n)/2;} // MUSS ERSETZT WERDEN
   static public int stp07(int n) {return (n*n*3*n)+(5*n*n)+(4*n+7);} // MUSS ERSETZT WERDEN
   static public int stp08(int n) {return (n*n)*(n*n*n);} // MUSS ERSETZT WERDEN
   static public int stp09(int n) {return n;} // MUSS ERSETZT WERDEN
   static public int stp10(int n) {
	   if(n <=1) return 1;
	   return 2*stp10(n-1) +1;
   } // MUSS ERSETZT WERDEN
   static public int stp11(int n) {
	   if(n <=1) return 1;
	   return 3*stp11(n-1) +1;
   } // MUSS ERSETZT WERDEN
   static public int stp12(int n) {return -99;} // MUSS ERSETZT WERDEN
   static public int stp13(int n) {return -99;} // MUSS ERSETZT WERDEN
   static public int stp14(int n) {return -99;} // MUSS ERSETZT WERDEN
   static public int stp15(int n) {return -99;} // MUSS ERSETZT WERDEN
   static public int stp16(int n) {return -99;} // MUSS ERSETZT WERDEN
   static public int stp17(int n) {return -99;} // MUSS ERSETZT WERDEN
   // ---------------------------------------------------------------------
   // Eine (rekursive) Potenzfunktion ("hoch-Funktion") fuer int-Werte
   static int h(int b, int p) {
      // Liefert die Zahl "b hoch p", wenn p positiv ist.
      // Liefert sonst 1.
      if (p <= 0) return 1;
      if (p == 1) return b;
      return b * h(b, p-1);
   }
   // ---------------------------------------------------------------------
   // Eine Funktion zur Berechnung ganzzahliger Logarithmen
   // zu beliebigen Basen (die groesser als 1 sind), Version A:
   static int glA(int b, int z) {
      int erg = 1;
      while (z >= b) {
         erg++;
         z /= b;
      }
      return erg;
   }
   // ---------------------------------------------------------------------
   // Eine Funktion zur Berechnung ganzzahliger Logarithmen
   // zu beliebigen Basen (die groesser als 1 sind), Version B.
   static int glB(int b, int z) {
      return 1 + (int) floor(log(z)/log(b));
   }
   // ---------------------------------------------------------------------
   // In dieser Variablen zaehlt die Methode schritt(), wie oft sie
   // aufgerufen wurde:
   static int algSteps;

   // Die Methode schritt() zaehlt nur, wie oft sie aufgerufen wurde:
   static void schritt() {algSteps++;}
   // ---------------------------------------------------------------------
   // Der Algorithmus alg12 wird mit den Parametern 1, 2, ..., maxN[12]
   // aufgerufen. Fuer die anderen Algorithmen entsprechend.
   static int[] maxN = {
      10, 10, 10, 10, 10,
      10, 10, 10, 10, 10,
      10, 10, 10, 10, 10,
      20, 20, 65,
   };
   // ---------------------------------------------------------------------
   // Die Anzahl Schritte, die der Algorithmus alg12 tatsaechlich
   // ausfuehrt, und die Anzahl Schritte, die seine Schrittfunktion
   // stp12 voraussagt, werden verglichen. Wenn sie nicht gleich sind,
   // wird das als ein Fehler der Schrittfunktion gezaehlt.
   // Fuer die anderen Algorithmen entsprechend.
   static int anzVergleiche = 0;
   static int anzFehler     = 0;
   // ---------------------------------------------------------------------
   static void stepCount(int nr) {
      // Ruft den Algorithmus Nummer nr auf und vergleicht seine
      // tatsaechliche Schrittzahl mit der von der zugehoerigen
      // Schrittzahlfunktion vorausgesagten Schrittzahl. Gibt das
      // Ergebnis zur Standardausgabe aus.

      // Die Algorithmen   alg00, alg01, ... und ihre
      // SchrittFunktionen stp00, stp01, ... werden
      // per Reflexion aufgerufen.
      Class<?>   cob          = Alg_SchrittFunktionenA.class;
      // Alle Algorithmen haben genau 1 Parameter vom Typ int:
      Class<?>[] paramTypes   = {Integer.TYPE};
      // Name des Algorithmus:
      String     nameA        = String.format("alg%02d", nr);
      // Name der zugehoehrigen Schrittfunktion:
      String     nameS        = String.format("stp%02d", nr);
      int        stpSteps = 0;

      try {
         Method alg = cob.getMethod(nameA, paramTypes);
         Method stp = cob.getMethod(nameS, paramTypes);

         printf("--------------------------------------%n");
         printf(" N    %5s(N)   %5s(N)%n%n", nameS, nameA);

         for (int n=1; n<=maxN[nr]; n++) {
            algSteps = 0;
            alg.invoke(null, n);

            stpSteps = (int) stp.invoke(null, n);
            printf("%2d %,8d   %,8d  ", n, stpSteps, algSteps);

            anzVergleiche++;
            if (algSteps != stpSteps) {
               anzFehler++;
               printf(" <-- Fehler?");
            }
            printf("%n");
         }
      } catch (Throwable t) {
         printf("Ausnahme in Methode stepCount mit nr gleich %02d%n", nr);
         printf("%s%n", t);
      }
   }
   // ---------------------------------------------------------------------
   // Eine Methode mit einem kurzen Namen:
   static void printf(String f, Object... v) {System.out.printf(f, v);}
   // ---------------------------------------------------------------------
   static public void main(String[] sonja) {
      printf("Alg_SchrittFunktionenA: Jetzt geht es los!%n");

      // Die folgende Schleife testet die Schrittfunktionen
      // der ersten beiden Algorithmen (alg00 und alg01):
 //   for (int nr=0; nr<2; nr++) stepCount(nr);

      // Die folgende Schleife testet die Schrittfunktionen
      // ALLER Algorithmen:
      for (int nr=0; nr<maxN.length; nr++) stepCount(nr);

      printf("--------------------------------------%n");
      printf("Anzahl Vergleiche: %d, davon Fehler: %d%n",
                  anzVergleiche,        anzFehler);
      printf("--------------------------------------%n");
      printf("Alg_SchrittFunktionenA: Das war's erstmal!%n");
   } // main
   // ---------------------------------------------------------------------
} // class Alg_SchrittFunktionenA
/* ------------------------------------------------------------------------
Ausgabe (wenn alle Schrittfunktionen stp00, stp01, ...
korrekt implementiert sind):

Alg_SchrittFunktionenA: Jetzt geht es los!
--------------------------------------
 N    stp00(N)   alg00(N)

 1        1          1
 2        2          2
 3        3          3
 4        4          4
 5        5          5
 6        6          6
 7        7          7
 8        8          8
 9        9          9
10       10         10
--------------------------------------
 N    stp01(N)   alg01(N)

 1        2          2
 2        4          4
 3        6          6
 4        8          8
 5       10         10
 6       12         12
 7       14         14
 8       16         16
 9       18         18
10       20         20
--------------------------------------
 N    stp02(N)   alg02(N)

 1        1          1
 2        4          4
 3        9          9
 4       16         16
 5       25         25
 6       36         36
 7       49         49
 8       64         64
 9       81         81
10      100        100
--------------------------------------
 N    stp03(N)   alg03(N)

 1        1          1
 2        8          8
 3       27         27
 4       64         64
 5      125        125
 6      216        216
 7      343        343
 8      512        512
 9      729        729
10    1.000      1.000
--------------------------------------
 N    stp04(N)   alg04(N)

 1        0          0
 2        2          2
 3        3          3
 4       16         16
 5       20         20
 6       54         54
 7       63         63
 8      128        128
 9      144        144
10      250        250
--------------------------------------
 N    stp05(N)   alg05(N)

 1        0          0
 2       12         12
 3       12         12
 4       24         24
 5       24         24
 6       36         36
 7       36         36
 8       48         48
 9       48         48
10       60         60
--------------------------------------
 N    stp06(N)   alg06(N)

 1        1          1
 2        3          3
 3        6          6
 4       10         10
 5       15         15
 6       21         21
 7       28         28
 8       36         36
 9       45         45
10       55         55
--------------------------------------
 N    stp07(N)   alg07(N)

 1       19         19
 2       59         59
 3      145        145
 4      295        295
 5      527        527
 6      859        859
 7    1.309      1.309
 8    1.895      1.895
 9    2.635      2.635
10    3.547      3.547
--------------------------------------
 N    stp08(N)   alg08(N)

 1        1          1
 2       32         32
 3      243        243
 4    1.024      1.024
 5    3.125      3.125
 6    7.776      7.776
 7   16.807     16.807
 8   32.768     32.768
 9   59.049     59.049
10  100.000    100.000
--------------------------------------
 N    stp09(N)   alg09(N)

 1        1          1
 2        2          2
 3        3          3
 4        4          4
 5        5          5
 6        6          6
 7        7          7
 8        8          8
 9        9          9
10       10         10
--------------------------------------
 N    stp10(N)   alg10(N)

 1        1          1
 2        3          3
 3        7          7
 4       15         15
 5       31         31
 6       63         63
 7      127        127
 8      255        255
 9      511        511
10    1.023      1.023
--------------------------------------
 N    stp11(N)   alg11(N)

 1        1          1
 2        4          4
 3       13         13
 4       40         40
 5      121        121
 6      364        364
 7    1.093      1.093
 8    3.280      3.280
 9    9.841      9.841
10   29.524     29.524
--------------------------------------
 N    stp12(N)   alg12(N)

 1        1          1
 2        5          5
 3       21         21
 4       85         85
 5      341        341
 6    1.365      1.365
 7    5.461      5.461
 8   21.845     21.845
 9   87.381     87.381
10  349.525    349.525
--------------------------------------
 N    stp13(N)   alg13(N)

 1        1          1
 2        2          2
 3        4          4
 4        8          8
 5       16         16
 6       32         32
 7       64         64
 8      128        128
 9      256        256
10      512        512
--------------------------------------
 N    stp14(N)   alg14(N)

 1        1          1
 2        3          3
 3        9          9
 4       27         27
 5       81         81
 6      243        243
 7      729        729
 8    2.187      2.187
 9    6.561      6.561
10   19.683     19.683
--------------------------------------
 N    stp15(N)   alg15(N)

 1        1          1
 2        2          2
 3        2          2
 4        3          3
 5        3          3
 6        3          3
 7        3          3
 8        4          4
 9        4          4
10        4          4
11        4          4
12        4          4
13        4          4
14        4          4
15        4          4
16        5          5
17        5          5
18        5          5
19        5          5
20        5          5
21        5          5
22        5          5
23        5          5
24        5          5
25        5          5
26        5          5
27        5          5
28        5          5
29        5          5
30        5          5
--------------------------------------
 N    stp16(N)   alg16(N)

 1        1          1
 2        1          1
 3        2          2
 4        2          2
 5        2          2
 6        2          2
 7        2          2
 8        2          2
 9        3          3
10        3          3
11        3          3
12        3          3
13        3          3
14        3          3
15        3          3
16        3          3
17        3          3
18        3          3
19        3          3
20        3          3
21        3          3
22        3          3
23        3          3
24        3          3
25        3          3
26        3          3
27        4          4
28        4          4
29        4          4
30        4          4
31        4          4
32        4          4
33        4          4
34        4          4
35        4          4
36        4          4
37        4          4
38        4          4
39        4          4
40        4          4
--------------------------------------
 N    stp17(N)   alg17(N)

 1        1          1
 2        4          4
 3        8          8
 4       12         12
 5       17         17
 6       22         22
 7       27         27
 8       32         32
 9       38         38
10       44         44
11       50         50
12       56         56
13       62         62
14       68         68
15       74         74
16       80         80
17       87         87
18       94         94
19      101        101
20      108        108
21      115        115
22      122        122
23      129        129
24      136        136
25      143        143
26      150        150
27      157        157
28      164        164
29      171        171
30      178        178
31      185        185
32      192        192
33      200        200
34      208        208
35      216        216
36      224        224
37      232        232
38      240        240
39      248        248
40      256        256
41      264        264
42      272        272
43      280        280
44      288        288
45      296        296
46      304        304
47      312        312
48      320        320
49      328        328
50      336        336
51      344        344
52      352        352
53      360        360
54      368        368
55      376        376
56      384        384
57      392        392
58      400        400
59      408        408
60      416        416
61      424        424
62      432        432
63      440        440
64      448        448
65      457        457
--------------------------------------
 N    stp18(N)   alg18(N)

 1        3          3
 2        9          9
 3       18         18
 4       30         30
 5       45         45
 6       63         63
 7       84         84
 8      108        108
 9      135        135
10      165        165
--------------------------------------
 N    stp19(N)   alg19(N)

 1        4          4
 2       12         12
 3       24         24
 4       40         40
 5       60         60
 6       84         84
 7      112        112
 8      144        144
 9      180        180
10      220        220
--------------------------------------
 N    stp20(N)   alg20(N)

 1        0          0
 2        4          4
 3       12         12
 4       24         24
 5       40         40
 6       60         60
 7       84         84
 8      112        112
 9      144        144
10      180        180
--------------------------------------
Anzahl Vergleiche: 315, davon Fehler: 0
--------------------------------------
Alg_SchrittFunktionenA: Das war's erstmal!
------------------------------------------------------------------------ */