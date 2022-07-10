package service;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProcessContext {

    //Recebe qualquer coisa como argumento
    //Repassa para o proximo passo
    private Map<String, Object> context;

    //salva o resultado que pode ser qualquer coisa
    //sera subtituido pelo resultado do proximo processo.
    private Object proceResult;

    public ProcessContext() {
        context = new LinkedHashMap<String, Object>();
    }

    public Object get(String key) throws Exception {
        return context.get(key);
    }

    public Object put(String key, Object value) {
        return context.put(key, value);
    }

    public Object remove(String key) {
        return context.remove(key);
    }

    public void resete() {
        context = new LinkedHashMap<String, Object>();
        proceResult = null;
    }

    public void addProcessResult(Object result) {
        this.proceResult = null;
    }

    public Object getProcessResult() {
        return proceResult;
    }


}
