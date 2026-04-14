
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fileUrl",
})
@Generated("jsonschema2pojo")
public class PTAvatar {

    @JsonProperty("fileUrl")
    private String fileUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();


    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

}
