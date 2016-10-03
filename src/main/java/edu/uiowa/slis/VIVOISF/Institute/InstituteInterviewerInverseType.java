package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteInterviewerInverseIterator theInstituteInterviewerInverseIterator = (InstituteInterviewerInverseIterator)findAncestorWithClass(this, InstituteInterviewerInverseIterator.class);
			pageContext.getOut().print(theInstituteInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

