package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionPublisherIterator theFacultyAdministrativePositionPublisherIterator = (FacultyAdministrativePositionPublisherIterator)findAncestorWithClass(this, FacultyAdministrativePositionPublisherIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

