SUMMARY = "Module::Build::WithXSpp - XS++ enhanced flavour of Module::Build"
DESCRIPTION = "This subclass of Module::Build adds some tools and processes \
to make it easier to use for wrapping C++ using XS++ (ExtUtils::XSpp). \
 \
There are a few minor differences from using Module::Build for an ordinary \
XS module and a few conventions that you should be aware of as an XS++ module \
author. They are documented in the 'FEATURES AND CONVENTIONS' section below. \
But if you can't be bothered to read all that, you may choose skip it and \
blindly follow the advice in 'JUMP START FOR THE IMPATIENT'. \
 \
An example of a full distribution based on this build tool can be found in the \
ExtUtils::XSpp distribution under examples/XSpp-Example. Using that example as \
the basis for your Module::Build::WithSXpp-based distribution is probably a \
good idea. \
"
HOMEPAGE = "http://search.cpan.org/~smueller/Module-Build-WithXSpp/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;beginline=238;endline=241;md5=3d1e531fc3a9640a533e45f4e8792253"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/S/SM/SMUELLER/Module-Build-WithXSpp-${PV}.tar.gz"
SRC_URI[md5sum] = "f3d6ad08127f62eed9baef131870f450"
SRC_URI[sha256sum] = "53b3c8c8fdbd50fc3dad3d19da20f1b6414ef70665b9311710c802969e746934"

S = "${WORKDIR}/Module-Build-WithXSpp-${PV}"

inherit cpan_build

do_install () {
        # Install Module/Build/WithXSpp.pm in @INC 
        install ${S}/lib/Module/Build/WithXSpp.pm ${PERL_ARCHLIB}/Module/Build/
        
        cpan_build_do_install
}

RDEPENDS_${PN} = " perl-module-digest-md5 \
                   perl-module-extutils-parsexs \
                   perl-module-extutils-xspp \
                   perl-module-test-base \
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

BBCLASSEXTEND = "native"
