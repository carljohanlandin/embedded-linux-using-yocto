SUMMARY = "LWL Package group"

inherit packagegroup

RDEPENDS:${PN} = "util-linux \
                  pciutils \
                  usbutils"
