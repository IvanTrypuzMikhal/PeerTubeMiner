
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.List;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "data"
})
@Generated("jsonschema2pojo")
public class PeerTubeVideos {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("data")
    private List<PeerTubeDatum> data;

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("data")
    public List<PeerTubeDatum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<PeerTubeDatum> data) {
        this.data = data;
    }

}
