require recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_INSTALL_append = "\
    96boards-tools \
    python3 \
    python3-modules \
    python3-git \
    python-pip \
    python3-pyjwt \
    python3-paho-mqtt \
    packagegroup-tools-bluetooth \
    packagegroup-core-buildessential \
    gawk \
    git \
    git-perltools \
    empty \
    "

