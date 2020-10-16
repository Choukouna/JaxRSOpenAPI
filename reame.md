Compte rendu TP2
==

Partie 1 : Servlet
===

* La partie 1 du TP2 a été inclue dans le TP1 (http:://lien github) </http::> (package servlet) <br>
* Pour le lancer au sein du TP1, on fait <em>mvn jetty:run</em> à la racine du TP1;
* La servlet de test est accessible à [hello](http://localhost:8080/hello)
* La liste des kanban [Les kanban](http://localhost:8080/c)
* La liste des users [users](http://localhost:8080/users)
* Le doPost est implémenté via le formulaire myForm.hml accessible [Formulaire de test](http://localhost:8080/myForm.html)
* Ajout d'un nouveau tableau de kanban via formulaire [Add new kanban](http://localhost:8080/ajoutTablo.html)

Partie 2 : JaxRS et OpenAPI
===

Lancement du projet
-

<p>De retour dans le dossier du TP2<p>

* on lance (ou on garde lancée) la bd du TP1;<br>
* On peuple la BD en exécutant la classe <em>GenerateDB</em> du package generic; 
* On lance maintenant la classe <em>RestServer</em>

Accès aux ressources
-

<p>
    A partir du modele, j'ai mis en place deux ressources (user et card) <br>
    L'accès aux ressources se fait via les urls suivantes : 
</p>

*   [card](http://localhost:8080/card/{idCard})
*   [user](http://localhost:8080/user/{userId})
*   via postman, on peut ajouter les ressources card [card](http://localhost:8080/card) et user [user](http://localhost:8080/user)