package aiss.peertubeminer.model.peerTubeObjects;
import java.util.LinkedHashMap;
import java.util.List;
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
    "version",
    "title",
    "home_page_url",
    "feed_url",
    "description",
    "icon",
    "items"
})
@Generated("jsonschema2pojo")
public class Comment {

    @JsonProperty("version")
    private String version;
    @JsonProperty("title")
    private String title;
    @JsonProperty("home_page_url")
    private String homePageUrl;
    @JsonProperty("feed_url")
    private String feedUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("items")
    private List<Item> items;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("home_page_url")
    public String getHomePageUrl() {
        return homePageUrl;
    }

    @JsonProperty("home_page_url")
    public void setHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
    }

    @JsonProperty("feed_url")
    public String getFeedUrl() {
        return feedUrl;
    }

    @JsonProperty("feed_url")
    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
