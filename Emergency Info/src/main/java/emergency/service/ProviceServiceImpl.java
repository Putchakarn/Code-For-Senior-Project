package emergency.service;


import emergency.dao.ProvinceDAO;
import emergency.entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 28/4/2557
 * Time: 16:36 น.
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ProviceServiceImpl implements ProvinceService {

    @Autowired
    ProvinceDAO provinceDAO;


    @Override
    @Transactional
    public Province getProvinceByName(String name) {
        return provinceDAO.getProvinceByName(name);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
