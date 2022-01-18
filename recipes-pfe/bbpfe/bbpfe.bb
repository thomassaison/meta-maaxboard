#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "b4c25f2316907241296a79bd98db44d459f0001c"
SRC_URI = "git://github.com/rmsalinas/raspicam.git"

S = "${WORKDIR}/git"

inherit cmake

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
EXTRA_OECMAKE = ""