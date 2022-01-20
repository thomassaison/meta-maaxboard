DESCRIPTION = "cameracapture application" 
SECTION = "examples" 
LICENSE = "CLOSED" 

SRCREV = "3cd0926946de2fcfc639cc655cf3e9fffb4592d5"
SRC_URI = "git://github.com/thomassaison/maaxboard-code.git;branch=main"

S = "${WORKDIR}/git"

inherit cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 imx8m ${D}${bindir}
}