/*
 * SWAPI2
 * defaultDescription
 *
 * OpenAPI spec version: 1.0.0
 * Contact: email@email.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse2001
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-22T17:13:49.696677300Z[GMT]")

public class InlineResponse2001 {
  @SerializedName("films")
  private List<String> films = null;

  @SerializedName("edited")
  private String edited = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("climate")
  private String climate = null;

  @SerializedName("rotation_period")
  private String rotationPeriod = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("population")
  private String population = null;

  @SerializedName("orbital_period")
  private String orbitalPeriod = null;

  @SerializedName("surface_water")
  private String surfaceWater = null;

  @SerializedName("diameter")
  private String diameter = null;

  @SerializedName("gravity")
  private String gravity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("residents")
  private List<String> residents = null;

  @SerializedName("terrain")
  private String terrain = null;

  public InlineResponse2001 films(List<String> films) {
    this.films = films;
    return this;
  }

  public InlineResponse2001 addFilmsItem(String filmsItem) {
    if (this.films == null) {
      this.films = new ArrayList<String>();
    }
    this.films.add(filmsItem);
    return this;
  }

   /**
   * Get films
   * @return films
  **/
  @Schema(description = "")
  public List<String> getFilms() {
    return films;
  }

  public void setFilms(List<String> films) {
    this.films = films;
  }

  public InlineResponse2001 edited(String edited) {
    this.edited = edited;
    return this;
  }

   /**
   * Get edited
   * @return edited
  **/
  @Schema(description = "")
  public String getEdited() {
    return edited;
  }

  public void setEdited(String edited) {
    this.edited = edited;
  }

  public InlineResponse2001 created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public InlineResponse2001 climate(String climate) {
    this.climate = climate;
    return this;
  }

   /**
   * Get climate
   * @return climate
  **/
  @Schema(description = "")
  public String getClimate() {
    return climate;
  }

  public void setClimate(String climate) {
    this.climate = climate;
  }

  public InlineResponse2001 rotationPeriod(String rotationPeriod) {
    this.rotationPeriod = rotationPeriod;
    return this;
  }

   /**
   * Get rotationPeriod
   * @return rotationPeriod
  **/
  @Schema(description = "")
  public String getRotationPeriod() {
    return rotationPeriod;
  }

  public void setRotationPeriod(String rotationPeriod) {
    this.rotationPeriod = rotationPeriod;
  }

  public InlineResponse2001 url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InlineResponse2001 population(String population) {
    this.population = population;
    return this;
  }

   /**
   * Get population
   * @return population
  **/
  @Schema(description = "")
  public String getPopulation() {
    return population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public InlineResponse2001 orbitalPeriod(String orbitalPeriod) {
    this.orbitalPeriod = orbitalPeriod;
    return this;
  }

   /**
   * Get orbitalPeriod
   * @return orbitalPeriod
  **/
  @Schema(description = "")
  public String getOrbitalPeriod() {
    return orbitalPeriod;
  }

  public void setOrbitalPeriod(String orbitalPeriod) {
    this.orbitalPeriod = orbitalPeriod;
  }

  public InlineResponse2001 surfaceWater(String surfaceWater) {
    this.surfaceWater = surfaceWater;
    return this;
  }

   /**
   * Get surfaceWater
   * @return surfaceWater
  **/
  @Schema(description = "")
  public String getSurfaceWater() {
    return surfaceWater;
  }

  public void setSurfaceWater(String surfaceWater) {
    this.surfaceWater = surfaceWater;
  }

  public InlineResponse2001 diameter(String diameter) {
    this.diameter = diameter;
    return this;
  }

   /**
   * Get diameter
   * @return diameter
  **/
  @Schema(description = "")
  public String getDiameter() {
    return diameter;
  }

  public void setDiameter(String diameter) {
    this.diameter = diameter;
  }

  public InlineResponse2001 gravity(String gravity) {
    this.gravity = gravity;
    return this;
  }

   /**
   * Get gravity
   * @return gravity
  **/
  @Schema(description = "")
  public String getGravity() {
    return gravity;
  }

  public void setGravity(String gravity) {
    this.gravity = gravity;
  }

  public InlineResponse2001 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2001 residents(List<String> residents) {
    this.residents = residents;
    return this;
  }

  public InlineResponse2001 addResidentsItem(String residentsItem) {
    if (this.residents == null) {
      this.residents = new ArrayList<String>();
    }
    this.residents.add(residentsItem);
    return this;
  }

   /**
   * Get residents
   * @return residents
  **/
  @Schema(description = "")
  public List<String> getResidents() {
    return residents;
  }

  public void setResidents(List<String> residents) {
    this.residents = residents;
  }

  public InlineResponse2001 terrain(String terrain) {
    this.terrain = terrain;
    return this;
  }

   /**
   * Get terrain
   * @return terrain
  **/
  @Schema(description = "")
  public String getTerrain() {
    return terrain;
  }

  public void setTerrain(String terrain) {
    this.terrain = terrain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.films, inlineResponse2001.films) &&
        Objects.equals(this.edited, inlineResponse2001.edited) &&
        Objects.equals(this.created, inlineResponse2001.created) &&
        Objects.equals(this.climate, inlineResponse2001.climate) &&
        Objects.equals(this.rotationPeriod, inlineResponse2001.rotationPeriod) &&
        Objects.equals(this.url, inlineResponse2001.url) &&
        Objects.equals(this.population, inlineResponse2001.population) &&
        Objects.equals(this.orbitalPeriod, inlineResponse2001.orbitalPeriod) &&
        Objects.equals(this.surfaceWater, inlineResponse2001.surfaceWater) &&
        Objects.equals(this.diameter, inlineResponse2001.diameter) &&
        Objects.equals(this.gravity, inlineResponse2001.gravity) &&
        Objects.equals(this.name, inlineResponse2001.name) &&
        Objects.equals(this.residents, inlineResponse2001.residents) &&
        Objects.equals(this.terrain, inlineResponse2001.terrain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(films, edited, created, climate, rotationPeriod, url, population, orbitalPeriod, surfaceWater, diameter, gravity, name, residents, terrain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    films: ").append(toIndentedString(films)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    climate: ").append(toIndentedString(climate)).append("\n");
    sb.append("    rotationPeriod: ").append(toIndentedString(rotationPeriod)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("    orbitalPeriod: ").append(toIndentedString(orbitalPeriod)).append("\n");
    sb.append("    surfaceWater: ").append(toIndentedString(surfaceWater)).append("\n");
    sb.append("    diameter: ").append(toIndentedString(diameter)).append("\n");
    sb.append("    gravity: ").append(toIndentedString(gravity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    residents: ").append(toIndentedString(residents)).append("\n");
    sb.append("    terrain: ").append(toIndentedString(terrain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
