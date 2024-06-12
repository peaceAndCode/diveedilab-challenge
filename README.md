# Java - Pet challenge

## Introduzione
Ti forniamo un backend e frontend completi con il classico esempio Pet Clinic, l’applicazione si basa su Spring e utilizza JPA (Hibernate) per interfacciarsi con il database Postgres.  
L'intento di questa challenge è quello di emulare le dinamiche possibili in un ambiente di produzione, per questo motivo dovrai tener conto dei seguenti aspetti:
- manutenibilità
- scalabilità
- robustezza
- logging

## Esercizi
### Esercizio 1
    /pets
Dovrai implementare una chiamata che restituisca tutti i pet presenti sul database, ogni pet corrisponderà a un oggetto contenente tutte le sue informazioni presenti nella tabella.

### Esercizio 2
    /pets/{petId}/diagnosis
Per ogni pet vengono restituite tutte le sue diagnosi associate, esse corrispondono a una stringa memorizzata in una tabella separata che viene legata attraverso l'id del pet.  
Come puoi vedere il codice non è ottimizzato al meglio, sapresti riscriverlo in modo che il recupero di queste diagnosi sia più performante?

### Esercizio 3
Il database sarà composto dalle seguenti entità Pet, Diagnosis. A ogni pet possono essere associate più diagnosis e per ogni diagnosis è associato il nome di un farmaco.
Sarà necessario sviluppare un endpoint che restituirà i punti vita totali per il singolo pet, essi saranno dati dall'applicazione del farmaco che a sua volta è associato a una diagnosi.  
> Esempio: Se il pet Pippo ha la diagnosi di febbre, il farmaco associato alla febbre sarà la Tachipirina e perciò i suoi punti vita verranno aumentati di +2 rispetto al suo valore iniziale.  
> - Lexitor: +4 pt  
> - Brufen: x3 pt  
> - Tachipirina: +2 pt

#### Pet 
| id | name  | age | life_points |
|----|-------|-----|-------------|
| 1  | Pippo | 7   | 10          |
#### Diagnosis
| id | pet_id | name   | farmaco |
|----|--------|--------|---------|
| 1  | 1      | febbre | brufen  |

### Esercizio 4:
Per migliorare le prestazioni dell'applicazione ti verrà chiesto di implementare un servizio di cache thread safe.  
I requisiti minimi del servizio dovranno essere i seguenti:
- inserire un nuovo record in cache
- rimuovere un record già presente
- prevedere il ttl per i singoli record
- svuotare totalmente la cache

Sarà tua discrezione su quali chiamate applicarlo e pensare a come invalidare la cache per garantire la coerenza dei dati rispetto al db.  
