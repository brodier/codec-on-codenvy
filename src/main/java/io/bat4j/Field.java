package io.bat4j;

import java.util.List;

public interface Field {
    
    public String getName();
        
    public List<Field> getFieldsList(String path);
    public int getInt(String path);
    public long getLong(String path);
    
}

