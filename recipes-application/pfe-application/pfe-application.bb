DESCRIPTION = "cameracapture application" 
SECTION = "examples" 
LICENSE = "CLOSED" 

DEPENDS += "gtest"

SRCREV = "6e4d787138df5b99ffb001f17290bab1993b9cb9"
SRC_URI = "git://github.com/thomassaison/maaxboard-code.git;branch=main"

S = "${WORKDIR}/git"

inherit cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 imx8m ${D}${bindir}
}