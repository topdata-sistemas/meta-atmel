require linux.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${P}:"
PV = "6.6+git${SRCPV}"

LINUX_VERSION="6.6"

KBRANCH = "topdata-202404-rt"
SRC_URI = "git:///home/topdata/repos/linux-at91.git;protocol=file;branch=${KBRANCH} \
           file://userinput.cfg"

# kernel fragments
SRC_URI:append:sama5      = " file://sama5.cfg"
SRC_URI:append:sama5d2    = " file://greengrass.cfg"
SRC_URI:append:\
sama5d27-som1-ek-optee-sd = " file://sama5-linux-optee.cfg \
                              file://sama5d2/0001-dts-include-optee-dtsi.patch \
                              "
SRC_URI:append:sam9x60    = " file://at91_dt.cfg"
SRC_URI:append:\
sama7g5ek-optee-sd	  = " file://sama7g5ek-linux-optee.cfg \
                              file://sama7g5ek/0001-dts-include-optee-dtsi.patch \
			      file://sama7g5ek/0002-ARM-dts-microchip-at91-sama7g5ek-use-scmi0_clock-ins.patch \
                              "

SRCREV = "93c01d497310ae8bc531becd719b179a84bc2128"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_MODULE_AUTOLOAD:append:sama5d27-wlsom1-ek-sd = " wilc-sdio"

COMPATIBLE_MACHINE = "(at91sam9x5ek|at91sam9m10g45ek|at91sam9rlek\
|sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc\
|sama5d2-ptc-ek|sama5d2-ptc-ek-sd\
|sama5d2-icp-sd\
|sama5d27-som1-ek|sama5d27-som1-ek-sd|sama5d27-som1-ek-optee-sd\
|sama5d27-wlsom1-ek-sd\
|sama5d29-curiosity-sd\
|sama5d3-xplained|sama5d3-xplained-sd|sama5d3xek\
|sama5d4-xplained|sama5d4-xplained-sd|sama5d4ek\
|sama7g5ek|sama7g5ek-sd|sama7g5ek-optee-sd\
|sam9x60-curiosity|sam9x60-curiosity-sd|sam9x60ek|sam9x60ek-sd\
|sam9x75-curiosity|sam9x75-curiosity-sd|sam9x75eb|sam9x75eb-sd\
)"
