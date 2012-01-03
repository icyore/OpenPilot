INCLUDEPATH += $$PWD
VPATH += $$PWD
HEADERS += \
    surfaces/qglabstractsurface.h \
    surfaces/qglframebufferobjectsurface.h \
    surfaces/qglpixelbuffersurface.h \
    surfaces/qglsubsurface.h \
    surfaces/qglwidgetsurface.h
SOURCES += \
    qglabstractsurface.cpp \
    qglcontextsurface.cpp \
    qgldrawbuffersurface.cpp \
    qglframebufferobjectsurface.cpp \
    qglmaskedsurface.cpp \
    qglpaintersurface.cpp \
    qglpixelbuffersurface.cpp \
    qglsubsurface.cpp \
    qglwidgetsurface.cpp
PRIVATE_HEADERS += \
    qglcontextsurface_p.h \
    qgldrawbuffersurface_p.h \
    qglmaskedsurface_p.h \
    qglpaintersurface_p.h
