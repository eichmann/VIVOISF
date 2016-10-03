package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterIntervieweeInverseIterator theCenterIntervieweeInverseIterator = (CenterIntervieweeInverseIterator)findAncestorWithClass(this, CenterIntervieweeInverseIterator.class);
			pageContext.getOut().print(theCenterIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

