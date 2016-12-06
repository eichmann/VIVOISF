package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNationalityZHIterator theFacultyPosition = (FacultyPositionNationalityZHIterator)findAncestorWithClass(this, FacultyPositionNationalityZHIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

