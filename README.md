# Schwaben-Dev
HackTUM 2024 Check24 Challenge 

to build:
./mvnw package -Dpackaging=native-image

to upload (check path to local file)
rsync -avz -e "ssh -J jumper@jumphost.hackatum.check24.de" <path-to>/Schwaben_Devs/target/MotoMatch challenger@team38.hackatum.check24.de:/home/challenger/backend