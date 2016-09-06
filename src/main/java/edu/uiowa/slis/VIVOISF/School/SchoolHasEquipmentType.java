package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolHasEquipmentIterator theSchoolHasEquipmentIterator = (SchoolHasEquipmentIterator)findAncestorWithClass(this, SchoolHasEquipmentIterator.class);
			pageContext.getOut().print(theSchoolHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

