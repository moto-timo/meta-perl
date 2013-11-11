SUMMARY = "ExtUtils::Helpers - Various portability utilities for module \
builders"
DESCRIPTION = "This module provides various portable helper function for \
module building modules."
HOMEPAGE = "http://search.cpan.org/~leont/ExtUtils-Helpers/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-file-copy \
                   perl-module-extutils-makemaker \
                   perl-module-exporter \
                   perl-module-carp \
                   perl-module-test-more \
                   perl-module-text-parsewords \
                   perl-module-module-load \
                   perl-module-file-temp \
                   perl-module-file-spec-functions \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=307057ce232899f5caa8858560c7274b"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/L/LE/LEONT/ExtUtils-Helpers-${PV}.tar.gz"
SRC_URI[md5sum] = "94aa8eaf92def26d9af0cb25fcb1570f"
SRC_URI[sha256sum] = "26b85077f4197b30e62ffec87d3f78111522619d62858d2ab45a64687351892a"

S = "${WORKDIR}/ExtUtils-Helpers-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
