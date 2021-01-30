
package org.chillrend.gosipnesia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpTerm_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("taxonomy")
    @Expose
    private String taxonomy;
    @SerializedName("yoast_head")
    @Expose
    private String yoastHead;
    @SerializedName("_links")
    @Expose
    private Links___ links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public String getYoastHead() {
        return yoastHead;
    }

    public void setYoastHead(String yoastHead) {
        this.yoastHead = yoastHead;
    }

    public Links___ getLinks() {
        return links;
    }

    public void setLinks(Links___ links) {
        this.links = links;
    }

}
