# SPIDERBEETLE

**Real home for the PARENA-Java-emitter Android app** (kanban cruise-queue card 32445324,
"PARENA android app in JAVA using PARENA using the JAVA emitter"). Upstream repo created
2026-09-03; this checkout starts real, not empty — see "Status" below.

## What this is

A real proof that PARENA's own Java emission target (`parena build ... -o Foo.java`) can power a
real Android app: business logic is written once, in PARENA (`.prn`), compiled to plain `.java`
source, and included directly in an Android app's own `src/main/java/` tree — no bridging layer,
since `.java` is already a first-class source language Android's own Gradle toolchain compiles
natively alongside Kotlin.

`MJOLNIR` is this monorepo's own real, existing Android app (Kotlin/Jetpack Compose, FCM push,
an Apple feed) — the real reference for what a real app here does, and for what Android build
tooling this monorepo already assumes exists elsewhere (this box doesn't have it locally; see
"Status" below).

## Status (2026-09-03)

**Real and verified**: `app/src/main/java/industrial/einhorn/spiderbeetle/generated/BatteryUi.java`
— compiled via the real `parena build` (Java target) from `PARENA/stdlib/android/battery_ui.prn`,
placed at its own real Maven/Gradle-convention path so `parena`'s own `java_package_name_from_path`
derives the correct `package industrial.einhorn.spiderbeetle.generated;` automatically. Two real,
minimal, scalar decision functions: `shouldShowLowBatteryWarning(int batteryPct, boolean
isCharging)` and `clampBrightness(double requested)`. Verified with an actual JDK
(`javac`/`java 25.0.4`) against `smoke_test/Main.java` — 7 real assertions, all pass (see that
file's own header comment for the exact compile/run commands).

**Real, honest, NOT yet built**: an actual Android app. Checked directly, not assumed: this
sandbox has no Android SDK (`ANDROID_HOME`/`ANDROID_SDK_ROOT` unset, no `sdkmanager`/`adb`/
`gradlew` present), and `MJOLNIR` itself — this monorepo's own real, existing Android app — has
no `gradlew` wrapper checked out locally either, confirming even that established app is never
actually built in this sandbox, only via real CI or the founder's own machine. No
`build.gradle.kts`, no `AndroidManifest.xml`, no Activity exist here yet — see `NORTHSTAR.md` for
the real, concrete, unattempted next steps, named honestly rather than guessed at.

## Related

- `PARENA` — the language and compiler; `stdlib/android/battery_ui.prn` is the real source this
  repo's own generated Java comes from, `docs/ANDROID_JAVA_TARGET_NORTHSTAR.md`'s original
  scoping note now supersedes into this repo's own `NORTHSTAR.md`.
- `MJOLNIR` — this monorepo's own real, existing Android app; the real reference point for scope,
  conventions, and build tooling.
- `EMILY` — RSI loop / backlog coordination for cross-repo work.
