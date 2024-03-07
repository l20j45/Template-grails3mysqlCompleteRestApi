package grails3mysql

import grails.gorm.services.Service

@Service(SciformaProjectNew)
interface SciformaProjectNewService {

    SciformaProjectNew get(Serializable id)

    List<SciformaProjectNew> list(Map args)

    Long count()

    void delete(Serializable id)

    SciformaProjectNew save(SciformaProjectNew sciformaProjectNew)

}