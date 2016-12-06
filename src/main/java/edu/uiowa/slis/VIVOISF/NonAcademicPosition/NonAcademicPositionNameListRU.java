package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameListRUIterator theNonAcademicPosition = (NonAcademicPositionNameListRUIterator)findAncestorWithClass(this, NonAcademicPositionNameListRUIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

