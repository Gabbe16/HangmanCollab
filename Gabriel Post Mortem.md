# HangMan Post Mortem

Gabriel, 2023-01-24

## Inledning

Arbetets syfte var att göra metoder för att skapa spelet hangman. Vi delade upp arbetet som skrivit tidigare i metoder (alltså mindre delar) och sedan började vi programmera dem.

## Bakgrund

Vi har gjort olika metoder för att göra spelet

* Första metoden var att få ett slumpmässigt ord ur en lista

* Andra metoden var att dölja ordet med underscores, alltså att ta alla bokstäver från ordet och ersätta dem med underscores

* Tredje metoden var att se till att bokstaven man gissa på fanns i en lista med alfabetet. Vi gjorde därför en lista med bokstäver man kan gissa på.

* Fjärde metoden var att börja med gissnings systemet och se till att bokstaven hamnar i en sträng för dem gissade bokstäverna

* Femte metoden var att kolla om gissningen av bokstav x fanns i ordet, om det inte fanns så gör den inget annars så går den vidare

* Sjätte metoden var att ersätta underscores med rätt bokstav om den väl fanns genom att använda .replace()

* Sista metoden var att göra ett slags "gamecheck" som kollar om ordet fortfarande har underscores, om gissningar är slut eller ej och till sist om man vinner eller förlorar beroende på detta. 

## Positiva erfarenheter
Det som har gått bra är följande: 

* Att göra slumpmässigt ord

* Räkna antaler characters

* Ersätta characters med andra characters

* Skapa listor 

* IF-satser och skapa enkla metoder

Dessa grejor har gått bra eftersom det är sådana saker som jag har lärt mig och kan göra ganska bra. För att upprepa att detta ska gå bra så borde jag fortsätta lära mig mer om dessa saker.

## Negativa erfarenheter
Det som har gått mindre bra är följande:

* Gissnings systemet, mer specefikt med att skriva olika metoder som går ihop med varandra

* For och While loopar, behöver tränas mer på 

* Spara data ifrån metoder, behöver tränas mer på

För att detta ska gå bättre behöver jag arbeta mer på dessa saker. I framtida projekt vill jag vara väl förbered när jag ska använda dem här sakerna

## Sammanfattning

För att sammanfatta behöver jag lära mig mer om hur man skriver metoder som går ihop med varandra, for och while loopar och spara data ifrån metoder. Det som jag lärt mig mer om är att välja slumpmässigt ord, räkna antalet characters och ersätta dem, skapa listor och IF-satser. Även fast jag lärt mig mer av detta skulle jag inte klaga på att lära mig ännu mer.
