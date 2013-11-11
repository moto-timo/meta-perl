SUMMARY = "Module::Runtime - runtime module handling"
DESCRIPTION = "The functions exported by this module deal with runtime \
handling of Perl modules, which are normally handled at compile time. This \
module avoids using any other modules, so that it can be used in low-level \
infrastructure. \
\
The parts of this module that work with module names apply the same syntax \
that is used for barewords in Perl source. In principle this syntax can vary \
between versions of Perl, and this module applies the syntax of the Perl on \
which it is running. In practice the usable syntax hasn't changed yet, but \
there's a good chance of it changing in Perl 5.18. \
\
The functions of this module whose purpose is to load modules include \
workarounds for three old Perl core bugs regarding require. These workarounds \
are applied on any Perl version where the bugs exist, except for a case where \
one of the bugs cannot be adequately worked around in pure Perl. \
"
HOMEPAGE = "http://search.cpan.org/~zefram/Module-Runtime/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
RDEPENDS_${PN} = " perl-module-test-more \
                   perl-module-strict \
                   perl-module-build \
"

LIC_FILES_CHKSUM = "file://README;beginline=42;endline=43;md5=62e24a93342fede7221d66335c716f34"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/Z/ZE/ZEFRAM/Module-Runtime-${PV}.tar.gz"
SRC_URI[md5sum] = "62b88b1f5f0e975a5d7c80cd46167b97"
SRC_URI[sha256sum] = "ec37e03d90dc905679dab62a82f42cf0897ed79244b87fd9d531438dc3c31023"

S = "${WORKDIR}/Module-Runtime-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
