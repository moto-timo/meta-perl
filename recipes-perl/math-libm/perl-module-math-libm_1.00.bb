SUMMARY = "Math::Libm - Perl extension for the C math library, libm"
DESCRIPTION = "This module is a translation of the C math.h file. It exports \
the following selected constants and functions. \
"
HOMEPAGE = "http://search.cpan.org/~dslewart/Math-Libm/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " \
"
# No license information in source. Default to perl standard license.
# Use author contact info for md5sum
LIC_FILES_CHKSUM = "file://Libm.pm;beginline=188;endline=188;md5=4d2921e414e7a8d67cafc4e2481c1f5a"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/D/DS/DSLEWART/Math-Libm-${PV}.tar.gz"
SRC_URI[md5sum] = "26a4ce8fe507d04c7d40b9eadac428ae"
SRC_URI[sha256sum] = "bfd309f283ac8cb9bf00af8c7c3a10bf25abfd642861c2022efaff0a4a52c276"

S = "${WORKDIR}/Math-Libm-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
