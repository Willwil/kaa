#
# Copyright 2014-2015 CyberVision, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

include(CMakeForceCompiler)

if(NOT DEFINED KAA_TOOLCHAIN_PATH)
  set(KAA_ARM_TOOLCHAIN "/opt/kaa/gcc-arm-none-eabi")
  set(CC32XX_SDK "/opt/kaa/cc3200-sdk")
else()
  set(KAA_ARM_TOOLCHAIN "${KAA_TOOLCHAIN_PATH}/gcc-arm-none-eabi")
  set(CC32XX_SDK "${KAA_TOOLCHAIN_PATH}/cc3200_sdk")
endif()

set(CMAKE_C_COMPILER   "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-gcc")
#set(CMAKE_AR           "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-ar")
#set(CMAKE_LINKER       "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-ld")
#set(CMAKE_OBJCOPY      "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-objcopy")
#set(CMAKE_OBJDUMP      "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-objdump")
#set(CMAKE_NM           "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-nm")
#set(CMAKE_RANLIB       "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-ranlib")
#set(CMAKE_STRIP        "${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-strip")

CMAKE_FORCE_C_COMPILER(${KAA_ARM_TOOLCHAIN}/bin/arm-none-eabi-gcc GNU)

set(CMAKE_C_FLAGS "-mthumb -mcpu=cortex-m4 -ffunction-sections -fdata-sections -MD -std=c99 -g -O0 -static"  CACHE STRING "" FORCE)
set(CMAKE_A_FLAGS "-mthumb -mcpu=cortex-m4 -MD -static"  CACHE STRING "" FORCE)

set(CC32XX_INCDIRS ${CC32XX_SDK}/inc
                   ${CC32XX_SDK}/driverlib
                   ${CC32XX_SDK}/oslib
                   ${CC32XX_SDK}/simplelink
                   ${CC32XX_SDK}/simplelink/include
                   ${CC32XX_SDK}/simplelink/source
                   ${CC32XX_SDK}/example/common
   )

set(KAA_INCLUDE_PATHS ${KAA_INCLUDE_PATHS} ${CC32XX_INCDIRS})
