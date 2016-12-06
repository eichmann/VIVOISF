package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionUrlIterator theNonAcademicPosition = (NonAcademicPositionUrlIterator)findAncestorWithClass(this, NonAcademicPositionUrlIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for url tag ");
		}
		return SKIP_BODY;
	}
}

