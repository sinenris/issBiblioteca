# issBiblioteca
BIBLIOTECA 
1.  O biblioteca ofera abonatilor sai o lista de carti ce pot fi imprumutate. 
2.  Pentru un abonat, se retin în sistem informații legate de nume, adresa, username, parola, varsta.
3.  Pentru o carte, se retin in sistem informatii legate de: titlu, autor, nr pagini, anul aparitiei, rating (1-5).
4.  Pentru un bibliotecar, se retin in sistem informatii legate de: username, pw, nume.
5.  Pentru un request, se retin informatii despre id-ul cartii si al abonatului, starea(reading/pending/accepted), rating.
6.  Fiecare carte poate exista în unul sau mai multe exemplare, identificate prin coduri unice. 
7.  Biblioteca are mai multe terminale, de unde abonatii pot sa imprumute carti. 
8.  Pentru a putea folosi un terminal, un abonat trebuie să se autentifice (folosing username&pw).
9.  Dupa autentificare, acesta vede lista exemplarelor disponibile în acel moment si poate imprumuta unul sau mai multe. 
10.  Pentru restituirea cartilor, exista un singur punct de lucru, deservit de un bibliotecar. Dupa fiecare împrumut/restituire, toți utilizatorii terminalelor bibliotecii văd lista actualizata a cartilor disponibile. (Utilizatorul va avea o lista a cartilor detinute, selecteaza cartea pe care doreste sa o returneze pt a trimite bibliotecarului o cerere de returnare. Odata ce bibliotecarul o accepta, cartea este returnata.)
11.  Book rating: la returnare, un utilizator trebuie sa ofere cartii unui rating (1-5 stele). Fiecare carte va avea asignat un rating.
