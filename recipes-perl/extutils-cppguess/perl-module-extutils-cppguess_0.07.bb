SUMMARY = "ExtUtils::CppGuess - guess C++ compiler and flags"
DESCRIPTION = "ExtUtils::CppGuess attempts to guess the system's C++ \
compiler that is compatible with the C compiler that your perl was built \
with. \
 \
It can generate the necessary options to the Module::Build constructor or \
to ExtUtils::MakeMaker's WriteMakefile function. \
"
HOMEPAGE = "http://search.cpan.org/~smueller/ExtUtils-CppGuess/"
SECTION = "modules"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-capture-tiny \
                   perl-module-scalar-util \
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

LIC_FILES_CHKSUM = "file://README;beginline=81;endline=84;md5=84c0390b90ea8c6702ce659b67bed699"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/S/SM/SMUELLER/ExtUtils-CppGuess-${PV}.tar.gz"
SRC_URI[md5sum] = "350dd7c661189ea770d6c9354ebbc6c2"
SRC_URI[sha256sum] = "1cd83ee8452351219b987c79ddb25cc25ee8c396318ba36c5211a92b5c87e7a8"

S = "${WORKDIR}/ExtUtils-CppGuess-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
