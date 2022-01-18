DESCRIPTION = "Wifi start service"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://sshd_config"

do_install_append() {
    install -D -m 644 ${WORKDIR}/sshd_config ${D}/etc/ssh/sshd_config
}