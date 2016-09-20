package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentERO_0000037Iterator theUndergraduateStudentERO_0000037Iterator = (UndergraduateStudentERO_0000037Iterator)findAncestorWithClass(this, UndergraduateStudentERO_0000037Iterator.class);
			pageContext.getOut().print(theUndergraduateStudentERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

