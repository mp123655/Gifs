package pl.akademiakodu.gifs.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor- zamiast kontruktora ponizej
public class Gif {

    private String name;
    private String userName;
    private Boolean favorite;
    private int categoryId;

    public Gif(String name, String userName, Boolean favorite, int categoryId) {
        this.name = name;
        this.userName = userName;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }
}
