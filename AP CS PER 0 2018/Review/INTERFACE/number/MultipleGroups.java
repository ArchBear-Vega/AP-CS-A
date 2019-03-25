package INTERFACE.number;

import java.util.List;

public class MultipleGroups implements NumberGroup {

	private List<NumberGroup> list;

	@Override
	public boolean contains(int num) {
		for (NumberGroup r : list) {

			if (r.contains(num)) {
				return true;
			}
		}
		return false;
	}

}
