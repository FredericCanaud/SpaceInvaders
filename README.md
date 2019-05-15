# Space Invaders
CANAUD Frédéric
Groupe G3B

Département Informatique -
Année scolaire 2018/2019

# Rapport n°1
 
## Sommaire

	Introduction
	Séance n°1 : Déplacer un vaisseau dans l'espace de jeu (finià
	Séance n°2  : Dimensionner le vaisseau
	Conclusion
	Glossaire
	Annexe
 
## Introduction

Durant cette première séance, nous allons définir le vaisseau, ainsi que ses déplacements dans l'espace de jeu. lE


 
# Séance n°1 
(réalisée le 07/05/2000) par Frédéric CANAUD

Objectif de la séance : Déplacer un vaisseau dans l'espace de jeu (fini)

Nombre de fonctionnalités implémentées durant la séance : 1

Description du travail réalisé durant cette séance :

## Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (fini)

➢	Story n°1 : Créer un espace de jeu : 
○	Un espace de jeu est créé aux dimensions données (2D) 
○	Cet espace de jeu est vide


➢	Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu : 
○	Un nouveau vaisseau est créé
○	Le vaisseau est positionné aux coordonnées transmises
○	Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
 Contraintes :
■	La position souhaitée est transmise par ses coordonnées x et y.
■	Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)
■	La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    


➢	Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu
○	Le vaisseau se déplace d'un pas vers la droite 
○	Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).


➢	Story n°4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu
○	Le vaisseau se déplace d'un pas vers la gauche 
○	Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

Remarque : Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

### Fonctionnalité en cours d’implémentation 

Aucune 

###Diagramme de classes (séance n°1) 

![alt text](http://image.noelshack.com/fichiers/2019/19/2/1557225921-diagramme-classes.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/19/2/1557225305-nuage-de-mots-1.png)
 
### Difficultés rencontrées pendant la séance n°1
Aucune difficulté particulière …

### Remarques et commentaires sur la séance n°1

### Conclusion

J'ai donc réussi à générer le vaisseau du joueur, et à pouvoir le faire bouger de droite à gauche en délimitant l'espace de jeu pour ne pas qu'il quitte celui-ci.

### Glossaire

Vaisseau :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

Envahisseur  :  ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.

Missile :  projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.
 
### Annexe : Contenu du fichier JavaBlacklist.txt utilisé 

Pour la génération des nuages de mots via Source Code Word Cloud Generator

abstract
assert
boolean
break
byte
case
catch
char
class
const
continue
default
do
double
else
enum
extends
final
finally
float
for
goto
if
implements
import
instanceof
int
interface
long
native
new
package
private
protected
public
return
short
static
strictfp
super
switch
synchronized
this
throw
throws
transient
try
void
volatile
while
true
false
null
SuppressWarnings

---
---
---
---
---
# Séance n°2
 
(réalisée le 05/05/2019) par Frédéric CANAUD

Objectif de la séance : Dimmensionner le vaisseau dans l'espace de jeu + Moteur de jeu (fini)

Nombre de fonctionnalités implémentées durant la séance : 1 (+ Moteur Graphique)

Description du travail réalisé durant cette séance :

## Fonctionnalité n°2 : Dimenssionner un nouveau vaisseau (fini)

➢	Story n°1 : Positionner un nouveau vaisseau avec une dimension donnée 
○	Un nouveau vaisseau avec des dimensions (largeur et hauteur) est correctement positionné dans l'esapce de jeu

➢	Story n°2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu : 
○	Un nouveau vaisseau est positionné dans l'espace de jeu mais sa dimension déborde de l'espace.
○	On lève alors une exception 

➢	Story n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension
○	Le vaisseau se déplace horizontalement vers la droite dans l'espace de jeu.
○	Le vaisseau reste immobile s'il est au bord de l'espace de jeu.

○	Le vaisseau se déplace horizontalement vers lagauche dans l'espace de jeu.
○	Le vaisseau reste immobile s'il est au bord de l'espace de jeu.

### Fonctionnalité en cours d’implémentation 

Aucune 

###Diagramme de classes (séance n°2) 

![alt text](http://image.noelshack.com/fichiers/2019/20/3/1557928360-diagramme-classes-2.png)

### Nuage de mots du projet spaceinvaders (séance n°2)  

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/20/3/1557928372-nuage-de-mots-2.png)
 
### Difficultés rencontrées pendant la séance n°2
Aucune difficulté particulière …

### Remarques et commentaires sur la séance n°2
Aucune difficulté particulière …

### Conclusion

J'ai donc réussi à dimensionner correctement mon vaisseau, et à pouvoir le déplacer sur l'écran.

### Glossaire

Vaisseau :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

Envahisseur  :  ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.

Missile :  projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.
 
### Annexe : Contenu du fichier JavaBlacklist.txt utilisé 

Pour la génération des nuages de mots via Source Code Word Cloud Generator

abstract
assert
boolean
break
byte
case
catch
char
class
const
continue
default
do
double
else
enum
extends
final
finally
float
for
goto
if
implements
import
instanceof
int
interface
long
native
new
package
private
protected
public
return
short
static
strictfp
super
switch
synchronized
this
throw
throws
transient
try
void
volatile
while
true
false
null
SuppressWarnings