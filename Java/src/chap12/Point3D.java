package chap12;

class Point3D extends Point2D {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	void setZ(int z) {
		this.z = z;
	}

	int getZ() {
		return z;
	}

}
