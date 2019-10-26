# Pocket Cube State Generator

## What it does
Use BFS to permutate all states of a pocket cube, and store into database. 
This database can be used to solve a pocket cube, and the solution is guaranteed to be the shortest.

## Dependences
"Magic-cube" jar file -- [download link](https://github.com/hanchen-hou/MagicCube/releases/latest)

## Database Structure
Refer to: [here](https://github.com/hanchen-hou/MagicCube#database)

## Note
* The release is a database file by using sqlite drive. This db file can be opened by "DB Browser for SQLite".
* To generate and store data to harddrive needs about 45min (i5 + HDD)
* The final database for the Pocket Cube is roughly 1.6GB! Rubik's Cube needs much more spaces, probably in TB level.
