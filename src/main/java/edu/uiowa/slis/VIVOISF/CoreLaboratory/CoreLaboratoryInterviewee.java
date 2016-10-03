package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryIntervieweeIterator theCoreLaboratoryIntervieweeIterator = (CoreLaboratoryIntervieweeIterator)findAncestorWithClass(this, CoreLaboratoryIntervieweeIterator.class);
			pageContext.getOut().print(theCoreLaboratoryIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

