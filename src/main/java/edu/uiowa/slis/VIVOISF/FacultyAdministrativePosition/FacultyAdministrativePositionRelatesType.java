package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionRelatesIterator theFacultyAdministrativePositionRelatesIterator = (FacultyAdministrativePositionRelatesIterator)findAncestorWithClass(this, FacultyAdministrativePositionRelatesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

