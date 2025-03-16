# Flight Planner


## Spring Boot

Projekti back-end on loodud kasutades Spring Booti kasutades keskkonda [Spring Initializr](https://start.spring.io/). 
See kasutab Gradle'it ning programmi käivitamiseks on kaasas Gradle'i *wrapper*.

Olenevalt operatsioonisüsteemist on selle käivitamiseks vaja kasutada vastavat käsku.

macOS, Linux:
~~~
> ./gradlew bootRun
~~~
Windows:
~~~
> .\gradlew.bat bootRun
~~~

Käivitunud rakendus asub üldjuhul aadressil `localhost:8080`, kuid täpse pordi numbri leiab logist.
Näide:
~~~
2025-03-16T23:24:45.680+02:00  INFO 82122 --- [Flight Planner] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
~~~


## Vue

Front-end on loodud kasutades Vue.js läbi Npm-i.
Selleks, et lehekülge käivitada, tuleb viimane esmalt arvutisse paigaldada.
Seda saab teha näiteks läbi [Node.js](https://nodejs.org/en/download).

Kui olete juurkaustas, siis on vaja minna `vue`-nimelisse kausta:
~~~
> cd vue
~~~

Selleks, et lehte käivitada, tuleb käivitada järgmised käsud:
~~~
> npm install
> npm run dev
~~~

Lehekülge saab külastada käsureal näidatud aadressi kaudu.
Üldjuhul on selleks `localhost:5173`, aga juba samal aadressil toimiva lehekülje esinemisel võib aadress erineda.


## Tööle kulunud aeg

| Kuupäev    |  Aeg   |
|:-----------|:------:|
| 13.03.2025 | 30 min |
| 14.03.2025 |   2h   |
| 15.03.2025 |   7h   |
| 16.03.2025 |   2h   |


## Mille sain valmis?

Alustasin projekti ERD-mudeli koostamisega.
Selle põhjal sain luua `Domain` kausta olemite klassid.
Jätkasin *controller*itega.

Jõudsin luua ka Vue.js lehekülje põhja.
Lehekülje põhjast ma paraku aga kaugemale ei jõudnud. 


## Kasutatud ressursid

[Mapping Requests](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)

Jakarta Persistence API dokumentatsioon:
[`ManyToOne`](https://jakarta.ee/specifications/persistence/2.2/apidocs/javax/persistence/manytoone),
[`OneToMany`](https://jakarta.ee/specifications/persistence/2.2/apidocs/javax/persistence/onetomany)