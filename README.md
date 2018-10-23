# WildLife Tracker Java App :tiger2:

### By wesley Mbate

## Description :notebook:

The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir.
Before this proposal may be approved, they must complete an environmental impact study.
This application allows Rangers to track wildlife sightings in the area, record them and ensure the animals are isolated to a safer zone.
All with the help of a user-friendly interface and fast database.

 Here's the link to Live site :< https://dry-sands-80956.herokuapp.com/  >

### Prerequisites

 * An up-to-date browser, preferably chrome or mozilla
 * Internet connection !


### Technologies used

   * JAVA
   * Gradle
   * Spark
   * Postgres SQL
   * HTML
   * CSS & Bootstrap
   * Junit

### Installation guide :notebook:

  If you want to use this as your template, here's how to go about it:

  * Install Git on you machine
  * Maneouver to 'clone or download' button and get the link
  * --Linux Users-- open your terminal and run the 'git clone ...' command in a directory of your choice
  * --for Windows Users-- Navigate to the location you'd want the repository located, right click and select "git bash here"
  * Clone the repository
  * Upon completion, navigate to the cloned repository
  Feel free to edit the files to your prefered taste

  * Now build the Database to enable storing of created instances
  * Install Postgres SQL
  * run the following commands in your terminal

        CREATE DATABASE wildlife;

        CREATE TABLE animals (id serial PRIMARY KEY, name varchar,ranger varchar, age varchar, location varchar, health varchar, status varchar, spotted timestamp);

        CREATE TABLE sighting (id serial PRIMARY KEY, location varchar);

        CREATE DATABASE wildlife_test WITH TEMPLATE wildlife;


### BUGS
NO BUGS noted, If any are experienced contact via Email wesleymbate@gmail.com :mailbox: and the issue will be sorted.


### LICENSE
 This website is under the MIT license which can be found [HERE](LICENSE).
 Copyright (c) 2018 wesleymbate
