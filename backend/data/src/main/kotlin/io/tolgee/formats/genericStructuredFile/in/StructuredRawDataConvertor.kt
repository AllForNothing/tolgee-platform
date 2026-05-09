package io.tolgee.formats.genericStructuredFile.`in`

import io.tolgee.formats.MessageConvertorResult

interface StructuredRawDataConvertor {
  fun convert(
    rawData: Any?,
    projectIcuPlaceholdersEnabled: Boolean,
    convertPlaceholdersToIcu: Boolean,
    keepOriginalPlaceholders: Boolean = false,
  ): List<MessageConvertorResult>?
}
