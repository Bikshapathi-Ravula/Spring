import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class IgnoreNullValues {

	public static String[] getNullPropertyNames(Object source) {

		final BeanWrapper src = new BeanWrapperImpl(source);

		java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<>();

		for (java.beans.PropertyDescriptor pd : pds) {

			Object srcValue = src.getPropertyValue(pd.getName());

			if (srcValue == null) {
				emptyNames.add(pd.getName());
			}

		}

		String[] result = new String[emptyNames.size()];

		return emptyNames.toArray(result);

	}

// then use Spring BeanUtils to copy and ignore null using our function

	public static void copyNonNullProperties(Object src, Object target) {

		BeanUtils.copyProperties(src, target, getNullPropertyNames(src));

	}

}