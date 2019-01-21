package org.wharagaradoo.dndbro.model.monster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.wharagaradoo.dndbro.model.monster.item.*;

/** @author Created by Vladimir Seleznov (v.e.seleznov@gmail.com) on 2019-01-11. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Monster {

  @JsonProperty("name")
  private String name;

  @JsonProperty("size")
  private String size;

  @JsonProperty("type")
  private String type;

  @JsonProperty("source")
  private String source;

  @JsonProperty("alignment")
  private String[] alignments;

  @JsonProperty("ac")
  private Ac[] acs;

  @JsonProperty("hp")
  private Hp hp;

  @JsonProperty("str")
  private int str;

  @JsonProperty("dex")
  private int dex;

  @JsonProperty("con")
  private int con;

  @JsonProperty("int")
  private int intellect;

  @JsonProperty("wis")
  private int wis;

  @JsonProperty("cha")
  private int cha;

  @JsonProperty("save")
  private Save save;

  @JsonProperty("resist")
  private Resist[] resists;

  @JsonProperty("immune")
  private Immune[] immunes;

  @JsonProperty("conditionImmune")
  private String[] conditionImmunes;

  @JsonProperty("senses")
  private String senses;

  @JsonProperty("passive")
  private int passive;

//  @JsonProperty("cr")
//  private Cr cr;

  @JsonProperty("trait")
  private Feature[] traits;

  @JsonProperty("action")
  private Feature[] actions;

  @JsonProperty("legendary")
  private Feature[] legendaries;

  @JsonProperty("legendaryGroup")
  private LegendaryGroup legendaryGroup;

  @JsonProperty("page")
  private int page;

  @JsonProperty("traitTags")
  private String[] traitTags;

  @JsonProperty("senseTags")
  private String[] senseTags;

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public String getType() {
    return type;
  }

  public String getSource() {
    return source;
  }

  public String[] getAlignments() {
    return alignments;
  }

  public Ac[] getAcs() {
    return acs;
  }

  public Hp getHp() {
    return hp;
  }

  public int getStr() {
    return str;
  }

  public int getDex() {
    return dex;
  }

  public int getCon() {
    return con;
  }

  public int getIntellect() {
    return intellect;
  }

  public int getWis() {
    return wis;
  }

  public int getCha() {
    return cha;
  }

  public Save getSave() {
    return save;
  }

  public Resist[] getResists() {
    return resists;
  }

  public Immune[] getImmunes() {
    return immunes;
  }

  public String[] getConditionImmunes() {
    return conditionImmunes;
  }

  public String getSenses() {
    return senses;
  }

  public int getPassive() {
    return passive;
  }

//  public Cr getCr() {
//    return cr;
//  }

  public Feature[] getTraits() {
    return traits;
  }

  public Feature[] getActions() {
    return actions;
  }

  public Feature[] getLegendaries() {
    return legendaries;
  }

  public LegendaryGroup getLegendaryGroup() {
    return legendaryGroup;
  }

  public int getPage() {
    return page;
  }

  public String[] getTraitTags() {
    return traitTags;
  }

  public String[] getSenseTags() {
    return senseTags;
  }
}