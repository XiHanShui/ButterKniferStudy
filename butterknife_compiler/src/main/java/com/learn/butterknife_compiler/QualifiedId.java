package com.learn.butterknife_compiler;

/**
* Author: WJ
* Date: 2018/8/5
* Description: 
* VersionCode: 1.0
*/

final class QualifiedId {
    final String packageName;
    final int id;

    QualifiedId(String packageName, int id) {
        this.packageName = packageName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "QualifiedId{packageName='" + packageName + "', id=" + id + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QualifiedId)) return false;
        QualifiedId other = (QualifiedId) o;
        return id == other.id
                && packageName.equals(other.packageName);
    }

    @Override
    public int hashCode() {
        int result = packageName.hashCode();
        result = 31 * result + id;
        return result;
    }
}
