TP2 : Intégration Continue (CI) Android avec GitHub Actions



Auteur : Laaraj Aya

Contexte : TP2 - Mise en place d'un pipeline CI/CD automatisé.



⚙️ Configuration

Le workflow est défini dans le fichier `.github/workflows/android.yml`. Il exécute les étapes suivantes :

1\.  Checkout : Récupération du code.

2\.  Set up JDK : Configuration de l'environnement Java.

3\.  Build with Gradle : Compilation du projet.

4\.  Test : Exécution des tests unitaires.



---



&nbsp;Scénario de Test : Du Bug à la Correction



Voici la démonstration du fonctionnement du pipeline CI à travers un cycle complet de développement.



\### 1. Environnement de développement

Le projet est configuré sous Android Studio avec la gestion des versions via `libs.versions.toml`.

!\[Configuration Projet](Application\_Android.jpg)



\### 2. Détection d'erreur (CI Failure)

J'ai volontairement introduit un test qui échoue dans une nouvelle branche. GitHub Actions a immédiatement détecté l'erreur lors de la Pull Request, signalant un échec ( Failure).

!\[Echec du pipeline](Fail.png)



\### 3. Correction et Validation (CI Success)

Après avoir corrigé la logique du test et poussé le nouveau commit, le workflow s'est relancé automatiquement. Cette fois, tous les tests sont passés (Success).

!\[Succès du pipeline](Success.png)



\### 4. Fusion et Historique (Merge)

Une fois le voyant au vert, la Pull Request a pu être fusionnée ("Merged") dans la branche principale `main`. On voit ici l'historique complet : l'échec initial suivi de la correction.

!\[Vue d'ensemble Merge](Fail+success.jpg)



---



\##  Vue d'ensemble des Actions

Historique des exécutions de workflows montrant les différents états par lesquels le projet est passé.

!\[Historique Actions](Actions.jpg)

