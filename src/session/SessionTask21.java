package session;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SessionTask21 {
	public static void main(String[] args) throws NoSuchMethodException, ScriptException, FileNotFoundException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("resources/calci.js"));
		
		//calling functions from js file
		Invocable invocabel = (Invocable) engine;
		invocabel.invokeFunction("add",10,20);
		invocabel.invokeFunction("sub",10,20);
		invocabel.invokeFunction("mul",10,20);
		invocabel.invokeFunction("div",10,20);
	}
}
