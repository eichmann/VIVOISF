package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameOfficialENIterator theNonAcademicPosition = (NonAcademicPositionNameOfficialENIterator)findAncestorWithClass(this, NonAcademicPositionNameOfficialENIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

