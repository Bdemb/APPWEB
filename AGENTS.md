<!-- LOVABLE:BEGIN -->
> [!IMPORTANT]
> This project is connected to [Lovable](https://lovable.dev). Avoid rewriting
> published git history — force pushing, or rebasing/amending/squashing commits
> that are already pushed — as it rewrites history on Lovable's side and the
> user will likely lose their project history.
>
> Commits you push to the connected branch sync back to Lovable and show up in
> the editor, so keep the branch in a working state.
<!-- LOVABLE:END -->
- Fixed 1024x600 stage scaled to fit; Android shell in android-launcher/ loads the published web UI in a WebView and exposes the AndroidLauncher JS bridge (src/lib/launcher.ts) — keep both sides in sync.
- Keep navigation provider URLs and package identities in a browser-safe shared module so preview and launch choices stay aligned.
- Embed third-party maps only in ordinary browsers, never in the Android bridge-bearing WebView; Android JavaScript interfaces are exposed to subframes, so the shell opens the selected native map app instead.
- Do not rely on Tailwind `h-full`/`w-full` utility classes — they are absent from this project's built CSS (verified in the stylesheet); size SVGs and images with explicit width/height styles or `size-*` classes instead, or elements render at 16px.
- Weather uses a browser-only public Open-Meteo query in its own component; do not replace failed or stale observations with demo values, so the dashboard never presents invented live weather.
