package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteInterviewerIterator theInstituteInterviewerIterator = (InstituteInterviewerIterator)findAncestorWithClass(this, InstituteInterviewerIterator.class);
			pageContext.getOut().print(theInstituteInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

