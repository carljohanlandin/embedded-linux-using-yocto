DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloworld.c \
           file://function.c \
           file://README.md \
"

S = "${WORKDIR}"
PROVIDES += "mylwl"

do_compile() {
    ${CC} helloworld.c function.c ${LDFLAGS} -o helloworld
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 helloworld ${D}${bindir}
    install -d ${D}${includedir}
    install -m 0655 README.md ${D}${includedir}
}

FILES:${PN} += "${bindir}/helloworld"
FILES:${PN}-lwl = "${includedir}/README.md"

PACKAGES = "${PN}-dbg ${PN} ${PN}-lwl"
