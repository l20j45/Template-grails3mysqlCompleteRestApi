package grails3mysql

import grails.databinding.BindingFormat

class SciformaProjectNew {

    String internalProjectId
    String projectName
    String nickname
    String commercialName
    String sapProjectId
    String magCode
    String productLine
    String productType
    String complexityCode
    Integer numberOfDie
    String technology
    String technologyCapabilityRequest
    Integer numberOfPackages
    Integer totalNumberOfDice
    String currentPhaseCode
    String statusCode
    String customers
    String securityLevel
    String tapeOutPriorNtiRGateFlag
    String productTransferFlag
    String customerSpecialHandling
    String equalplan
    BigDecimal waferTestInsertsRGate
    BigDecimal wtInsertsSafeLaunch
    BigDecimal finalTestInsertsRGate
    BigDecimal ftInsertsSafeLaunch
    BigDecimal finalTestTestTimeRGate
    BigDecimal ftTestTimeSafeLaunch
    Integer qtySafeLaunch
    String qsSubmitBy
    Date qsSubmitDate
    String qsSubmitIntake
    BigDecimal biSafeLaunchDuration
    BigDecimal biSafeLaunchUnitsQty
    String safeLaunchRgateAsyYield
    String rgateAsyYield
    String safeLaunchRgateFtYield
    String rgateFtYield
    String mscrrFtPerf
    String mscrrWtPerf
    String siteToSiteYieldVar
    String tpQualCpkIndex
    String safeLaunchRgateWtYield
    String rgateWtYield
    BigDecimal wtMultisiteParallelism
    BigDecimal ftMultisiteParallelism
    @BindingFormat('MM/dd/yyyy')
    Date pcagatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date pdagatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date ppagatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date rgatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date pcgatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date cesgatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date rqgatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date cqsgatecurrentdate
    @BindingFormat('MM/dd/yyyy')
    Date egatecurrentdate
    String programManager
    Date publishedDate
    String ifrsCode
    String projectType
    Date rowCrteGmtDttm

    // internal fields not part of the summary table that indicate when this data was created/updated
    Date dateCreated
    Date lastUpdated
    boolean active

    static constraints = {
        internalProjectId unique: true, nullable: false
        projectName nullable: false, maxSize: 100
        nickname nullable: true, maxSize: 100
        commercialName nullable: true, maxSize: 150
        sapProjectId nullable: true, maxSize: 15
        magCode nullable: true, maxSize: 15
        productLine nullable: true, maxSize: 6
        productType nullable: true, maxSize: 200
        complexityCode nullable: true, maxSize: 50
        numberOfDie nullable: true
        technology nullable: true, maxSize: 50
        technologyCapabilityRequest nullable: true, maxSize: 30
        numberOfPackages nullable: true
        totalNumberOfDice nullable: true
        currentPhaseCode nullable: true, maxSize: 10
        statusCode nullable: true, maxSize: 30
        customers nullable: true, maxSize: 4000
        securityLevel nullable: true, maxSize: 30
        tapeOutPriorNtiRGateFlag nullable: true, maxSize: 1
        productTransferFlag nullable: true, maxSize: 1
        customerSpecialHandling nullable: true, maxSize: 25
        equalplan nullable: true, maxSize: 1
        waferTestInsertsRGate nullable: true
        wtInsertsSafeLaunch nullable: true
        finalTestInsertsRGate nullable: true
        ftInsertsSafeLaunch nullable: true
        finalTestTestTimeRGate nullable: true
        ftTestTimeSafeLaunch nullable: true
        qtySafeLaunch nullable: true
        qsSubmitBy nullable: true, maxSize: 150
        qsSubmitDate nullable: true
        qsSubmitIntake nullable: true, maxSize: 100
        biSafeLaunchDuration nullable: true
        biSafeLaunchUnitsQty nullable: true
        safeLaunchRgateAsyYield nullable: true, maxSize: 30
        rgateAsyYield nullable: true, maxSize: 30
        safeLaunchRgateFtYield nullable: true, maxSize: 30
        rgateFtYield nullable: true, maxSize: 30
        mscrrFtPerf nullable: true, maxSize: 30
        mscrrWtPerf nullable: true, maxSize: 30
        siteToSiteYieldVar nullable: true, maxSize: 30
        tpQualCpkIndex nullable: true, maxSize: 30
        safeLaunchRgateWtYield nullable: true, maxSize: 30
        rgateWtYield nullable: true, maxSize: 30
        wtMultisiteParallelism nullable: true
        ftMultisiteParallelism nullable: true
        pcagatecurrentdate nullable: true
        pdagatecurrentdate nullable: true
        ppagatecurrentdate nullable: true
        rgatecurrentdate nullable: true
        pcgatecurrentdate nullable: true
        cesgatecurrentdate nullable: true
        rqgatecurrentdate nullable: true
        cqsgatecurrentdate nullable: true
        egatecurrentdate nullable: true
        programManager nullable: true, maxSize: 30
        publishedDate nullable: true
        ifrsCode nullable: true, maxSize: 30
        projectType nullable: true, maxSize: 40
        rowCrteGmtDttm nullable: true
    }

    static mapping = {
        active defaultValue: "true"
    }

    static namedQueries = {
        searchAllFieldsBy { String searchString ->
            or {
                ilike 'sapProjectId', "%${searchString}%"
                ilike 'projectName', "%${searchString}%"
                ilike 'commercialName', "%${searchString}%"
                ilike 'productLine', "%${searchString}%"
                ilike 'technology', "%${searchString}%"
                ilike 'customers', "%${searchString}%"
                ilike 'magCode', "%${searchString}%"
            }
        }
    }
}
