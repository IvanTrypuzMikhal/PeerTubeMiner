
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "captionPath",
})
@Generated("jsonschema2pojo")
public class PeerTubeCaption {

    @JsonProperty("language")
    private PeerTubeLanguage language;
    @JsonProperty("captionPath")
    private String captionPath;

    @JsonProperty("language")
    public PeerTubeLanguage getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(PeerTubeLanguage language) {
        this.language = language;
    }

    @JsonProperty("captionPath")
    public String getCaptionPath() {
        return captionPath;
    }

    @JsonProperty("captionPath")
    public void setCaptionPath(String captionPath) {
        this.captionPath = captionPath;
    }


    @Override
    public String toString() {
        return "PeerTubeCaption{" +
                "language=" + language +
                ", captionPath='" + captionPath + '\'' +
                '}';
    }
}
