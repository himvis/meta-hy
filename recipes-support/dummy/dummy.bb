# Copyright (C) 2018 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "dummy copying of precompiled files and scripts"
LICENSE = "CLOSED"

SRC_URI = "file://dummy.txt"

S = "${WORKDIR}"

do_install() {
	install -D -m 0644 ${S}/dummy.txt ${D}${bindir}/dummy.txt
}
