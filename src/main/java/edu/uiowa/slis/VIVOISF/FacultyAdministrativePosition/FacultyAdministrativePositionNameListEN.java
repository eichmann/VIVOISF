package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameListENIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameListENIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameListENIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

