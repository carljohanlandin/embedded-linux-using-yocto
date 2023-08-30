SUMMARY = "A custom test image"
LICENSE = "MIT"

inherit core-image
IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "usbutils"

