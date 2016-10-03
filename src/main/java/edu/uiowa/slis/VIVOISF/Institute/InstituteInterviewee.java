package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteIntervieweeIterator theInstituteIntervieweeIterator = (InstituteIntervieweeIterator)findAncestorWithClass(this, InstituteIntervieweeIterator.class);
			pageContext.getOut().print(theInstituteIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

