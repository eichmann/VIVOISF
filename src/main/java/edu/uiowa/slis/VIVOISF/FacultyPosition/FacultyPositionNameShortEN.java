package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameShortENIterator theFacultyPosition = (FacultyPositionNameShortENIterator)findAncestorWithClass(this, FacultyPositionNameShortENIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

