SUMMARY = "Module::Build::Tiny - A tiny replacement for Module::Build"
DESCRIPTION = "Many Perl distributions use a Build.PL file instead of a \
Makefile.PL file to drive distribution configuration, build, test and \
installation. Traditionally, Build.PL uses Module::Build as the underlying \
build system. This module provides a simple, lightweight, drop-in replacement. \
\
Whereas Module::Build has over 6,700 lines of code; this module has less than \
120, yet supports the features needed by most distributions. \
"
HOMEPAGE = "http://search.cpan.org/~leont/Module-Build-Tiny/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaca61412962cf972aec0cdad99d0a84"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/L/LE/LEONT/Module-Build-Tiny-${PV}.tar.gz"
SRC_URI[md5sum] = "1c54bf4c602eec87f98950314699402e"
SRC_URI[sha256sum] = "dfd418ad0e8290cf645ab11be209a1bf6865e5a562c5a1592da99d5fd24718a8"

S = "${WORKDIR}/Module-Build-Tiny-${PV}"

inherit cpan_build

do_install () {
        # Install Module/Build/Tiny.pm in @INC 
        install -m 444 ${S}/lib/Module/Build/Tiny.pm ${PERL_ARCHLIB}/Module/Build/
        
        cpan_build_do_install
}

RDEPENDS_${PN} = " perl-module-xsloader \
                   perl-module-file-spec \
                   perl-module-io-handle \
                   perl-module-tap-harness-env \
                   perl-module-extutils-install \
                   perl-module-ipc-open3 \
                   perl-module-file-path \
                   perl-module-cpan-meta \
                   perl-module-extutils-cbuilder \
                   perl-module-getopt-long \
                   perl-module-extutils-helpers \
                   perl-module-extutils-helpers-native \
                   perl-module-extutils-makemaker \
                   perl-module-exporter \
                   perl-module-carp \
                   perl-module-test-more \
                   perl-module-text-parsewords \
                   perl-module-module-load \
                   perl-module-file-temp \
                   perl-module-data-dumper \
                   perl-module-extutils-parsexs \
                   perl-module-pod-man \
                   perl-module-extutils-installpaths \
                   perl-module-extutils-installpaths-native \
                   perl-module-extutils-config \
                   perl-module-extutils-config-native \
                   perl-module-json-pp \
"

BBCLASSEXTEND = "native"
