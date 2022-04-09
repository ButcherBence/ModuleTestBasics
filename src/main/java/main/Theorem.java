package main;

/**
 * Elméleti kérdések.
 * Mindegyik kérdésre a kérdés saját blokk kommentjén belül válaszolj!
 */
public class Theorem {

    /* Milyen primitív adattípusok léteznek a Java-ban? Sorold fel őket! - 1p
        byte ; short ; int ; long ; float ; double ; char ; boolean
     */


    /* Mi a különbség a while és a do-while ciklusok között? - 2p


        while: (előltesztelős ciklus)
        - Csak akkor fut le a  ciklusmag (body) ha az általunk megadott feltétel igaz,
        és addig fut amíg a feltétel igaz marad.
        -A while ciklus tehát először megvizsgálja, hogy a feltétel igaz-e. Ha igen, akkor lefuttatja a ciklusmagot,
        és újból kezdődik egészen addig amíg a feltétel igaz(true); ha hamis a feltétel(false), akkor a program a ciklus utáni ponton folytatódik, azaz a ciklusmag kimarad.
        -Tehát ha a feltétel már alapból hamis akkor a ciklusmag egyszer sem fog lefutni.
        - Akkor használjuk, ha nem tudjuk pontosan, hogy hányszor kell iterálnunk.

        A while ciklus szintaktikája: while (feltétel) {
                                        utasítás(ok);
                                       }

        do-while: (hátultesztelős ciklus)
        - Mivel a feltételvizsgálat a ciklusmag után áll, ezért a hátultesztelő ciklus legalább egyszer mindenképpen lefut.
        - A feltétel vizsgálata mindíg az utasításblokk lefutása után történik.
        - Akkor használjuk, ha nem tudjuk pontosan, hogy hányszor kell iterálnunk ,de egyszer mindenképp szeretnénk végrrehajtani a ciklusmagot(utasításblokkolt)

         A do-while ciklus szintaktikája:                       do {
                                                                    utasítás(ok);
                                                                   } while (feltétel);
     */


    /* Mik a tömbök? (Mire használhatóak? Mikor érdemes használni őket? Hogyan hozhatjuk létre őket?) - 3p
        - Egyszerű adatstruktúra azonos típusú elemek tárolására használhatóak.
        - Akkor érdemes használni őket ha azonos témakörű elemeket amik azonos tipússal rendelkeznek szeretnénk eltárolni.
        Pl: Ha egy 100 fős kérdőív kitöltőinek Vezetéknevét (String tömb),Keresztnevét (String tömb), születési évét (Int tömb) szeretnénk eltárolni.
        - Az üres tömb aminek csak hosszt adtunk meg, a típusára jellemző alapértelmezett értékeket tárolja, amíg mi
          magunk nem adunk hozzá elemeket.
        Létrehozni többféleképp is lehet őket:
        Pl :
        int[] array = new int[100]; (Ebben az esetben létrehozunk egy 100 hosszú tömböt, de mivel még nincs érték adva ezért az indexeken a default érték szerepel (int-nél 0))
        int[] array2 = {1,2,3,4,5}; (Ebben az esetben létrehoztunk egy 5 hosszúságú tömböt és már értékeket is adtunk az indexeknek)
        Az indexelés mindíg 0 ról kezdődik.  Az array esetében tehát: 0.index = 1 , 1.index = 2 , 2.index = 3 , 3.index = 4 , 4.index = 5.
        Kétdimenziós tömb létrehozása értékadás nélkül: Pl: int[][] array2d = [3][5]; (Ebben az esetben a tömb 3 soros és minden sor 5 elem hosszú.
        Kétdimenziós tömb létrehozása érdékadással: int[][] array2dWithValue = {{11,18}, {10,14}, {-1,6}}; (Ebben az esetben 3 sor van, az első sor elemei: 11,18  , a 2. sor elemei: 10,14
        a harmadik sor elemei -1,6)



     */

}
