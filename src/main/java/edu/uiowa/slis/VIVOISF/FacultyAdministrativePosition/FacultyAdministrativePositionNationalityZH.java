package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNationalityZHIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNationalityZHIterator)findAncestorWithClass(this, FacultyAdministrativePositionNationalityZHIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

