package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoonWoods = 3;
		int racoonHome = 2;
		int racoonsLeft = racoonWoods - racoonHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int howManyBees = numberOfFlowers - numberOfBees;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int numberOfPigeons = lonelyPigeon + anotherPigeon;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsJoined = 2;
		int numberOfOwls = owlsOnFence + owlsJoined;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int beaversStillWorking = beaversWorking - beaversSwimming;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int toucansJoining = 1;
		int numberOfToucans = toucansSitting + toucansJoining;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int numberOfNuts = 2;
		int differenceInSquirrels = squirrelsInTree - numberOfNuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int numOfQuarters = 1;
		int numOfDime = 1;
		int numOfNickels = 2;
		double quarters = 0.25;
		double dimes = 0.10;
		double nickels = 0.05;
		double moneyAmount = (quarters * numOfQuarters) + (dimes * numOfDime) + (nickels * numOfNickels);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int hiltMuffinsBaked = 18;
		int macadamMuffinsBaked = 20;
		int flanneryMuffinsBaked = 17;
		int totalMuffins = hiltMuffinsBaked + macadamMuffinsBaked + flanneryMuffinsBaked;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
         */
		double yoyoCents = 0.24;
		double whistleCents = 0.14;
		double totalCents = yoyoCents + whistleCents;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnowHouse = 29;
		int inchesOfSnowSchool = 17;
		int differenceInSnow = inchesOfSnowHouse - inchesOfSnowSchool;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double totalMoney = 10.0;
		double toyTruck = 3.00;
		double pencilCase = 2.00;
		double differenceInMoney = totalMoney - toyTruck - pencilCase;


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int totalMarbles = 16;
		int lostMarbles = 7;
		int currentMarbles = totalMarbles - lostMarbles;



        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int totalShells = 19;
		int desiredShells = 25;
		int neededShells = desiredShells - totalShells;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloon = 17;
		int redBalloon = 8;
		int greenBalloon = totalBalloon - redBalloon;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int totalBooks = 38;
		int addedBooks = 10;
		int currentBooks = totalBooks + addedBooks;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numOfBees = 8;
		int beeLegs = 6;
		int howManyLegs = numOfBees * beeLegs;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costIceCream = 0.99;
		int numOfIceCream = 2;
		double cost = costIceCream * numOfIceCream;


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksDesired = 125;
		int totalRocks = 64;
		int neededRocks = rocksDesired - totalRocks;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int numMarbles = 38;
		int numlostMarbles = 15;
		int leftMarbles = numMarbles - numlostMarbles;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int distance = 78;
		int distanceDrove = 32;
		int milesLeft = distance - distanceDrove;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timeSpentMorning = 90;
		int timeSpentAfternoon = 45;
		int totalTime = timeSpentAfternoon + timeSpentMorning;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotdogsBought = 6;
		double hotdogsCost = 0.50;
		double moneyPaid = hotdogsCost * hotdogsBought;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hasMoney = 50;
		int pencilCost = 7;
		int howManyPencils = hasMoney / pencilCost;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = butterflies - orangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double amountPaid = 1.00;
		double candyCost = 0.54;
		double changeAmount = amountPaid - candyCost;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInYard = 13;
		int plantedTrees = 12;
		int totalTrees = treesInYard + plantedTrees;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int howManyDays = 2;
		int hoursInDay = 24;
		int howManyHours = howManyDays * hoursInDay;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int giveGum = 5;
		int neededGum = cousins * giveGum;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danMoney = 3.00;
		double boughtCandy = 1.00;
		double leftoverMoney = danMoney - boughtCandy;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int peopleOnBoats = 3;
		int howManyPeople = boats * peopleOnBoats;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legos = 380;
		int lostLegos = 57;
		int leftoverLegos = legos - lostLegos;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBaked = 35;
		int desiredMuffins = 83;
		int neededMuffins = desiredMuffins - muffinsBaked;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int differenceInCrayons = willyCrayons - lucyCrayons;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pages = 22;
		int totalStickers = stickersPerPage * pages;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100;
		double children = 8;
		double cupcakesDivided = cupcakes / children;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int gingerbreadInJar = 6;
		int cookiesNotInJar = gingerbreadCookies % gingerbreadInJar;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int preparedCroissants = 59;
		int numberOfNeighbors = 8;
		int receiveEqualNum = 59 % 8;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealcookies = 276;
		int cookiePerTray = 12;
		int traysNeeded = oatmealcookies / cookiePerTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
		int oneServing = 12;
		int biteSizedServings = pretzels / oneServing;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
         */
		int lemonCupcakes = 53;
		int cupcakesLeftAtHome = 2;
		int boxesOfthree = lemonCupcakes / 3;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticks = 74;
		int numPeople = 12;
		int carrotsUneaten = 74 % 12;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int bears = 98;
		int shelfCapacity = 7;
		int shelvesFilled = bears / shelfCapacity;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumCapacity = 20;
		int pictures = 480;
		int albumsNeeded = pictures / albumCapacity;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
		int boxMaximum = 8;
		int boxesFilled = tradingCards / boxMaximum;
		int unfilledBox = tradingCards % boxMaximum;


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int numOfBooks = 210;
		int numOfShelves = 10;
		int booksOnEachShelf = numOfBooks / numOfShelves;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double bakedCroissants = 17;
		double guests = 7;
		double croissantsForGuests = bakedCroissants / guests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
		double billPaintTime = 2.15;
		double jillPainttime = 1.90;
		double numOfRooms = 5;
		double billRate = 1 / billPaintTime;
		double jillRate = 1 / jillPainttime;
		double combinedRate = billRate + jillRate;
		double timeForCompletion = numOfRooms / combinedRate;
     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceBetween = 800;
		double distanceTravelled = 537;
		double distanceLeft = distanceTravelled / distanceBetween * 100;
		int percentageComplete = (int)distanceLeft;

	}

}
