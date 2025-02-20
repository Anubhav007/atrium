package ch.tutteli.atrium.specs.integration

import ch.tutteli.atrium.api.fluent.en_GB.toBe
import ch.tutteli.atrium.api.verbs.internal.expect
import ch.tutteli.atrium.creating.Expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths

abstract class FileAssertionsSpec(
    asPath: Expect<File>.(Expect<Path>.() -> Unit) -> Expect<File>
) : Spek({

    describe("something") {
        it("something else") {
            val path = "/foo/bar"
            expect(File(path)).asPath { toBe(Paths.get(path)) }
        }
    }
})
