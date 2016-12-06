package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameShortENIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameShortENIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameShortENIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

