# Schwaben-Dev
HackTUM 2024 Check24 Challenge 

to build:
./mvnw package -Dpackaging=native-image


rsync -avz -e "ssh -J jumper@jumphost.hackatum.check24.de" /home/gdp09/Desktop/privat/Schwaben_Devs/target/MotoMatch-0.1.jar challenger@team38.hackatum.check24.de:/home/challenger/backend