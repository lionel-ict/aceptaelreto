package entrenamiento12uvas;

import java.util.Scanner;

public class cuantosdiasfaltan2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int casos = scan.nextInt();
		int diasmes[][] = new int[][] { {},
				// Enero
				{ -1, 364, 363, 362, 361, 360, 359, 358, 357, 356, 355, 354, 353, 352, 351, 350, 349, 348, 347, 346,
						345, 344, 343, 342, 341, 340, 339, 338, 337, 336, 335, 334 },
				// Febrero
				{ -1, 333, 332, 331, 330, 329, 328, 327, 326, 325, 324, 323, 322, 321, 320, 319, 318, 317, 316, 315,
						314, 313, 312, 311, 310, 309, 308, 307, 306 },
				// Marzo
				{ -1, 305, 304, 303, 302, 301, 300, 299, 298, 297, 296, 295, 294, 293, 292, 291, 290, 289, 288, 287,
						286, 285, 284, 283, 282, 281, 280, 279, 278, 277, 276, 275 },
				// Abril
				{ -1, 274, 273, 272, 271, 270, 269, 268, 267, 266, 265, 264, 263, 262, 261, 260, 259, 258, 257, 256,
						255, 254, 253, 252, 251, 250, 249, 248, 247, 246, 245 },
				// Mayo
				{ -1, 244, 243, 242, 241, 240, 239, 238, 237, 236, 235, 234, 233, 232, 231, 230, 229, 228, 227, 226,
						225, 224, 223, 222, 221, 220, 219, 218, 217, 216, 215, 214 },
				// Junio
				{ -1, 213, 212, 211, 210, 209, 208, 207, 206, 205, 204, 203, 202, 201, 200, 199, 198, 197, 196, 195,
						194, 193, 192, 191, 190, 189, 188, 187, 186, 185, 184 },
				// Julio
				{ -1, 183, 182, 181, 180, 179, 178, 177, 176, 175, 174, 173, 172, 171, 170, 169, 168, 167, 166, 165,
						164, 163, 162, 161, 160, 159, 158, 157, 156, 155, 154, 153 },
				// Agosto
				{ -1, 152, 151, 150, 149, 148, 147, 146, 145, 144, 143, 142, 141, 140, 139, 138, 137, 136, 135, 134,
						133, 132, 131, 130, 129, 128, 127, 126, 125, 124, 123, 122 },
				// Septiembre
				{ -1, 121, 120, 119, 118, 117, 116, 115, 114, 113, 112, 111, 110, 109, 108, 107, 106, 105, 104, 103,
						102, 101, 100, 99, 98, 97, 96, 95, 94, 93, 92 },
				// Octubre
				{ -1, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68,
						67, 66, 65, 64, 63, 62, 61 },
				// Noviembre
				{ -1, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37,
						36, 35, 34, 33, 32, 31 },
				// Diciembre
				{ -1, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5,
						4, 3, 2, 1, 0 } };

		while (casos > 0) {

			int dia = scan.nextInt();
			int mes = scan.nextInt();
			System.out.println(diasmes[mes][dia]);
			casos--;
		}

	}

}
