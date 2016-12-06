package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameShortENIterator theNonAcademicPosition = (NonAcademicPositionNameShortENIterator)findAncestorWithClass(this, NonAcademicPositionNameShortENIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

