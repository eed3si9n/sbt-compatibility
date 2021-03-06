
lazy val a = project
  .settings(
    version := "0.1.1-SNAPSHOT",
    addedIn := Some("0.1.1"),
    check := {
      val prev = previousVersions.value
      val expected = Seq()
      assert(prev == expected, s"prev=$prev, expected=$expected")
    }
  )

lazy val b = project
  .settings(
    version := "0.1.1-SNAPSHOT",
    addedIn := Some("0.1.0"),
    check := {
      val prev = previousVersions.value
      val expected = Seq("0.1.0")
      assert(prev == expected, s"prev=$prev, expected=$expected")
    }
  )

lazy val check = taskKey[Unit]("")

