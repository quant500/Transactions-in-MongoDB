# Transactions in MongoDB

### MongoDB starten in Wsl2

In wsl2:

```wsl.exe```
```cd docker/ && podman-compose -f podman-compose.yaml up -d```

Alternativ in ```wsl.exe -d Ubuntu``` 

```cd /mnt/d/IntelliJWorkspaces/Transactions-in-MongoDB/docker/ && podman-compose -f podman-compose.yaml up -d```

### MongoDB Setup

IP-Adresse rausfinden, wo die MongoDB läuft:
```hostname -I```

172.24.62.226 172.17.0.1 <------- Diese IP-Adresse eintragen in application.properties


### MongoSh öffnen

Eine mongosh in wsl2 öffnen 
```podman exec -it mongodb mongosh -u admin -p password```

show dbs

use trading

show collections

db.trades.find();

