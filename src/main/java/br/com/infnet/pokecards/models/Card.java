package br.com.infnet.pokecards.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "supertype",
    "subtypes",
    "level",
    "hp",
    "types",
    "evolvesFrom",
    "abilities",
    "attacks",
    "weaknesses",
    "resistances",
    "retreatCost",
    "convertedRetreatCost",
    "set",
    "number",
    "artist",
    "rarity",
    "nationalPokedexNumbers",
    "legalities",
    "images",
    "tcgplayer",
    "evolvesTo",
    "flavorText"
})

public class Card {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("supertype")
    private String supertype;
    @JsonProperty("subtypes")
    private List<String> subtypes = null;
    @JsonProperty("level")
    private String level;
    @JsonProperty("hp")
    private String hp;
    @JsonProperty("types")
    private List<String> types = null;
    @JsonProperty("evolvesFrom")
    private String evolvesFrom;
    @JsonProperty("abilities")
    private List<Ability> abilities = null;
    @JsonProperty("attacks")
    private List<Attack> attacks = null;
    @JsonProperty("weaknesses")
    private List<Weakness> weaknesses = null;
    @JsonProperty("resistances")
    private List<Resistance> resistances = null;
    @JsonProperty("retreatCost")
    private List<String> retreatCost = null;
    @JsonProperty("convertedRetreatCost")
    private Integer convertedRetreatCost;
    @JsonProperty("set")
    private Set set;
    @JsonProperty("number")
    private String number;
    @JsonProperty("artist")
    private String artist;
    @JsonProperty("rarity")
    private String rarity;
    @JsonProperty("nationalPokedexNumbers")
    private List<Integer> nationalPokedexNumbers = null;
    @JsonProperty("legalities")
    private Legalities__1 legalities;
    @JsonProperty("images")
    private ImagesCard images;
    @JsonProperty("tcgplayer")
    private Tcgplayer tcgplayer;
    @JsonProperty("evolvesTo")
    private List<String> evolvesTo = null;
    @JsonProperty("flavorText")
    private String flavorText;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
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

    @JsonProperty("supertype")
    public String getSupertype() {
        return supertype;
    }

    @JsonProperty("supertype")
    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    @JsonProperty("subtypes")
    public List<String> getSubtypes() {
        return subtypes;
    }

    @JsonProperty("subtypes")
    public void setSubtypes(List<String> subtypes) {
        this.subtypes = subtypes;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("hp")
    public String getHp() {
        return hp;
    }

    @JsonProperty("hp")
    public void setHp(String hp) {
        this.hp = hp;
    }

    @JsonProperty("types")
    public List<String> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<String> types) {
        this.types = types;
    }

    @JsonProperty("evolvesFrom")
    public String getEvolvesFrom() {
        return evolvesFrom;
    }

    @JsonProperty("evolvesFrom")
    public void setEvolvesFrom(String evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    @JsonProperty("abilities")
    public List<Ability> getAbilities() {
        return abilities;
    }

    @JsonProperty("abilities")
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    @JsonProperty("attacks")
    public List<Attack> getAttacks() {
        return attacks;
    }

    @JsonProperty("attacks")
    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    @JsonProperty("weaknesses")
    public List<Weakness> getWeaknesses() {
        return weaknesses;
    }

    @JsonProperty("weaknesses")
    public void setWeaknesses(List<Weakness> weaknesses) {
        this.weaknesses = weaknesses;
    }

    @JsonProperty("resistances")
    public List<Resistance> getResistances() {
        return resistances;
    }

    @JsonProperty("resistances")
    public void setResistances(List<Resistance> resistances) {
        this.resistances = resistances;
    }

    @JsonProperty("retreatCost")
    public List<String> getRetreatCost() {
        return retreatCost;
    }

    @JsonProperty("retreatCost")
    public void setRetreatCost(List<String> retreatCost) {
        this.retreatCost = retreatCost;
    }

    @JsonProperty("convertedRetreatCost")
    public Integer getConvertedRetreatCost() {
        return convertedRetreatCost;
    }

    @JsonProperty("convertedRetreatCost")
    public void setConvertedRetreatCost(Integer convertedRetreatCost) {
        this.convertedRetreatCost = convertedRetreatCost;
    }

    @JsonProperty("set")
    public Set getSet() {
        return set;
    }

    @JsonProperty("set")
    public void setSet(Set set) {
        this.set = set;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("artist")
    public String getArtist() {
        return artist;
    }

    @JsonProperty("artist")
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @JsonProperty("rarity")
    public String getRarity() {
        return rarity;
    }

    @JsonProperty("rarity")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    @JsonProperty("nationalPokedexNumbers")
    public List<Integer> getNationalPokedexNumbers() {
        return nationalPokedexNumbers;
    }

    @JsonProperty("nationalPokedexNumbers")
    public void setNationalPokedexNumbers(List<Integer> nationalPokedexNumbers) {
        this.nationalPokedexNumbers = nationalPokedexNumbers;
    }

    @JsonProperty("legalities")
    public Legalities__1 getLegalities() {
        return legalities;
    }

    @JsonProperty("legalities")
    public void setLegalities(Legalities__1 legalities) {
        this.legalities = legalities;
    }

    @JsonProperty("images")
    public ImagesCard getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(ImagesCard images) {
        this.images = images;
    }

    @JsonProperty("tcgplayer")
    public Tcgplayer getTcgplayer() {
        return tcgplayer;
    }

    @JsonProperty("tcgplayer")
    public void setTcgplayer(Tcgplayer tcgplayer) {
        this.tcgplayer = tcgplayer;
    }

    @JsonProperty("evolvesTo")
    public List<String> getEvolvesTo() {
        return evolvesTo;
    }

    @JsonProperty("evolvesTo")
    public void setEvolvesTo(List<String> evolvesTo) {
        this.evolvesTo = evolvesTo;
    }

    @JsonProperty("flavorText")
    public String getFlavorText() {
        return flavorText;
    }

    @JsonProperty("flavorText")
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

}
