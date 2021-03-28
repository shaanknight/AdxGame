# AdxGame
Building an agent to play a greatly simplified version of the most recent game, Ad
Exchange (AdX), in which agents play the role of ad networks, competing to procure
contracts (i.e., advertising campaigns) from advertisers (e.g., retailers), and then bidding in
an exchange on opportunities to exhibit those ads to Internet users as they browse the web. 

This was built for a tournament to be played among teams taking the course Introduction to Game Theory, Spring 2020 at IIIT Hyderabad.
#### Performance : Rank 2 in the tournament
### Contributors : Tanmay Kumar Sinha, Sayantan Jana, Yash Chaurasia

The description and details of the game and the tournament are mentioned in the pdf AdXGame_IGTSpring20.pdf.

We have implemented the following strategy:-

- Spending limit for each segment is divided into eight parts, depending on the distribution.
- The bid amount is 0.8 * budget/reach

First we observed that bidding 1*budget/reach is the equilibrium strategy for a single auction. But, upon trying out different strategies, we found that, in the long run, bidding 0.8 * budget/reach is the optimal strategy( assuming that multiple people bid 1).

For running the experiments we made a bunch of agents to check which gives the best performance, the set of agents built by us is put in thirtydaysgame folder .

Result :

Our agent stood second in the tournament, for checking out the game logs of the final tournament played between the agents, look into the file gamelog2 .

Brief overview of the results ( ours is ThreeAgent ) :

  Agent and corresponding	Profits made by them throughout 30 days :
- ElevenAgent 	:  4912.86 
- ThreeAgent 	:  4742.28 	
- TwoAgent 	:  3630.89 	
- SixAgent 	:  2193.82 	
- FiveAgent 	:  1911.64 	
- TenAgent 	:   992.02 	
- SevenAgent 	:   215.50 	
- agent4 	:  -717.45 	
- NineAgent 	:  -966.40 	
- agent1 	: -2059.01 	
- EightAgent 	: -3258.30
