SUMMARY = "App::cpanminus - get, unpack, build and install modules from CPAN"
DESCRIPTION = "cpanminus is a script to get, unpack, build and install\
modules from CPAN and does nothing else.\
It's dependency free (can bootstrap itself), requires zero configuration,\
and stands alone. When running, it requires only 10MB of RAM.\
"
HOMEPAGE = "http://search.cpan.org/~miyagaw/App-cpanminus/"
SECTION = "apps"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=9be77e3fe7266dc0509b1abc7c3d5f8b"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/M/MI/MIYAGAWA/App-cpanminus-${PV}.tar.gz"
SRC_URI[md5sum] = "4655c5903e2885085262cf5f15ff5ae3"
SRC_URI[sha256sum] = "6d5f99835bb3c9f7930ba26c42879d2e180993c16d9e6de2c0ca955c8eda84b9"

S = "${WORKDIR}/App-cpanminus-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
