package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentRO_0000056Iterator theUndergraduateStudentRO_0000056Iterator = (UndergraduateStudentRO_0000056Iterator)findAncestorWithClass(this, UndergraduateStudentRO_0000056Iterator.class);
			pageContext.getOut().print(theUndergraduateStudentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

