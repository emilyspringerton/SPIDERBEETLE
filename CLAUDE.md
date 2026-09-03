# SPIDERBEETLE

## What This Is

Real home for the PARENA-Java-emitter Android app (kanban cruise-queue card 32445324). See
`README.md` for the real, current status and `NORTHSTAR.md` for the full real scope/plan
(what's shipped, what's honestly not attempted, and why — no Android SDK in this sandbox).

## Status

Real and verified: `app/src/main/java/industrial/einhorn/spiderbeetle/generated/BatteryUi.java`,
compiled from `PARENA/stdlib/android/battery_ui.prn` via the real Java emitter, verified with an
actual JDK against `smoke_test/Main.java` (7 real assertions, all pass). Not yet built: any real
Android project (Gradle/Manifest/Activity) — this sandbox has no Android SDK, see `NORTHSTAR.md`.

## Related Repos

- `PARENA` — the language/compiler; `stdlib/android/*.prn` is the real source this repo's own
  generated Java comes from.
- `MJOLNIR` — this monorepo's own real, existing Android app; the real reference for scope and
  build tooling (Kotlin/Jetpack Compose, FCM push, an Apple feed).
- `EMILY` — RSI loop / backlog coordination for cross-repo work.

## Founder Real-Time Direction

Whenever the founder gives real-time direction — a new ask, a correction, a "can we also..." —
route it through `emily observe -s info "Founder real-time: <summary>"` first, even if it isn't
this repo's usual domain, then sprint-plan it into `EMILY/BACKLOG.md` (`emily backlog curate`,
scoped into a real SECTION/sub-item, not just a one-line log), and only then implement. See
`EMILY/docs/THE_EMILY_WAY.md` Principle 18 ("Pave the Cow Paths").

## Apple Filing Protocol

After any meaningful change, file an Apple:
```bash
emily apples post -t completion -repo SPIDERBEETLE "<title>" "<body with commit hash>"
```
Then mark the item done in `EMILY/BACKLOG.md` and commit.

## CHANGELOG Protocol

After any meaningful change, update CHANGELOG.md:
```bash
emily changelog add SPIDERBEETLE "<what changed>"
# or manually: append a dated bullet under ## YYYY-MM-DD in SPIDERBEETLE/CHANGELOG.md
```

## Golden Doc Registration

If you create a new NORTHSTAR.md, architecture spec, or mission-critical design doc in this repo,
append a row to `EMILY/context/golden-docs-index.md` so Emily Prime picks it up on the next cycle.
Then commit and push EMILY.

## Frame-Break Reframing

Founder-sourced prompting technique (REDGARDEN/NORTHSTAR.md §28, full origin in
REDGARDEN/docs2/MULTI_AGENT_RD_RESEARCH_NOTES.md §5): given a request, name the underlying
structural/systemic pattern it's one instance of — one level of abstraction up — as an added
lens during planning/triage/judgment calls. Use it to spot the general case behind a specific
ask. It augments judgment, it does not replace doing the work: direct, concrete execution of
the literal task asked for still happens every time.

## Commit Protocol (standing instruction)

Always commit and push completed work immediately — don't wait to be asked. This is the default for every repo in this monorepo.

Every commit — human-written or produced by automated code paths (git-commit helpers in emily-agent, emily.cli, IDUNA handlers, etc.) — must carry the active `emily session` fingerprint as a `session: <tag>` trailer (blank line, then the trailer). This was silently missing from several independently-implemented automated commit helpers across the monorepo until an audit on 2026-08-10 (founder, real-time: "where in the fuck is my llm session id anywhere"). If you add a new automated git-commit code path anywhere, wire in the session tag the same way — don't assume an existing helper already does it.
