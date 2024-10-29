require at91bootstrap.inc

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES/MIT.txt;md5=12c44f58fe16bd407f016e45950c2f3d"

COMPATIBLE_MACHINE = '(sama5d2-icp-sd\
|sama5d2-ptc-ek|sama5d2-ptc-ek-sd\
|sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc\
|sama5d27-som1-ek|sama5d27-som1-ek-sd|sama5d27-som1-ek-optee-sd\
|sama5d27-wlsom1-ek-sd\
|sama5d29-curiosity-sd\
|sama5d3-xplained|sama5d3-xplained-sd\
|sama5d4-xplained|sama5d4-xplained-sd\
|sama7g5ek-sd|sama7g5ek-emmc|sama7g5ek-ospi|sama7g5ek-optee-sd\
|sam9x60ek|sam9x60ek-sd\
|sam9x60-curiosity|sam9x60-curiosity-sd\
|sam9x75-curiosity|sam9x75-curiosity-sd|sam9x75eb|sam9x75eb-sd\
)'

SRC_URI = "git://github.com/linux4sam/at91bootstrap.git;protocol=https;branch=at91bootstrap-4.x"

PV = "4.0.10+git${SRCPV}"
SRCREV = "60de1589f6925818f91f100e8c03b09d6fb129aa"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = 'CROSS_COMPILE=${TARGET_PREFIX} CC=${TARGET_PREFIX}gcc EXTRA_CC_ARGS="${TOOLCHAIN_OPTIONS}"'

AT91BOOTSTRAP_BIN_PATH = "${S}/build/binaries"

AT91BOOTSTRAP_CONFIG_PATH = "${S}/configs"
