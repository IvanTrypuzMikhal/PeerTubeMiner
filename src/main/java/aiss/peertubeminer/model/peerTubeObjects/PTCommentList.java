
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
    "totalNotDeletedComments"
})
@Generated("jsonschema2pojo")
public class PTCommentList {

    @JsonProperty("data")
    private List<PTComment> data;
    @JsonProperty("totalNotDeletedComments")
    private Integer totalNotDeletedComments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("data")
    public List<PTComment> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<PTComment> data) {
        this.data = data;
    }

    @JsonProperty("totalNotDeletedComments")
    public Integer getTotalNotDeletedComments() {
        return totalNotDeletedComments;
    }

    @JsonProperty("totalNotDeletedComments")
    public void setTotalNotDeletedComments(Integer totalNotDeletedComments) {
        this.totalNotDeletedComments = totalNotDeletedComments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "PeerTubeCommentList{" +
                "data=" + data +
                ", totalNotDeletedComments=" + totalNotDeletedComments +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
