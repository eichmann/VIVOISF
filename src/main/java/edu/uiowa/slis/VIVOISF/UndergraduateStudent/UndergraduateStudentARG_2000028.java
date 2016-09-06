package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentARG_2000028Iterator theUndergraduateStudentARG_2000028Iterator = (UndergraduateStudentARG_2000028Iterator)findAncestorWithClass(this, UndergraduateStudentARG_2000028Iterator.class);
			pageContext.getOut().print(theUndergraduateStudentARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

