package commands;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// аннотация
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public // цель
@interface AppBotCommand {
    String name();
    String description(); // для того, чтобы писать в хелпи что будет делать эта команда
    boolean showInHelp() default false;
    boolean showInKeyboard() default false;

}
