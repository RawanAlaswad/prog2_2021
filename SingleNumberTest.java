package aufgabe4;

import org.junit.Test;

class SingleNumberTest {

		int [] nums = {5,1,2,1,2};
		int [] nums1 = {1,2,1,2};
		int [] nums2 = {1};
		
		
		@Test
		void testSingleNumber()
		{
			assertFalse(1==SingleNumber.singleNumber(nums2),"Input: [1] Expected output: 1");
			assertFalse(5==SingleNumber.singleNumber(nums),"Input: [5,1,2,1,2] Expected output: 5");
			assertFalse(-1==SingleNumber.singleNumber(nums1),"Input: [1,2,1,2] Expected output: -1");
			assertFalse(6==SingleNumber.singleNumber(nums), "Input: [5,1,2,1,2] Expected output: 5");	
			assertEquals(5, SingleNumber.singleNumber(nums), "Input: [5,1,2,1,2] Expected output: 5");
		}


		private void assertEquals(int i, int singleNumber, String string) {
			// TODO Auto-generated method stub
			
		}


		private void assertFalse(boolean b, String string) {
			// TODO Auto-generated method stub
			
		}
		

	}


