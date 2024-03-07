package grails3mysql

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class SciformaProjectNewController {

    SciformaProjectNewService sciformaProjectNewService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond sciformaProjectNewService.list(params), model:[sciformaProjectNewCount: sciformaProjectNewService.count()]
    }

    def show(Long id) {
        respond sciformaProjectNewService.get(id)
    }

    def save(SciformaProjectNew sciformaProjectNew) {
        if (sciformaProjectNew == null) {
            render status: NOT_FOUND
            return
        }

        try {
            sciformaProjectNewService.save(sciformaProjectNew)
        } catch (ValidationException e) {
            respond sciformaProjectNew.errors, view:'create'
            return
        }

        respond sciformaProjectNew, [status: CREATED, view:"show"]
    }

    def update(SciformaProjectNew sciformaProjectNew) {
        if (sciformaProjectNew == null) {
            render status: NOT_FOUND
            return
        }

        try {
            sciformaProjectNewService.save(sciformaProjectNew)
        } catch (ValidationException e) {
            respond sciformaProjectNew.errors, view:'edit'
            return
        }

        respond sciformaProjectNew, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        sciformaProjectNewService.delete(id)

        render status: NO_CONTENT
    }
}
