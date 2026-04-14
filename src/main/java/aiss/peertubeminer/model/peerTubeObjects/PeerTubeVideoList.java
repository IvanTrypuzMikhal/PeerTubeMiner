
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.List;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
})
@Generated("jsonschema2pojo")
public class PeerTubeVideoList {

    @JsonProperty("data")
    private List<PeerTubeVideo> data;

    @JsonProperty("data")
    public List<PeerTubeVideo> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<PeerTubeVideo> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PeerTubeVideoList{" +
                "data=" + data +
                '}';
    }
}
