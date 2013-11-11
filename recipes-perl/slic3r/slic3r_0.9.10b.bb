SUMMARY = "Slic3r - G-code generator for 3D printers"
DESCRIPTION = "Slic3r takes 3D models (STL, OBJ, AMF) and converts them into \
G-code instructions for 3D printers. It's compatible with any modern printer \
based on the RepRap toolchain, including all those based on the Marlin, \
Sprinter and Repetier firmware. It also works with Mach3 and LinuxCNC \
controllers. \
"
HOMEPAGE = "http://slic3r.org/"
SECTION = "devel"

LICENSE = "Artistic-1.0 | GPL-1.0+ | GPL-3.0"
LIC_FILES_CHKSUM = "file://lib/Slic3r.pm;beginline=3;endline=4;md5=aaca61412962cf972aec0cdad99d0a84"

DEPENDS = "  perl-module-encode-locale-native \
             perl-module-runtime-native \
             perl-module-boost-geometry-utils-native \
             perl-module-test-more \
             perl-module-io-scalar \
"

SRC_URI = "git://github.com/alexrj/Slic3r.git;tag=0.9.10b;branch=0.9.10b"
SRCREV = "f13c611f95059a2530bd30fc3c83362c2d95bf7e"

S = "${WORKDIR}/git"

inherit cpan_build

RDEPENDS_${PN} = " perl-module-boost-geometry-utils \
                   perl-module-encode-locale \
                   perl-module-file-basename \
                   perl-module-file-spec \
                   perl-module-getopt-long \
                   perl-module-math-clipper \
                   perl-module-math-convexhull-monotonechain \
                   perl-module-math-geometry-voronoi \
                   perl-module-planepath \
                   perl-module-moo \
                   perl-module-scalar-util \
                   perl-module-storable \
                   perl-module-time-hires \
"

#RECOMMENDS += " perl-module-class-xsaccessor \
#                perl-module-growl-gntp \
#                perl-module-xml-sax-expatxs \
#                perl-module-wx \
#"

BBCLASSEXTEND = "native"
