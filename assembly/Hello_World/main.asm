section .data
	text db "Hello World!", 0xA
	text_l equ $-text

section .text
	global _start

_start:
	mov eax, 4
	mov ebx, 1
	mov ecx, text
	mov edx, text_l
	int 0x80

	mov eax, 1
	mov ebx, 0
	int 0x80
