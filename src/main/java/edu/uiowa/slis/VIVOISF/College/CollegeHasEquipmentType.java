package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeHasEquipmentIterator theCollegeHasEquipmentIterator = (CollegeHasEquipmentIterator)findAncestorWithClass(this, CollegeHasEquipmentIterator.class);
			pageContext.getOut().print(theCollegeHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

