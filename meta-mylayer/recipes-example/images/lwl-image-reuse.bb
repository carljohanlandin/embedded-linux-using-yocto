require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL += "usbutils myhello myhello-lwl mystaticlib-staticdev"
IMAGE_FEATURES = "ssh-server-openssh debug-tweaks"
# dropbear ssh server
IMAGE_FEATURES = "ssh-server-dropbear debug-tweaks read-only-rootfs splash tools-debug tools-sdk"

#IMAGE_INSTALL:append = " mygit"
#IMAGE_INSTALL:append = " mymakefile mysharedlib"
#IMAGE_INSTALL:append = " mysharedlib"
IMAGE_INSTALL:append = " mycmake"
IMAGE_INSTALL:append = " packagegroup-lwl"
