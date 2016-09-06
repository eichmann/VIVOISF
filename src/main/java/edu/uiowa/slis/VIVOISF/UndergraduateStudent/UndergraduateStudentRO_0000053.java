package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentRO_0000053Iterator theUndergraduateStudentRO_0000053Iterator = (UndergraduateStudentRO_0000053Iterator)findAncestorWithClass(this, UndergraduateStudentRO_0000053Iterator.class);
			pageContext.getOut().print(theUndergraduateStudentRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

