# Copyright (C) 2018 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "empty - run processes under pseudo-terminal sessions"

DESCRIPTION = "empty - run applications under pseudo-terminal (PTY)\
               sessions to dialogue with interactive programs.\
               Replace TCL/Expect with a simple tool and use your\
               favorite shell (sh, bash, csh, tcsh, ksh, zsh, etc)"

HOMEPAGE = "http://empty.sourceforge.net/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=92bdef9f92d08cb685e9ebdd4766a874"
DEPENDS = ""

SRC_URI = "${SOURCEFORGE_MIRROR}/empty/empty-0.6.20b.tgz \
           file://01_logfile.diff \
           file://02_typos.diff \
           file://04_bufsiz.diff \
           file://05_ldflags.diff \
           file://06_crosscompile.diff \
"
SRC_URI[md5sum] = "d576754795ab4eb1c528ca2a98b5d545"
SRC_URI[sha256sum] = "7e6636e400856984c4405ce7bd0843aaa3329fa3efd20c58df8400a9eaa35f09"

export PREFIX="${D}${exec_prefix}"

do_install() {
	oe_runmake install
}

FILES_${PN}-doc += "${exec_prefix}/man"

