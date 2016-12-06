package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasTitleIterator theNonAcademicPositionHasTitleIterator = (NonAcademicPositionHasTitleIterator)findAncestorWithClass(this, NonAcademicPositionHasTitleIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

