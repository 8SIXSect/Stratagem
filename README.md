# Stratagem
A singleplayer real time strategy game where you fight evil robots

## How it works
Games are played against a computer-controlled opponent. Each player controls their own forces including where they move to, when they can attack, and who they attack. Forces are made up of unmanned, metalic robots who follow the players orders exactly and instantaneously.

### Troops

#### Recon Specialist (Scout Unit)
These troops are equipped with enhanced sensory equipment and excellent mobility capabilities allowing them to swiftly execute lightweight tasks such as gathering information about your opponent's position or using them to gang up on a small target with their poor weaponry.

#### Slashers (Anti-Tank Unit)
These troops are equipped with durable blades and short-range cannons. Both of these weapons has the potential to deal considerable damage to tank-type troops. However, due to their armaments and need-for-mobility, Slashers posses light armor.

#### Panzer (Tank-Type Unit)
These troops are equipped a deadly, medium-range cannon and rapid-firing weaponry. Panzers are also built with heavy armor; however, they suffer from a lack of mobility due to their weight.

#### Artillery (Long-Range Unit)
These troops deliver devestating blows to mediun or light armored targets from a distance but because of their excessive weaponry, they lack mobility and heavy-armor.

#### Command Base (Stationary Unit)
This singular unit can only be moved durng the **Setup Phase** of a game. Once the **Battle Phase** of the game begins, these units become immobile. They also posses extremely heavy armor and close to mid-range cannons.

### Game Phases

#### Map Generation Phase
As the player loads into the game, the map is generated. For each game, a unique, randomly-generated map is presented to the player. Each player is assigned "their half" of the map in which they can move thier troops around in during the **Setup Phase.**

In the middle of the map, 2 lines are drawn. These lines split the map up into 3 sections: _The Player's Side_, _No Man's Land_, and _The Computer's Side._

#### Setup Phase
- Lasts _60 seconds_
- Here, **Command Bases** can be moved (as well as all other troops).
- Troops are moved instantaneously during this phase.
- Troops can only be moved around on the player's own side. Players cannot move troops into **No Man's Land** or their opponent's side.

#### Battle Phase
- Ends when one of the players' **Command Bases** is destroyed.
- After _30 minutes_, both **Command Bases** will begin taking continuous damage until one of them is destroyed.
