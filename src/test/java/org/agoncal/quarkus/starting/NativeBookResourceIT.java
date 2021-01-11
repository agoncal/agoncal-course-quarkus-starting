package org.agoncal.quarkus.starting;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeBookResourceIT extends BookResourceTest {

    // Execute the same tests but in native mode.
}