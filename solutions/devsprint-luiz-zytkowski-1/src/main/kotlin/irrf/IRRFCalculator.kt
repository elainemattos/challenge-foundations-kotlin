package irrf

open class IRRFCalculator() {

    fun calculateIRRF(salary: Double) {

        val irrfRanges: List<IRRFRange> = IRRFRangeManager.readFileIRRF("/faixasIRRF.txt")


        for (irrfRange in irrfRanges) {
            if (salary > irrfRange.minimumValue && salary < irrfRange.maximumValue) {

            }

        }
    }

}