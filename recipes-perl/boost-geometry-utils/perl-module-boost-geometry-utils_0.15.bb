SUMMARY = "Boost::Geometry::Utils - Bindings for the Boost Geometry library"
DESCRIPTION = "This module provides bindings to perform some geometric \
operations using the Boost Geometry library. It does not aim at providing \
full bindings for such library, and that's why I left the Boost::Geometry \
namespace free. I'm unsure about the optimal architectural for providing full \
bindings, but I'm interested in such a project -- so, if you have ideas \
please get in touch with me. \
\
Warning: the API could change in the future. \
"
HOMEPAGE = "http://search.cpan.org/~aar/Boost-Geometry-Utils/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
DEPENDS_${PN} =  " perl-module-build-withxspp-native \
"
RDEPENDS_${PN} = " perl-module-extutils-typemaps-default \
                   perl-module-extutils-typemaps \
                   perl-module-module-build \
                   perl-module-test-more \
                   perl-module-build-withxspp \
                   perl-module-digest-md5 \
                   perl-module-extutils-xspp \
                   perl-module-test-base \
                   perl-module-filter-util-call \
                   perl-module-extutils-makemaker \
                   perl-module-spiffy \
                   perl-module-test-differences \
                   perl-module-text-diff \
                   perl-module-algorithm-diff \
                   perl-module-exporter \
                   perl-module-carp \
                   perl-module-data-dumper \
                   perl-module-extutils-cppguess \
                   perl-module-capture-tiny \
                   perl-module-scalar-util \
                   perl-module-io-file \
                   perl-module-file-spec \
                   perl-module-carp \
                   perl-module-file-temp \
                   perl-module-lib \
                   perl-module-extutils-cbuilder \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=64f00136d2b9c8615cb83304e9a817da"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/A/AA/AAR/Boost-Geometry-Utils-${PV}.tar.gz"
SRC_URI[md5sum] = "14d705f8efda8db81e118aa8c8a21bed"
SRC_URI[sha256sum] = "0054dd3f573bd3f6f47b73ee81d1e845842fba04aadb52880aa52701c687d1ca"

S = "${WORKDIR}/Boost-Geometry-Utils-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
