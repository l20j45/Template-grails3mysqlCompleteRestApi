package grails3mysql

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SciformaProjectNewServiceSpec extends Specification {

    SciformaProjectNewService sciformaProjectNewService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new SciformaProjectNew(...).save(flush: true, failOnError: true)
        //new SciformaProjectNew(...).save(flush: true, failOnError: true)
        //SciformaProjectNew sciformaProjectNew = new SciformaProjectNew(...).save(flush: true, failOnError: true)
        //new SciformaProjectNew(...).save(flush: true, failOnError: true)
        //new SciformaProjectNew(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //sciformaProjectNew.id
    }

    void "test get"() {
        setupData()

        expect:
        sciformaProjectNewService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<SciformaProjectNew> sciformaProjectNewList = sciformaProjectNewService.list(max: 2, offset: 2)

        then:
        sciformaProjectNewList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        sciformaProjectNewService.count() == 5
    }

    void "test delete"() {
        Long sciformaProjectNewId = setupData()

        expect:
        sciformaProjectNewService.count() == 5

        when:
        sciformaProjectNewService.delete(sciformaProjectNewId)
        sessionFactory.currentSession.flush()

        then:
        sciformaProjectNewService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        SciformaProjectNew sciformaProjectNew = new SciformaProjectNew()
        sciformaProjectNewService.save(sciformaProjectNew)

        then:
        sciformaProjectNew.id != null
    }
}
