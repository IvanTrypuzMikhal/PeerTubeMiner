
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
})
@Generated("jsonschema2pojo")
public class PTLanguage {

    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "PeerTubeLanguage{" +
                "id='" + id + '\'' +
                '}';
    }
}
