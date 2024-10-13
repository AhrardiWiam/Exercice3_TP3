# Exercic3_TP3 : Gestion des Projets

## Outils Utilisés
- **Java 8** : Langage de programmation utilisé pour le développement de l'application.
- **Hibernate** : Framework ORM pour la gestion de la persistance des données.
- **NetBeans** : IDE utilisé pour le développement du projet.
- **MySQL** : Base de données relationnelle utilisée pour stocker les informations.


## Structure du Projet
Le projet est organisé en plusieurs packages, avec une séparation claire entre les couches de persistance, de service et de configuration.
![image](https://github.com/user-attachments/assets/1d00e10e-0ee5-4a10-a8ed-f34e33d98528)

### Package : `ma.projet.classes` : Contient les classes entités représentant les objets du domaine :
- `Projet` : Représente un projet avec des attributs tels que l'ID, le nom, la date de début, etc.
- `Tache` : Représente une tâche avec des attributs comme l'ID, le nom, la date de début réelle, la date de fin réelle, etc.
- `Employe` : Représente un employé avec des attributs tels que l'ID, le nom, etc.
- `EmployeTache` : Classe associant un employé à une tâche spécifique.

### Package : `ma.projet.config`
- `hibernate.cfg.xml` : Fichier XML configurant les paramètres de connexion à la base de données, les propriétés de Hibernate et les mappings des entités.

### Package : `ma.projet.util`
- `HibernateUtil` : Classe utilitaire pour gérer la session Hibernate et la configuration.

### Package : `ma.projet.dao`
- `IDao<T>` : Interface générique définissant les méthodes CRUD de base.

### Package : `ma.projet.service`: Contient les classes de service qui implémentent les méthodes spécifiques pour gérer les entités :
- `ProjetService` : Gère les opérations liées aux projets.
- `TacheService` : Gère les opérations liées aux tâches.
- `EmployeService` : Gère les opérations liées aux employés.
- `EmployeTacheService` : Gère l'association entre les employés et les tâches.

## Vue relationnelle entre les différentes entités dans la base de données
![image](https://github.com/user-attachments/assets/577f2573-d1ea-4fcb-b91b-562a245c41e7)


## Fonctionnalités 
Liste des principales méthodes définies dans les classes de service :

-  Affiche la liste des tâches réalisées par un employé.
-  Affiche la liste des projets gérés par un employé.
-  Affiche la liste des tâches planifiées pour un projet.
-  Affiche la liste des tâches réalisées dans un projet donné.
-  Affiche la liste des tâches dont le prix est supérieur à 1000 DH .
-  Affiche la liste des tâches réalisées entre deux dates données.

