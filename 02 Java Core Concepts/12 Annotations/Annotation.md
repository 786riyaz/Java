## 1️⃣ `@Override` (Java – compile-time only)

* Checked by the **Java compiler**
* Ensures you are overriding a superclass/interface method
* **No runtime behavior**

```java
@Override
public String toString() { ... }
```

👉 This is **not related to Spring at all**.

---

## 2️⃣ Spring MVC / Web Annotations (runtime behavior)

These annotations are read by **Spring at runtime** to build your REST API.

### 🔹 `@RestController`

* Marks the class as a **REST controller**
* Combines:

  * `@Controller`
  * `@ResponseBody`
* Tells Spring:

  > “Return data (JSON), not views”

```java
@RestController
```

---

### 🔹 `@RequestMapping("/api/users")`

* Defines the **base URL** for the controller
* All endpoints start with `/api/users`

```java
@RequestMapping("/api/users")
```

---

### 🔹 `@PostMapping`, `@GetMapping`, `@PutMapping`, `@DeleteMapping`

* Map **HTTP methods + paths** to Java methods

```java
@PostMapping        // POST /api/users
@GetMapping         // GET  /api/users
@GetMapping("/{id}")// GET  /api/users/1
```

These are **runtime routing instructions** for Spring.

---

## 3️⃣ Parameter binding annotations

These tell Spring **how to extract data from HTTP requests**.

### 🔹 `@RequestBody`

* Converts JSON → Java object
* Uses Jackson internally

```java
@RequestBody User user
```

---

### 🔹 `@PathVariable`

* Extracts values from URL path

```java
@PathVariable Long id
```

For:

```
/api/users/5
```

`id = 5`

---

## 4️⃣ Validation annotation (JSR-380 / Jakarta Bean Validation)

### 🔹 `@Valid`

* Triggers **validation rules** defined in the `User` class

```java
@Valid @RequestBody User user
```

Example in `User`:

```java
@NotNull
@Email
private String email;
```

If validation fails → Spring automatically returns **400 Bad Request**.

---

## 5️⃣ Dependency Injection (constructor)

No annotation here, but important:

```java
public UserController(UserService service) {
    this.service = service;
}
```

Spring:

* Detects `UserService` as a bean
* Injects it automatically

---

## 🔍 Summary Table

| Annotation         | Purpose                | Checked When | Who Uses It      |
| ------------------ | ---------------------- | ------------ | ---------------- |
| `@Override`        | Method override safety | Compile-time | Java compiler    |
| `@RestController`  | REST API class         | Runtime      | Spring           |
| `@RequestMapping`  | Base URL               | Runtime      | Spring           |
| `@GetMapping` etc. | HTTP routing           | Runtime      | Spring           |
| `@RequestBody`     | JSON → Object          | Runtime      | Spring + Jackson |
| `@PathVariable`    | URL → variable         | Runtime      | Spring           |
| `@Valid`           | Input validation       | Runtime      | Bean Validation  |