package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentERO_0000397 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentERO_0000397 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentERO_0000397.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentERO_0000397Iterator theUndergraduateStudentERO_0000397Iterator = (UndergraduateStudentERO_0000397Iterator)findAncestorWithClass(this, UndergraduateStudentERO_0000397Iterator.class);
			pageContext.getOut().print(theUndergraduateStudentERO_0000397Iterator.getERO_0000397());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

