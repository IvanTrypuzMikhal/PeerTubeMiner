
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
public class PeerTubeCaptionList {

    @JsonProperty("data")
    private List<PeerTubeCaption> data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("data")
    public List<PeerTubeCaption> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<PeerTubeCaption> data) {
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
