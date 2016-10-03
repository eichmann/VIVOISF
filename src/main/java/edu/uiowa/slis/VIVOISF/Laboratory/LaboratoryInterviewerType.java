package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryInterviewerIterator theLaboratoryInterviewerIterator = (LaboratoryInterviewerIterator)findAncestorWithClass(this, LaboratoryInterviewerIterator.class);
			pageContext.getOut().print(theLaboratoryInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

