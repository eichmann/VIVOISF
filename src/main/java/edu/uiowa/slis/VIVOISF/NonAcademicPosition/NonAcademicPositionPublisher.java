package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionPublisherIterator theNonAcademicPositionPublisherIterator = (NonAcademicPositionPublisherIterator)findAncestorWithClass(this, NonAcademicPositionPublisherIterator.class);
			pageContext.getOut().print(theNonAcademicPositionPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

