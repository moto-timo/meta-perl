SUMMARY = "Test::Differences - Test strings and data structures and show \
differences if not ok"
DESCRIPTION = "When the code you're testing returns multiple lines, records \
or data structures and they're just plain wrong, an equivalent to the Unix \
diff utility may be just what's needed. \
"
HOMEPAGE = "http://search.cpan.org/~ovid/Test-Differences/"
SECTION = "modules"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-test-more \
                   perl-module-text-diff \
                   perl-module-extutils-makemaker \
                   perl-module-algorthm-diff \
                   perl-module-exporter \
                   perl-module-data-dumper \
                   perl-module-build \
"

LIC_FILES_CHKSUM = "file://README;beginline=38;endline=39;md5=b08db4360eec119e875dddd7cb8a5ddd"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/O/OV/OVID/Test-Differences-${PV}.tar.gz"
SRC_URI[md5sum] = "8728047fbd04a32ffdbbc4304d635eb1"
SRC_URI[sha256sum] = "759b6560011b77e6713c2a5020407e1136fa5772058c8f742d70c38aed799c10"

S = "${WORKDIR}/Test-Differences-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
