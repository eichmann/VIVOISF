package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryOrganizerInverseIterator theLaboratoryOrganizerInverseIterator = (LaboratoryOrganizerInverseIterator)findAncestorWithClass(this, LaboratoryOrganizerInverseIterator.class);
			pageContext.getOut().print(theLaboratoryOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for organizer tag ");
		}
		return SKIP_BODY;
	}
}

