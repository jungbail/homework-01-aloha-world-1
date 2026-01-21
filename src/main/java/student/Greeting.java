package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {

    private int locality;

    private static String localityName;

    private static String asciiGreeting;

    private static String unicodeGreeting;

    private static String formatting;



    // for when Greeter only gets locality and  locality name arguments
    public Greeting(int locality, String localityName){
        this.locality = locality;
        this.localityName = localityName;
    }

    //for when Greeting gets locality, locality name, and ascii greeting arguments
    public Greeting(int locality, String localityName, String asciiGreeting){
        this.locality = locality;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
    }

    //for when Greeting gets locality, locality name, ascii greeting arguments, unicodeGreetings and formatting
    public Greeting(int locality, String localityName, String asciiGreeting, String unicodeGreeting, String formating){
        this.locality = locality;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatting = formatting;

    }

}
