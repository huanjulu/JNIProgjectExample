
#include "jniproject_ndkproject_MainActivity.h"

JNIEXPORT jstring JNICALL Java_jniproject_ndkproject_MainActivity_nativeMethod
       (JNIEnv *env, jclass type) {

    return env->NewStringUTF("this code from jni cpp");
}
