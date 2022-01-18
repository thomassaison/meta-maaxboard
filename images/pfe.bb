SUMMARY = "A console lite image for production"
LICENSE = "MIT"

inherit core-image

# additional free disk space created in Kbytes
IMAGE_OVERHEAD_FACTOR = "1.0"
IMAGE_ROOTFS_EXTRA_SPACE = "4096000"

## Select Image Features
IMAGE_FEATURES += " \
    ssh-server-openssh \
    hwcodecs \
    package-management \
    allow-root-login \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-tools-bluetooth \
    packagegroup-fsl-tools-audio \
    packagegroup-imx-isp \
    packagegroup-imx-security \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
"

CORE_IMAGE_EXTRA_INSTALL_append = " \
    gnupg \
    parted \ 
    nano \
    v4l-utils \
    linux-imx-headers \
    i2c-tools \
    kbd-keymaps \
    ffmpeg \
    myssh \
    git \
    gcc \
    gcc-symlinks \
    binutils \
    automake \
    autoconf \
    hostapd \
    evtest \
    mtd-utils \
    spitools \
"

CORE_IMAGE_EXTRA_INSTALL_append_maaxboardnano = "wifi-service"

inherit extrausers
EXTRA_USERS_PARAMS = "\
    usermod -P avnet root; \
"
