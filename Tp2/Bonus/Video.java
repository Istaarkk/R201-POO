package streaming;
import java.util.Scanner;

class Video {
    String title;
    int duration;

    Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}

class Season {
    int seasonNumber;
    Video[] episodes;

    Season(int seasonNumber, Video[] episodes) {
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
}

class Series {
    String title;
    Season[] seasons;

    Series(String title, Season[] seasons) {
        this.title = title;
        this.seasons = seasons;
    }
}

class User {
    String username;
    String[] favoriteVideos;
    int[] videoTimestamps;

    User(String username) {
        this.username = username;
        this.favoriteVideos = new String[10]; // Ajustez la taille si nécessaire
        this.videoTimestamps = new int[10];
    }
}

class StreamingSite {
    Video[] movies;
    Series[] series;
    User[] users;

    StreamingSite() {
        this.movies = new Video[10]; // Ajustez la taille si nécessaire
        this.series = new Series[10];
        this.users = new User[10];
    }

    void displayMenu() {
        System.out.println("1. List Movies");
        System.out.println("2. List Series");
        System.out.println("3. View Favorites");
        System.out.println("4. Exit");
    }

    void listMovies() {
        System.out.println("Movies:");
        for (Video movie : movies) {
            if (movie != null) {
                System.out.println(movie.title);
            }
        }
    }

    void listSeries() {
        System.out.println("Series:");
        for (Series serie : series) {
            if (serie != null) {
                System.out.println(serie.title);
            }
        }
    }

    void viewFavorites(User user) {
        System.out.println("Favorites for user " + user.username + ":");
        for (int i = 0; i < user.favoriteVideos.length; i++) {
            if (user.favoriteVideos[i] != null) {
                System.out.println(user.favoriteVideos[i] + " - Timestamp: " + user.videoTimestamps[i]);
            }
        }
    }

    public static void main(String[] args) {
        StreamingSite streamingSite = new StreamingSite();

        // Ajouter des films
        streamingSite.movies[0] = new Video("Inception", 150);
        streamingSite.movies[1] = new Video("The Shawshank Redemption", 142);

        // Ajouter des séries avec des saisons et des épisodes
        Video[] season1Episodes = { new Video("Episode 1", 30), new Video("Episode 2", 25) };
        Season season1 = new Season(1, season1Episodes);

        Video[] season2Episodes = { new Video("Episode 1", 35), new Video("Episode 2", 28) };
        Season season2 = new Season(2, season2Episodes.clone());

        streamingSite.series[0] = new Series("Breaking Bad", new Season[]{season1, season2});

        // Ajouter un utilisateur avec des vidéos marquées
        User user = new User("john_doe");
        user.favoriteVideos[0] = "Inception";
        user.videoTimestamps[0] = 10;
        user.favoriteVideos[1] = "Episode 1";
        user.videoTimestamps[1] = 5;
        streamingSite.users[0] = user;

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            streamingSite.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    streamingSite.listMovies();
                    break;
                case 2:
                    streamingSite.listSeries();
                    break;
                case 3:
                    streamingSite.viewFavorites(user);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
