oop.homework.funwithbullets
===========================
README pentru tema 2 la Programare Orientata pe Obiecte.

	Tema este bazata 100% pe scheletul de cod oferit ca suport.

	Modul de implementare pe care l-am ales si care functioneaza este cel cerut ca BONUS, adica daca 
avem lantul de transformari A?B?C, atunci aceasta este si ierarhia de mostenire din cadrul rezolvarii.

	Fiecare glont suprascrie doar metoda de tragere pentru ca nu se puteau ambele. Puteam face o metoda 
separata pentru fiecare clasa ce continea actiunea de desenare dar pentru 2 randuri nu isi avea rostul.

	SimpleShell este singura clasa "glont" care mosteneste direct clasa Projectile din scheletul de cod iar 
restul o motenesc fie pe ea fie o clasa care o moteneste pe ea s.a.m.d.

	Am creat o clasa pentru fiecare figura geometrica care extinde BasicShape si care desneaza figura 
reprezentativa.

	Ecranul foloseste DrawManager si creeaza matricea si o modifica.
