# Activité Pratique N°2 - Spring Data JPA Hibernate

# Partie 1

## Étape 1 : Installer IntelliJ Ultimate

## Étape 2 : Créer un projet Spring Initializer
- Ajouter les dépendances : JPA, H2, Spring Web, Lombok

## Étape 3 : Créer l'entité JPA Patient

![image](https://github.com/ducloser90/TP2-SD/assets/167253342/60cc9ee3-e3ba-44e0-bf54-369a60bbf784)

## Étape 4 : Configurer l'unité de persistance dans le fichier `application.properties`

![image](https://github.com/ducloser90/TP2-SD/assets/167253342/830b337e-4f3f-4ba3-a80d-0cd7e29c6ef2)

## Étape 5 : Créer l'interface JPA Repository basée sur Spring Data

![image](https://github.com/ducloser90/TP2-SD/assets/167253342/bfc035fd-c820-4ab1-9602-494dcfce2f12)

## Étape 6 : Tester quelques opérations de gestion de patients
- Ajouter des patients
  
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/86d4b983-dbb0-4f1e-8c95-21a3aaee2956)
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/be641321-13d3-47d5-9ca3-60b2e90ea8de)

- Consulter tous les patients
  
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/338970c3-9d9d-43dd-bfae-d0cc00f865aa)
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/6278ad51-5aeb-4892-b251-23e313d9131b)

- Consulter un patient
  
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/fb405762-1225-4e63-8475-bcc9a2175ee9)
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/59d9195a-539f-4ca1-863e-6865ada6370f)

- Mettre à jour un patient
  
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/5371b3af-b458-4522-a7a9-591a72495cd0)
  
  Modification du Score:
  
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/8816077a-c3fb-4629-8d79-bfcad4fe0abc)

  Modification réussie
  
  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/9c4c3e1a-1d4a-45ca-867a-9e851ecc83bc)

- Supprimer un patient

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/9c4c3e1a-1d4a-45ca-867a-9e851ecc83bc)

  Suppression

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/179c8b9c-bb07-4893-8bec-8ae081b2256d)

  Suppression réussie

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/0450138e-7621-4891-8b9b-18c6e8ad67e5)


## Étape 7 : Migrer de H2 Database vers MySQL

- Demarrer MysQL

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/79a3d433-37ad-4fa5-b86b-e36fccc70023)

- Changer la dependance

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/82f958ff-99df-453b-90c9-537aec75bdf3)

- Modifier le fichier application.properties

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/380fe0b9-817f-473c-97b3-73daa6b0eb78)

- Migration réussie

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/baccaa5e-40ea-4d60-b2fd-40615d4b50d3)

# One To Many & One To One Cases

- Creation des entites Jpa Patient, Médecin, rendez-vous et consultation:

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/d8aa89ba-29ab-4fb1-ad55-78728dd6cef5)

- Creation des interfaces repositories

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/29277122-91f0-40af-8bc8-1e7d296bf582)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/bfc642ac-8401-4e23-8f0c-4c3677d57e38)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/7d708e06-3d29-426d-83f8-6ec7e17d1ec0)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/3adc8dc9-a720-4d98-981a-42f0cae99cf1)

- Les tests :

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/87199f98-d255-4c43-8ef2-16a8e5aa5aef)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/3dab7b4c-a0fe-45fa-99b3-45be9b8c56b7)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/20a7a9f2-32ab-4e3a-bb6b-179a095ba12a)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/5b155eec-b0bd-4e5e-a0e6-2b08b93e1908)

- Partie Web sous forme de Json

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/3747ff8f-45cc-404a-9579-4356bb19bb02)

# Many To Many Case

- Creation des entites

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/b23c6ff5-7dc0-4c76-9c22-52fdeff1b216)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/4bd75114-e3b5-4dca-bb41-154cf0156ba0)

- Creation des interfaces

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/1a1c2109-b650-478d-a5f6-6f95973924f9)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/2ab48bc3-9296-42b3-995f-96b738397649)

- Les tests

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/a384b6c3-72c2-469d-a83c-2c2b2c25079d)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/0161e797-6fc3-4e63-8a02-a032ee25dd36)

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/13d2fb8b-5d01-4feb-a8a5-dd7e1f917994)

- Parie Web sous forme de Json

  ![image](https://github.com/ducloser90/TP2-SD/assets/167253342/969de690-f6a2-45c3-b9f1-d90f72a606fc)



















  




