package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeOrganizerInverseIterator theCollegeOrganizerInverseIterator = (CollegeOrganizerInverseIterator)findAncestorWithClass(this, CollegeOrganizerInverseIterator.class);
			pageContext.getOut().print(theCollegeOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing College for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for organizer tag ");
		}
		return SKIP_BODY;
	}
}

