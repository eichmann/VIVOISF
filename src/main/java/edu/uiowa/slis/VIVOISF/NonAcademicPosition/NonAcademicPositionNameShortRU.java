package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameShortRUIterator theNonAcademicPosition = (NonAcademicPositionNameShortRUIterator)findAncestorWithClass(this, NonAcademicPositionNameShortRUIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

