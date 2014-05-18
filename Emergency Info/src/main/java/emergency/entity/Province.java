package emergency.entity;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;

/**
 * Created by gii guide on 28/4/2557.
 */
@Entity
public class Province {
    @Id
    @GeneratedValue
    private Integer id;
   // private String id;
    private String name;
    @OneToMany//(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<HelpPlace> helpPlaces;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
       // this.helpPlaces = helpPlaces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HelpPlace> getHelpPlaces() {
        return helpPlaces;
    }

    public void setHelpPlaces(List<HelpPlace> helpPlaces) {
        this.helpPlaces = helpPlaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Province province = (Province) o;

        if (helpPlaces != null ? !helpPlaces.equals(province.helpPlaces) : province.helpPlaces != null) return false;
        if (id != null ? !id.equals(province.id) : province.id != null) return false;
        if (name != null ? !name.equals(province.name) : province.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (helpPlaces != null ? helpPlaces.hashCode() : 0);
        return result;
    }
}
