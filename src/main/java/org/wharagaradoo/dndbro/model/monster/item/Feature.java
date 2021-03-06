package org.wharagaradoo.dndbro.model.monster.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/** @author Created by Vladimir Seleznov (v.e.seleznov@gmail.com) on 2019-01-15. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Feature {

  @JsonProperty("name")
  private String name;

  @JsonProperty("entries")
  private Object[] entries;

  public String getName() {
    return name;
  }

  @Override
  public String toString() {

    return "\n**Name:** " + name + "\n" + "  **Entries:** " + Arrays.toString(entries) + "\n";
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object[] getEntries() {
    return entries;
  }

  public void setEntries(Object[] entries) {
    this.entries = entries;
  }
}
