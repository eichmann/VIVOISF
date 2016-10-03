package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteIntervieweeInverseIterator theInstituteIntervieweeInverseIterator = (InstituteIntervieweeInverseIterator)findAncestorWithClass(this, InstituteIntervieweeInverseIterator.class);
			pageContext.getOut().print(theInstituteIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

