FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG:remove = " \
    backlight \
    binfmt \
    gshadow \
    firstboot \
    hibernate \
    ima \
    localed \
    logind \
    machined \
    nss \
    nss-mymachines \
    nss-resolve \
    polkit \
    pam \
    quotacheck \
    randomseed \
    seccomp \
    smack \
    sysusers \
    sysvinit \
    utmp \
    vconsole \
"
