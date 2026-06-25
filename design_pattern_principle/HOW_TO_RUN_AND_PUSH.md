# How to Run These Projects in Eclipse and Push to GitHub

Folder structure already created:

```
2-design_pattern_principle/
  Exercise1_SingletonPatternExample/src/*.java
  Exercise2_FactoryMethodPatternExample/src/*.java
  Exercise3_BuilderPatternExample/src/*.java
  Exercise4_AdapterPatternExample/src/*.java
  Exercise5_DecoratorPatternExample/src/*.java
  Exercise6_ProxyPatternExample/src/*.java
  Exercise7_ObserverPatternExample/src/*.java
  Exercise8_StrategyPatternExample/src/*.java
  Exercise9_CommandPatternExample/src/*.java
  Exercise10_MVCPatternExample/src/*.java
  Exercise11_DependencyInjectionExample/src/*.java
```

Each exercise's files use the default (no) package, so all `.java` files for one exercise must stay together in the same source folder.

## Part 1 — Run in Eclipse, from scratch

### 1. Install Eclipse (skip if already installed)

1. Go to https://www.eclipse.org/downloads/.
2. Download the **Eclipse Installer**.
3. Run the installer, choose **Eclipse IDE for Java Developers**.
4. Pick an install location, click **Install**, accept the license, let it finish, click **Launch**.
5. When asked for a workspace folder, pick any folder (e.g. `C:\Users\eshna\eclipse-workspace`) and click **Launch**.

### 2. Create a project for each exercise

Repeat this for each of the 11 exercises (example uses Exercise1):

1. In Eclipse, go to **File → New → Java Project**.
2. Project name: `Exercise1_SingletonPatternExample`.
3. Leave JRE as the default, click **Finish**. If a "Module-Info" dialog pops up, click **Don't Create**.
4. Eclipse creates the project with an empty `src` folder.
5. In Windows File Explorer, open:
   `C:\Users\eshna\OneDrive\Desktop\javafse\2-design_pattern_principle\Exercise1_SingletonPatternExample\src`
6. Select the `.java` files inside (`Logger.java`, `SingletonTest.java`), copy them (Ctrl+C).
7. In Eclipse's **Package Explorer**, expand the new project, right-click the `src` folder → **Paste** (Ctrl+V). Confirm overwrite if asked.
8. The files appear under `src` with a red/yellow icon disappearing once compiled (Eclipse auto-builds).

Alternative to steps 2–7 (faster, one-shot import):

1. **File → Import → General → File System**, click **Next**.
2. Browse to `C:\Users\eshna\OneDrive\Desktop\javafse\2-design_pattern_principle\Exercise1_SingletonPatternExample`.
3. Check the `src` folder, set "Into folder" to the matching Eclipse project's `src`, click **Finish**.

Do this for all 11 folders, creating 11 separate Eclipse projects with matching names.

### 3. Run each exercise

1. In **Package Explorer**, expand the project → `src`.
2. Right-click the file containing `public static void main` (e.g. `SingletonTest.java`).
3. Choose **Run As → Java Application**.
4. Output appears in the **Console** view at the bottom.
5. To re-run later: select the file, press **Ctrl+F11**, or use the green Run button's dropdown to pick a previously run class.

Files with a `main` method (the ones to run) per exercise:

- Exercise1: `SingletonTest`
- Exercise2: `FactoryMethodTest`
- Exercise3: `BuilderTest`
- Exercise4: `AdapterTest`
- Exercise5: `DecoratorTest`
- Exercise6: `ProxyTest`
- Exercise7: `ObserverTest`
- Exercise8: `StrategyTest`
- Exercise9: `CommandTest`
- Exercise10: `MVCTest`
- Exercise11: `DependencyInjectionTest`

### 4. Troubleshooting

- **Red X on a file**: open it, check for a typo introduced by manual copy-paste; Eclipse underlines the exact error.
- **"main" not found**: make sure you right-clicked the test class itself (the one with `public static void main`), not the project.
- **Wrong JRE / compiler version error**: right-click project → **Properties → Java Compiler**, set compiler level to 11 or higher, or right-click → **Properties → Java Build Path → Libraries**, ensure a JRE is listed.

## Part 2 — Push the code to GitHub using VS Code

### 1. One-time setup

1. Install Git: https://git-scm.com/downloads — run the installer with default options.
2. Install VS Code: https://code.visualstudio.com/ if not already installed.
3. Open VS Code, go to **Extensions** (Ctrl+Shift+X), confirm **GitHub Pull Requests and Issues** or just rely on built-in Git support (already bundled, no extension required for basic push).
4. Open a terminal in VS Code (**Terminal → New Terminal**) and configure Git identity (one-time, skip if already done):
   ```
   git config --global user.name "Your Name"
   git config --global user.email "chandanieshna20@gmail.com"
   ```

### 2. Create the GitHub repository

1. Go to https://github.com and log in.
2. Click the **+** icon top-right → **New repository**.
3. Repository name: e.g. `design-pattern-exercises`.
4. Leave it **Public** or **Private** as you prefer.
5. Do **NOT** check "Add a README" (you already have local files).
6. Click **Create repository**.
7. Copy the repository URL shown, e.g. `https://github.com/<your-username>/design-pattern-exercises.git`.

### 3. Open the folder in VS Code

1. **File → Open Folder**.
2. Select `C:\Users\eshna\OneDrive\Desktop\javafse\2-design_pattern_principle`.
3. Click **Select Folder**. VS Code reloads with that folder as the workspace root.

### 4. Initialize Git and push (terminal commands)

Open **Terminal → New Terminal** in VS Code (it opens already inside the folder) and run, one line at a time:

```
git init
git add .
git commit -m "Add design pattern exercises 1-11"
git branch -M main
git remote add origin https://github.com/<your-username>/design-pattern-exercises.git
git push -u origin main
```

Notes:

- Replace `<your-username>` and the repo name with the actual values copied in step 2.
- On the first `git push`, a browser window or VS Code dialog will ask you to sign in to GitHub — sign in and authorize.
- If `git push` fails with "rejected" because the remote isn't empty, run `git pull origin main --allow-unrelated-histories` first, resolve any conflicts, then push again.

### 5. Equivalent steps using VS Code's UI (no typed git commands except remote setup)

1. Click the **Source Control** icon in the left sidebar (branch icon, Ctrl+Shift+G).
2. Click **Initialize Repository**.
3. Type a commit message at the top (e.g. "Add design pattern exercises 1-11").
4. Click the **✓ Commit** button (stages and commits all files; click "Yes" if asked to stage all changes automatically).
5. Click **Publish Branch** (appears after the first commit).
6. Choose **Publish to GitHub**, sign in if prompted, choose public/private, and confirm. VS Code creates the remote repo and pushes in one step (use this instead of Part 2 if you haven't created the GitHub repo manually yet).

### 6. Verify

1. Go to your repository page on github.com.
2. Confirm all 11 `Exercise*` folders and their `.java` files appear.
3. Future changes: edit files, then repeat `git add .`, `git commit -m "message"`, `git push` (or the Source Control panel equivalents).
