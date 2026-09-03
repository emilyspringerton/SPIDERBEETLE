# Changelog

## 2026-09-03

- Real, checked-out home for the PARENA-Java-emitter Android app (kanban cruise-queue card
  32445324). `app/src/main/java/industrial/einhorn/spiderbeetle/generated/BatteryUi.java`
  compiled via the real `parena build` (Java target) from `PARENA/stdlib/android/battery_ui.prn`,
  at its own real Maven/Gradle-convention path so the package declaration derives automatically.
  Verified with an actual JDK (`javac`/`java 25.0.4`) against `smoke_test/Main.java` — 7 real
  assertions, all pass. Real, honest, not yet built: an actual Android project (no Android SDK in
  this sandbox, `MJOLNIR` itself has no `gradlew` checked out locally either) — see
  `NORTHSTAR.md`'s own real, concrete, unattempted next steps. (sess-20260902-2008-ed50169e)
