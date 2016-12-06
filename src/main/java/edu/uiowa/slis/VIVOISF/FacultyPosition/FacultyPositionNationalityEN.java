package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNationalityENIterator theFacultyPosition = (FacultyPositionNationalityENIterator)findAncestorWithClass(this, FacultyPositionNationalityENIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

