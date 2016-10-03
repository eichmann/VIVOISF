package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionOrganizerInverseIterator theDivisionOrganizerInverseIterator = (DivisionOrganizerInverseIterator)findAncestorWithClass(this, DivisionOrganizerInverseIterator.class);
			pageContext.getOut().print(theDivisionOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for organizer tag ");
		}
		return SKIP_BODY;
	}
}

