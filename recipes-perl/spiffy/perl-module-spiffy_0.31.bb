SUMMARY = "Spiffy - a framework and methodology for doing objected oriented \
(OO) programming in Perl"
DESCRIPTION = "Spiffy combines the best parts of Exporter.pm, base.pm, \
mixin.pm and SUPER.pm into one magic foundation class. It attempts to fix \
all the nits and warts of traditional Perl OO, in a clean, straightforward \
and (perhaps someday) standard way. \
"
HOMEPAGE = "http://search.cpan.org/~ingy/Spiffy/"
SECTION = "modules"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-extutils-makemaker \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e83a51a357569c732881dab01deb37ec"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/I/IN/INGY/Spiffy-${PV}.tar.gz"
SRC_URI[md5sum] = "53cfd4e915715e6dac912469af3d71a0"
SRC_URI[sha256sum] = "922e02aa62a8a618f91dc185d34fde65ef652dfa35d7a335f2e8de2ffdd2f686"

S = "${WORKDIR}/Spiffy-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
