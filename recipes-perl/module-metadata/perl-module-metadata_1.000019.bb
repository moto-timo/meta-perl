SUMMARY = "Module::Metadata - Gather package and POD information from perl \
module files"
DESCRIPTION = "This module provides a standard way to gather metadata about \
a .pm files through (mostly) static analysis and (some) code execution. When \
determining the version of a module, the $VERSION assignment is eval-ed, as \
is traditional in the CPAN toolchain. \
"
HOMEPAGE = "http://search.cpan.org/~ether/Module-Metadata/"
SECTION = "modules"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-io-file \
                   perl-module-data-dumper \
                   perl-module-extutils-makemaker \
                   perl-module-file-spec \
                   perl-module-version \
                   perl-module-exporter \
                   perl-module-carp \
                   perl-module-test-more \
                   perl-module-file-temp \
                   perl-module-file-path \
"

LIC_FILES_CHKSUM = "file://README;beginline=185;endline=190;md5=e1b24eebe5d819b40bb68ad06b72d3ee"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/E/ET/ETHER/Module-Metadata-${PV}.tar.gz"
SRC_URI[md5sum] = "838ecf97f7daff79e0f81e104a6be823"
SRC_URI[sha256sum] = "5afca94dc0213608101ad519eb1b25133cdc9e44c2a053a45a5a59422c2ee554"

S = "${WORKDIR}/Module-Metadata-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
