TEMPLATE = app
TARGET = penguin_advanced
DESTDIR = ../../../bin/qt3d/tutorials
CONFIG += qt warn_on qt3d
SOURCES = modelview.cpp \
    main.cpp
HEADERS = modelview.h
RESOURCES = model_advanced.qrc

symbian {
    vendorinfo = \
     "%{\"Nokia\"}" \
     ":\"Nokia\""

    my_deployment.pkg_prerules = vendorinfo
    DEPLOYMENT += my_deployment

    ICON = ../qt3d.svg

    TARGET.EPOCHEAPSIZE = 0x40000 0x4000000
}
