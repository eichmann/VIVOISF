package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentRO_0001025Iterator theUndergraduateStudentRO_0001025Iterator = (UndergraduateStudentRO_0001025Iterator)findAncestorWithClass(this, UndergraduateStudentRO_0001025Iterator.class);
			pageContext.getOut().print(theUndergraduateStudentRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

