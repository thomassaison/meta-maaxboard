# KERNEL_BRANCH_maaxboardbase = "maaxboard_5.10.35_2.0.0"
KERNEL_BRANCH_maaxboardbase = "main"
#KERNEL_SRC_maaxboardbase = "${MAAXBOARD_GIT_HOST_MIRROR}/linux-imx.git;protocol=https"
KERNEL_SRC_maaxboardbase = "git://git@github.com/thomassaison/linux-imx.git;protocol=https"

SRC_URI = "${KERNEL_SRC};branch=${KERNEL_BRANCH}"

SRCREV_maaxboardnano = "fefa73c13998cba45abab3a5041fe9fbfbc44c64"
# SRCREV_maaxboard = "38aab19d2b4241f5383e3f2d30d4f089f0eaf74d"
SRCREV_maaxboard = "87ba63215909b9b5a8471058659de472f048bed8"
SRCREV_maaxboardmini = "b8e6bda2e31dbb4f93bc98bd324c00119d90ac87"
