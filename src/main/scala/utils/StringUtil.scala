package utils

object StringUtil {
	def isAlphanumeric(c: Char): Boolean =
		(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')

	def isEqualIgnoreCase(a: Char, b: Char): Boolean =
		(if (a >= 'A' && a <= 'Z') a + 32 else a) == (if (b >= 'A' && b <= 'Z') b + 32 else b)
}