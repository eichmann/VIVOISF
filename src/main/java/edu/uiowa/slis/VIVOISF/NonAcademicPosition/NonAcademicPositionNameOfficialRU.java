package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameOfficialRUIterator theNonAcademicPosition = (NonAcademicPositionNameOfficialRUIterator)findAncestorWithClass(this, NonAcademicPositionNameOfficialRUIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

