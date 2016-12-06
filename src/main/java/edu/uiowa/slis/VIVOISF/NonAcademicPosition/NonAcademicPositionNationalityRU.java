package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNationalityRUIterator theNonAcademicPosition = (NonAcademicPositionNationalityRUIterator)findAncestorWithClass(this, NonAcademicPositionNationalityRUIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

