SUMMARY = "Test::CheckDeps - Check for presence of dependencies"
DESCRIPTION = "This subclass of Module::Build adds some tools and processes \
"
HOMEPAGE = "http://search.cpan.org/~leont/Test-CheckDeps/"
SECTION = "dev"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-cpan-meta-check \
                   perl-module-module-metadata \
                   perl-module-extutils-makemaker \
                   perl-module-file-spec \
                   perl-module-io-handle \
                   perl-module-env \
                   perl-module-exporter \
                   perl-module-test-more \
                   perl-module-cpan-meta-requirements \
                   perl-module-cpan-meta \
                   perl-module-test-deep \
                   perl-module-list-util \
                   perl-module-test-tester \
                   perl-module-test-nowarnings \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=78fb130dca823672631b53a1ca72a4e1"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/L/LE/LEONT/Test-CheckDeps-${PV}.tar.gz"
SRC_URI[md5sum] = "c1893b187e9b2efee7d40b1799218576"
SRC_URI[sha256sum] = "66fccca6c6f330e7ecc898bd6a51846e2145b3e02d78c4997ba6b7de23b551ee"

S = "${WORKDIR}/Test-CheckDeps-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
