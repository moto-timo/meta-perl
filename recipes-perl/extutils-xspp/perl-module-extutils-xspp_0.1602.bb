SUMMARY = "ExtUtils::XSpp - XS for C++"
DESCRIPTION = "XS++ is just a thin layer over plan XS, hence to use it you \
are supposed to know, at the very least, C++ and XS. \
\
This means that you may need typemaps for both the normal SX pre-processor \
xsubpp and the XS++ pre-processor xspp. More on that in the TYPEMAPS section.\
"
HOMEPAGE = "http://search.cpan.org/~smueller/ExtUtils-XSpp/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-test-base \
                   perl-module-test-more \
                   perl-module-filter-util-call \
                   perl-module-extutils-makemaker \
                   perl-module-spiffy \
                   perl-module-test-differences \
                   perl-module-text-diff \
                   perl-module-algorithm-diff \
                   perl-module-exporter \
                   perl-module-data-dumper \
                   perl-module-build \
                   perl-module-digest-md5 \
                   perl-module-extutils-parsexs \
"

LIC_FILES_CHKSUM = "file://README;beginline=230;endline=231;md5=b2725e2164ecaeab82c4f6bd861a9b7f"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/M/MB/MBARBON/ExtUtils-XSpp-${PV}.tar.gz"
SRC_URI[md5sum] = "449c8c6d1c2fdd8fd06eb671f94faf4d"
SRC_URI[sha256sum] = "3f54ebc00ee663fb014db9970ce789e1a4152caa5ef96212c567678339a3f78f"

S = "${WORKDIR}/ExtUtils-XSpp-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
