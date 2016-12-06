package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPublisherIterator theFacultyPositionPublisherIterator = (FacultyPositionPublisherIterator)findAncestorWithClass(this, FacultyPositionPublisherIterator.class);
			pageContext.getOut().print(theFacultyPositionPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

