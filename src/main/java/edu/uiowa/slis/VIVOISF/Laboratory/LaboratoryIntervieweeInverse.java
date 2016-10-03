package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryIntervieweeInverseIterator theLaboratoryIntervieweeInverseIterator = (LaboratoryIntervieweeInverseIterator)findAncestorWithClass(this, LaboratoryIntervieweeInverseIterator.class);
			pageContext.getOut().print(theLaboratoryIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

