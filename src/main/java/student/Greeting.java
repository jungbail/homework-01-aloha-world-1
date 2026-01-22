package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc.
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */
public class Greeting {
    /** int value of locality.*/
    private final int localityID;

    /** String value of location name.*/
    private final String localityName;

    /** String greeting in ascii text.*/
    private final String asciiGreeting;

    /** String greeting in unicode.*/
    private final String unicodeGreeting;

    /** Formats string.*/
    private String formatStr;

    /** Default greeting string.*/
    private static final String DEFAULT_GREETING = "Hello";



    /** Constructor for when Greeter only gets locality and  locality name arguments.
     *
     * @param localityID number of location
     * @param localityName name of location
     *
     */
    public Greeting(int localityID, String localityName) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = DEFAULT_GREETING;
        this.unicodeGreeting = DEFAULT_GREETING;
        this.formatStr = null;
    }

    /** Constructor for when Greeting gets locality, locality name, and ascii greeting arguments.
     *
     * @param localityID number of location
     * @param localityName name of location
     * @param asciiGreeting greeting in ascii values
     *
     */
    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = asciiGreeting;
        this.formatStr = null;
    }

    /** Constructor for when Greeting gets locality, locality name, ascii greeting arguments, unicodeGreetings and formatStr.
     *
     * @param localityID number of location
     * @param localityName name of location
     * @param asciiGreeting greeting in ascii values
     * @param unicodeGreeting greeting in unicode characters
     * @param formatStr formatting for greeting
     *
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;

    }

    // accessor method that retrieves locality ID
    public int getLocalityID() { return localityID;}

    // accessor method that retrieves locality name
    public String getLocalityName() { return localityName;}

    // accessor method that retrieves ascii greeting
    public String getAsciiGreeting() { return asciiGreeting;}

    // accessor method that retrieves unicode greeting
    public String getUnicodeGreeting() { return unicodeGreeting;}

    // overload method for getFormatStr
    public String getFormatStr() { return getFormatStr(false);}

    // method used to greet user based on what formatStr is in the arguments id any
    public String getFormatStr(boolean asciiOnly) {
        if (formatStr == null) {
            return asciiGreeting + ", %s!";
        }
        String greeting;
        if (asciiOnly) {
            greeting = asciiGreeting;
        } else {
            greeting = unicodeGreeting;
        }
        return String.format(formatStr, greeting);
    }

    //toString override
    @Override
    public String toString(){
        return String.format("{localityID:%s, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}", localityID, localityName, asciiGreeting, unicodeGreeting);
    }





}
