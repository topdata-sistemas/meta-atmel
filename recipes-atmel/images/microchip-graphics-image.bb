DESCRIPTION = "An image that includes EGT"
LICENSE = "MIT"
PR = "r0"

IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL += "\
	packagegroup-core-boot \
	packagegroup-core-full-cmdline \
	packagegroup-base-wifi \
	packagegroup-base-bluetooth \
	packagegroup-base-usbhost \
	packagegroup-base-usbgadget \
	openssh-sftp \
	openssh-sftp-server \
	kernel-modules \
	lrzsz \
	setserial \
	opkg \
	iperf3 \
	\
	nbench-byte \
	lmbench \
	\
	linux-firmware-ralink \
	linux-firmware-ath6k \
	mchp-wireless-firmware \
	\
	alsa-utils \
	mpg123 \
	i2c-tools \
	devmem2 \
	libgpiod-tools \
	dosfstools \
	libdrm-tests \
	mtd-utils \
	mtd-utils-ubifs \
	dtc \
	dtc-misc \
	iproute2 \
	iptables \
	bridge-utils \
	python3-pyserial \
	python3-smbus \
	python3-ctypes \
	python3-pip \
	mpio \
	gdb \
	evtest \
	usbutils \
	wget \
	dpkg-start-stop \
	${CORE_IMAGE_BASE_INSTALL} \
	\
	cjson \
	lua \
	libplanes \
	\
	libicui18n \
	gstreamer1.0 \
	gstreamer1.0-plugins-bad-meta \
	gstreamer1.0-plugins-base-meta \
	gstreamer1.0-plugins-good-meta \
	gstreamer1.0-plugins-ugly-meta \
	gstreamer1.0-libav \
	libv4l \
	v4l-utils \
	fswebcam \
	ffmpeg \
	\
	liberation-fonts \
	hostapd \
	9bit \
	rng-tools \
	bluez5 \
	wireless-regdb-static \
	libdrm \
	net-tools \
	nftables \
	phytool \
	tcpdump \
	kea \
        ${@oe.utils.conditional('SITEINFO_ENDIANNESS', 'le', 'libegt', '', d)} \
	noto-fonts \
	lohit-fonts \
	rsync \
	linuxptp \
	cryptoauthlib \
	python3-cryptoauthlib \
	p11-kit \
	strace \
	ltrace \
	stress-ng \
	systemd-analyze \
	tzdata \
	fb-test \
	socat \
"

IMAGE_INSTALL:append:at91sam9m10g45 = " \
	tslib tslib-conf tslib-tests tslib-calibrate "

IMAGE_INSTALL:append:at91sam9rl = " \
	tslib tslib-conf tslib-tests tslib-calibrate "

IMAGE_INSTALL:append:at91sam9x5 = " \
	tslib tslib-conf tslib-tests tslib-calibrate "

IMAGE_INSTALL:append:at91sam9rl = " \
	tslib tslib-conf tslib-tests tslib-calibrate "

IMAGE_INSTALL:append:at91sam9x5 = " \
	tslib tslib-conf tslib-tests tslib-calibrate "

IMAGE_INSTALL:append:sam9x60 = " \
	tslib tslib-conf tslib-tests tslib-calibrate \
    rt-tests \
	hostapd \
	bonnie++ "

IMAGE_INSTALL:append:sam9x75 = " \
        bonnie++ \
        video-capture-at91 \
	media-ctl \
	yavta "

IMAGE_INSTALL:append:sama5d4 = " \
	gstreamer1.0-plugins-hantro \
	g1-decoder \
	"

IMAGE_INSTALL:append:sama5d2-ptc-ek = " ptc-examples"
IMAGE_INSTALL:append:sama5d2-ptc-ek-sd = " ptc-examples"

IMAGE_INSTALL:append:sama5d27-som1-ek-sd = " wilc-demo-fs-overlay "
IMAGE_INSTALL:append:sama5d27-wlsom1-ek-sd = " ptc-examples \
                                               wilc-demo-fs-overlay \
                                               "

IMAGE_INSTALL:append:sama5d2 = " video-capture-at91 \
				libv4l v4l-utils media-ctl yavta \
				"
IMAGE_INSTALL:append:sam9x60-curiosity = " wilc-demo-fs-overlay "
IMAGE_INSTALL:append:sam9x60-curiosity-sd = " wilc-demo-fs-overlay "

IMAGE_INSTALL:append:sam9x75-curiosity = " wilc-demo-fs-overlay "
IMAGE_INSTALL:append:sam9x75-curiosity-sd = " nginx wireless-kit-webpages \
					      ble-bluez-hci-apps \
					      libcamera-mchp \
					      wilc-demo-fs-overlay "

inherit core-image siteinfo

TOOLCHAIN_HOST_TASK += "nativesdk-swig"

# Required dependencies to build EGT with the SDK.
TOOLCHAIN_TARGET_TASK += " \
    lua-dev \
    lua-staticdev \
    libstdc++-dev \
    "
IMAGE_INSTALL:append:sama5d27-som1-ek-optee-sd = " optee-os optee-test optee-examples \
				wilc-demo-fs-overlay "
