package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryInterviewerInverseIterator theLaboratoryInterviewerInverseIterator = (LaboratoryInterviewerInverseIterator)findAncestorWithClass(this, LaboratoryInterviewerInverseIterator.class);
			pageContext.getOut().print(theLaboratoryInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

