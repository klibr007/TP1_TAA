# TP1_TAA

Dans ce premier TP, j'ai effectué les question 1, 2 et 3. On retrouve aussi la partie servlet du début du tp2.

- Toutes les classes qui devaient faire l'objet de persistance ont été marqué @Entity ainsi que les différentes annotations pour la génération automatique de l'id, 
tous les attributs ont été sauvegarder je n'ai donc pas eu à utilisé l'annotation @transcient. Dans la classe src/main/java/dao/Kanban.java on retrouve dans le 
main la partie qui permet de peupler la base données.

# COMMENT TESTER ?
Ayant utilisé hsqldb, pour tester il faudra executer dans un terminal le fichier run-hsqldb-server.sh avant de lancer dans eclipse la classe src/main/java/dao/Kanban.java.
Pour voir les résultats il faudra lancer dans un terminal le fichier show-hsqldb.sh.
