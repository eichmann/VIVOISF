package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityHasEquipmentIterator theUniversityHasEquipmentIterator = (UniversityHasEquipmentIterator)findAncestorWithClass(this, UniversityHasEquipmentIterator.class);
			pageContext.getOut().print(theUniversityHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing University for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

