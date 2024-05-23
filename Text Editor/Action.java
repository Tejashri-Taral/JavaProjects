package action;

import java.time.*;


public class Action {
    private int actionId;
    private LocalDateTime localDateTime;
    private boolean isAddition;
    private int lineNumber;
    private String text;

    public Action(int actionId,LocalDateTime localDateTime,boolean isAddition,int lineNumber,String text) {
        this.actionId=actionId;
        this.localDateTime=localDateTime;
        this.isAddition=isAddition;
        this.lineNumber=lineNumber;
        this.text=text;
    }

    public int getActionId() {
        return this.actionId;
    }

    public LocalDateTime getLocalDateTime()  {
        return this.localDateTime;
    }

    public boolean getIsAddition() {
        return this.isAddition;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public String getText() {
        return this.text;
    }


}
