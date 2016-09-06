package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionRelatesIterator theNonAcademicPositionRelatesIterator = (NonAcademicPositionRelatesIterator)findAncestorWithClass(this, NonAcademicPositionRelatesIterator.class);
			pageContext.getOut().print(theNonAcademicPositionRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

