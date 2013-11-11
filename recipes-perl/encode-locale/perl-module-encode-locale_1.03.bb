SUMMARY = "Encode::Locale - Determine the locale encoding"
DESCRIPTION = "In many applications it's wise to let Perl use Unicode for the \
strings it processes. Most of the interfaces Perl has to the outside world are \still byte based. Programs therefore need to decode byte strings that enter \
the program from the outside and encode them again on the way out. \
"
HOMEPAGE = "http://search.cpan.org/~gaas/Encode-Locale/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-extutils-makemaker \
                   perl-module-test \
                   perl-module-encode-alias \
"

LIC_FILES_CHKSUM = "file://README;beginline=8;endline=11;md5=7ab9e2ae830de5b07bf9f4f340a23c90"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/G/GA/GAAS/Encode-Locale-${PV}.tar.gz"
SRC_URI[md5sum] = "de8422d068634e7c1068dab4e18b452f"
SRC_URI[sha256sum] = "f76337e0933225914111fcc3319ff4db359b1abfd1aa56dff2df5378db0e2d55"

S = "${WORKDIR}/Encode-Locale-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
