SUMMARY = "A console lite image for production"
LICENSE = "MIT"

inherit core-image

# additional free disk space created in Kbytes
IMAGE_OVERHEAD_FACTOR = "1.0"
IMAGE_ROOTFS_EXTRA_SPACE = "4096000"

## Select Image Features
IMAGE_FEATURES += " \
"

CORE_IMAGE_EXTRA_INSTALL += " \
"

CORE_IMAGE_EXTRA_INSTALL_append = " \
    linuxptp \
"

inherit extrausers
EXTRA_USERS_PARAMS = "\
    usermod -P avnet root; \
"
