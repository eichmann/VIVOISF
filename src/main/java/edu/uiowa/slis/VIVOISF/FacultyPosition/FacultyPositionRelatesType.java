package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRelatesIterator theFacultyPositionRelatesIterator = (FacultyPositionRelatesIterator)findAncestorWithClass(this, FacultyPositionRelatesIterator.class);
			pageContext.getOut().print(theFacultyPositionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

