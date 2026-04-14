
package aiss.peertubeminer.model.peerTubeObjects;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "url",
    "avatars"
})

@Generated("jsonschema2pojo")
public class PTAccount {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("avatars")
    private List<PTAvatar> peerTubeAvatars;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }


    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("avatars")
    public List<PTAvatar> getAvatars() {
        return peerTubeAvatars;
    }

    @JsonProperty("avatars")
    public void setAvatars(List<PTAvatar> peerTubeAvatars) {
        this.peerTubeAvatars = peerTubeAvatars;
    }

    @Override
    public String toString() {
        return "PeerTubeAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", peerTubeAvatars=" + peerTubeAvatars +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
