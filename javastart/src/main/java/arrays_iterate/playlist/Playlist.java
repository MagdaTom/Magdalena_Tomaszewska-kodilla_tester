package arrays_iterate.playlist;

public class Playlist {
    private static final int SECONDS_IN_HOUR = 60*60;
    private static final  int SECONDS_IN_MINUTE = 60;

    public static int playlistLength(Song ...songs){
        int totalTime= 0;
        for(Song song : songs){
            totalTime +=song.getLength();
        }
        return totalTime;

        //Metoda ta przyjmuje jako parametr coś dziwnego - parametr typu Song, ale z jakimiś trzema kropkami.
        // Nazywamy coś takiego parametrem wieloargumentowym.
        // Oznacza to tyle, że w to miejsce możemy przekazać jeden, dwa, albo dowolną liczbę obiektów typu Song,
        // a Java opakuje je w tablicę i taką tablicę przypisze do parametru songs
    }
    public static String getFormattedTime(int seconds) {
        int hours = seconds / SECONDS_IN_HOUR;
        seconds %= SECONDS_IN_HOUR;
        int minutes = seconds / SECONDS_IN_MINUTE;
        seconds %= SECONDS_IN_MINUTE;
        String hoursPart = timeToString(hours);
        String minutesPart = timeToString(minutes);
        String secondsPart = timeToString(seconds);
        return hoursPart + ":" + minutesPart + ":" + secondsPart;
    }

    private static String timeToString(int hours) {
        String time;
        if(hours == 0)
            time = "00";
        else if(hours < 10)
            time = "0" + hours;
        else
            time = Integer.toString(hours);
        return time;
    }

    public static void main(String[] args) {
        Song song1 = new Song("Ulalala", 309);
        Song song2 = new Song("Nothing else matters", 300);
        int playlistLength = Playlist.playlistLength(song1, song2);
        System.out.println(playlistLength);
        String formattedTime = Playlist.getFormattedTime(playlistLength);
        System.out.println(formattedTime);
    }

    //public static String getFormattedTime(int seconds) {
    //    Duration duration = Duration.ofSeconds(seconds);
    //    int hours = duration.toHoursPart();
    //    int minutes = duration.toMinutesPart();
    //    seconds = duration.toSecondsPart();
    //    String hoursPart = timeToString(hours);
    //    String minutesPart = timeToString(minutes);
    //    String secondsPart = timeToString(seconds);
    //    return hoursPart + ":" + minutesPart + ":" + secondsPart;
    //}
}
