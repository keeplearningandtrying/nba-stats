# Telegram NBA stats bot

Send NBA games statistics to a [Telegram][] channel (using a [Telegram Bot]) as soon as a game is finished.

The running channel is available at https://t.me/nba_games.

## Technical environment

* Java 11
* Spring Boot
* Maven

A library is used for getting NBA statistics: [nbawrapper-stats][]. Many thanks to [@antoineguay1][] for his great work!

## Environment variables

Before running the app (development, tests, production), be sure to provide 2 environment variables:
- `telegram.bot_id`
- `telegram.chat_id`

For instance with:

> TELEGRAM_BOT_ID=123:abc TELEGRAM_CHAT_ID=123 ./mvnw test

[Telegram]: https://telegram.org/
[Telegram Bot]: https://core.telegram.org/bots
[nbawrapper-stats]: https://github.com/antoineguay1/nbawrapper-stats
[@antoineguay1]: https://github.com/antoineguay1
