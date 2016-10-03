package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryIntervieweeIterator theLaboratoryIntervieweeIterator = (LaboratoryIntervieweeIterator)findAncestorWithClass(this, LaboratoryIntervieweeIterator.class);
			pageContext.getOut().print(theLaboratoryIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

