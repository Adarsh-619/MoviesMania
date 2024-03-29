# Movies Mania

## Project Requirements

### Front-End

1. React (Vite)

### Back-End

1. SpringBoot
2. MongoDB

### Software Requirements

1. Java JDK (Latest LTS)
2. Intellij IDEA
3. Visual Studio Code
4. MongoDB
5. NodeJS


**Installation related details specific to Front-end and Back-end are there in their respective directories**


## How to run?
1. You will need to install the following applications:

    | **Windows**                                                                                     | **Mac (ARM-M1/M2)**                                                                               |
    |-------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|
    | [Intellij Idea](https://download.jetbrains.com/idea/ideaIC-2023.2.3.exe)                        | [Intellij Idea](https://download.jetbrains.com/idea/ideaIC-2023.2.3-aarch64.exe)                  |
    | [Java-17](https://download.oracle.com/java/17/archive/jdk-17.0.9_windows-x64_bin.exe)           | [Java-17](https://download.oracle.com/java/17/archive/jdk-17.0.9_macos-aarch64_bin.dmg)           |
    | [Visual Studio Code](https://code.visualstudio.com/sha/download?build=stable&os=win32-x64-user) | [Visual Studio Code](https://code.visualstudio.com/sha/download?build=stable&os=darwin-universal) |
    | [MongoDB](https://fastdl.mongodb.org/windows/mongodb-windows-x86_64-7.0.2-signed.msi)           | [MongoDB](https://fastdl.mongodb.org/osx/mongodb-macos-arm64-7.0.2.tgz)                           |
    | [Node](https://nodejs.org/dist/v20.9.0/node-v20.9.0-x64.msi)                                    | [Node](https://nodejs.org/dist/v20.9.0/node-v20.9.0.pkg)                                          |

   **NOTE:For Mac most of the above mentioned can be installed using HomeBrew.**
3. Prior to that you will have to setup the connection in MongoDB Cluster, (TODO)
4. Create a database named `movies-api-db`.
5. Starting with the back-end, there is not much setup as you can directly run the `MoviesApplication.java`. This will set the two collections namely 'movies' and 'reviews' which are the entities in the Back-end application.
[Spring Starter]()
6. Before the running the application, you need to have the default data in the database of MongoDB. In tyhe movies collection of the `movies-api-db` add data from [File]()
7. Now you need to install the node dependencies for the front-end, after opening the `movies-mania` from inside the Front-End directory in VS Code, execute in terminal `npm install --save-dev`.
8. Finally we can start the front-end, `npm run dev` (It runs on http://localhost:3000 by default)
9. Happy Hacking. 😉 😎 🔥

## Working Screenshots/GIFs

![MoviesMania-1](https://github.com/Adarsh-619/MoviesMania/assets/53617091/b35bce9b-dfe8-4f1a-b550-8f191c1be675)

![MoviesMania-2](https://github.com/Adarsh-619/MoviesMania/assets/53617091/ef1aa19b-3679-4788-9bd8-19e45c6c51bb)

https://github.com/Adarsh-619/MoviesMania/assets/53617091/b1c8d092-1e4f-4f93-aa09-88a2aa6bcc6f

## License
[MIT License](LICENSE)
