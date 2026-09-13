# Spring Boot Java App

Starter Maven-based Spring Boot application with sample health and greeting endpoints.

## Run & Operate

- `pnpm --filter @workspace/api-server run dev` — run the API server (port 5000)
- `pnpm run typecheck` — full typecheck across all packages
- `pnpm run build` — typecheck + build all packages
- `pnpm --filter @workspace/api-spec run codegen` — regenerate API hooks and Zod schemas from the OpenAPI spec
- `pnpm --filter @workspace/db run push` — push DB schema changes (dev only)
- Required env: `DATABASE_URL` — Postgres connection string
- `mvn -f spring-boot-app/pom.xml spring-boot:run` — run the Spring Boot app
- `mvn -f spring-boot-app/pom.xml test` — run Java tests

## Stack

- pnpm workspaces, Node.js 24, TypeScript 5.9
- API: Express 5
- DB: PostgreSQL + Drizzle ORM
- Validation: Zod (`zod/v4`), `drizzle-zod`
- API codegen: Orval (from OpenAPI spec)
- Build: esbuild (CJS bundle)
- Spring Boot: Maven + Java 17 target

## Where things live

- `spring-boot-app/pom.xml` — Maven project definition and Spring Boot dependencies
- `spring-boot-app/src/main/java/com/example/application/Application.java` — application entry point
- `spring-boot-app/src/main/java/com/example/application/api/GreetingController.java` — sample REST endpoints

## Architecture decisions

- The Java app is isolated under `spring-boot-app/` so it can evolve independently from the existing TypeScript workspace packages.
- The server port reads `PORT` and falls back to `8080`, which keeps local and managed workflow runs compatible.

## Product

- Provides starter REST endpoints at `/api/health` and `/api/hello`.

## User preferences

_Populate as you build — explicit user instructions worth remembering across sessions._

## Gotchas

_Populate as you build — sharp edges, "always run X before Y" rules._

## Pointers

- See the `pnpm-workspace` skill for workspace structure, TypeScript setup, and package details
