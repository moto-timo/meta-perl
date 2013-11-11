SUMMARY = "Class::Method::Modifiers - provides Moose-like method modifiers"
DESCRIPTION = "Method modifiers are a convenient feature from the CLOS \
(Common Lisp Object System) world. \
"
HOMEPAGE = "http://search.cpan.org/~ether/Class-Method-Modifiers/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-extutils-makemaker \
                   perl-module-file-spec \
                   perl-module-io-handle \
                   perl-module-test-fatal \
                   perl-module-try-tiny \
                   perl-module-exporter \
                   perl-module-carp \
                   perl-module-test-more \
                   perl-module-file-temp \
                   perl-module-test-builder-tester \
                   perl-module-list-util \
                   perl-module-build-tiny \
                   perl-module-build-tiny-native \
                   perl-module-xsloader \
                   perl-module-tap-harness-env \
                   perl-module-extutils-install \
                   perl-module-cpan-meta \
                   perl-module-file-path \
                   perl-module-extutils-cbuilder \
                   perl-module-getopt-long \
                   perl-module-extutils-helpers \
                   perl-module-text-parsewords \
                   perl-module-load \
                   perl-module-data-dumper \
                   perl-module-extutils-parsexs \
                   perl-module-pod-man \
                   perl-module-extutils-installpaths \
                   perl-module-extutils-config \
                   perl-module-json-pp \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=8f452e993a18ffdaa761b9b0543942bf"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/E/ET/ETHER/Class-Method-Modifiers-${PV}.tar.gz"
SRC_URI[md5sum] = "32e8bf0e68524866cbc8ae763eb08e74"
SRC_URI[sha256sum] = "bc87f0e187cea1caa724ddbf7088f41403939289ecf783de74f805e3a9fdd25d"

S = "${WORKDIR}/Class-Method-Modifiers-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
