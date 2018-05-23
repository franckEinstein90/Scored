import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
 
class Image{
    String m_imgDescription;
    int Width; 
    int Height; 
    public Image(String imgDescription, int W, int H){
        Width = W;
        Height = H;
        m_imgDescription = imgDescription ;
    }
}
 
interface ScoreObject{
 }
 
class Note implements ScoreObject, Comparable<Note>{
    public enum Letter {C,D,E,F,G,A,B}
    public enum Duration {H,Q}
    
    private final Letter letter;
    private final Duration duration; 
    
    public Letter letter(){ return letter;}
    public Duration duration(){ return duration;}
    
    public Note(Letter letter, Duration duration){
        if (letter == null || duration == null)
            throw new NullPointerException(letter + "" + duration);
        this.letter = letter;
        this.duration = duration;
    }
    public String toString() { return letter + "" + duration; }
    public int compareTo(Note n) { return 1; }
}

class Score{
    Image imageScore;
    Note n;
    public Score(Image img){
        imageScore = img;
        n = new Note(Note.Letter.A,Note.Duration.H);
    }
    public String toString(){
        return n.toString(); 
    }
} 

 
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        Image inputImage = new Image(in.nextLine(), W, H);
        Score score = new Score(inputImage);
        System.out.println(score.toString());
    }
}
