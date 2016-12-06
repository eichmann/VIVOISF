package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNationalityENIterator theNonAcademicPosition = (NonAcademicPositionNationalityENIterator)findAncestorWithClass(this, NonAcademicPositionNationalityENIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

