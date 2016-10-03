package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteIntervieweeIterator theInstituteIntervieweeIterator = (InstituteIntervieweeIterator)findAncestorWithClass(this, InstituteIntervieweeIterator.class);
			pageContext.getOut().print(theInstituteIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

