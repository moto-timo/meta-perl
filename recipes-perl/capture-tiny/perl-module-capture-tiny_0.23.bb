SUMMARY = "Capture::Tiny - Capture STDOUT and STDERR from Perl, XS or \
external programs \
"
DESCRIPTION = "Capture::Tiny provies a simple, portable way to capture \
almost anything sent to STDOUT or STDERR, regardless of whether it comes \
from Perl, from XS code or from an external program. Optionally, output can \
be teed so that it is captured while being passed through to the original \
filehandles. Yes, it even works on Windows (usually). Stop guessing which of \
a dozen capturing modules to use in any particular situation and just use \
this one. \
"
HOMEPAGE = "http://search.cpan.org/~dagolden/Capture-Tiny/"
SECTION = "modules"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-scalar-util \
                   perl-module-io-file \
                   perl-module-extutils-makemaker \
                   perl-module-file-spec \
                   perl-module-exporter \
                   perl-module-carp \
                   perl-module-test-more \
                   perl-module-file-temp \
                   perl-module-lib \
                   perl-module-buil \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=37a4918a30ace24395020e5b8c03b83f"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/D/DA/DAGOLDEN/Capture-Tiny-${PV}.tar.gz"
SRC_URI[md5sum] = "7c6f63671802d004c0df5dbcba93e5b4"
SRC_URI[sha256sum] = "427814015824014b41f666c16afadab0ea551db946e494fdfbc59c44c9569bdf"

S = "${WORKDIR}/Capture-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
