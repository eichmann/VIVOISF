package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteIntervieweeInverseIterator theInstituteIntervieweeInverseIterator = (InstituteIntervieweeInverseIterator)findAncestorWithClass(this, InstituteIntervieweeInverseIterator.class);
			pageContext.getOut().print(theInstituteIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

