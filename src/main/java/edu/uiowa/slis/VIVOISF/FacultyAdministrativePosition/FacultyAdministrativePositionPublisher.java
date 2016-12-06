package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionPublisherIterator theFacultyAdministrativePositionPublisherIterator = (FacultyAdministrativePositionPublisherIterator)findAncestorWithClass(this, FacultyAdministrativePositionPublisherIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

