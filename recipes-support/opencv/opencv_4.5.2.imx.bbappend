inherit cmake_qt5

PACKAGECONFIG[qt5] = "-DWITH_QT=ON -DWITH_GTK=OFF -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_BINDIR_NATIVE}/qt5 -DCMAKE_PREFIX_PATH=${STAGING_BINDIR_NATIVE}/cmake,-DWITH_QT=ON,qtbase qtbase-native,"
DEPENDS += "qtbase"