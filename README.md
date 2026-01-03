# Flutter VK ID Auth Demo

Демо-приложение Flutter для Android с авторизацией через **VK ID One Tap**.

---

## Возможности

- Авторизация через VK ID (One Tap)
- Хранение токена и данных пользователя в Secure Storage
- Управление состоянием через Cubit
- Extension на BuildContext для быстрого доступа к `User`

---

### Комментарии

- Храним в `/android/local.properties` константы с данными приложения VK, пример:
  - `VKIDRedirectHost=vk.ru`
  - `VKIDRedirectScheme=vk12345678`
  - `VKIDClientID=12345678`
  - `VKIDClientSecret=blahblahboobooboo`

---

### Ссылки

- [VK ID Flutter SDK](https://pub.dev/packages/vkid_flutter_sdk)
- [Документация VK ID](https://id.vk.com/about/business/go/docs/ru/vkid/latest/vk-id/connection/create-application)
