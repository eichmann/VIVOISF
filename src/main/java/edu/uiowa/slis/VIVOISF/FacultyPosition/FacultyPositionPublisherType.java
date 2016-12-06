package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPublisherIterator theFacultyPositionPublisherIterator = (FacultyPositionPublisherIterator)findAncestorWithClass(this, FacultyPositionPublisherIterator.class);
			pageContext.getOut().print(theFacultyPositionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

