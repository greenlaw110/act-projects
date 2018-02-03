package test.gh487;

import act.data.annotation.Data;
import act.db.jpa.JPADao;
import act.db.sql.tx.Transactional;
import act.inject.util.LoadResource;
import act.job.OnAppStart;
import act.util.SimpleBean;
import act.util.Stateless;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "area")
@Data
public class Area implements SimpleBean {

    @Id
    public Integer id;
    public Integer pid;
    public String name;
    public String merger_name;
    public String short_name;
    public String merger_short_name;
    public Integer level_type;
    public Integer city_code;
    public Integer zip_code;
    public String pinyin;
    public String jianpin;
    public String first_char;
    public String lng;
    public String lat;
    public String remark;

    @Stateless
    public static class Dao extends JPADao<Integer, Area> {

        @LoadResource("area.json")
        private List<Area> predefined;

        @OnAppStart
        @Transactional
        public void loadIntoDbIfNeeded() {
            if (0 == count()) {
                save(predefined);
            }
        }

    }

}
