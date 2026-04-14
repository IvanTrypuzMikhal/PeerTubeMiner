
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
})
@Generated("jsonschema2pojo")
public class CaptionList {

    @JsonProperty("data")
    private List<Caption> data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("data")
    public List<Caption> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Caption> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PeerTubeCaptions{" +
                ", data=" + data +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
