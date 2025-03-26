import java.util.*;
import java.util.Scanner;

/**
 * Allows users to "shop" for music by naming the song title and artist and their format preference and calculating the
 * price for each album/song
 */
public class MusicPlayerTester
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<MusicPlayer> usersMusic = new ArrayList<>();

        while (true)
        {
            System.out.println("Let's go shopping for music!");
            String italic = "\u001B[3m";
            String reset = "\u001B[0m";
            System.out.println(italic + "If you'd like to see your result, enter -1" + reset);
            System.out.println("Please enter the song title or enter -1 to exit: ");
            String songTitle = input.nextLine();


            //exit loop
            if (songTitle.equals("-1") || input.nextLine().equals("-1"))
            {
                break;
            }
            System.out.println("Please enter the artist's name: ");
            String artistName = input.nextLine();

            System.out.println("Do you prefer to listen to music physically or digitally?");
            String physicalVSdigital = input.nextLine();

            //IF USER SAYS THEY PREFER PHYSICAL
            if (physicalVSdigital.equals("physical") || physicalVSdigital.equals("physically"))
            {
                System.out.println("Do you have a DVD player?");
                String dvdPlayer = input.nextLine();
                if (dvdPlayer.equals("yes") || dvdPlayer.equals("Yes"))
                {
                    System.out.println("Enter the price on DVD: ");
                    double dvdPrice = input.nextDouble();
                    input.nextLine();
                    usersMusic.add(new MusicPlayer(songTitle, artistName, dvdPrice));
                }
                else if (dvdPlayer.equals("no") || dvdPlayer.equals("No"))
                {
                    System.out.println("Do you want to buy a DVD player?");
                    String buyPlayer = input.nextLine();
                    //DVD PLAYER
                    if (buyPlayer.equals("yes") ||buyPlayer.equals("Yes"))
                    {
                        System.out.println("Enter the price on DVD (as a double): ");
                        double dvdPrice = input.nextDouble();
                        input.nextLine();

                        System.out.println("Enter the DVD Player price (as a double): ");
                        double dvdPlayerPrice = input.nextDouble();
                        input.nextLine();

                        double newDvdPrice = dvdPrice += dvdPlayerPrice;
                        MusicPlayer dvdAndPlayer = new DVD(songTitle, artistName, newDvdPrice, dvdPlayer);
                        usersMusic.add(dvdAndPlayer);
                    }
                    //CASSETTE PLAYER
                    else if (buyPlayer.equals("no") ||buyPlayer.equals("No"))
                    {
                        System.out.println("Do you have a cassette player?");
                        String haveCassettePlayer = input.nextLine();
                        if(haveCassettePlayer.equals("yes") || haveCassettePlayer.equals("Yes"))
                        {
                            System.out.println("Enter the price of the Cassette tape (as a double): ");
                            double cassettePrice = input.nextDouble();
                            input.nextLine();

                            MusicPlayer cassetteOnly = new Cassette (songTitle, artistName, cassettePrice, haveCassettePlayer);
                            usersMusic.add(cassetteOnly);
                        } else if (buyPlayer.equals("no") ||buyPlayer.equals("No")) {
                            System.out.println("Do you want to buy a cassette player?");
                            String buyCassettePlayer = input.nextLine();
                            if (buyCassettePlayer.equals("yes") || buyCassettePlayer.equals("Yes"))
                            {
                                System.out.println("Enter the price of the Cassette tape (as a double): ");
                                double cassettePrice = input.nextDouble();
                                input.nextLine();
                                System.out.println("Enter the Cassette Player price (as a double): ");
                                double cassettePlayerPrice = input.nextDouble();
                                input.nextLine();
                                double newCassettePrice = cassettePrice += cassettePlayerPrice;
                                MusicPlayer cassetteANDPlayer = new Cassette (songTitle, artistName, newCassettePrice, buyCassettePlayer);
                                usersMusic.add(cassetteANDPlayer);
                            }
                            //RECORD PLAYER
                            else if (buyCassettePlayer.equals("no") ||buyCassettePlayer.equals("No"))
                            {
                                System.out.println("Do you have a record player for vinyl?");
                                String haveRecordPlayer = input.nextLine();

                                if(haveRecordPlayer.equals("yes") || haveRecordPlayer.equals("Yes"))
                                {
                                    System.out.println("Enter the price of the vinyl album (as a double): ");
                                    double vinylPrice = input.nextDouble();
                                    input.nextLine();
                                    MusicPlayer vinylOnly = new Vinyl (songTitle, artistName, vinylPrice, haveRecordPlayer);
                                    usersMusic.add(vinylOnly);
                                } else if (haveRecordPlayer.equals("no") ||haveRecordPlayer.equals("No")) {
                                    System.out.println("Do you want to buy a record player for the vinyl?");
                                    String buyRecordPlayer = input.nextLine();
                                    if (buyRecordPlayer.equals("yes") || buyRecordPlayer.equals("Yes"))
                                    {
                                        System.out.println("Enter the price of the vinyl album (as a double): ");
                                        double vinylPrice = input.nextDouble();
                                        input.nextLine();
                                        System.out.println("Enter the Record Player price (as a double): ");
                                        double recordPlayerPrice = input.nextDouble();
                                        input.nextLine();
                                        double newRecordPlayerPrice = recordPlayerPrice += recordPlayerPrice;
                                        MusicPlayer vinylANDPlayer = new Vinyl (songTitle, artistName, newRecordPlayerPrice, buyRecordPlayer);
                                        usersMusic.add(vinylANDPlayer);
                                    }
                                    else if(haveRecordPlayer.equals("no") ||haveRecordPlayer.equals("No"))
                                    {
                                        System.out.println("Then dont listen to music ¯\\_(ツ)_/¯");
                                    }

                                }
                            }

                        }
                    }

                }

            }
            //IF USER SAYS THEY PREFER DIGITAL
            else if (physicalVSdigital.equals("digitally") || physicalVSdigital.equals("digital"))
            {
                System.out.println("Do you have a specific streaming service you'd like to use? (yes or no)");
                String streamingService = input.nextLine();

                if (streamingService.equals("yes"))
                {
                    System.out.println("Please enter the name of the streaming service: ");
                    String streamingServiceName = input.nextLine();
                    System.out.println("Please enter the monthly price of the streaming service: ");
                    double monthlyPrice = input.nextDouble();

                    MusicPlayer streamingPrefered = new StreamingService (songTitle, artistName, monthlyPrice, streamingServiceName);
                    usersMusic.add(streamingPrefered);
                }
                else
                {
                    MusicPlayer randmStreaming = new StreamingService(songTitle, artistName, 10.99, "spotify");
                    usersMusic.add(randmStreaming);
                }
            }
            else {
                System.out.println("Then dont listen to music ¯\\_(ツ)_/¯");
                break;
            }

        }
        printSummary(usersMusic);
        input.close();
    }

    /**
     * Prints a summary of all the music the user selected
     * @param usersMusic
     */
    public static void printSummary (ArrayList<MusicPlayer> usersMusic)
    {
        for (MusicPlayer user : usersMusic)
        {
            System.out.println(user.toString());
        }
    }

    /*
        in while loop
        1. please enter the name of the song you'd like to play
        2. please enter the name of the artist
        3. do you prefer to listen digitally or physically?

        IF USER SAYS DIGITAL
        a. do you have a specific streaming service you'd like to use? (y/n)
            IF YES please enter the streaming service ----> prints title, name, price and the streaming service
            IF NO -----> print title, name, price, and a random streaming service (really just spotify)

        IF USER SAYS PHYSICAL
        a. do you have a DVD player? (y/n)
            IF YES -----> print title, name, price on dvd
            IF NO would you like to buy a DVD player?
                IF YES ----> print title, name, price with dvd + dvd player
                IF NO do you have a cassette player?
                     IF YES ----> print title, name, prince on cassette
                     IF NO do you want to buy a cassette player?
                        IF YES ----> print title, name, price with cassette + cassette player
                        IF NO do you have a record player for vinyl? (y/n)
                            IF YES ----> print title, name, price on vinyl
                            IF NO would you like to buy a vinyl player?
                                IF YES ----> print title, name, price on vinyl + record player
                                IF NO ----> then dont listen to music ¯\_(ツ)_/¯
         */
}
