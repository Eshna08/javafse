# Push design_pattern_principle into your existing javafse repo

Your repo: https://github.com/Eshna08/javafse
New folder to create in it: `design_pattern_principle` (sibling to your existing `algorithms_data_structures` folder)

Your local source files are here:
`C:\Users\eshna\OneDrive\Desktop\javafse\2-design_pattern_principle`

Note: that path already has "javafse" in it, but it is just a local folder you used as a workspace — it is **not** the cloned git repo. Clone the real repo to a separate location to avoid name confusion.

## 1. Clone the repo

Open a terminal (VS Code → Terminal → New Terminal, or PowerShell) and run:

```
cd C:\Users\eshna\OneDrive\Desktop
git clone https://github.com/Eshna08/javafse.git javafse-repo
```

This creates `C:\Users\eshna\OneDrive\Desktop\javafse-repo`, containing your existing `algorithms_data_structures` folder.

## 2. Create the new folder and copy the files in

Still in the terminal:

```
mkdir "C:\Users\eshna\OneDrive\Desktop\javafse-repo\design_pattern_principle"
xcopy "C:\Users\eshna\OneDrive\Desktop\javafse\2-design_pattern_principle\*" "C:\Users\eshna\OneDrive\Desktop\javafse-repo\design_pattern_principle\" /E /I
```

(`xcopy /E /I` copies all subfolders and files, including the `Exercise1...` through `Exercise11...` folders and the guide `.md` files.)

If you'd rather do it by hand: open File Explorer, copy everything inside `2-design_pattern_principle` (the 11 `Exercise*` folders + the two `.md` guides), and paste it into the new `javafse-repo\design_pattern_principle` folder.

## 3. Commit and push

```
cd C:\Users\eshna\OneDrive\Desktop\javafse-repo
git add design_pattern_principle
git commit -m "Add design pattern exercises 1-11"
git push
```

If `git push` asks you to sign in, authenticate with your GitHub account in the browser window that opens.

## 4. Verify

Go to https://github.com/Eshna08/javafse and confirm a new `design_pattern_principle` folder appears alongside `algorithms_data_structures`, containing all 11 exercise subfolders.

## 5. Open in VS Code going forward

Once pushed, you can open `C:\Users\eshna\OneDrive\Desktop\javafse-repo` directly in VS Code (**File → Open Folder**) to keep working on this repo — it's now a proper git-tracked clone, so future commits just need:

```
git add .
git commit -m "your message"
git push
```
