Dans ce projet de microservices, nous avons développé quatre modules distincts pour gérer différentes fonctionnalités de manière modulaire et évolutive :

- **product-service** : responsable de la gestion des produits, permettant aux utilisateurs d'ajouter, de lister des produits dans le système.
  
- **inventory-service** : gère les niveaux de stock des produits, garantissant que les produits sont disponibles lorsque les clients en ont besoin.
  
- **order-service** : gère le processus de commande, y compris la création de nouvelles commandes, la gestion des paiements et la mise à jour de l'état des commandes.
  
- **notification-service** : chargé de la communication avec les clients, en envoyant des notifications de confirmation de commande, des rappels de paiement et d'autres notifications pertinentes tout au long du processus d'achat.

Chaque module est conçu pour être autonome, ce qui permet une évolutivité horizontale facile et une maintenance indépendante, tout en offrant une intégration transparente avec les autres modules du système. Ce découpage en microservices favorise la modularité, la flexibilité et la scalabilité du système dans son ensemble.
