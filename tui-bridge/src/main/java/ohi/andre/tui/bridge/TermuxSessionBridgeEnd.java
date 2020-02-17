package ohi.andre.tui.bridge;

/*
one instance for each session
 */
public interface TermuxSessionBridgeEnd {
    void sendBackCommand(String command);
}
