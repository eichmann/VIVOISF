package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameListENIterator theFacultyPosition = (FacultyPositionNameListENIterator)findAncestorWithClass(this, FacultyPositionNameListENIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

