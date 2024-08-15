package site.edee.bob.models.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Map;
import java.util.HashMap;
@Setter @Getter @AllArgsConstructor
public class GeneralResponse {
    private GeneralResponseStatus status;
    private Object message;

    public Map<String, Object> toJson(){
        Map<String, Object> map = new HashMap<>();
        map.put("status", status.name());
        map.put("message", message);
        return map;
    }
}
