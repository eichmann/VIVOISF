package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameOfficialENIterator theFacultyPosition = (FacultyPositionNameOfficialENIterator)findAncestorWithClass(this, FacultyPositionNameOfficialENIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

