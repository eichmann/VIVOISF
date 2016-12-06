package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeDBPediaIDIterator theFacultyPosition = (FacultyPositionCodeDBPediaIDIterator)findAncestorWithClass(this, FacultyPositionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

