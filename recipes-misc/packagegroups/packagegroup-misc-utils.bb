SUMMARY = "OpenSSH SSH client/server"
PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = "expand-rootfs sshswitch wpa-conf"
