package edu.source.it.lectures.lecture13.examples.patterns.behaiviour.command;

public class RemoteControl {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
