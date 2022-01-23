DESCRIPTION = "cameracapture application" 
SECTION = "examples" 
LICENSE = "CLOSED" 

SRCREV = "d9c8c6677eb3f7a19703a8c84b0bff94a5957f8b"
SRC_URI = "git://github.com/thomassaison/maaxboard-code.git;branch=main"

S = "${WORKDIR}/git"

inherit cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 imx8m ${D}${bindir}
}