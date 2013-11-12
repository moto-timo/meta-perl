SUMMARY = "IO::Scalar - IO:: interface for reading/writing a scalar"
DESCRIPTION = "This class is part of the IO::Stringy distribution; see \
IO::Stringy for change log and general information. \
\
The IO::Scalar class implements objects which behave just like IO::Handle (or \
FileHandle) objects, except that you may use them to write to (or read from) \
scalars. These handles are automatically tiehandle'd (though please see \
'WARNINGS' for information relevant to your Perl version). \
"

HOMEPAGE = "http://search.cpan.org/~dskoll/IO-Scalar/"
SECTION = "devel"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://COPYING;md5=01406e4ff2e60d88d42ef1caebdd0011"


SRC_URI = "http://search.cpan.org/CPAN/authors/id/D/DS/DSKOLL/IO-stringy-${PV}.tar.gz"
SRC_URI[md5sum] = "2e6a976cfa5521e815c1fdf4006982de"
SRC_URI[sha256sum] = "7e3cf438b3938a2692cb502704c0bbfa2c5ec4a5071ab77906a2432126b004ee"

S = "${WORKDIR}/IO-stringy-${PV}"

inherit cpan

RDEPENDS_${PN} = "  \
"

BBCLASSEXTEND = "native"
