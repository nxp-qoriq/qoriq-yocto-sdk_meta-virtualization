require xen.inc

SRC_URI = " \
    http://bits.xensource.com/oss-xen/release/${PV}/xen-${PV}.tar.gz \
    file://xen-xsm-Make-p-policyvers-be-a-local-variable-ver-to.patch \
    "

SRC_URI[md5sum] = "48e232f90927c08326a7b52bb06f49bc"
SRC_URI[sha256sum] = "6fa1c2431df55aa5950d248e6093b8c8c0f11c357a0adbd348a2186478e80909"

S = "${WORKDIR}/xen-${PV}"
