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
DEPENDS_${PN} = "  perl-module-encode-locale-native \
                   perl-module-runtime-native \
"
RDEPENDS_${PN} = " perl-module-test-more \
                   perl-module-io-scalar \
"

#    requires        => {
#        'Boost::Geometry::Utils'    => '0.12',
#        'Encode::Locale'            => '0',
#        'File::Basename'            => '0',
#        'File::Spec'                => '0',
#       'Getopt::Long'              => '0',
#        'Math::Clipper'             => '1.22',
#        'Math::ConvexHull::MonotoneChain' => '0.01',
#        'Math::Geometry::Voronoi'   => '1.3',
#        'Math::PlanePath'           => '53',
#        'Moo'                       => '0.091009',
#        'perl'                      => '5.10.0',
#        'Scalar::Util'              => '0',
#        'Storable'                  => '0',
#        'Time::HiRes'               => '0',
#    },
#    build_requires => {
#        'Test::More' => '0.10',
#        'IO::Scalar' => '0.10',
#    },
#    recommends     => {
#        'Class::XSAccessor' => '0',
#        'Growl::GNTP' => '0.15',
#        'XML::SAX::ExpatXS' => '0',
#        'Wx'          => '0.9901',
#    },
#    script_files    => ['slic3r.pl'],

LIC_FILES_CHKSUM = "file://lib/Slic3r.pm;beginline=3;endline=4;md5=aaca61412962cf972aec0cdad99d0a84"

SRC_URI = "git://github.com/alexrj/Slic3r.git;tag=0.9.10b;branch=0.9.10b"

S = "${WORKDIR}/git"

inherit cpan_build

BBCLASSEXTEND = "native"
