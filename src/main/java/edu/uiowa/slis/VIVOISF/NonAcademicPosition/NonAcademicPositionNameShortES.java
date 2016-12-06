package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameShortESIterator theNonAcademicPosition = (NonAcademicPositionNameShortESIterator)findAncestorWithClass(this, NonAcademicPositionNameShortESIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

