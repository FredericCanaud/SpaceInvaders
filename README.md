# Space Invaders <br/>

CANAUD Frédéric
Groupe G3B

Département Informatique -
Année scolaire 2018/2019

# Rapport n°1
 
## Sommaire

	Introduction
	Séance n°1 : Déplacer un vaisseau dans l'espace de jeu (finià
	Séance n°2 : Dimensionner le vaisseau
	Séance n°3 : Régler vitesse vaisseau + Tirer un missile depuis vaisseau
	Conclusion
	Glossaire
	Annexe
 
 
# Séance n°1 <br/>

(réalisée le 07/05/2019) par Frédéric CANAUD

Objectif de la séance : Déplacer un vaisseau dans l'espace de jeu (fini)

Nombre de fonctionnalités implémentées durant la séance : 1

Description du travail réalisé durant cette séance :

## Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (fini)

➢	Story n°1 : Créer un espace de jeu : <br/>
○	Un espace de jeu est créé aux dimensions données (2D) <br/>
○	Cet espace de jeu est vide


➢	Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu : <br/>
○	Un nouveau vaisseau est créé<br/>
○	Le vaisseau est positionné aux coordonnées transmises<br/>
○	Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.<br/>
 Contraintes :<br/>
■	La position souhaitée est transmise par ses coordonnées x et y.<br/>
■	Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)<br/>
■	La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    


➢	Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu<br/>
○	Le vaisseau se déplace d'un pas vers la droite <br/>
○	Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).


➢	Story n°4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu<br/>
○	Le vaisseau se déplace d'un pas vers la gauche <br/>
○	Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).<br/>

Remarque : Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

### Diagramme de classes (séance n°1) 

![alt text](http://image.noelshack.com/fichiers/2019/19/2/1557225921-diagramme-classes.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/19/2/1557225305-nuage-de-mots-1.png)

---

# Séance n°2
 
(réalisée le 14/05/2019) par Frédéric CANAUD

Objectif de la séance : Dimmensionner le vaisseau dans l'espace de jeu + Moteur de jeu (fini)

Nombre de fonctionnalités implémentées durant la séance : 1 (+ Moteur Graphique)

Description du travail réalisé durant cette séance :

## Fonctionnalité n°2 : Dimensionner un nouveau vaisseau (fini)

➢	Story n°1 : Positionner un nouveau vaisseau avec une dimension donnée <br/>
○	Un nouveau vaisseau avec des dimensions (largeur et hauteur) est correctement positionné dans l'esapce de jeu

➢	Story n°2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu <br/>
○	Un nouveau vaisseau est positionné dans l'espace de jeu mais sa dimension déborde de l'espace. <br/>
○	On lève alors une exception 

➢	Story n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension <br/>
○	Le vaisseau se déplace horizontalement vers la droite dans l'espace de jeu. <br/>
○	Le vaisseau reste immobile s'il est au bord de l'espace de jeu.

○	Le vaisseau se déplace horizontalement vers lagauche dans l'espace de jeu. <br/>
○	Le vaisseau reste immobile s'il est au bord de l'espace de jeu.


### Diagramme de classes (séance n°2) 

![alt text](http://image.noelshack.com/fichiers/2019/20/3/1557928360-diagramme-classes-2.png)

### Nuage de mots du projet spaceinvaders (séance n°2)  

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/20/3/1557928372-nuage-de-mots-2.png)

---

# Séance n°3
 
(réalisée le 21/05/2019) par Frédéric CANAUD

Objectif de la séance : Fonctionnalité n°3 + Fonctionnalité n°4 (finies)

Nombre de fonctionnalités implémentées durant la séance : 2

Description du travail réalisé durant cette séance :

## Fonctionnalité n°3 : Choisir la vitesse du vaisseau

➢	Story n°1 : Ajouter la vitesse au visseau
○	Un nouvel attribut vitesse est créé (entier)
○	Les méthodes de déplacement prennent en compte cette valeur

➢	Story n°2 : Régler la vitesse du vaisseau 
○	Mise en place des constructeurs, appelant ou pas cette valeur

➢	Story n°3 : Régler correctement les déplacements avec vitesse
○	Déplacement à droite et cas limites
○	Déplacement à gauche et cas limites

### Diagramme de classes (séance n°3) 

![alt text](http://image.noelshack.com/fichiers/2019/21/2/1558446377-diagrammef3.png)

### Nuage de mots du projet spaceinvaders (séance n°3)  

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/21/2/1558446378-nuagef3.png)

---

## Fonctionnalité n°4 : Tirer un missile depuis le vaisseau

➢	Préparatifs de refactoring <br/>
○	Création d'une classe mère (Sprite) pour envelopper Missile et Vaisseau

➢	Story n°1 : Test pour tirer un missile  <br/>
○	Mise en place d'un test pour tirer un missile depuis un vaisseau, qui échoue <br/>
○	Mise en place de méthodes pour tirer un missile, et acceptation du test

➢	Story n°2 : Position du missile </br>
○	Réflexion sur la position du missile sur le vaisseau, puis sur l'espace de jeu
○	Mise en place d'une classe VaisseauTest pour différencier des tests de jeu

➢	Story n°3 : Paramétrage des commandes de jeu et de l'affichage du missile <br/>
○	Paramètrage des commandes de jeu <br/>
○	Dessin du missile dans l'espace de jeu

➢	Story n°4 : Déplacer le missile de manière autonome </br>
○	Mise en place d'une classe Direction pour se débarasser des soucis d'orientation d'axes (ordonnées inversées) <br/>
○	Gestion du déplacement du missile <br/>
o	Gestion de la disparition du missile en haut de l'écran <br/>
o	Gestion de la vitesse du missile

### Diagramme de classes (séance n°4) 

![alt text](http://image.noelshack.com/fichiers/2019/21/2/1558446377-diagrammef4.png)

### Nuage de mots du projet spaceinvaders (séance n°4)  

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/21/2/1558446378-nuagef4.png)
 
---

## Fonctionnalité n°5 : Ajouter un envahisseur

➢	Préparatifs de refactoring <br/>
○	Création d'une classe mère (Character) pour envelopper Envahisseur et Vaisseau. Elle permettra par la suite une simplification des méthodes

➢	Story n°1 : Positionner un nouveau envahisseur dans l’espace de jeu : <br/>
○	Un nouvel envahisseur est créé<br/>
○	L'envahisseur est positionné aux coordonnées transmises<br/>
○	Si un nouvel envahisseur essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.<br/>
 Contraintes :<br/>
■	La position souhaitée est transmise par ses coordonnées x et y.<br/>
■	Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)<br/>  


➢	Story n°3 : Déplacer le vaisseau dans l'espace de jeu<br/>
○	On effectue des tests de déplacements en fonction de la direction
○	On écrit des méthodes semblables à celles des autres sprites pour pouvoir déplacer l'envahisseur


### Diagramme de classes (séance n°5) 

![alt text](http://image.noelshack.com/fichiers/2019/21/2/1558446377-diagramme-5.png)

### Nuage de mots du projet spaceinvaders (séance n°5)  

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/21/2/1558446377-nuage-de-mots-5.png)

---

## Fonctionnalité n°6 : Détecter une collision entre deux sprites

○	Un système de collision entre les sprites est mis en place : <br/> <br/>

■	Character touché à droite : Si abscisse à droite du missile > abscisse à gauche du personnage et si abscisse à gauche du missile < abscisse à droite du personnage <br/>
■	Character touché à gauche : Si abscisse à droite du missile < abscisse à gauche du personnage et si abscisse à gauche du missile < abscisse à droite du personnage <br/>
■	Character touché en haut : Si ordonnée en bas du missile > ordonnée en haut du personnage et si ordonnée en haut du missile < ordonnée en bas du personnage <br/>
■	Character touché en bas : Si ordonnée en bas du missile > ordonnée en haut du personnage et si ordonnée en haut du missile > ordonnée en bas du personnage <br/> <br/>

Il suffit ensuite de combiner ces méthodes (une ordonnee et une abscisse touchée) pour détecter une collision. </br>

○	6 tests sont mis en place dans une classe CollisionTest afin de valider nos méthodes : <br/> <br/>

■	Cas où character touché à droite <br/>
■	Cas où character touché à gauche <br/>
■	Cas où character touché en haut <br/>
■	Cas où character touché en bas <br/>
■	Cas où la méthode détecterCollision renvoie vrai <br/>
■	Cas où la méthode détecterCollision renvoie faux <br/> <br/>

○	Modification de la méthode évoluer, qui fait disparaître deux sprites lors d'une collision. <br/> <br/>

---

### Fonctionnalité n°7 : Terminer le jeu

○	Suite au système de collision, un système de fin de jeu est mis en place :

■	Si l'ennemi vient à disparaître, le jeu rend la méthode êtreFini vrai, et un message de fin est renvoyé au joueur. <br/>

### Diagramme de classes (Fonctionnalité 6 et 7) 

![alt text](http://image.noelshack.com/fichiers/2019/22/2/1559023119-diagramme-classes-6-7.png)

### Nuage de mots du projet spaceinvaders (Fonctionnalité 6 et 7) 

(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)
 
![alt text](http://image.noelshack.com/fichiers/2019/22/2/1559023120-nuage-6-7.png)
 

### Glossaire

Vaisseau :  Véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

Envahisseur  :  Ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.

Missile :  Projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

Vitesse : valeur pour laquelle un objet se déplace proportionnellement dans l'espace.
 
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