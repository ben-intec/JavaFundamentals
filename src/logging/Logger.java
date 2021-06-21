package logging;

public class Logger {

    private static final byte ERROR_LEVEL = 0;
    private static final byte CRITICAL_LEVEL = 1;
    private static final byte WARNING_LEVEL = 2;
    private static final byte INFO_LEVEL = 3;
    private static final byte DEBUG_LEVEL = 4;
    private static final byte VERBOSE_LEVEL = 5;

    private int loggingLevel = 0;
    
    private LogWriter writer;

    public Logger(int loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public void error(String message) {
        if(loggingLevel > ERROR_LEVEL) writer.write("ERROR: " + message);
    }

    public void critical(String message) {
        if(loggingLevel > CRITICAL_LEVEL) writer.write("CRITICAL: " + message);
    }

    public void warn(String message) {
        if(loggingLevel > WARNING_LEVEL) writer.write("WARNING: " + message);
    }

    public void info(String message) {
        if(loggingLevel > INFO_LEVEL) writer.write("INFO: " + message);
    }

    public void debug(String message) {
        if(loggingLevel > DEBUG_LEVEL) writer.write("DEBUG: " + message);
    }

    public void verbose(String message) {
        if(loggingLevel > VERBOSE_LEVEL) writer.write("VERBOSE: " + message);
    }

}
