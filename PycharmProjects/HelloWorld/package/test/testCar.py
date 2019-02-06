import unittest
from unittest.mock import patch

class TestUMmmmmm(unittest.TestCase):

    def setUp(self):
        pass

    @patch("Car.Car")
    def test_numbers_3_4(self, MockCar):
        mock = MockCar()
        mock.accelerate.return_value = 100
        self.assertEqual(mock.accelerate(), 100)

    # def test_strings_a_3(self):
    #     self.assertEqual(multiply('a', 3), 'aaa')


if __name__ == '__main__':
    unittest.main()