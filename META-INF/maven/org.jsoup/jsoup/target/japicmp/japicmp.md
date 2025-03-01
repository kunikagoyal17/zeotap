
# Compatibility Report

![semver MAJOR](https://img.shields.io/badge/semver-MAJOR-red?logo=semver "semver MAJOR")

## Summary

> [!CAUTION]
>
> Incompatible changes found while checking backward compatibility of version `1.18.3` with the previous version `1.18.2`.

<details markdown="1">
<summary>Expand to see options used.</summary>

- **Report only summary**: No
- **Report only changes**: No
- **Report only binary-incompatible changes**: No
- **Access modifier filter**: `PROTECTED`
- **Old archives**:
  - ![jsoup 1.18.2](https://img.shields.io/badge/jsoup-1.18.2-blue "jsoup 1.18.2")
- **New archives**:
  - ![jsoup 1.18.3](https://img.shields.io/badge/jsoup-1.18.3-blue "jsoup 1.18.3")
- **Evaluate annotations**: Yes
- **Include synthetic classes and class members**: No
- **Include specific elements**: No
- **Exclude specific elements**: Yes
  - `@java.lang.Deprecated`
  - `org.jsoup.UncheckedIOException`
- **Ignore all missing classes**: No
- **Ignore specific missing classes**: No
- **Treat changes as errors**:
  - Any changes: No
  - Binary incompatible changes: No
  - Source incompatible changes: No
  - Incompatible changes caused by excluded classes: Yes
  - Semantically incompatible changes: No
  - Semantically incompatible changes, including development versions: No
- **Classpath mode**: `ONE_COMMON_CLASSPATH`
- **Old classpath**:
```

```
- **New classpath**:
```

```

</details>


## Results

| Status  | Type                                                      | Serialization       | Compatibility Changes |
|---------|-----------------------------------------------------------|---------------------|-----------------------|
| Removed | [org.jsoup.Connection]                                    | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.Connection$Base]                               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.Connection$KeyVal]                             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.Connection$Method]                             | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] |
| Removed | [org.jsoup.Connection$Request]                            | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.Connection$Response]                           | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.HttpStatusException]                           | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.Jsoup]                                         | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.Progress]                                      | ![Not serializable] | ![Annotation removed] ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.SerializationException]                        | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Constructor removed] |
| Removed | [org.jsoup.UnsupportedMimeTypeException]                  | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.helper.ChangeNotifyingArrayList]               | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.helper.DataUtil]                               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Field removed] |
| Removed | [org.jsoup.helper.HttpConnection]                         | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.helper.HttpConnection$KeyVal]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.helper.HttpConnection$Request]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.helper.HttpConnection$Response]                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.helper.RequestAuthenticator]                   | ![Not serializable] | ![Annotation removed] ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.helper.RequestAuthenticator$Context]           | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.helper.Validate]                               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.helper.ValidationException]                    | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.helper.W3CDom]                                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.helper.W3CDom$W3CBuilder]                      | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Constructor removed] |
| Removed | [org.jsoup.internal.ControllableInputStream]              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.internal.Functions]                            | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.internal.Normalizer]                           | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.internal.SharedConstants]                      | ![Not serializable] | ![Class removed] ![Superclass removed] ![Field removed] |
| Removed | [org.jsoup.internal.SoftPool]                             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.internal.StringUtil]                           | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.internal.StringUtil$StringJoiner]              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Attribute]                               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Attributes]                              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.CDataNode]                               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Comment]                                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.DataNode]                                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Document]                                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Document$OutputSettings]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Document$OutputSettings$Syntax]          | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] |
| Removed | [org.jsoup.nodes.Document$QuirksMode]                     | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] |
| Removed | [org.jsoup.nodes.DocumentType]                            | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Element]                                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Entities]                                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.nodes.Entities$EscapeMode]                     | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] |
| Removed | [org.jsoup.nodes.FormElement]                             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.LeafNode]                                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Node]                                    | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.NodeIterator]                            | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.PseudoTextElement]                       | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Range]                                   | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Range$AttributeRange]                    | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.Range$Position]                          | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.TextNode]                                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.nodes.XmlDeclaration]                          | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.parser.CharacterReader]                        | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.parser.HtmlTreeBuilder]                        | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.parser.ParseError]                             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.parser.ParseErrorList]                         | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.parser.ParseSettings]                          | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.parser.Parser]                                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.parser.StreamParser]                           | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.parser.Tag]                                    | ![Not serializable] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] |
| Removed | [org.jsoup.parser.Token$TokenType]                        | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] |
| Removed | [org.jsoup.parser.TokenQueue]                             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.parser.XmlTreeBuilder]                         | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.safety.Cleaner]                                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.safety.Safelist]                               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Collector]                              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.select.CombiningEvaluator]                     | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.select.CombiningEvaluator$And]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.CombiningEvaluator$Or]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Elements]                               | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator]                              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AllElements]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$Attribute]                    | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeKeyPair]             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeStarting]            | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeWithValue]           | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeWithValueContaining] | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeWithValueEnding]     | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeWithValueMatching]   | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeWithValueNot]        | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$AttributeWithValueStarting]   | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$Class]                        | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$ContainsData]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$ContainsOwnText]              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$ContainsText]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$ContainsWholeOwnText]         | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$ContainsWholeText]            | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$CssNthEvaluator]              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Field removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$Id]                           | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IndexEquals]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IndexEvaluator]               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IndexGreaterThan]             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IndexLessThan]                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsEmpty]                      | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsFirstChild]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsFirstOfType]                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsLastChild]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsLastOfType]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsNthChild]                   | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsNthLastChild]               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsNthLastOfType]              | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsNthOfType]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsOnlyChild]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsOnlyOfType]                 | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$IsRoot]                       | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$MatchText]                    | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$Matches]                      | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$MatchesOwn]                   | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$MatchesWholeOwnText]          | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$MatchesWholeText]             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$Tag]                          | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$TagEndsWith]                  | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.Evaluator$TagStartsWith]                | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.NodeFilter]                             | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.select.NodeFilter$FilterResult]                | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Method removed] ![Field removed] |
| Removed | [org.jsoup.select.NodeTraversor]                          | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] ![Constructor removed] |
| Removed | [org.jsoup.select.NodeVisitor]                            | ![Not serializable] | ![Annotation removed] ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.select.QueryParser]                            | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.select.Selector]                               | ![Not serializable] | ![Class removed] ![Superclass removed] ![Method removed] |
| Removed | [org.jsoup.select.Selector$SelectorParseException]        | ![Class removed][1] | ![Class removed] ![Superclass removed] ![Interface removed] ![Constructor removed] |

<details markdown="1">
<summary>Expand for details.</summary>

___

<a id="user-content-org.jsoup.connection"></a>
### `org.jsoup.Connection`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type          | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|---------------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`Connection`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                   | Generics | Type                | Method                                                          | Annotations | Throws              | Compatibility Changes |
|---------|-----------------------------|----------|---------------------|-----------------------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~                |          | ~~[`Connection`]~~  | ~~`auth`~~([`RequestAuthenticator`])                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`cookie`~~([`String`], [`String`])                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`cookieStore`~~([`CookieStore`])                              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`CookieStore`]~~ | ~~`cookieStore`~~()                                             |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`cookies`~~([`Map<String, String>`])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`data`~~([`String`], [`String`])                              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`data`~~([`String`], [`String`], [`InputStream`])             |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`data`~~([`String`], [`String`], [`InputStream`], [`String`]) |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`data`~~([`Collection<KeyVal>`])                              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`data`~~([`Map<String, String>`])                             |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`data`~~([`String...`])                                       |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`KeyVal`]~~      | ~~`data`~~([`String`])                                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Response`]~~    | ~~`execute`~~()                                                 |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`followRedirects`~~(`boolean`)                                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Document`]~~    | ~~`get`~~()                                                     |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`header`~~([`String`], [`String`])                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`headers`~~([`Map<String, String>`])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`ignoreContentType`~~(`boolean`)                              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`ignoreHttpErrors`~~(`boolean`)                               |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`maxBodySize`~~(`int`)                                        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`method`~~([`Method`])                                        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`newRequest`~~()                                              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Connection`]~~  | ~~`newRequest`~~([`String`])                                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Connection`]~~  | ~~`newRequest`~~([`URL`])                                       |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Connection`]~~  | ~~`onResponseProgress`~~([`Progress<Response>`])                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`parser`~~([`Parser`])                                        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Document`]~~    | ~~`post`~~()                                                    |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`postDataCharset`~~([`String`])                               |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`proxy`~~([`Proxy`])                                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`proxy`~~([`String`], `int`)                                  |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`referrer`~~([`String`])                                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~     | ~~`request`~~()                                                 |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`request`~~([`Request`])                                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`requestBody`~~([`String`])                                   |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Response`]~~    | ~~`response`~~()                                                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`response`~~([`Response`])                                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`sslSocketFactory`~~([`SSLSocketFactory`])                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`timeout`~~(`int`)                                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`url`~~([`URL`])                                              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`url`~~([`String`])                                           |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Connection`]~~  | ~~`userAgent`~~([`String`])                                     |             |                     | ![Method removed]     |

___

<a id="user-content-org.jsoup.connection$base"></a>
### `org.jsoup.Connection$Base`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                                | Type          | Name       | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------------------|---------------|------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`Base`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Generics

| Status  | Name    | Extends         | Compatibility Changes |
|---------|---------|-----------------|-----------------------|
| Removed | ~~`T`~~ | ~~[`Base<T>`]~~ | ![No changes]         |


#### Methods

| Status  | Modifiers                   | Generics | Type                              | Method                                           | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|-----------------------------------|--------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Base`]~~                      | ~~`addHeader`~~([`String`], [`String`])          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~                    | ~~`cookie`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Base`]~~                      | ~~`cookie`~~([`String`], [`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Map<String, String>`]~~       | ~~`cookies`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~                     | ~~`hasCookie`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~                     | ~~`hasHeader`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~                     | ~~`hasHeaderWithValue`~~([`String`], [`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~                    | ~~`header`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Base`]~~                      | ~~`header`~~([`String`], [`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`List<String>`]~~              | ~~`headers`~~([`String`])                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Map<String, String>`]~~       | ~~`headers`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Method`]~~                    | ~~`method`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Base`]~~                      | ~~`method`~~([`Method`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Map<String, List<String>>`]~~ | ~~`multiHeaders`~~()                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Base`]~~                      | ~~`removeCookie`~~([`String`])                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Base`]~~                      | ~~`removeHeader`~~([`String`])                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`URL`]~~                       | ~~`url`~~()                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Base`]~~                      | ~~`url`~~([`URL`])                               |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.connection$keyval"></a>
### `org.jsoup.Connection$KeyVal`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                                | Type          | Name         | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------------------|---------------|--------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`KeyVal`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                   | Generics | Type                | Method                             | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|---------------------|------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`KeyVal`]~~      | ~~`contentType`~~([`String`])      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~      | ~~`contentType`~~()                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~       | ~~`hasInputStream`~~()             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`KeyVal`]~~      | ~~`inputStream`~~([`InputStream`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`InputStream`]~~ | ~~`inputStream`~~()                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`KeyVal`]~~      | ~~`key`~~([`String`])              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~      | ~~`key`~~()                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`KeyVal`]~~      | ~~`value`~~([`String`])            |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~      | ~~`value`~~()                      |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.connection$method"></a>
### `org.jsoup.Connection$Method`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                             | Type     | Name         | Extends      | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|----------|--------------|--------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Enum~~ | ~~`Method`~~ | ~~[`Enum`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |
| Removed | ~~[`Comparable`]~~   | ![Interface removed]  |
| Removed | ~~[`Constable`]~~    | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                | Method                    | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|---------------------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~  |          | ~~`boolean`~~       | ~~`hasBody`~~()           |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Method`]~~      | ~~`valueOf`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Method[]`][2]~~ | ~~`values`~~()            |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type           | Name      | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------|-----------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `DELETE`  |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `GET`     |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `HEAD`    |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `OPTIONS` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `PATCH`   |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `POST`    |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `PUT`     |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Method`]~~ | `TRACE`   |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.connection$request"></a>
### `org.jsoup.Connection$Request`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                                | Type          | Name          | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------------------|---------------|---------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`Request`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface    | Compatibility Changes |
|---------|--------------|-----------------------|
| Removed | ~~[`Base`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers                   | Generics | Type                         | Method                                       | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|------------------------------|----------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~                |          | ~~[`Request`]~~              | ~~`auth`~~([`RequestAuthenticator`])         |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`RequestAuthenticator`]~~ | ~~`auth`~~()                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`data`~~([`KeyVal`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Collection<KeyVal>`]~~   | ~~`data`~~()                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~                | ~~`followRedirects`~~()                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`followRedirects`~~(`boolean`)             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~                | ~~`ignoreContentType`~~()                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`ignoreContentType`~~(`boolean`)           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~                | ~~`ignoreHttpErrors`~~()                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`ignoreHttpErrors`~~(`boolean`)            |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`int`~~                    | ~~`maxBodySize`~~()                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`maxBodySize`~~(`int`)                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`parser`~~([`Parser`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Parser`]~~               | ~~`parser`~~()                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`postDataCharset`~~([`String`])            |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~               | ~~`postDataCharset`~~()                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Proxy`]~~                | ~~`proxy`~~()                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`proxy`~~([`Proxy`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`proxy`~~([`String`], `int`)               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`requestBody`~~([`String`])                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~               | ~~`requestBody`~~()                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`SSLSocketFactory`]~~     | ~~`sslSocketFactory`~~()                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`void`~~                   | ~~`sslSocketFactory`~~([`SSLSocketFactory`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`int`~~                    | ~~`timeout`~~()                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Request`]~~              | ~~`timeout`~~(`int`)                         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.connection$response"></a>
### `org.jsoup.Connection$Response`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                                | Type          | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------------------|---------------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`Response`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface    | Compatibility Changes |
|---------|--------------|-----------------------|
| Removed | ~~[`Base`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers                   | Generics | Type                        | Method                    | Annotations | Throws              | Compatibility Changes |
|---------|-----------------------------|----------|-----------------------------|---------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~              | ~~`body`~~()              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`byte[]`~~                | ~~`bodyAsBytes`~~()       |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`BufferedInputStream`]~~ | ~~`bodyStream`~~()        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Response`]~~            | ~~`bufferUp`~~()          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~              | ~~`charset`~~()           |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Response`]~~            | ~~`charset`~~([`String`]) |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~              | ~~`contentType`~~()       |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`Document`]~~            | ~~`parse`~~()             |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`int`~~                   | ~~`statusCode`~~()        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`String`]~~              | ~~`statusMessage`~~()     |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`StreamParser`]~~        | ~~`streamParser`~~()      |             | ~~[`IOException`]~~ | ![Method removed]     |

___

<a id="user-content-org.jsoup.httpstatusexception"></a>
### `org.jsoup.HttpStatusException`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers    | Type      | Name                      | Extends             | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|---------------------------|---------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`HttpStatusException`~~ | ~~[`IOException`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                              | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`HttpStatusException`~~([`String`], `int`, [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`getStatusCode`~~() |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`getUrl`~~()        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.jsoup"></a>
### `org.jsoup.Jsoup`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name        | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Jsoup`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type               | Method                                                           | Annotations | Throws              | Compatibility Changes |
|---------|---------------------------|----------|--------------------|------------------------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~     | ~~`clean`~~([`String`], [`String`], [`Safelist`])                |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~     | ~~`clean`~~([`String`], [`Safelist`])                            |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~     | ~~`clean`~~([`String`], [`String`], [`Safelist`], [`OutputSettings`]) |        |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Connection`]~~ | ~~`connect`~~([`String`])                                        |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~      | ~~`isValid`~~([`String`], [`Safelist`])                          |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Connection`]~~ | ~~`newSession`~~()                                               |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`String`], [`String`])                              |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`String`], [`String`], [`Parser`])                  |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`String`], [`Parser`])                              |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`String`])                                          |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`File`], [`String`], [`String`])                    |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`File`], [`String`])                                |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`File`])                                            |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`File`], [`String`], [`String`], [`Parser`])        |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`Path`], [`String`], [`String`])                    |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`Path`], [`String`])                                |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`Path`])                                            |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`Path`], [`String`], [`String`], [`Parser`])        |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`InputStream`], [`String`], [`String`])             |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`InputStream`], [`String`], [`String`], [`Parser`]) |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parse`~~([`URL`], `int`)                                      |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parseBodyFragment`~~([`String`], [`String`])                  |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~   | ~~`parseBodyFragment`~~([`String`])                              |             |                     | ![Method removed]     |

___

<a id="user-content-org.jsoup.progress"></a>
### `org.jsoup.Progress`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type          | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|---------------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`Progress`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Annotation removed] ![Superclass removed] |


#### Generics

| Status  | Name                  | Extends        | Compatibility Changes |
|---------|-----------------------|----------------|-----------------------|
| Removed | ~~`ProgressContext`~~ | ~~[`Object`]~~ | ![No changes]         |


#### Annotations

| Status  | Annotation                  | Compatibility Changes |
|---------|-----------------------------|-----------------------|
| Removed | ~~[`FunctionalInterface`]~~ | ![No changes]         |


#### Methods

| Status  | Modifiers                   | Generics | Type       | Method                                                     | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|------------|------------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`void`~~ | ~~`onProgress`~~(`int`, `int`, `float`, `ProgressContext`) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.serializationexception"></a>
### `org.jsoup.SerializationException`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                | Type      | Name                         | Extends                  | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|------------------------------|--------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`SerializationException`~~ | ~~[`RuntimeException`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`SerializationException`~~()                          |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`SerializationException`~~([`String`], [`Throwable`]) |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`SerializationException`~~([`String`])                |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`SerializationException`~~([`Throwable`])             |             |        | ![Constructor removed] |

___

<a id="user-content-org.jsoup.unsupportedmimetypeexception"></a>
### `org.jsoup.UnsupportedMimeTypeException`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers    | Type      | Name                               | Extends             | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|------------------------------------|---------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`UnsupportedMimeTypeException`~~ | ~~[`IOException`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`UnsupportedMimeTypeException`~~([`String`], [`String`], [`String`]) |  |  | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method              | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|---------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`getMimeType`~~() |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`getUrl`~~()      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()    |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.helper.changenotifyingarraylist"></a>
### `org.jsoup.helper.ChangeNotifyingArrayList`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                   | Type      | Name                           | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|-----------|--------------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`ChangeNotifyingArrayList`~~ | ~~[`ArrayList`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Generics

| Status  | Name    | Extends        | Compatibility Changes |
|---------|---------|----------------|-----------------------|
| Removed | ~~`E`~~ | ~~[`Object`]~~ | ![No changes]         |


#### Implemented Interfaces

| Status  | Interface                   | Compatibility Changes |
|---------|-----------------------------|-----------------------|
| Removed | ~~[`Serializable`]~~        | ![Interface removed]  |
| Removed | ~~[`Cloneable`]~~           | ![Interface removed]  |
| Removed | ~~[`Iterable`]~~            | ![Interface removed]  |
| Removed | ~~[`Collection`]~~          | ![Interface removed]  |
| Removed | ~~[`List`]~~                | ![Interface removed]  |
| Removed | ~~[`RandomAccess`]~~        | ![Interface removed]  |
| Removed | ~~[`SequencedCollection`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ChangeNotifyingArrayList`~~(`int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                   | Generics | Type           | Method                                           | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|----------------|--------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~                |          | ~~`boolean`~~  | ~~`add`~~(`E`)                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`void`~~     | ~~`add`~~(`int`, `E`)                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`boolean`~~  | ~~`addAll`~~([`Collection<? extends E>`])        |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`boolean`~~  | ~~`addAll`~~(`int`, [`Collection<? extends E>`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`void`~~     | ~~`clear`~~()                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`void`~~     | ~~`onContentsChanged`~~()                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Object`]~~ | ~~`remove`~~(`int`)                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`boolean`~~  | ~~`remove`~~([`Object`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`boolean`~~  | ~~`removeAll`~~([`Collection<?>`])               |             |        | ![Method removed]     |
| Removed | ~~`protected`~~             |          | ~~`void`~~     | ~~`removeRange`~~(`int`, `int`)                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`boolean`~~  | ~~`retainAll`~~([`Collection<?>`])               |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Object`]~~ | ~~`set`~~(`int`, `E`)                            |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.helper.datautil"></a>
### `org.jsoup.helper.DataUtil`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`DataUtil`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type                 | Method                                                          | Annotations | Throws              | Compatibility Changes |
|---------|---------------------------|----------|----------------------|-----------------------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~     | ~~`load`~~([`File`], [`String`], [`String`])                    |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~     | ~~`load`~~([`File`], [`String`], [`String`], [`Parser`])        |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~     | ~~`load`~~([`Path`], [`String`], [`String`])                    |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~     | ~~`load`~~([`Path`], [`String`], [`String`], [`Parser`])        |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~     | ~~`load`~~([`InputStream`], [`String`], [`String`])             |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~     | ~~`load`~~([`InputStream`], [`String`], [`String`], [`Parser`]) |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`ByteBuffer`]~~   | ~~`readToByteBuffer`~~([`InputStream`], `int`)                  |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`StreamParser`]~~ | ~~`streamParser`~~([`Path`], [`Charset`], [`String`], [`Parser`]) |           | ~~[`IOException`]~~ | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type            | Name    | Annotations | Compatibility Changes |
|---------|---------------------------------------|-----------------|---------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Charset`]~~ | `UTF_8` |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.helper.httpconnection"></a>
### `org.jsoup.helper.HttpConnection`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                 | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`HttpConnection`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface          | Compatibility Changes |
|---------|--------------------|-----------------------|
| Removed | ~~[`Connection`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`HttpConnection`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type                | Method                                                          | Annotations | Throws              | Compatibility Changes |
|---------|---------------------------|----------|---------------------|-----------------------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`auth`~~([`RequestAuthenticator`])                            |             |                     | ![No changes]         |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Connection`]~~  | ~~`connect`~~([`String`])                                       |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Connection`]~~  | ~~`connect`~~([`URL`])                                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`cookie`~~([`String`], [`String`])                            |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`cookieStore`~~([`CookieStore`])                              |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`CookieStore`]~~ | ~~`cookieStore`~~()                                             |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`cookies`~~([`Map<String, String>`])                          |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`data`~~([`String`], [`String`])                              |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`data`~~([`String`], [`String`], [`InputStream`])             |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`data`~~([`String`], [`String`], [`InputStream`], [`String`]) |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`data`~~([`Map<String, String>`])                             |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`data`~~([`String...`])                                       |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`data`~~([`Collection<KeyVal>`])                              |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`KeyVal`]~~      | ~~`data`~~([`String`])                                          |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Response`]~~    | ~~`execute`~~()                                                 |             | ~~[`IOException`]~~ | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`followRedirects`~~(`boolean`)                                |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~    | ~~`get`~~()                                                     |             | ~~[`IOException`]~~ | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`header`~~([`String`], [`String`])                            |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`headers`~~([`Map<String, String>`])                          |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`ignoreContentType`~~(`boolean`)                              |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`ignoreHttpErrors`~~(`boolean`)                               |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`maxBodySize`~~(`int`)                                        |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`method`~~([`Method`])                                        |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`newRequest`~~()                                              |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`onResponseProgress`~~([`Progress<Response>`])                |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`parser`~~([`Parser`])                                        |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~    | ~~`post`~~()                                                    |             | ~~[`IOException`]~~ | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`postDataCharset`~~([`String`])                               |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`proxy`~~([`Proxy`])                                          |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`proxy`~~([`String`], `int`)                                  |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`referrer`~~([`String`])                                      |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Request`]~~     | ~~`request`~~()                                                 |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`request`~~([`Request`])                                      |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`requestBody`~~([`String`])                                   |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Response`]~~    | ~~`response`~~()                                                |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`response`~~([`Response`])                                    |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`sslSocketFactory`~~([`SSLSocketFactory`])                    |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`timeout`~~(`int`)                                            |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`url`~~([`URL`])                                              |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`url`~~([`String`])                                           |             |                     | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~  | ~~`userAgent`~~([`String`])                                     |             |                     | ![No changes]         |


#### Fields

| Status  | Modifiers                             | Type           | Name                  | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------|-----------------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `CONTENT_ENCODING`    |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `CONTENT_TYPE`        |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `DEFAULT_UA`          |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `FORM_URL_ENCODED`    |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `MULTIPART_FORM_DATA` |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.helper.httpconnection$keyval"></a>
### `org.jsoup.helper.HttpConnection$KeyVal`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name         | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|--------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`KeyVal`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface      | Compatibility Changes |
|---------|----------------|-----------------------|
| Removed | ~~[`KeyVal`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                | Method                                                | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|---------------------|-------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~              |          | ~~[`KeyVal`]~~      | ~~`contentType`~~([`String`])                         |             |        | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`String`]~~      | ~~`contentType`~~()                                   |             |        | ![No changes]         |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`KeyVal`][3]~~   | ~~`create`~~([`String`], [`String`])                  |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`KeyVal`][3]~~   | ~~`create`~~([`String`], [`String`], [`InputStream`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~       | ~~`hasInputStream`~~()                                |             |        | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`KeyVal`][3]~~   | ~~`inputStream`~~([`InputStream`])                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`InputStream`]~~ | ~~`inputStream`~~()                                   |             |        | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`KeyVal`][3]~~   | ~~`key`~~([`String`])                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~      | ~~`key`~~()                                           |             |        | ![No changes]         |
| Removed | ~~`public`~~              |          | ~~[`String`]~~      | ~~`toString`~~()                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`KeyVal`][3]~~   | ~~`value`~~([`String`])                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~      | ~~`value`~~()                                         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.httpconnection$request"></a>
### `org.jsoup.helper.HttpConnection$Request`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name          | Extends         | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|---------------|-----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Request`~~ | ~~[`Base`][4]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface       | Compatibility Changes |
|---------|-----------------|-----------------------|
| Removed | ~~[`Base`]~~    | ![Interface removed]  |
| Removed | ~~[`Request`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers    | Generics | Type                         | Method                                       | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------------|----------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Request`]~~              | ~~`auth`~~([`RequestAuthenticator`])         |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`RequestAuthenticator`]~~ | ~~`auth`~~()                                 |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`][5]~~           | ~~`data`~~([`KeyVal`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Collection<KeyVal>`]~~   | ~~`data`~~()                                 |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`boolean`~~                | ~~`followRedirects`~~()                      |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`]~~              | ~~`followRedirects`~~(`boolean`)             |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`boolean`~~                | ~~`ignoreContentType`~~()                    |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`]~~              | ~~`ignoreContentType`~~(`boolean`)           |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`boolean`~~                | ~~`ignoreHttpErrors`~~()                     |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`]~~              | ~~`ignoreHttpErrors`~~(`boolean`)            |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`int`~~                    | ~~`maxBodySize`~~()                          |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`]~~              | ~~`maxBodySize`~~(`int`)                     |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`][5]~~           | ~~`parser`~~([`Parser`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Parser`]~~               | ~~`parser`~~()                               |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`]~~              | ~~`postDataCharset`~~([`String`])            |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`String`]~~               | ~~`postDataCharset`~~()                      |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Proxy`]~~                | ~~`proxy`~~()                                |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`][5]~~           | ~~`proxy`~~([`Proxy`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Request`][5]~~           | ~~`proxy`~~([`String`], `int`)               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Request`]~~              | ~~`requestBody`~~([`String`])                |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`String`]~~               | ~~`requestBody`~~()                          |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`SSLSocketFactory`]~~     | ~~`sslSocketFactory`~~()                     |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`void`~~                   | ~~`sslSocketFactory`~~([`SSLSocketFactory`]) |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`int`~~                    | ~~`timeout`~~()                              |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Request`][5]~~           | ~~`timeout`~~(`int`)                         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.helper.httpconnection$response"></a>
### `org.jsoup.helper.HttpConnection$Response`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name           | Extends         | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|----------------|-----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Response`~~ | ~~[`Base`][4]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface        | Compatibility Changes |
|---------|------------------|-----------------------|
| Removed | ~~[`Base`]~~     | ![Interface removed]  |
| Removed | ~~[`Response`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers    | Generics | Type                        | Method                    | Annotations | Throws              | Compatibility Changes |
|---------|--------------|----------|-----------------------------|---------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`body`~~()              |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`byte[]`~~                | ~~`bodyAsBytes`~~()       |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`BufferedInputStream`]~~ | ~~`bodyStream`~~()        |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Response`]~~            | ~~`bufferUp`~~()          |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`charset`~~()           |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Response`][6]~~         | ~~`charset`~~([`String`]) |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`contentType`~~()       |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`Document`]~~            | ~~`parse`~~()             |             | ~~[`IOException`]~~ | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`int`~~                   | ~~`statusCode`~~()        |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`statusMessage`~~()     |             |                     | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~[`StreamParser`]~~        | ~~`streamParser`~~()      |             | ~~[`IOException`]~~ | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.requestauthenticator"></a>
### `org.jsoup.helper.RequestAuthenticator`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type          | Name                       | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|---------------|----------------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`RequestAuthenticator`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Annotation removed] ![Superclass removed] |


#### Annotations

| Status  | Annotation                  | Compatibility Changes |
|---------|-----------------------------|-----------------------|
| Removed | ~~[`FunctionalInterface`]~~ | ![No changes]         |


#### Methods

| Status  | Modifiers                   | Generics | Type                           | Method                          | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|--------------------------------|---------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`PasswordAuthentication`]~~ | ~~`authenticate`~~([`Context`]) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.helper.requestauthenticator$context"></a>
### `org.jsoup.helper.RequestAuthenticator$Context`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name          | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|---------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Context`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                           | Method                                    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------|-------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`PasswordAuthentication`]~~ | ~~`credentials`~~([`String`], [`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~                  | ~~`isProxy`~~()                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~                  | ~~`isServer`~~()                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~                 | ~~`realm`~~()                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`RequestorType`]~~          | ~~`type`~~()                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`URL`]~~                    | ~~`url`~~()                               |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.helper.validate"></a>
### `org.jsoup.helper.Validate`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`Validate`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type           | Method                                                     | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------|------------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Object`]~~ | ~~`ensureNotNull`~~([`Object`])                            |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Object`]~~ | ~~`ensureNotNull`~~([`Object`], [`String`], [`Object...`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`fail`~~([`String`])                                     |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`fail`~~([`String`], [`Object...`])                      |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`isFalse`~~(`boolean`)                                   |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`isFalse`~~(`boolean`, [`String`])                       |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`isTrue`~~(`boolean`)                                    |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`isTrue`~~(`boolean`, [`String`])                        |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`noNullElements`~~([`Object[]`][7])                      |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`noNullElements`~~([`Object[]`][7], [`String`])          |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`notEmpty`~~([`String`])                                 |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`notEmpty`~~([`String`], [`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`notEmptyParam`~~([`String`], [`String`])                |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`notNull`~~([`Object`])                                  |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`notNull`~~([`Object`], [`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`notNullParam`~~([`Object`], [`String`])                 |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~     | ~~`wtf`~~([`String`])                                      |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.helper.validationexception"></a>
### `org.jsoup.helper.ValidationException`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers    | Type      | Name                      | Extends                          | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|---------------------------|----------------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`ValidationException`~~ | ~~[`IllegalArgumentException`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ValidationException`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type              | Method                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------|--------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Throwable`]~~ | ~~`fillInStackTrace`~~() |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type           | Name        | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------|-------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `Validator` |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.helper.w3cdom"></a>
### `org.jsoup.helper.W3CDom`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name         | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|--------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`W3CDom`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`W3CDom`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics                   | Type                            | Method                                                   | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------------------------|---------------------------------|----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |                            | ~~[`HashMap<String, String>`]~~ | ~~`OutputHtml`~~()                                       |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |                            | ~~[`HashMap<String, String>`]~~ | ~~`OutputXml`~~()                                        |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |                            | ~~[`String`]~~                  | ~~`asString`~~([`Document`][8], [`Map<String, String>`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~[`String`]~~                  | ~~`asString`~~([`Document`][8])                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~[`Node`]~~                    | ~~`contextNode`~~([`Document`][8])                       |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |                            | ~~[`Document`][8]~~             | ~~`convert`~~([`Document`])                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~`void`~~                      | ~~`convert`~~([`Document`], [`Document`][8])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~`void`~~                      | ~~`convert`~~([`Element`], [`Document`][8])              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~[`Document`][8]~~             | ~~`fromJsoup`~~([`Document`])                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~[`Document`][8]~~             | ~~`fromJsoup`~~([`Element`])                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~`boolean`~~                   | ~~`namespaceAware`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~[`W3CDom`]~~                  | ~~`namespaceAware`~~(`boolean`)                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~[`NodeList`]~~                | ~~`selectXpath`~~([`String`], [`Document`][8])           |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |                            | ~~[`NodeList`]~~                | ~~`selectXpath`~~([`String`], [`Node`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~              | \<~~[`T extends Node`]~~\> | ~~[`List<T>`]~~                 | ~~`sourceNodes`~~([`NodeList`], [`Class<T>`])            |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type                           | Name                   | Annotations | Compatibility Changes |
|---------|---------------------------------------|--------------------------------|------------------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~                 | `SourceProperty`       |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~                 | `XPathFactoryProperty` |             | ![Field removed]      |
| Removed | ~~`protected`~~                       | ~~[`DocumentBuilderFactory`]~~ | `factory`              |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.helper.w3cdom$w3cbuilder"></a>
### `org.jsoup.helper.W3CDom$W3CBuilder`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                    | Type      | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------|-----------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`protected`~~ | ~~Class~~ | ~~`W3CBuilder`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface           | Compatibility Changes |
|---------|---------------------|-----------------------|
| Removed | ~~[`NodeVisitor`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                       | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`W3CBuilder`~~([`Document`][8]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type       | Method                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`void`~~ | ~~`head`~~([`Node`][9], `int`) |             |        | ![No changes]         |
| Removed | ~~`public`~~ |          | ~~`void`~~ | ~~`tail`~~([`Node`][9], `int`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.internal.controllableinputstream"></a>
### `org.jsoup.internal.ControllableInputStream`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                          | Extends                   | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-------------------------------|---------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`ControllableInputStream`~~ | ~~[`FilterInputStream`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface             | Compatibility Changes |
|---------|-----------------------|-----------------------|
| Removed | ~~[`Closeable`]~~     | ![Interface removed]  |
| Removed | ~~[`AutoCloseable`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics                                   | Type                            | Method                                         | Annotations | Throws              | Compatibility Changes |
|---------|---------------------------|--------------------------------------------|---------------------------------|------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~              |                                            | ~~`void`~~                      | ~~`allowClose`~~(`boolean`)                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~`boolean`~~                   | ~~`baseReadFully`~~()                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~`void`~~                      | ~~`close`~~()                                  |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~[`BufferedInputStream`]~~     | ~~`inputStream`~~()                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~`void`~~                      | ~~`mark`~~(`int`)                              |             |                     | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~`int`~~                       | ~~`max`~~()                                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~`void`~~                      | ~~`max`~~(`int`)                               |             |                     | ![Method removed]     |
| Removed | ~~`public`~~              | \<~~[`ProgressContext extends Object`]~~\> | ~~[`ControllableInputStream`]~~ | ~~`onProgress`~~(`int`, [`Progress<ProgressContext>`], `ProgressContext`) |  |     | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~`int`~~                       | ~~`read`~~(`byte[]`, `int`, `int`)             |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |                                            | ~~[`ByteBuffer`]~~              | ~~`readToByteBuffer`~~([`InputStream`], `int`) |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~`void`~~                      | ~~`reset`~~()                                  |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~              |                                            | ~~[`ControllableInputStream`]~~ | ~~`timeout`~~(`long`, `long`)                  |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |                                            | ~~[`ControllableInputStream`]~~ | ~~`wrap`~~([`InputStream`], `int`)             |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |                                            | ~~[`ControllableInputStream`]~~ | ~~`wrap`~~([`InputStream`], `int`, `int`)      |             |                     | ![Method removed]     |

___

<a id="user-content-org.jsoup.internal.functions"></a>
### `org.jsoup.internal.Functions`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                | Type      | Name            | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|-----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`Functions`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics                                               | Type                                       | Method                      | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|--------------------------------------------------------|--------------------------------------------|-----------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | \<~~[`K extends Object`]~~, ~~[`T extends Object`]~~, ~~[`V extends Object`]~~\> | ~~[`Function<T, IdentityHashMap<K, V>>`]~~ | ~~`identityMapFunction`~~() |  |  | ![Method removed] |
| Removed | ~~`static`~~ ~~`public`~~ | \<~~[`T extends Object`]~~, ~~[`U extends Object`]~~\> | ~~[`Function<T, List<U>>`]~~               | ~~`listFunction`~~()        |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ | \<~~[`K extends Object`]~~, ~~[`T extends Object`]~~, ~~[`V extends Object`]~~\> | ~~[`Function<T, Map<K, V>>`]~~ | ~~`mapFunction`~~() |       |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ | \<~~[`T extends Object`]~~, ~~[`U extends Object`]~~\> | ~~[`Function<T, Set<U>>`]~~                | ~~`setFunction`~~()         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.internal.normalizer"></a>
### `org.jsoup.internal.Normalizer`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                | Type      | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`Normalizer`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor        | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Normalizer`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type           | Method                                 | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------|----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`lowerCase`~~([`String`])            |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`normalize`~~([`String`])            |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`normalize`~~([`String`], `boolean`) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.internal.sharedconstants"></a>
### `org.jsoup.internal.SharedConstants`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                | Type      | Name                  | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|-----------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`SharedConstants`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Fields

| Status  | Modifiers                             | Type                 | Name                | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------------|---------------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~       | `AttrRangeKey`      |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~`int`~~            | `DefaultBufferSize` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~       | `EndRangeKey`       |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String[]`][10]~~ | `FormSubmitTags`    |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~       | `RangeKey`          |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~       | `UserDataKey`       |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.internal.softpool"></a>
### `org.jsoup.internal.SoftPool`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`SoftPool`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Generics

| Status  | Name    | Extends        | Compatibility Changes |
|---------|---------|----------------|-----------------------|
| Removed | ~~`T`~~ | ~~[`Object`]~~ | ![No changes]         |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`SoftPool`~~([`Supplier<T>`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|--------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Object`]~~ | ~~`borrow`~~()     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~     | ~~`release`~~(`T`) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.internal.stringutil"></a>
### `org.jsoup.internal.StringUtil`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                | Type      | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`StringUtil`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor        | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`StringUtil`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type                                       | Method                                       | Annotations | Throws                        | Compatibility Changes |
|---------|---------------------------|----------|--------------------------------------------|----------------------------------------------|-------------|-------------------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~                                 | ~~`appendNormalisedWhitespace`~~([`StringBuilder`], [`String`], `boolean`) |  |            | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`StringBuilder`]~~                      | ~~`borrowBuilder`~~()                        |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`in`~~([`String`], [`String...`])          |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`inSorted`~~([`String`], [`String[]`][10]) |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`isActuallyWhitespace`~~(`int`)            |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`isAscii`~~([`String`])                    |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`isBlank`~~([`String`])                    |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`isInvisibleChar`~~(`int`)                 |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`isNumeric`~~([`String`])                  |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`isWhitespace`~~(`int`)                    |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`join`~~([`Collection<?>`], [`String`])    |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`join`~~([`Iterator<?>`], [`String`])      |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`join`~~([`String[]`][10], [`String`])     |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Collector<CharSequence, ?, String>`]~~ | ~~`joining`~~([`String`])                    |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`normaliseWhitespace`~~([`String`])        |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`padding`~~(`int`)                         |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`padding`~~(`int`, `int`)                  |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`releaseBuilder`~~([`StringBuilder`])      |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`URL`]~~                                | ~~`resolve`~~([`URL`], [`String`])           |             | ~~[`MalformedURLException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~                             | ~~`resolve`~~([`String`], [`String`])        |             |                               | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~                              | ~~`startsWithNewline`~~([`String`])          |             |                               | ![Method removed]     |

___

<a id="user-content-org.jsoup.internal.stringutil$stringjoiner"></a>
### `org.jsoup.internal.StringUtil$StringJoiner`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name               | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|--------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`StringJoiner`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`StringJoiner`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                 | Method                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------|--------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`StringJoiner`]~~ | ~~`add`~~([`Object`])    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`StringJoiner`]~~ | ~~`append`~~([`Object`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~       | ~~`complete`~~()         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.attribute"></a>
### `org.jsoup.nodes.Attribute`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name            | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Attribute`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |
| Removed | ~~[`Entry`]~~     | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Attribute`~~([`String`], [`String`])                 |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Attribute`~~([`String`], [`String`], [`Attributes`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                    | Generics | Type                   | Method                                            | Annotations | Throws              | Compatibility Changes |
|---------|------------------------------|----------|------------------------|---------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~                 |          | ~~[`Attribute`]~~      | ~~`clone`~~()                                     |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~    |          | ~~[`Attribute`]~~      | ~~`createFromEncoded`~~([`String`], [`String`])   |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~`boolean`~~          | ~~`equals`~~([`Object`])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~[`String`]~~         | ~~`getKey`~~()                                    |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~    |          | ~~[`String`]~~         | ~~`getValidKey`~~([`String`], [`Syntax`])         |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~[`String`]~~         | ~~`getValue`~~()                                  |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~`boolean`~~          | ~~`hasDeclaredValue`~~()                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~`int`~~              | ~~`hashCode`~~()                                  |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~[`String`]~~         | ~~`html`~~()                                      |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~              |          | ~~`void`~~             | ~~`html`~~([`Appendable`], [`OutputSettings`])    |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`static`~~ ~~`protected`~~ |          | ~~`void`~~             | ~~`html`~~([`String`], [`String`], [`Appendable`], [`OutputSettings`]) |  | ~~[`IOException`]~~ | ![Method removed] |
| Removed | ~~`static`~~ ~~`public`~~    |          | ~~`boolean`~~          | ~~`isBooleanAttribute`~~([`String`])              |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~              |          | ~~`boolean`~~          | ~~`isDataAttribute`~~()                           |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`protected`~~ |          | ~~`boolean`~~          | ~~`isDataAttribute`~~([`String`])                 |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~`void`~~             | ~~`setKey`~~([`String`])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~[`String`]~~         | ~~`setValue`~~([`String`])                        |             |                     | ![Method removed]     |
| Removed | ~~`final`~~ ~~`protected`~~  |          | ~~`boolean`~~          | ~~`shouldCollapseAttribute`~~([`OutputSettings`]) |             |                     | ![Method removed]     |
| Removed | ~~`static`~~ ~~`protected`~~ |          | ~~`boolean`~~          | ~~`shouldCollapseAttribute`~~([`String`], [`String`], [`OutputSettings`]) |  |        | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~[`AttributeRange`]~~ | ~~`sourceRange`~~()                               |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                 |          | ~~[`String`]~~         | ~~`toString`~~()                                  |             |                     | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.attributes"></a>
### `org.jsoup.nodes.Attributes`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Attributes`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |
| Removed | ~~[`Iterable`]~~  | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor        | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Attributes`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                        | Method                                             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------|----------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Attributes`]~~          | ~~`add`~~([`String`], [`String`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~                  | ~~`addAll`~~([`Attributes`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<Attribute>`]~~     | ~~`asList`~~()                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Attribute`]~~           | ~~`attribute`~~([`String`])                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Attributes`]~~          | ~~`clone`~~()                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Map<String, String>`]~~ | ~~`dataset`~~()                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~                   | ~~`deduplicate`~~([`ParseSettings`])               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~               | ~~`equals`~~([`Object`])                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`get`~~([`String`])                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`getIgnoreCase`~~([`String`])                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~               | ~~`hasDeclaredValueForKey`~~([`String`])           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~               | ~~`hasDeclaredValueForKeyIgnoreCase`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~               | ~~`hasKey`~~([`String`])                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~               | ~~`hasKeyIgnoreCase`~~([`String`])                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~                   | ~~`hashCode`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`html`~~()                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~               | ~~`isEmpty`~~()                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Iterator<Attribute>`]~~ | ~~`iterator`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~                  | ~~`normalize`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Attributes`]~~          | ~~`put`~~([`String`], [`String`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Attributes`]~~          | ~~`put`~~([`String`], `boolean`)                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Attributes`]~~          | ~~`put`~~([`Attribute`])                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~                  | ~~`remove`~~([`String`])                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~                  | ~~`removeIgnoreCase`~~([`String`])                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~                   | ~~`size`~~()                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`AttributeRange`]~~      | ~~`sourceRange`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Attributes`]~~          | ~~`sourceRange`~~([`String`], [`AttributeRange`])  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~              | ~~`toString`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Object`]~~              | ~~`userData`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Attributes`]~~          | ~~`userData`~~([`String`], [`Object`])             |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                                | Type           | Name         | Annotations | Compatibility Changes |
|---------|------------------------------------------|----------------|--------------|-------------|-----------------------|
| Removed | ~~`protected`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `dataPrefix` |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.nodes.cdatanode"></a>
### `org.jsoup.nodes.CDataNode`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name            | Extends          | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-----------------|------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`CDataNode`~~ | ~~[`TextNode`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                 | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`CDataNode`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type              | Method           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------|------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`CDataNode`]~~ | ~~`clone`~~()    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~    | ~~`nodeName`~~() |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~    | ~~`text`~~()     |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.comment"></a>
### `org.jsoup.nodes.Comment`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name          | Extends          | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|---------------|------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Comment`~~ | ~~[`LeafNode`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor               | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Comment`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                   | Method                    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`XmlDeclaration`]~~ | ~~`asXmlDeclaration`~~()  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Comment`]~~        | ~~`clone`~~()             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~         | ~~`getData`~~()           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~          | ~~`isXmlDeclaration`~~()  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~         | ~~`nodeName`~~()          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Comment`]~~        | ~~`setData`~~([`String`]) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.datanode"></a>
### `org.jsoup.nodes.DataNode`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends          | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`DataNode`~~ | ~~[`LeafNode`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`DataNode`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type             | Method                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`DataNode`]~~ | ~~`clone`~~()                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~   | ~~`getWholeData`~~()           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~   | ~~`nodeName`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`DataNode`]~~ | ~~`setWholeData`~~([`String`]) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.document"></a>
### `org.jsoup.nodes.Document`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends         | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|-----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Document`~~ | ~~[`Element`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Document`~~([`String`])             |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Document`~~([`String`], [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type                      | Method                                    | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|---------------------------|-------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~              |          | ~~[`Element`]~~           | ~~`body`~~()                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`void`~~                | ~~`charset`~~([`Charset`])                |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Charset`]~~           | ~~`charset`~~()                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~          | ~~`clone`~~()                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Connection`]~~        | ~~`connection`~~()                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~          | ~~`connection`~~([`Connection`])          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Element`]~~           | ~~`createElement`~~([`String`])           |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~          | ~~`createShell`~~([`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`DocumentType`]~~      | ~~`documentType`~~()                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`FormElement`]~~       | ~~`expectForm`~~([`String`])              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`List<FormElement>`]~~ | ~~`forms`~~()                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Element`]~~           | ~~`head`~~()                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~            | ~~`location`~~()                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~            | ~~`nodeName`~~()                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~            | ~~`outerHtml`~~()                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`OutputSettings`]~~    | ~~`outputSettings`~~()                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~          | ~~`outputSettings`~~([`OutputSettings`])  |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Parser`]~~            | ~~`parser`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~          | ~~`parser`~~([`Parser`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`QuirksMode`]~~        | ~~`quirksMode`~~()                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~          | ~~`quirksMode`~~([`QuirksMode`])          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~          | ~~`shallowClone`~~()                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Element`]~~           | ~~`text`~~([`String`])                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~            | ~~`title`~~()                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`void`~~                | ~~`title`~~([`String`])                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`void`~~                | ~~`updateMetaCharsetElement`~~(`boolean`) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~             | ~~`updateMetaCharsetElement`~~()          |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.document$outputsettings"></a>
### `org.jsoup.nodes.Document$OutputSettings`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name                 | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|----------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`OutputSettings`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`OutputSettings`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                   | Method                           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------|----------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Charset`]~~        | ~~`charset`~~()                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`charset`~~([`Charset`])       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`charset`~~([`String`])        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`clone`~~()                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`EscapeMode`]~~     | ~~`escapeMode`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`escapeMode`~~([`EscapeMode`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~              | ~~`indentAmount`~~()             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`indentAmount`~~(`int`)        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~              | ~~`maxPaddingWidth`~~()          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`maxPaddingWidth`~~(`int`)     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~          | ~~`outline`~~()                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`outline`~~(`boolean`)         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~          | ~~`prettyPrint`~~()              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`prettyPrint`~~(`boolean`)     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Syntax`]~~         | ~~`syntax`~~()                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`OutputSettings`]~~ | ~~`syntax`~~([`Syntax`])         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.document$outputsettings$syntax"></a>
### `org.jsoup.nodes.Document$OutputSettings$Syntax`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                             | Type     | Name         | Extends      | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|----------|--------------|--------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Enum~~ | ~~`Syntax`~~ | ~~[`Enum`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |
| Removed | ~~[`Comparable`]~~   | ![Interface removed]  |
| Removed | ~~[`Constable`]~~    | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                 | Method                    | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Syntax`]~~       | ~~`valueOf`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Syntax[]`][11]~~ | ~~`values`~~()            |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type           | Name   | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------|--------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Syntax`]~~ | `html` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`Syntax`]~~ | `xml`  |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.nodes.document$quirksmode"></a>
### `org.jsoup.nodes.Document$QuirksMode`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                             | Type     | Name             | Extends      | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|----------|------------------|--------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Enum~~ | ~~`QuirksMode`~~ | ~~[`Enum`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |
| Removed | ~~[`Comparable`]~~   | ![Interface removed]  |
| Removed | ~~[`Constable`]~~    | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                     | Method                    | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|--------------------------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`QuirksMode`]~~       | ~~`valueOf`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`QuirksMode[]`][12]~~ | ~~`values`~~()            |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type               | Name            | Annotations | Compatibility Changes |
|---------|---------------------------------------|--------------------|-----------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`QuirksMode`]~~ | `limitedQuirks` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`QuirksMode`]~~ | `noQuirks`      |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`QuirksMode`]~~ | `quirks`        |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.nodes.documenttype"></a>
### `org.jsoup.nodes.DocumentType`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name               | Extends          | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|--------------------|------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`DocumentType`~~ | ~~[`LeafNode`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`DocumentType`~~([`String`], [`String`], [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`name`~~()                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`nodeName`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`publicId`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~     | ~~`setPubSysKey`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`systemId`~~()               |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type           | Name         | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------|--------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `PUBLIC_KEY` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `SYSTEM_KEY` |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.nodes.element"></a>
### `org.jsoup.nodes.Element`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name          | Extends         | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|---------------|-----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Element`~~ | ~~[`Node`][9]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                        | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Element`~~([`Tag`], [`String`], [`Attributes`]) |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Element`~~([`Tag`], [`String`])                 |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Element`~~([`String`], [`String`])              |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Element`~~([`String`])                          |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                | Generics                         | Type                        | Method                                                          | Annotations | Throws | Compatibility Changes |
|---------|--------------------------|----------------------------------|-----------------------------|-----------------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`addClass`~~([`String`])                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`after`~~([`String`])                                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`after`~~([`Node`][9])                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`append`~~([`String`])                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`appendChild`~~([`Node`][9])                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`appendChildren`~~([`Collection<? extends Node>`])            |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`appendElement`~~([`String`])                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`appendElement`~~([`String`], [`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`appendText`~~([`String`])                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`appendTo`~~([`Element`])                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`attr`~~([`String`], [`String`])                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`attr`~~([`String`], `boolean`)                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Attribute`]~~           | ~~`attribute`~~([`String`])                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Attributes`]~~          | ~~`attributes`~~()                                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`baseUri`~~()                                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`before`~~([`String`])                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`before`~~([`Node`][9])                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`child`~~(`int`)                                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`int`~~                   | ~~`childNodeSize`~~()                                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`children`~~()                                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`int`~~                   | ~~`childrenSize`~~()                                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`className`~~()                                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Set<String>`]~~         | ~~`classNames`~~()                                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`classNames`~~([`Set<String>`])                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`clearAttributes`~~()                                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`clone`~~()                                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`closest`~~([`String`])                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`closest`~~([`Evaluator`])                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`cssSelector`~~()                                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`data`~~()                                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`List<DataNode>`]~~      | ~~`dataNodes`~~()                                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Map<String, String>`]~~ | ~~`dataset`~~()                                                 |             |        | ![Method removed]     |
| Removed | ~~`protected`~~          |                                  | ~~[`Element`]~~             | ~~`doClone`~~([`Node`][9])                                      |             |        | ![Method removed]     |
| Removed | ~~`protected`~~          |                                  | ~~`void`~~                  | ~~`doSetBaseUri`~~([`String`])                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`boolean`~~               | ~~`elementIs`~~([`String`], [`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`int`~~                   | ~~`elementSiblingIndex`~~()                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`empty`~~()                                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Range`]~~               | ~~`endSourceRange`~~()                                          |             |        | ![Method removed]     |
| Removed | ~~`protected`~~          |                                  | ~~[`List<Node>`]~~          | ~~`ensureChildNodes`~~()                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`expectFirst`~~([`String`])                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`filter`~~([`NodeFilter`])                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`firstElementChild`~~()                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`firstElementSibling`~~()                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`forEachNode`~~([`Consumer<? super Node>`])                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getAllElements`~~()                                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`getElementById`~~([`String`])                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttribute`~~([`String`])                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeStarting`~~([`String`])                |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeValue`~~([`String`], [`String`])       |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeValueContaining`~~([`String`], [`String`]) |         |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeValueEnding`~~([`String`], [`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeValueMatching`~~([`String`], [`Pattern`]) |          |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeValueMatching`~~([`String`], [`String`]) |           |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeValueNot`~~([`String`], [`String`])    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByAttributeValueStarting`~~([`String`], [`String`]) |           |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByClass`~~([`String`])                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByIndexEquals`~~(`int`)                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByIndexGreaterThan`~~(`int`)                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByIndexLessThan`~~(`int`)                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsByTag`~~([`String`])                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsContainingOwnText`~~([`String`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsContainingText`~~([`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsMatchingOwnText`~~([`Pattern`])                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsMatchingOwnText`~~([`String`])                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsMatchingText`~~([`Pattern`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`getElementsMatchingText`~~([`String`])                       |             |        | ![Method removed]     |
| Removed | ~~`protected`~~          |                                  | ~~`boolean`~~               | ~~`hasAttributes`~~()                                           |             |        | ![Method removed]     |
| Removed | ~~`protected`~~          |                                  | ~~`boolean`~~               | ~~`hasChildNodes`~~()                                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`boolean`~~               | ~~`hasClass`~~([`String`])                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`boolean`~~               | ~~`hasText`~~()                                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`html`~~()                                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             | \<~~[`T extends Appendable`]~~\> | ~~[`Appendable`]~~          | ~~`html`~~(`T`)                                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`html`~~([`String`])                                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`id`~~()                                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`id`~~([`String`])                                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`insertChildren`~~(`int`, [`Collection<? extends Node>`])     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`insertChildren`~~(`int`, [`Node...`])                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`boolean`~~               | ~~`is`~~([`String`])                                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`boolean`~~               | ~~`is`~~([`Evaluator`])                                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~`boolean`~~               | ~~`isBlock`~~()                                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`lastElementChild`~~()                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`lastElementSibling`~~()                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`nextElementSibling`~~()                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`nextElementSiblings`~~()                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`nodeName`~~()                                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`normalName`~~()                                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`ownText`~~()                                                 |             |        | ![Method removed]     |
| Removed | ~~`final`~~ ~~`public`~~ |                                  | ~~[`Element`]~~             | ~~`parent`~~()                                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`parents`~~()                                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`prepend`~~([`String`])                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`prependChild`~~([`Node`][9])                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`prependChildren`~~([`Collection<? extends Node>`])           |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`prependElement`~~([`String`])                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`prependElement`~~([`String`], [`String`])                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`prependText`~~([`String`])                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`previousElementSibling`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`previousElementSiblings`~~()                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`removeAttr`~~([`String`])                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`removeClass`~~([`String`])                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`root`~~()                                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`select`~~([`String`])                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`select`~~([`Evaluator`])                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`selectFirst`~~([`String`])                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`selectFirst`~~([`Evaluator`])                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`selectXpath`~~([`String`])                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             | \<~~[`T extends Node`]~~\>       | ~~[`List<T>`]~~             | ~~`selectXpath`~~([`String`], [`Class<T>`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`shallowClone`~~()                                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Elements`]~~            | ~~`siblingElements`~~()                                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Stream<Element>`]~~     | ~~`stream`~~()                                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Tag`]~~                 | ~~`tag`~~()                                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`tagName`~~()                                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`tagName`~~([`String`])                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`tagName`~~([`String`], [`String`])                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`text`~~()                                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`text`~~([`String`])                                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`List<TextNode>`]~~      | ~~`textNodes`~~()                                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`toggleClass`~~([`String`])                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`traverse`~~([`NodeVisitor`])                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`val`~~()                                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`val`~~([`String`])                                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`wholeOwnText`~~()                                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`String`]~~              | ~~`wholeText`~~()                                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~             |                                  | ~~[`Element`]~~             | ~~`wrap`~~([`String`])                                          |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.entities"></a>
### `org.jsoup.nodes.Entities`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Entities`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type           | Method                                       | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------|----------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`int`~~      | ~~`codepointsForName`~~([`String`], `int[]`) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`escape`~~([`String`], [`OutputSettings`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`escape`~~([`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`findPrefix`~~([`String`])                 |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`getByName`~~([`String`])                  |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~  | ~~`isBaseNamedEntity`~~([`String`])          |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~  | ~~`isNamedEntity`~~([`String`])              |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`unescape`~~([`String`])                   |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.entities$escapemode"></a>
### `org.jsoup.nodes.Entities$EscapeMode`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                             | Type     | Name             | Extends      | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|----------|------------------|--------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Enum~~ | ~~`EscapeMode`~~ | ~~[`Enum`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |
| Removed | ~~[`Comparable`]~~   | ![Interface removed]  |
| Removed | ~~[`Constable`]~~    | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                     | Method                    | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|--------------------------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`EscapeMode`]~~       | ~~`valueOf`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`EscapeMode[]`][13]~~ | ~~`values`~~()            |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type               | Name       | Annotations | Compatibility Changes |
|---------|---------------------------------------|--------------------|------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`EscapeMode`]~~ | `base`     |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`EscapeMode`]~~ | `extended` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`EscapeMode`]~~ | `xhtml`    |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.nodes.formelement"></a>
### `org.jsoup.nodes.FormElement`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name              | Extends         | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-------------------|-----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`FormElement`~~ | ~~[`Element`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`FormElement`~~([`Tag`], [`String`], [`Attributes`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type                 | Method                         | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~    |          | ~~[`FormElement`]~~  | ~~`addElement`~~([`Element`])  |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`FormElement`]~~  | ~~`clone`~~()                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`Elements`]~~     | ~~`elements`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`List<KeyVal>`]~~ | ~~`formData`~~()               |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~`void`~~           | ~~`removeChild`~~([`Node`][9]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`Connection`]~~   | ~~`submit`~~()                 |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.leafnode"></a>
### `org.jsoup.nodes.LeafNode`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type      | Name           | Extends         | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|-----------|----------------|-----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`LeafNode`~~ | ~~[`Node`][9]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers       | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`LeafNode`~~([`String`]) |             |        | ![Constructor removed] |
| Removed | ~~`public`~~    |          | ~~`LeafNode`~~()           |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                   | Generics | Type               | Method                             | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|--------------------|------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~                |          | ~~[`String`]~~     | ~~`absUrl`~~([`String`])           |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`String`]~~     | ~~`attr`~~([`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Node`][9]~~    | ~~`attr`~~([`String`], [`String`]) |             |        | ![Method removed]     |
| Removed | ~~`final`~~ ~~`public`~~    |          | ~~[`Attributes`]~~ | ~~`attributes`~~()                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`String`]~~     | ~~`baseUri`~~()                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`int`~~          | ~~`childNodeSize`~~()              |             |        | ![Method removed]     |
| Removed | ~~`protected`~~             |          | ~~[`LeafNode`]~~   | ~~`doClone`~~([`Node`][9])         |             |        | ![Method removed]     |
| Removed | ~~`protected`~~             |          | ~~`void`~~         | ~~`doSetBaseUri`~~([`String`])     |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Node`][9]~~    | ~~`empty`~~()                      |             |        | ![Method removed]     |
| Removed | ~~`protected`~~             |          | ~~[`List<Node>`]~~ | ~~`ensureChildNodes`~~()           |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`boolean`~~      | ~~`hasAttr`~~([`String`])          |             |        | ![Method removed]     |
| Removed | ~~`final`~~ ~~`protected`~~ |          | ~~`boolean`~~      | ~~`hasAttributes`~~()              |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`Node`][9]~~    | ~~`removeAttr`~~([`String`])       |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.node"></a>
### `org.jsoup.nodes.Node`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type      | Name       | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|-----------|------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`Node`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers       | Generics | Constructor  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|--------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`Node`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                      | Generics                         | Type                 | Method                                                  | Annotations | Throws              | Compatibility Changes |
|---------|--------------------------------|----------------------------------|----------------------|---------------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~                   |                                  | ~~[`String`]~~       | ~~`absUrl`~~([`String`])                                |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`addChildren`~~([`Node...`])                          |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`addChildren`~~(`int`, [`Node...`])                   |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`after`~~([`String`])                                 |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`after`~~([`Node`][9])                                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`String`]~~       | ~~`attr`~~([`String`])                                  |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`attr`~~([`String`], [`String`])                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~    |                                  | ~~[`Attributes`]~~   | ~~`attributes`~~()                                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`int`~~            | ~~`attributesSize`~~()                                  |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~    |                                  | ~~[`String`]~~       | ~~`baseUri`~~()                                         |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`before`~~([`String`])                                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`before`~~([`Node`][9])                               |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`childNode`~~(`int`)                                  |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~    |                                  | ~~`int`~~            | ~~`childNodeSize`~~()                                   |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`List<Node>`]~~   | ~~`childNodes`~~()                                      |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~[`Node[]`][14]~~   | ~~`childNodesAsArray`~~()                               |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`List<Node>`]~~   | ~~`childNodesCopy`~~()                                  |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`clearAttributes`~~()                                 |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`clone`~~()                                           |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~[`Node`][9]~~      | ~~`doClone`~~([`Node`][9])                              |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~ ~~`abstract`~~ |                                  | ~~`void`~~           | ~~`doSetBaseUri`~~([`String`])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~    |                                  | ~~[`Node`][9]~~      | ~~`empty`~~()                                           |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~ ~~`abstract`~~ |                                  | ~~[`List<Node>`]~~   | ~~`ensureChildNodes`~~()                                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`boolean`~~        | ~~`equals`~~([`Object`])                                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`filter`~~([`NodeFilter`])                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`firstChild`~~()                                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`forEachNode`~~([`Consumer<? super Node>`])           |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`boolean`~~        | ~~`hasAttr`~~([`String`])                               |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~ ~~`abstract`~~ |                                  | ~~`boolean`~~        | ~~`hasAttributes`~~()                                   |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`boolean`~~        | ~~`hasParent`~~()                                       |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`boolean`~~        | ~~`hasSameValue`~~([`Object`])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`int`~~            | ~~`hashCode`~~()                                        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   | \<~~[`T extends Appendable`]~~\> | ~~[`Appendable`]~~   | ~~`html`~~(`T`)                                         |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`indent`~~([`Appendable`], `int`, [`OutputSettings`]) |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`lastChild`~~()                                       |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`boolean`~~        | ~~`nameIs`~~([`String`])                                |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`nextSibling`~~()                                     |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~    |                                  | ~~[`String`]~~       | ~~`nodeName`~~()                                        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Stream<Node>`]~~ | ~~`nodeStream`~~()                                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   | \<~~[`T extends Node`]~~\>       | ~~[`Stream<T>`]~~    | ~~`nodeStream`~~([`Class<T>`])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`String`]~~       | ~~`normalName`~~()                                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`String`]~~       | ~~`outerHtml`~~()                                       |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`outerHtml`~~([`Appendable`])                         |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Document`]~~     | ~~`ownerDocument`~~()                                   |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`parent`~~()                                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`boolean`~~        | ~~`parentElementIs`~~([`String`], [`String`])           |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`boolean`~~        | ~~`parentNameIs`~~([`String`])                          |             |                     | ![Method removed]     |
| Removed | ~~`final`~~ ~~`public`~~       |                                  | ~~[`Node`][9]~~      | ~~`parentNode`~~()                                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`previousSibling`~~()                                 |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`void`~~           | ~~`remove`~~()                                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`removeAttr`~~([`String`])                            |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`removeChild`~~([`Node`][9])                          |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`reparentChild`~~([`Node`][9])                        |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`replaceChild`~~([`Node`][9], [`Node`][9])            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`void`~~           | ~~`replaceWith`~~([`Node`][9])                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`root`~~()                                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`void`~~           | ~~`setBaseUri`~~([`String`])                            |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`setParentNode`~~([`Node`][9])                        |             |                     | ![Method removed]     |
| Removed | ~~`protected`~~                |                                  | ~~`void`~~           | ~~`setSiblingIndex`~~(`int`)                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`shallowClone`~~()                                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~`int`~~            | ~~`siblingIndex`~~()                                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`List<Node>`]~~   | ~~`siblingNodes`~~()                                    |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Range`]~~        | ~~`sourceRange`~~()                                     |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`String`]~~       | ~~`toString`~~()                                        |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`traverse`~~([`NodeVisitor`])                         |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`unwrap`~~()                                          |             |                     | ![Method removed]     |
| Removed | ~~`public`~~                   |                                  | ~~[`Node`][9]~~      | ~~`wrap`~~([`String`])                                  |             |                     | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.nodeiterator"></a>
### `org.jsoup.nodes.NodeIterator`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name               | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|--------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`NodeIterator`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Generics

| Status  | Name    | Extends         | Compatibility Changes |
|---------|---------|-----------------|-----------------------|
| Removed | ~~`T`~~ | ~~[`Node`][9]~~ | ![No changes]         |


#### Implemented Interfaces

| Status  | Interface        | Compatibility Changes |
|---------|------------------|-----------------------|
| Removed | ~~[`Iterator`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`NodeIterator`~~([`Node`][9], [`Class<T>`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type                       | Method                     | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------------------|----------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`NodeIterator<Node>`]~~ | ~~`from`~~([`Node`][9])    |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~              | ~~`hasNext`~~()            |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Node`][9]~~            | ~~`next`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`void`~~                 | ~~`remove`~~()             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`void`~~                 | ~~`restart`~~([`Node`][9]) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.pseudotextelement"></a>
### `org.jsoup.nodes.PseudoTextElement`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                    | Extends         | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-------------------------|-----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`PseudoTextElement`~~ | ~~[`Element`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`PseudoTextElement`~~([`Tag`], [`String`], [`Attributes`]) |             |        | ![Constructor removed] |

___

<a id="user-content-org.jsoup.nodes.range"></a>
### `org.jsoup.nodes.Range`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name        | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Range`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Range`~~([`Position`], [`Position`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type             | Method                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------|--------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Position`]~~ | ~~`end`~~()              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~        | ~~`endPos`~~()           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~    | ~~`equals`~~([`Object`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~        | ~~`hashCode`~~()         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~    | ~~`isImplicit`~~()       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~    | ~~`isTracked`~~()        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Position`]~~ | ~~`start`~~()            |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~        | ~~`startPos`~~()         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~   | ~~`toString`~~()         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.range$attributerange"></a>
### `org.jsoup.nodes.Range$AttributeRange`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name                 | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|----------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeRange`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeRange`~~([`Range`], [`Range`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|--------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`equals`~~([`Object`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`hashCode`~~()         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Range`]~~  | ~~`nameRange`~~()        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Range`]~~  | ~~`valueRange`~~()       |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.range$position"></a>
### `org.jsoup.nodes.Range$Position`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Position`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Position`~~(`int`, `int`, `int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|--------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`columnNumber`~~()     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`equals`~~([`Object`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`hashCode`~~()         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`isTracked`~~()        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`lineNumber`~~()       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`pos`~~()              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.textnode"></a>
### `org.jsoup.nodes.TextNode`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends          | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`TextNode`~~ | ~~[`LeafNode`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`TextNode`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type             | Method                              | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|------------------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~              |          | ~~[`TextNode`]~~ | ~~`clone`~~()                       |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`TextNode`]~~ | ~~`createFromEncoded`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~   | ~~`getWholeText`~~()                |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~    | ~~`isBlank`~~()                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~   | ~~`nodeName`~~()                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`TextNode`]~~ | ~~`splitText`~~(`int`)              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~   | ~~`text`~~()                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`TextNode`]~~ | ~~`text`~~([`String`])              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~   | ~~`toString`~~()                    |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.nodes.xmldeclaration"></a>
### `org.jsoup.nodes.XmlDeclaration`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                 | Extends          | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------------|------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`XmlDeclaration`~~ | ~~[`LeafNode`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                 | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`XmlDeclaration`~~([`String`], `boolean`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                   | Method                      | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------|-----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`XmlDeclaration`]~~ | ~~`clone`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~         | ~~`getWholeDeclaration`~~() |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~         | ~~`name`~~()                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~         | ~~`nodeName`~~()            |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~         | ~~`toString`~~()            |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.parser.characterreader"></a>
### `org.jsoup.parser.CharacterReader`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                | Type      | Name                  | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------------------|-----------|-----------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`public`~~ | ~~Class~~ | ~~`CharacterReader`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                              | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`CharacterReader`~~([`Reader`], `int`) |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`CharacterReader`~~([`String`])        |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`CharacterReader`~~([`Reader`])        |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`void`~~     | ~~`advance`~~()                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~     | ~~`close`~~()                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`columnNumber`~~()           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`consumeTo`~~(`char`)        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`consumeToAny`~~(`char...`)  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`char`~~     | ~~`current`~~()                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`isEmpty`~~()                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`isTrackNewlines`~~()        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`lineNumber`~~()             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`pos`~~()                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~     | ~~`trackNewlines`~~(`boolean`) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.parser.htmltreebuilder"></a>
### `org.jsoup.parser.HtmlTreeBuilder`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                  | Extends             | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-----------------------|---------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`HtmlTreeBuilder`~~ | ~~[`TreeBuilder`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`HtmlTreeBuilder`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                                    | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`void`~~     | ~~`initialiseParse`~~([`Reader`], [`String`], [`Parser`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~`boolean`~~  | ~~`isContentForTagData`~~([`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~`boolean`~~  | ~~`process`~~([`Token`])                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                                          |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type      | Name                  | Annotations | Compatibility Changes |
|---------|---------------------------------------|-----------|-----------------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~`int`~~ | `MaxScopeSearchDepth` |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.parser.parseerror"></a>
### `org.jsoup.parser.ParseError`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`ParseError`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`getCursorPos`~~()    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`getErrorMessage`~~() |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`int`~~      | ~~`getPosition`~~()     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.parser.parseerrorlist"></a>
### `org.jsoup.parser.ParseErrorList`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers    | Type      | Name                 | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`ParseErrorList`~~ | ~~[`ArrayList`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface                   | Compatibility Changes |
|---------|-----------------------------|-----------------------|
| Removed | ~~[`Serializable`]~~        | ![Interface removed]  |
| Removed | ~~[`Cloneable`]~~           | ![Interface removed]  |
| Removed | ~~[`Iterable`]~~            | ![Interface removed]  |
| Removed | ~~[`Collection`]~~          | ![Interface removed]  |
| Removed | ~~[`List`]~~                | ![Interface removed]  |
| Removed | ~~[`RandomAccess`]~~        | ![Interface removed]  |
| Removed | ~~[`SequencedCollection`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                   | Method                | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|------------------------|-----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~              |          | ~~[`Object`]~~         | ~~`clone`~~()         |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`ParseErrorList`]~~ | ~~`noTracking`~~()    |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`ParseErrorList`]~~ | ~~`tracking`~~(`int`) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.parser.parsesettings"></a>
### `org.jsoup.parser.ParseSettings`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|---------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`ParseSettings`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                               | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ParseSettings`~~(`boolean`, `boolean`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                               | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|--------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`normalizeAttribute`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`normalizeTag`~~([`String`])       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`preserveAttributeCase`~~()        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`preserveTagCase`~~()              |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type                  | Name           | Annotations | Compatibility Changes |
|---------|---------------------------------------|-----------------------|----------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`ParseSettings`]~~ | `htmlDefault`  |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`ParseSettings`]~~ | `preserveCase` |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.parser.parser"></a>
### `org.jsoup.parser.Parser`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name         | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|--------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Parser`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Parser`~~([`TreeBuilder`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type                   | Method                                                        | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|------------------------|---------------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~              |          | ~~[`String`]~~         | ~~`defaultNamespace`~~()                                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`ParseErrorList`]~~ | ~~`getErrors`~~()                                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`TreeBuilder`]~~    | ~~`getTreeBuilder`~~()                                        |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Parser`]~~         | ~~`htmlParser`~~()                                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~          | ~~`isContentForTagData`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~          | ~~`isTrackErrors`~~()                                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~          | ~~`isTrackPosition`~~()                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Parser`]~~         | ~~`newInstance`~~()                                           |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~       | ~~`parse`~~([`String`], [`String`])                           |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Document`]~~       | ~~`parseBodyFragment`~~([`String`], [`String`])               |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`List<Node>`]~~     | ~~`parseFragment`~~([`String`], [`Element`], [`String`])      |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`List<Node>`]~~     | ~~`parseFragment`~~([`String`], [`Element`], [`String`], [`ParseErrorList`]) |  |    | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`List<Node>`]~~     | ~~`parseFragmentInput`~~([`String`], [`Element`], [`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~       | ~~`parseInput`~~([`String`], [`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Document`]~~       | ~~`parseInput`~~([`Reader`], [`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`List<Node>`]~~     | ~~`parseXmlFragment`~~([`String`], [`String`])                |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Parser`]~~         | ~~`setTrackErrors`~~(`int`)                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Parser`]~~         | ~~`setTrackPosition`~~(`boolean`)                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Parser`]~~         | ~~`setTreeBuilder`~~([`TreeBuilder`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Parser`]~~         | ~~`settings`~~([`ParseSettings`])                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`ParseSettings`]~~  | ~~`settings`~~()                                              |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~         | ~~`unescapeEntities`~~([`String`], `boolean`)                 |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Parser`]~~         | ~~`xmlParser`~~()                                             |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type           | Name              | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------|-------------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `NamespaceHtml`   |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `NamespaceMathml` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `NamespaceSvg`    |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`String`]~~ | `NamespaceXml`    |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.parser.streamparser"></a>
### `org.jsoup.parser.StreamParser`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name               | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|--------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`StreamParser`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface             | Compatibility Changes |
|---------|-----------------------|-----------------------|
| Removed | ~~[`Closeable`]~~     | ![Interface removed]  |
| Removed | ~~[`AutoCloseable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`StreamParser`~~([`Parser`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                      | Method                                                   | Annotations | Throws              | Compatibility Changes |
|---------|--------------|----------|---------------------------|----------------------------------------------------------|-------------|---------------------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`void`~~                | ~~`close`~~()                                            |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Document`]~~          | ~~`complete`~~()                                         |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<Node>`]~~        | ~~`completeFragment`~~()                                 |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Document`]~~          | ~~`document`~~()                                         |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`expectFirst`~~([`String`])                            |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`expectNext`~~([`String`])                             |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Iterator<Element>`]~~ | ~~`iterator`~~()                                         |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`StreamParser`]~~      | ~~`parse`~~([`Reader`], [`String`])                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`StreamParser`]~~      | ~~`parse`~~([`String`], [`String`])                      |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`StreamParser`]~~      | ~~`parseFragment`~~([`Reader`], [`Element`], [`String`]) |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`StreamParser`]~~      | ~~`parseFragment`~~([`String`], [`Element`], [`String`]) |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`selectFirst`~~([`String`])                            |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`selectFirst`~~([`Evaluator`])                         |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`selectNext`~~([`String`])                             |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`selectNext`~~([`Evaluator`])                          |             | ~~[`IOException`]~~ | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`StreamParser`]~~      | ~~`stop`~~()                                             |             |                     | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Stream<Element>`]~~   | ~~`stream`~~()                                           |             |                     | ![Method removed]     |

___

<a id="user-content-org.jsoup.parser.tag"></a>
### `org.jsoup.parser.Tag`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name      | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-----------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Tag`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface         | Compatibility Changes |
|---------|-------------------|-----------------------|
| Removed | ~~[`Cloneable`]~~ | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type           | Method                                                   | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------|----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~           |          | ~~[`Tag`]~~    | ~~`clone`~~()                                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`equals`~~([`Object`])                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`formatAsBlock`~~()                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`getName`~~()                                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`int`~~      | ~~`hashCode`~~()                                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isBlock`~~()                                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isEmpty`~~()                                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isFormListed`~~()                                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isFormSubmittable`~~()                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isInline`~~()                                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isKnownTag`~~()                                       |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`boolean`~~  | ~~`isKnownTag`~~([`String`])                             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isSelfClosing`~~()                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`namespace`~~()                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`normalName`~~()                                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`preserveWhitespace`~~()                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`toString`~~()                                         |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Tag`]~~    | ~~`valueOf`~~([`String`], [`String`], [`ParseSettings`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Tag`]~~    | ~~`valueOf`~~([`String`])                                |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Tag`]~~    | ~~`valueOf`~~([`String`], [`ParseSettings`])             |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.parser.token$tokentype"></a>
### `org.jsoup.parser.Token$TokenType`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                             | Type     | Name            | Extends      | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|----------|-----------------|--------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Enum~~ | ~~`TokenType`~~ | ~~[`Enum`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |
| Removed | ~~[`Comparable`]~~   | ![Interface removed]  |
| Removed | ~~[`Constable`]~~    | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                    | Method                    | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|-------------------------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`TokenType`]~~       | ~~`valueOf`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`TokenType[]`][15]~~ | ~~`values`~~()            |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type              | Name        | Annotations | Compatibility Changes |
|---------|---------------------------------------|-------------------|-------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`TokenType`]~~ | `Character` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`TokenType`]~~ | `Comment`   |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`TokenType`]~~ | `Doctype`   |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`TokenType`]~~ | `EOF`       |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`TokenType`]~~ | `EndTag`    |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`TokenType`]~~ | `StartTag`  |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.parser.tokenqueue"></a>
### `org.jsoup.parser.TokenQueue`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`TokenQueue`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`TokenQueue`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type           | Method                                | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------|---------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~              |          | ~~`void`~~     | ~~`addFirst`~~([`String`])            |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`void`~~     | ~~`advance`~~()                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`chompBalanced`~~(`char`, `char`)   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`chompTo`~~([`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`chompToIgnoreCase`~~([`String`])   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`char`~~     | ~~`consume`~~()                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`void`~~     | ~~`consume`~~([`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`consumeCssIdentifier`~~()          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`consumeElementSelector`~~()        |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`consumeTo`~~([`String`])           |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`consumeToAny`~~([`String...`])     |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`consumeToIgnoreCase`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`consumeWhitespace`~~()             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`consumeWord`~~()                   |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`escapeCssIdentifier`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`isEmpty`~~()                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`matchChomp`~~([`String`])          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`matches`~~([`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`matchesAny`~~([`String...`])       |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`matchesAny`~~(`char...`)           |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`matchesWhitespace`~~()             |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~  | ~~`matchesWord`~~()                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`remainder`~~()                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~ | ~~`toString`~~()                      |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`String`]~~ | ~~`unescape`~~([`String`])            |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.parser.xmltreebuilder"></a>
### `org.jsoup.parser.XmlTreeBuilder`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                 | Extends             | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------------|---------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`XmlTreeBuilder`~~ | ~~[`TreeBuilder`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`XmlTreeBuilder`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                                    | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`defaultNamespace`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~`void`~~     | ~~`initialiseParse`~~([`Reader`], [`String`], [`Parser`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~`void`~~     | ~~`popStackToClose`~~([`EndTag`])                         |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~`boolean`~~  | ~~`process`~~([`Token`])                                  |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.safety.cleaner"></a>
### `org.jsoup.safety.Cleaner`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name          | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|---------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Cleaner`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                 | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Cleaner`~~([`Safelist`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type             | Method                            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------|-----------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Document`]~~ | ~~`clean`~~([`Document`])         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~    | ~~`isValid`~~([`Document`])       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~    | ~~`isValidBodyHtml`~~([`String`]) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.safety.safelist"></a>
### `org.jsoup.safety.Safelist`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Safelist`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Safelist`~~()             |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Safelist`~~([`Safelist`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type               | Method                                                         | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|--------------------|----------------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`addAttributes`~~([`String`], [`String...`])                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`addEnforcedAttribute`~~([`String`], [`String`], [`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`addProtocols`~~([`String`], [`String`], [`String...`])      |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`addTags`~~([`String...`])                                   |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Safelist`]~~   | ~~`basic`~~()                                                  |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Safelist`]~~   | ~~`basicWithImages`~~()                                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Attributes`]~~ | ~~`getEnforcedAttributes`~~([`String`])                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~      | ~~`isSafeAttribute`~~([`String`], [`Element`], [`Attribute`])  |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~`boolean`~~      | ~~`isSafeTag`~~([`String`])                                    |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Safelist`]~~   | ~~`none`~~()                                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`preserveRelativeLinks`~~(`boolean`)                         |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Safelist`]~~   | ~~`relaxed`~~()                                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`removeAttributes`~~([`String`], [`String...`])              |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`removeEnforcedAttribute`~~([`String`], [`String`])          |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`removeProtocols`~~([`String`], [`String`], [`String...`])   |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`Safelist`]~~   | ~~`removeTags`~~([`String...`])                                |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Safelist`]~~   | ~~`simpleText`~~()                                             |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.collector"></a>
### `org.jsoup.select.Collector`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name            | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Collector`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type             | Method                                      | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|------------------|---------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Elements`]~~ | ~~`collect`~~([`Evaluator`], [`Element`])   |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Element`]~~  | ~~`findFirst`~~([`Evaluator`], [`Element`]) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.combiningevaluator"></a>
### `org.jsoup.select.CombiningEvaluator`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type      | Name                     | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|-----------|--------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`CombiningEvaluator`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers       | Generics | Type       | Method        | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|------------|---------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~  | ~~`cost`~~()  |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~`void`~~ | ~~`reset`~~() |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.combiningevaluator$and"></a>
### `org.jsoup.select.CombiningEvaluator$And`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name      | Extends                    | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-----------|----------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`And`~~ | ~~[`CombiningEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                          | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`And`~~([`Collection<Evaluator>`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.combiningevaluator$or"></a>
### `org.jsoup.select.CombiningEvaluator$Or`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name     | Extends                    | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|----------|----------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Or`~~ | ~~[`CombiningEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Or`~~([`Collection<Evaluator>`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`void`~~     | ~~`add`~~([`Evaluator`])                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.elements"></a>
### `org.jsoup.select.Elements`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Elements`~~ | ~~[`ArrayList`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface                   | Compatibility Changes |
|---------|-----------------------------|-----------------------|
| Removed | ~~[`Serializable`]~~        | ![Interface removed]  |
| Removed | ~~[`Cloneable`]~~           | ![Interface removed]  |
| Removed | ~~[`Iterable`]~~            | ![Interface removed]  |
| Removed | ~~[`Collection`]~~          | ![Interface removed]  |
| Removed | ~~[`List`]~~                | ![Interface removed]  |
| Removed | ~~[`RandomAccess`]~~        | ![Interface removed]  |
| Removed | ~~[`SequencedCollection`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Elements`~~()                        |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Elements`~~([`List<Element>`])       |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Elements`~~(`int`)                   |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Elements`~~([`Collection<Element>`]) |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`Elements`~~([`Element...`])          |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type                      | Method                                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------|------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`addClass`~~([`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`after`~~([`String`])                        |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`append`~~([`String`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~            | ~~`attr`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`attr`~~([`String`], [`String`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`before`~~([`String`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~                | ~~`clear`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`clone`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<Comment>`]~~     | ~~`comments`~~()                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<DataNode>`]~~    | ~~`dataNodes`~~()                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<String>`]~~      | ~~`eachAttr`~~([`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<String>`]~~      | ~~`eachText`~~()                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`empty`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`eq`~~(`int`)                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`filter`~~([`NodeFilter`])                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`first`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<FormElement>`]~~ | ~~`forms`~~()                                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`hasAttr`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`hasClass`~~([`String`])                     |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`hasText`~~()                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~            | ~~`html`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`html`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`is`~~([`String`])                           |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`last`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`next`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`next`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`nextAll`~~()                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`nextAll`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`not`~~([`String`])                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~            | ~~`outerHtml`~~()                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`parents`~~()                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`prepend`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`prev`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`prev`~~([`String`])                         |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`prevAll`~~()                                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`prevAll`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`remove`~~()                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`remove`~~(`int`)                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`remove`~~([`Object`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`removeAll`~~([`Collection<?>`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`removeAttr`~~([`String`])                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`removeClass`~~([`String`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`removeIf`~~([`Predicate<? super Element>`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`void`~~                | ~~`replaceAll`~~([`UnaryOperator<Element>`])   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~`boolean`~~             | ~~`retainAll`~~([`Collection<?>`])             |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`select`~~([`String`])                       |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Element`]~~           | ~~`set`~~(`int`, [`Element`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`tagName`~~([`String`])                      |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~            | ~~`text`~~()                                   |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`List<TextNode>`]~~    | ~~`textNodes`~~()                              |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~            | ~~`toString`~~()                               |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`toggleClass`~~([`String`])                  |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`traverse`~~([`NodeVisitor`])                |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`unwrap`~~()                                 |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~            | ~~`val`~~()                                    |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`val`~~([`String`])                          |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`Elements`]~~          | ~~`wrap`~~([`String`])                         |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator"></a>
### `org.jsoup.select.Evaluator`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type      | Name            | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|-----------|-----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`Evaluator`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers       | Generics | Constructor       | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|-------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`Evaluator`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                   | Generics | Type                       | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|----------------------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~                |          | ~~[`Predicate<Element>`]~~ | ~~`asPredicate`~~([`Element`])          |             |        | ![Method removed]     |
| Removed | ~~`protected`~~             |          | ~~`int`~~                  | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`boolean`~~              | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~             |          | ~~`void`~~                 | ~~`reset`~~()                           |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$allelements"></a>
### `org.jsoup.select.Evaluator$AllElements`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name              | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AllElements`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AllElements`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attribute"></a>
### `org.jsoup.select.Evaluator$Attribute`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name            | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-----------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Attribute`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                 | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Attribute`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attributekeypair"></a>
### `org.jsoup.select.Evaluator$AttributeKeyPair`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                                | Type      | Name                   | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------------------|-----------|------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`AttributeKeyPair`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                               | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeKeyPair`~~([`String`], [`String`])            |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`AttributeKeyPair`~~([`String`], [`String`], `boolean`) |             |        | ![Constructor removed] |

___

<a id="user-content-org.jsoup.select.evaluator$attributestarting"></a>
### `org.jsoup.select.Evaluator$AttributeStarting`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                    | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeStarting`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeStarting`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvalue"></a>
### `org.jsoup.select.Evaluator$AttributeWithValue`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                     | Extends                  | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------------------|--------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeWithValue`~~ | ~~[`AttributeKeyPair`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                      | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeWithValue`~~([`String`], [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluecontaining"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueContaining`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                               | Extends                  | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|------------------------------------|--------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeWithValueContaining`~~ | ~~[`AttributeKeyPair`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                                | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeWithValueContaining`~~([`String`], [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvalueending"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueEnding`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                           | Extends                  | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------------------------|--------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeWithValueEnding`~~ | ~~[`AttributeKeyPair`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeWithValueEnding`~~([`String`], [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluematching"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueMatching`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                             | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|----------------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeWithValueMatching`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                               | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeWithValueMatching`~~([`String`], [`Pattern`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluenot"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueNot`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                        | Extends                  | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-----------------------------|--------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeWithValueNot`~~ | ~~[`AttributeKeyPair`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeWithValueNot`~~([`String`], [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluestarting"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueStarting`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                             | Extends                  | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|----------------------------------|--------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`AttributeWithValueStarting`~~ | ~~[`AttributeKeyPair`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                              | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`AttributeWithValueStarting`~~([`String`], [`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$class"></a>
### `org.jsoup.select.Evaluator$Class`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name        | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Class`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Class`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$containsdata"></a>
### `org.jsoup.select.Evaluator$ContainsData`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name               | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`ContainsData`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ContainsData`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$containsowntext"></a>
### `org.jsoup.select.Evaluator$ContainsOwnText`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                  | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-----------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`ContainsOwnText`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                       | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ContainsOwnText`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$containstext"></a>
### `org.jsoup.select.Evaluator$ContainsText`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name               | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`ContainsText`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ContainsText`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$containswholeowntext"></a>
### `org.jsoup.select.Evaluator$ContainsWholeOwnText`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                       | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|----------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`ContainsWholeOwnText`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ContainsWholeOwnText`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$containswholetext"></a>
### `org.jsoup.select.Evaluator$ContainsWholeText`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                    | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`ContainsWholeText`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`ContainsWholeText`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$cssnthevaluator"></a>
### `org.jsoup.select.Evaluator$CssNthEvaluator`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                                | Type      | Name                  | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------------------|-----------|-----------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`CssNthEvaluator`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`CssNthEvaluator`~~(`int`)        |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`CssNthEvaluator`~~(`int`, `int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                      | Generics | Type           | Method                                            | Annotations | Throws | Compatibility Changes |
|---------|--------------------------------|----------|----------------|---------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ ~~`abstract`~~ |          | ~~`int`~~      | ~~`calculatePosition`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ ~~`abstract`~~ |          | ~~[`String`]~~ | ~~`getPseudoClass`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~                   |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`])           |             |        | ![Method removed]     |
| Removed | ~~`public`~~                   |          | ~~[`String`]~~ | ~~`toString`~~()                                  |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                   | Type      | Name | Annotations | Compatibility Changes |
|---------|-----------------------------|-----------|------|-------------|-----------------------|
| Removed | ~~`protected`~~ ~~`final`~~ | ~~`int`~~ | `a`  |             | ![Field removed]      |
| Removed | ~~`protected`~~ ~~`final`~~ | ~~`int`~~ | `b`  |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.select.evaluator$id"></a>
### `org.jsoup.select.Evaluator$Id`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name     | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|----------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Id`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor          | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Id`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$indexequals"></a>
### `org.jsoup.select.Evaluator$IndexEquals`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name              | Extends                | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------------|------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IndexEquals`~~ | ~~[`IndexEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor              | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IndexEquals`~~(`int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$indexevaluator"></a>
### `org.jsoup.select.Evaluator$IndexEvaluator`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                                | Type      | Name                 | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|------------------------------------------|-----------|----------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ ~~`abstract`~~ | ~~Class~~ | ~~`IndexEvaluator`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                 | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IndexEvaluator`~~(`int`) |             |        | ![Constructor removed] |

___

<a id="user-content-org.jsoup.select.evaluator$indexgreaterthan"></a>
### `org.jsoup.select.Evaluator$IndexGreaterThan`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                   | Extends                | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|------------------------|------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IndexGreaterThan`~~ | ~~[`IndexEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IndexGreaterThan`~~(`int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$indexlessthan"></a>
### `org.jsoup.select.Evaluator$IndexLessThan`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                | Extends                | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|---------------------|------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IndexLessThan`~~ | ~~[`IndexEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IndexLessThan`~~(`int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isempty"></a>
### `org.jsoup.select.Evaluator$IsEmpty`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name          | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|---------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsEmpty`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor     | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsEmpty`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isfirstchild"></a>
### `org.jsoup.select.Evaluator$IsFirstChild`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name               | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsFirstChild`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor          | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsFirstChild`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isfirstoftype"></a>
### `org.jsoup.select.Evaluator$IsFirstOfType`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                | Extends             | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|---------------------|---------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsFirstOfType`~~ | ~~[`IsNthOfType`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsFirstOfType`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~() |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$islastchild"></a>
### `org.jsoup.select.Evaluator$IsLastChild`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name              | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsLastChild`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsLastChild`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$islastoftype"></a>
### `org.jsoup.select.Evaluator$IsLastOfType`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name               | Extends                 | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------------|-------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsLastOfType`~~ | ~~[`IsNthLastOfType`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor          | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsLastOfType`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~() |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isnthchild"></a>
### `org.jsoup.select.Evaluator$IsNthChild`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name             | Extends                 | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|------------------|-------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsNthChild`~~ | ~~[`CssNthEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsNthChild`~~(`int`, `int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                            | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|---------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`calculatePosition`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~[`String`]~~ | ~~`getPseudoClass`~~()                            |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isnthlastchild"></a>
### `org.jsoup.select.Evaluator$IsNthLastChild`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                 | Extends                 | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|----------------------|-------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsNthLastChild`~~ | ~~[`CssNthEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                        | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsNthLastChild`~~(`int`, `int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                            | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|---------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`calculatePosition`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~[`String`]~~ | ~~`getPseudoClass`~~()                            |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isnthlastoftype"></a>
### `org.jsoup.select.Evaluator$IsNthLastOfType`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name                  | Extends                 | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|-----------------------|-------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsNthLastOfType`~~ | ~~[`CssNthEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsNthLastOfType`~~(`int`, `int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                            | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|---------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`calculatePosition`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~[`String`]~~ | ~~`getPseudoClass`~~()                            |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isnthoftype"></a>
### `org.jsoup.select.Evaluator$IsNthOfType`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                 | Type      | Name              | Extends                 | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|-------------------|-------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsNthOfType`~~ | ~~[`CssNthEvaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsNthOfType`~~(`int`, `int`) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                            | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|---------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`calculatePosition`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`protected`~~ |          | ~~[`String`]~~ | ~~`getPseudoClass`~~()                            |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isonlychild"></a>
### `org.jsoup.select.Evaluator$IsOnlyChild`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name              | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsOnlyChild`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsOnlyChild`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isonlyoftype"></a>
### `org.jsoup.select.Evaluator$IsOnlyOfType`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name               | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsOnlyOfType`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor          | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsOnlyOfType`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$isroot"></a>
### `org.jsoup.select.Evaluator$IsRoot`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name         | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|--------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`IsRoot`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor    | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`IsRoot`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$matchtext"></a>
### `org.jsoup.select.Evaluator$MatchText`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name            | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-----------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`MatchText`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor       | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`MatchText`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$matches"></a>
### `org.jsoup.select.Evaluator$Matches`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name          | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|---------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Matches`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Matches`~~([`Pattern`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$matchesown"></a>
### `org.jsoup.select.Evaluator$MatchesOwn`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name             | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`MatchesOwn`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`MatchesOwn`~~([`Pattern`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$matcheswholeowntext"></a>
### `org.jsoup.select.Evaluator$MatchesWholeOwnText`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                      | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|---------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`MatchesWholeOwnText`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                            | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`MatchesWholeOwnText`~~([`Pattern`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$matcheswholetext"></a>
### `org.jsoup.select.Evaluator$MatchesWholeText`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                   | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|------------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`MatchesWholeText`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`MatchesWholeText`~~([`Pattern`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$tag"></a>
### `org.jsoup.select.Evaluator$Tag`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name      | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-----------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`Tag`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`Tag`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers       | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|-----------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`protected`~~ |          | ~~`int`~~      | ~~`cost`~~()                            |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~    |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$tagendswith"></a>
### `org.jsoup.select.Evaluator$TagEndsWith`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name              | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|-------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`TagEndsWith`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                   | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`TagEndsWith`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.evaluator$tagstartswith"></a>
### `org.jsoup.select.Evaluator$TagStartsWith`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                             | Type      | Name                | Extends           | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|-----------|---------------------|-------------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`TagStartsWith`~~ | ~~[`Evaluator`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`TagStartsWith`~~([`String`]) |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers    | Generics | Type           | Method                                  | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|----------------|-----------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`boolean`~~  | ~~`matches`~~([`Element`], [`Element`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()                        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.nodefilter"></a>
### `org.jsoup.select.NodeFilter`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type          | Name             | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|---------------|------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`NodeFilter`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                   | Generics | Type                 | Method                         | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|----------------------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~[`FilterResult`]~~ | ~~`head`~~([`Node`][9], `int`) |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~[`FilterResult`]~~ | ~~`tail`~~([`Node`][9], `int`) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.nodefilter$filterresult"></a>
### `org.jsoup.select.NodeFilter$FilterResult`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                             | Type     | Name               | Extends      | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------------------|----------|--------------------|--------------|-----------|---------------------|-----------------------|
| Removed | ~~`final`~~ ~~`static`~~ ~~`public`~~ | ~~Enum~~ | ~~`FilterResult`~~ | ~~[`Enum`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |
| Removed | ~~[`Comparable`]~~   | ![Interface removed]  |
| Removed | ~~[`Constable`]~~    | ![Interface removed]  |


#### Methods

| Status  | Modifiers                 | Generics | Type                       | Method                    | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------------------|---------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`FilterResult`]~~       | ~~`valueOf`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`FilterResult[]`][16]~~ | ~~`values`~~()            |             |        | ![Method removed]     |


#### Fields

| Status  | Modifiers                             | Type                 | Name            | Annotations | Compatibility Changes |
|---------|---------------------------------------|----------------------|-----------------|-------------|-----------------------|
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`FilterResult`]~~ | `CONTINUE`      |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`FilterResult`]~~ | `REMOVE`        |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`FilterResult`]~~ | `SKIP_CHILDREN` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`FilterResult`]~~ | `SKIP_ENTIRELY` |             | ![Field removed]      |
| Removed | ~~`public`~~ ~~`static`~~ ~~`final`~~ | ~~[`FilterResult`]~~ | `STOP`          |             | ![Field removed]      |

___

<a id="user-content-org.jsoup.select.nodetraversor"></a>
### `org.jsoup.select.NodeTraversor`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name                | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|---------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`NodeTraversor`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Constructors

| Status  | Modifiers    | Generics | Constructor           | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|-----------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`NodeTraversor`~~() |             |        | ![Constructor removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type                 | Method                                        | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|----------------------|-----------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`FilterResult`]~~ | ~~`filter`~~([`NodeFilter`], [`Node`][9])     |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~           | ~~`filter`~~([`NodeFilter`], [`Elements`])    |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~           | ~~`traverse`~~([`NodeVisitor`], [`Node`][9])  |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~`void`~~           | ~~`traverse`~~([`NodeVisitor`], [`Elements`]) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.nodevisitor"></a>
### `org.jsoup.select.NodeVisitor`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers                   | Type          | Name              | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|-----------------------------|---------------|-------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ | ~~Interface~~ | ~~`NodeVisitor`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Annotation removed] ![Superclass removed] |


#### Annotations

| Status  | Annotation                  | Compatibility Changes |
|---------|-----------------------------|-----------------------|
| Removed | ~~[`FunctionalInterface`]~~ | ![No changes]         |


#### Methods

| Status  | Modifiers                   | Generics | Type       | Method                         | Annotations | Throws | Compatibility Changes |
|---------|-----------------------------|----------|------------|--------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ ~~`abstract`~~ |          | ~~`void`~~ | ~~`head`~~([`Node`][9], `int`) |             |        | ![Method removed]     |
| Removed | ~~`public`~~                |          | ~~`void`~~ | ~~`tail`~~([`Node`][9], `int`) |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.queryparser"></a>
### `org.jsoup.select.QueryParser`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name              | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|-------------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`QueryParser`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type              | Method                  | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|-------------------|-------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Evaluator`]~~ | ~~`parse`~~([`String`]) |             |        | ![Method removed]     |
| Removed | ~~`public`~~              |          | ~~[`String`]~~    | ~~`toString`~~()        |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.selector"></a>
### `org.jsoup.select.Selector`

- [ ] Binary-compatible
- [ ] Source-compatible
- [X] Serialization-compatible

| Status  | Modifiers    | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|---------|--------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Removed | ~~`public`~~ | ~~Class~~ | ~~`Selector`~~ | ~~[`Object`]~~ | ~~JDK 8~~ | ![Not serializable] | ![Class removed] ![Superclass removed] |


#### Methods

| Status  | Modifiers                 | Generics | Type             | Method                                          | Annotations | Throws | Compatibility Changes |
|---------|---------------------------|----------|------------------|-------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Elements`]~~ | ~~`select`~~([`String`], [`Element`])           |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Elements`]~~ | ~~`select`~~([`Evaluator`], [`Element`])        |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Elements`]~~ | ~~`select`~~([`String`], [`Iterable<Element>`]) |             |        | ![Method removed]     |
| Removed | ~~`static`~~ ~~`public`~~ |          | ~~[`Element`]~~  | ~~`selectFirst`~~([`String`], [`Element`])      |             |        | ![Method removed]     |

___

<a id="user-content-org.jsoup.select.selector$selectorparseexception"></a>
### `org.jsoup.select.Selector$SelectorParseException`

- [ ] Binary-compatible
- [ ] Source-compatible
- [ ] Serialization-compatible

| Status  | Modifiers                 | Type      | Name                         | Extends                       | JDK       | Serialization       | Compatibility Changes |
|---------|---------------------------|-----------|------------------------------|-------------------------------|-----------|---------------------|-----------------------|
| Removed | ~~`static`~~ ~~`public`~~ | ~~Class~~ | ~~`SelectorParseException`~~ | ~~[`IllegalStateException`]~~ | ~~JDK 8~~ | ![Class removed][1] | ![Class removed] ![Superclass removed] |


#### Implemented Interfaces

| Status  | Interface            | Compatibility Changes |
|---------|----------------------|-----------------------|
| Removed | ~~[`Serializable`]~~ | ![Interface removed]  |


#### Constructors

| Status  | Modifiers    | Generics | Constructor                                             | Annotations | Throws | Compatibility Changes |
|---------|--------------|----------|---------------------------------------------------------|-------------|--------|-----------------------|
| Removed | ~~`public`~~ |          | ~~`SelectorParseException`~~([`Throwable`], [`String`], [`Object...`]) |  |    | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`SelectorParseException`~~([`String`])                |             |        | ![Constructor removed] |
| Removed | ~~`public`~~ |          | ~~`SelectorParseException`~~([`String`], [`Object...`]) |             |        | ![Constructor removed] |


</details>


___

*Generated on: 2025-03-01 07:11:13.579+0530*.

[1]: https://img.shields.io/badge/Incompatible-red "Class removed"
[2]: # "org.jsoup.Connection$Method[]"
[3]: # "org.jsoup.helper.HttpConnection$KeyVal"
[4]: # "org.jsoup.helper.HttpConnection$Base"
[5]: # "org.jsoup.helper.HttpConnection$Request"
[6]: # "org.jsoup.helper.HttpConnection$Response"
[7]: # "java.lang.Object[]"
[8]: # "org.w3c.dom.Document"
[9]: # "org.jsoup.nodes.Node"
[10]: # "java.lang.String[]"
[11]: # "org.jsoup.nodes.Document$OutputSettings$Syntax[]"
[12]: # "org.jsoup.nodes.Document$QuirksMode[]"
[13]: # "org.jsoup.nodes.Entities$EscapeMode[]"
[14]: # "org.jsoup.nodes.Node[]"
[15]: # "org.jsoup.parser.Token$TokenType[]"
[16]: # "org.jsoup.select.NodeFilter$FilterResult[]"
[Annotation removed]: https://img.shields.io/badge/Annotation_removed-yellow "Annotation removed"
[Class removed]: https://img.shields.io/badge/Class_removed-red "Class removed"
[Constructor removed]: https://img.shields.io/badge/Constructor_removed-red "Constructor removed"
[Field removed]: https://img.shields.io/badge/Field_removed-red "Field removed"
[Interface removed]: https://img.shields.io/badge/Interface_removed-red "Interface removed"
[Method removed]: https://img.shields.io/badge/Method_removed-red "Method removed"
[No changes]: https://img.shields.io/badge/No_changes-green "No changes"
[Not serializable]: https://img.shields.io/badge/Not_serializable-green "Not serializable"
[Superclass removed]: https://img.shields.io/badge/Superclass_removed-red "Superclass removed"
[`Appendable`]: # "java.lang.Appendable"
[`ArrayList`]: # "java.util.ArrayList"
[`AttributeKeyPair`]: # "org.jsoup.select.Evaluator$AttributeKeyPair"
[`AttributeRange`]: # "org.jsoup.nodes.Range$AttributeRange"
[`Attribute`]: # "org.jsoup.nodes.Attribute"
[`Attributes`]: # "org.jsoup.nodes.Attributes"
[`AutoCloseable`]: # "java.lang.AutoCloseable"
[`Base<T>`]: # "org.jsoup.Connection$Base<T>"
[`Base`]: # "org.jsoup.Connection$Base"
[`BufferedInputStream`]: # "java.io.BufferedInputStream"
[`ByteBuffer`]: # "java.nio.ByteBuffer"
[`CDataNode`]: # "org.jsoup.nodes.CDataNode"
[`Charset`]: # "java.nio.charset.Charset"
[`Class<T>`]: # "java.lang.Class<T>"
[`Cloneable`]: # "java.lang.Cloneable"
[`Closeable`]: # "java.io.Closeable"
[`Collection<? extends E>`]: # "java.util.Collection<? extends E>"
[`Collection<? extends Node>`]: # "java.util.Collection<? extends org.jsoup.nodes.Node>"
[`Collection<?>`]: # "java.util.Collection<?>"
[`Collection<Element>`]: # "java.util.Collection<org.jsoup.nodes.Element>"
[`Collection<Evaluator>`]: # "java.util.Collection<org.jsoup.select.Evaluator>"
[`Collection<KeyVal>`]: # "java.util.Collection<org.jsoup.Connection$KeyVal>"
[`Collection`]: # "java.util.Collection"
[`Collector<CharSequence, ?, String>`]: # "java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String>"
[`CombiningEvaluator`]: # "org.jsoup.select.CombiningEvaluator"
[`Comment`]: # "org.jsoup.nodes.Comment"
[`Comparable`]: # "java.lang.Comparable"
[`Connection`]: # "org.jsoup.Connection"
[`Constable`]: # "java.lang.constant.Constable"
[`Consumer<? super Node>`]: # "java.util.function.Consumer<? super org.jsoup.nodes.Node>"
[`Context`]: # "org.jsoup.helper.RequestAuthenticator$Context"
[`ControllableInputStream`]: # "org.jsoup.internal.ControllableInputStream"
[`CookieStore`]: # "java.net.CookieStore"
[`CssNthEvaluator`]: # "org.jsoup.select.Evaluator$CssNthEvaluator"
[`DataNode`]: # "org.jsoup.nodes.DataNode"
[`DocumentBuilderFactory`]: # "javax.xml.parsers.DocumentBuilderFactory"
[`DocumentType`]: # "org.jsoup.nodes.DocumentType"
[`Document`]: # "org.jsoup.nodes.Document"
[`Element...`]: # "org.jsoup.nodes.Element..."
[`Element`]: # "org.jsoup.nodes.Element"
[`Elements`]: # "org.jsoup.select.Elements"
[`EndTag`]: # "org.jsoup.parser.Token$EndTag"
[`Entry`]: # "java.util.Map$Entry"
[`Enum`]: # "java.lang.Enum"
[`EscapeMode`]: # "org.jsoup.nodes.Entities$EscapeMode"
[`Evaluator`]: # "org.jsoup.select.Evaluator"
[`File`]: # "java.io.File"
[`FilterInputStream`]: # "java.io.FilterInputStream"
[`FilterResult`]: # "org.jsoup.select.NodeFilter$FilterResult"
[`FormElement`]: # "org.jsoup.nodes.FormElement"
[`Function<T, IdentityHashMap<K, V>>`]: # "java.util.function.Function<T, java.util.IdentityHashMap<K, V>>"
[`Function<T, List<U>>`]: # "java.util.function.Function<T, java.util.List<U>>"
[`Function<T, Map<K, V>>`]: # "java.util.function.Function<T, java.util.Map<K, V>>"
[`Function<T, Set<U>>`]: # "java.util.function.Function<T, java.util.Set<U>>"
[`FunctionalInterface`]: # "java.lang.FunctionalInterface"
[`HashMap<String, String>`]: # "java.util.HashMap<java.lang.String, java.lang.String>"
[`IOException`]: # "java.io.IOException"
[`IllegalArgumentException`]: # "java.lang.IllegalArgumentException"
[`IllegalStateException`]: # "java.lang.IllegalStateException"
[`IndexEvaluator`]: # "org.jsoup.select.Evaluator$IndexEvaluator"
[`InputStream`]: # "java.io.InputStream"
[`IsNthLastOfType`]: # "org.jsoup.select.Evaluator$IsNthLastOfType"
[`IsNthOfType`]: # "org.jsoup.select.Evaluator$IsNthOfType"
[`Iterable<Element>`]: # "java.lang.Iterable<org.jsoup.nodes.Element>"
[`Iterable`]: # "java.lang.Iterable"
[`Iterator<?>`]: # "java.util.Iterator<?>"
[`Iterator<Attribute>`]: # "java.util.Iterator<org.jsoup.nodes.Attribute>"
[`Iterator<Element>`]: # "java.util.Iterator<org.jsoup.nodes.Element>"
[`Iterator`]: # "java.util.Iterator"
[`K extends Object`]: # "K extends java.lang.Object"
[`KeyVal`]: # "org.jsoup.Connection$KeyVal"
[`LeafNode`]: # "org.jsoup.nodes.LeafNode"
[`List<Attribute>`]: # "java.util.List<org.jsoup.nodes.Attribute>"
[`List<Comment>`]: # "java.util.List<org.jsoup.nodes.Comment>"
[`List<DataNode>`]: # "java.util.List<org.jsoup.nodes.DataNode>"
[`List<Element>`]: # "java.util.List<org.jsoup.nodes.Element>"
[`List<FormElement>`]: # "java.util.List<org.jsoup.nodes.FormElement>"
[`List<KeyVal>`]: # "java.util.List<org.jsoup.Connection$KeyVal>"
[`List<Node>`]: # "java.util.List<org.jsoup.nodes.Node>"
[`List<String>`]: # "java.util.List<java.lang.String>"
[`List<T>`]: # "java.util.List<T>"
[`List<TextNode>`]: # "java.util.List<org.jsoup.nodes.TextNode>"
[`List`]: # "java.util.List"
[`MalformedURLException`]: # "java.net.MalformedURLException"
[`Map<String, List<String>>`]: # "java.util.Map<java.lang.String, java.util.List<java.lang.String>>"
[`Map<String, String>`]: # "java.util.Map<java.lang.String, java.lang.String>"
[`Method`]: # "org.jsoup.Connection$Method"
[`Node...`]: # "org.jsoup.nodes.Node..."
[`NodeFilter`]: # "org.jsoup.select.NodeFilter"
[`NodeIterator<Node>`]: # "org.jsoup.nodes.NodeIterator<org.jsoup.nodes.Node>"
[`NodeList`]: # "org.w3c.dom.NodeList"
[`NodeVisitor`]: # "org.jsoup.select.NodeVisitor"
[`Node`]: # "org.w3c.dom.Node"
[`Object...`]: # "java.lang.Object..."
[`Object`]: # "java.lang.Object"
[`OutputSettings`]: # "org.jsoup.nodes.Document$OutputSettings"
[`ParseErrorList`]: # "org.jsoup.parser.ParseErrorList"
[`ParseSettings`]: # "org.jsoup.parser.ParseSettings"
[`Parser`]: # "org.jsoup.parser.Parser"
[`PasswordAuthentication`]: # "java.net.PasswordAuthentication"
[`Path`]: # "java.nio.file.Path"
[`Pattern`]: # "java.util.regex.Pattern"
[`Position`]: # "org.jsoup.nodes.Range$Position"
[`Predicate<? super Element>`]: # "java.util.function.Predicate<? super org.jsoup.nodes.Element>"
[`Predicate<Element>`]: # "java.util.function.Predicate<org.jsoup.nodes.Element>"
[`Progress<ProgressContext>`]: # "org.jsoup.Progress<ProgressContext>"
[`Progress<Response>`]: # "org.jsoup.Progress<org.jsoup.Connection$Response>"
[`ProgressContext extends Object`]: # "ProgressContext extends java.lang.Object"
[`Proxy`]: # "java.net.Proxy"
[`QuirksMode`]: # "org.jsoup.nodes.Document$QuirksMode"
[`RandomAccess`]: # "java.util.RandomAccess"
[`Range`]: # "org.jsoup.nodes.Range"
[`Reader`]: # "java.io.Reader"
[`RequestAuthenticator`]: # "org.jsoup.helper.RequestAuthenticator"
[`Request`]: # "org.jsoup.Connection$Request"
[`RequestorType`]: # "java.net.Authenticator$RequestorType"
[`Response`]: # "org.jsoup.Connection$Response"
[`RuntimeException`]: # "java.lang.RuntimeException"
[`SSLSocketFactory`]: # "javax.net.ssl.SSLSocketFactory"
[`Safelist`]: # "org.jsoup.safety.Safelist"
[`SequencedCollection`]: # "java.util.SequencedCollection"
[`Serializable`]: # "java.io.Serializable"
[`Set<String>`]: # "java.util.Set<java.lang.String>"
[`Stream<Element>`]: # "java.util.stream.Stream<org.jsoup.nodes.Element>"
[`Stream<Node>`]: # "java.util.stream.Stream<org.jsoup.nodes.Node>"
[`Stream<T>`]: # "java.util.stream.Stream<T>"
[`StreamParser`]: # "org.jsoup.parser.StreamParser"
[`String...`]: # "java.lang.String..."
[`StringBuilder`]: # "java.lang.StringBuilder"
[`StringJoiner`]: # "org.jsoup.internal.StringUtil$StringJoiner"
[`String`]: # "java.lang.String"
[`Supplier<T>`]: # "java.util.function.Supplier<T>"
[`Syntax`]: # "org.jsoup.nodes.Document$OutputSettings$Syntax"
[`T extends Appendable`]: # "T extends java.lang.Appendable"
[`T extends Node`]: # "T extends org.jsoup.nodes.Node"
[`T extends Object`]: # "T extends java.lang.Object"
[`Tag`]: # "org.jsoup.parser.Tag"
[`TextNode`]: # "org.jsoup.nodes.TextNode"
[`Throwable`]: # "java.lang.Throwable"
[`TokenType`]: # "org.jsoup.parser.Token$TokenType"
[`Token`]: # "org.jsoup.parser.Token"
[`TreeBuilder`]: # "org.jsoup.parser.TreeBuilder"
[`U extends Object`]: # "U extends java.lang.Object"
[`URL`]: # "java.net.URL"
[`UnaryOperator<Element>`]: # "java.util.function.UnaryOperator<org.jsoup.nodes.Element>"
[`V extends Object`]: # "V extends java.lang.Object"
[`W3CDom`]: # "org.jsoup.helper.W3CDom"
[`XmlDeclaration`]: # "org.jsoup.nodes.XmlDeclaration"
[org.jsoup.Connection]: #user-content-org.jsoup.connection
[org.jsoup.Connection$Base]: #user-content-org.jsoup.connection$base
[org.jsoup.Connection$KeyVal]: #user-content-org.jsoup.connection$keyval
[org.jsoup.Connection$Method]: #user-content-org.jsoup.connection$method
[org.jsoup.Connection$Request]: #user-content-org.jsoup.connection$request
[org.jsoup.Connection$Response]: #user-content-org.jsoup.connection$response
[org.jsoup.HttpStatusException]: #user-content-org.jsoup.httpstatusexception
[org.jsoup.Jsoup]: #user-content-org.jsoup.jsoup
[org.jsoup.Progress]: #user-content-org.jsoup.progress
[org.jsoup.SerializationException]: #user-content-org.jsoup.serializationexception
[org.jsoup.UnsupportedMimeTypeException]: #user-content-org.jsoup.unsupportedmimetypeexception
[org.jsoup.helper.ChangeNotifyingArrayList]: #user-content-org.jsoup.helper.changenotifyingarraylist
[org.jsoup.helper.DataUtil]: #user-content-org.jsoup.helper.datautil
[org.jsoup.helper.HttpConnection]: #user-content-org.jsoup.helper.httpconnection
[org.jsoup.helper.HttpConnection$KeyVal]: #user-content-org.jsoup.helper.httpconnection$keyval
[org.jsoup.helper.HttpConnection$Request]: #user-content-org.jsoup.helper.httpconnection$request
[org.jsoup.helper.HttpConnection$Response]: #user-content-org.jsoup.helper.httpconnection$response
[org.jsoup.helper.RequestAuthenticator]: #user-content-org.jsoup.helper.requestauthenticator
[org.jsoup.helper.RequestAuthenticator$Context]: #user-content-org.jsoup.helper.requestauthenticator$context
[org.jsoup.helper.Validate]: #user-content-org.jsoup.helper.validate
[org.jsoup.helper.ValidationException]: #user-content-org.jsoup.helper.validationexception
[org.jsoup.helper.W3CDom]: #user-content-org.jsoup.helper.w3cdom
[org.jsoup.helper.W3CDom$W3CBuilder]: #user-content-org.jsoup.helper.w3cdom$w3cbuilder
[org.jsoup.internal.ControllableInputStream]: #user-content-org.jsoup.internal.controllableinputstream
[org.jsoup.internal.Functions]: #user-content-org.jsoup.internal.functions
[org.jsoup.internal.Normalizer]: #user-content-org.jsoup.internal.normalizer
[org.jsoup.internal.SharedConstants]: #user-content-org.jsoup.internal.sharedconstants
[org.jsoup.internal.SoftPool]: #user-content-org.jsoup.internal.softpool
[org.jsoup.internal.StringUtil]: #user-content-org.jsoup.internal.stringutil
[org.jsoup.internal.StringUtil$StringJoiner]: #user-content-org.jsoup.internal.stringutil$stringjoiner
[org.jsoup.nodes.Attribute]: #user-content-org.jsoup.nodes.attribute
[org.jsoup.nodes.Attributes]: #user-content-org.jsoup.nodes.attributes
[org.jsoup.nodes.CDataNode]: #user-content-org.jsoup.nodes.cdatanode
[org.jsoup.nodes.Comment]: #user-content-org.jsoup.nodes.comment
[org.jsoup.nodes.DataNode]: #user-content-org.jsoup.nodes.datanode
[org.jsoup.nodes.Document]: #user-content-org.jsoup.nodes.document
[org.jsoup.nodes.Document$OutputSettings]: #user-content-org.jsoup.nodes.document$outputsettings
[org.jsoup.nodes.Document$OutputSettings$Syntax]: #user-content-org.jsoup.nodes.document$outputsettings$syntax
[org.jsoup.nodes.Document$QuirksMode]: #user-content-org.jsoup.nodes.document$quirksmode
[org.jsoup.nodes.DocumentType]: #user-content-org.jsoup.nodes.documenttype
[org.jsoup.nodes.Element]: #user-content-org.jsoup.nodes.element
[org.jsoup.nodes.Entities]: #user-content-org.jsoup.nodes.entities
[org.jsoup.nodes.Entities$EscapeMode]: #user-content-org.jsoup.nodes.entities$escapemode
[org.jsoup.nodes.FormElement]: #user-content-org.jsoup.nodes.formelement
[org.jsoup.nodes.LeafNode]: #user-content-org.jsoup.nodes.leafnode
[org.jsoup.nodes.Node]: #user-content-org.jsoup.nodes.node
[org.jsoup.nodes.NodeIterator]: #user-content-org.jsoup.nodes.nodeiterator
[org.jsoup.nodes.PseudoTextElement]: #user-content-org.jsoup.nodes.pseudotextelement
[org.jsoup.nodes.Range]: #user-content-org.jsoup.nodes.range
[org.jsoup.nodes.Range$AttributeRange]: #user-content-org.jsoup.nodes.range$attributerange
[org.jsoup.nodes.Range$Position]: #user-content-org.jsoup.nodes.range$position
[org.jsoup.nodes.TextNode]: #user-content-org.jsoup.nodes.textnode
[org.jsoup.nodes.XmlDeclaration]: #user-content-org.jsoup.nodes.xmldeclaration
[org.jsoup.parser.CharacterReader]: #user-content-org.jsoup.parser.characterreader
[org.jsoup.parser.HtmlTreeBuilder]: #user-content-org.jsoup.parser.htmltreebuilder
[org.jsoup.parser.ParseError]: #user-content-org.jsoup.parser.parseerror
[org.jsoup.parser.ParseErrorList]: #user-content-org.jsoup.parser.parseerrorlist
[org.jsoup.parser.ParseSettings]: #user-content-org.jsoup.parser.parsesettings
[org.jsoup.parser.Parser]: #user-content-org.jsoup.parser.parser
[org.jsoup.parser.StreamParser]: #user-content-org.jsoup.parser.streamparser
[org.jsoup.parser.Tag]: #user-content-org.jsoup.parser.tag
[org.jsoup.parser.Token$TokenType]: #user-content-org.jsoup.parser.token$tokentype
[org.jsoup.parser.TokenQueue]: #user-content-org.jsoup.parser.tokenqueue
[org.jsoup.parser.XmlTreeBuilder]: #user-content-org.jsoup.parser.xmltreebuilder
[org.jsoup.safety.Cleaner]: #user-content-org.jsoup.safety.cleaner
[org.jsoup.safety.Safelist]: #user-content-org.jsoup.safety.safelist
[org.jsoup.select.Collector]: #user-content-org.jsoup.select.collector
[org.jsoup.select.CombiningEvaluator]: #user-content-org.jsoup.select.combiningevaluator
[org.jsoup.select.CombiningEvaluator$And]: #user-content-org.jsoup.select.combiningevaluator$and
[org.jsoup.select.CombiningEvaluator$Or]: #user-content-org.jsoup.select.combiningevaluator$or
[org.jsoup.select.Elements]: #user-content-org.jsoup.select.elements
[org.jsoup.select.Evaluator]: #user-content-org.jsoup.select.evaluator
[org.jsoup.select.Evaluator$AllElements]: #user-content-org.jsoup.select.evaluator$allelements
[org.jsoup.select.Evaluator$Attribute]: #user-content-org.jsoup.select.evaluator$attribute
[org.jsoup.select.Evaluator$AttributeKeyPair]: #user-content-org.jsoup.select.evaluator$attributekeypair
[org.jsoup.select.Evaluator$AttributeStarting]: #user-content-org.jsoup.select.evaluator$attributestarting
[org.jsoup.select.Evaluator$AttributeWithValue]: #user-content-org.jsoup.select.evaluator$attributewithvalue
[org.jsoup.select.Evaluator$AttributeWithValueContaining]: #user-content-org.jsoup.select.evaluator$attributewithvaluecontaining
[org.jsoup.select.Evaluator$AttributeWithValueEnding]: #user-content-org.jsoup.select.evaluator$attributewithvalueending
[org.jsoup.select.Evaluator$AttributeWithValueMatching]: #user-content-org.jsoup.select.evaluator$attributewithvaluematching
[org.jsoup.select.Evaluator$AttributeWithValueNot]: #user-content-org.jsoup.select.evaluator$attributewithvaluenot
[org.jsoup.select.Evaluator$AttributeWithValueStarting]: #user-content-org.jsoup.select.evaluator$attributewithvaluestarting
[org.jsoup.select.Evaluator$Class]: #user-content-org.jsoup.select.evaluator$class
[org.jsoup.select.Evaluator$ContainsData]: #user-content-org.jsoup.select.evaluator$containsdata
[org.jsoup.select.Evaluator$ContainsOwnText]: #user-content-org.jsoup.select.evaluator$containsowntext
[org.jsoup.select.Evaluator$ContainsText]: #user-content-org.jsoup.select.evaluator$containstext
[org.jsoup.select.Evaluator$ContainsWholeOwnText]: #user-content-org.jsoup.select.evaluator$containswholeowntext
[org.jsoup.select.Evaluator$ContainsWholeText]: #user-content-org.jsoup.select.evaluator$containswholetext
[org.jsoup.select.Evaluator$CssNthEvaluator]: #user-content-org.jsoup.select.evaluator$cssnthevaluator
[org.jsoup.select.Evaluator$Id]: #user-content-org.jsoup.select.evaluator$id
[org.jsoup.select.Evaluator$IndexEquals]: #user-content-org.jsoup.select.evaluator$indexequals
[org.jsoup.select.Evaluator$IndexEvaluator]: #user-content-org.jsoup.select.evaluator$indexevaluator
[org.jsoup.select.Evaluator$IndexGreaterThan]: #user-content-org.jsoup.select.evaluator$indexgreaterthan
[org.jsoup.select.Evaluator$IndexLessThan]: #user-content-org.jsoup.select.evaluator$indexlessthan
[org.jsoup.select.Evaluator$IsEmpty]: #user-content-org.jsoup.select.evaluator$isempty
[org.jsoup.select.Evaluator$IsFirstChild]: #user-content-org.jsoup.select.evaluator$isfirstchild
[org.jsoup.select.Evaluator$IsFirstOfType]: #user-content-org.jsoup.select.evaluator$isfirstoftype
[org.jsoup.select.Evaluator$IsLastChild]: #user-content-org.jsoup.select.evaluator$islastchild
[org.jsoup.select.Evaluator$IsLastOfType]: #user-content-org.jsoup.select.evaluator$islastoftype
[org.jsoup.select.Evaluator$IsNthChild]: #user-content-org.jsoup.select.evaluator$isnthchild
[org.jsoup.select.Evaluator$IsNthLastChild]: #user-content-org.jsoup.select.evaluator$isnthlastchild
[org.jsoup.select.Evaluator$IsNthLastOfType]: #user-content-org.jsoup.select.evaluator$isnthlastoftype
[org.jsoup.select.Evaluator$IsNthOfType]: #user-content-org.jsoup.select.evaluator$isnthoftype
[org.jsoup.select.Evaluator$IsOnlyChild]: #user-content-org.jsoup.select.evaluator$isonlychild
[org.jsoup.select.Evaluator$IsOnlyOfType]: #user-content-org.jsoup.select.evaluator$isonlyoftype
[org.jsoup.select.Evaluator$IsRoot]: #user-content-org.jsoup.select.evaluator$isroot
[org.jsoup.select.Evaluator$MatchText]: #user-content-org.jsoup.select.evaluator$matchtext
[org.jsoup.select.Evaluator$Matches]: #user-content-org.jsoup.select.evaluator$matches
[org.jsoup.select.Evaluator$MatchesOwn]: #user-content-org.jsoup.select.evaluator$matchesown
[org.jsoup.select.Evaluator$MatchesWholeOwnText]: #user-content-org.jsoup.select.evaluator$matcheswholeowntext
[org.jsoup.select.Evaluator$MatchesWholeText]: #user-content-org.jsoup.select.evaluator$matcheswholetext
[org.jsoup.select.Evaluator$Tag]: #user-content-org.jsoup.select.evaluator$tag
[org.jsoup.select.Evaluator$TagEndsWith]: #user-content-org.jsoup.select.evaluator$tagendswith
[org.jsoup.select.Evaluator$TagStartsWith]: #user-content-org.jsoup.select.evaluator$tagstartswith
[org.jsoup.select.NodeFilter]: #user-content-org.jsoup.select.nodefilter
[org.jsoup.select.NodeFilter$FilterResult]: #user-content-org.jsoup.select.nodefilter$filterresult
[org.jsoup.select.NodeTraversor]: #user-content-org.jsoup.select.nodetraversor
[org.jsoup.select.NodeVisitor]: #user-content-org.jsoup.select.nodevisitor
[org.jsoup.select.QueryParser]: #user-content-org.jsoup.select.queryparser
[org.jsoup.select.Selector]: #user-content-org.jsoup.select.selector
[org.jsoup.select.Selector$SelectorParseException]: #user-content-org.jsoup.select.selector$selectorparseexception
