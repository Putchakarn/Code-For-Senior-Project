package emergency.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

/**
 * Created by gii guide on 28/4/2557.
 */
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Integer id;
  //  private String id;
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<HelpPlace> helpPlaces;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
      //  this.helpPlaces = helpPlaces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //
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

        Category category = (Category) o;

        if (helpPlaces != null ? !helpPlaces.equals(category.helpPlaces) : category.helpPlaces != null) return false;
        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;

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
