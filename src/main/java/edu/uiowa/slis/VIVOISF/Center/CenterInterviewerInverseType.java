package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterInterviewerInverseIterator theCenterInterviewerInverseIterator = (CenterInterviewerInverseIterator)findAncestorWithClass(this, CenterInterviewerInverseIterator.class);
			pageContext.getOut().print(theCenterInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for interviewer tag ");
		}
		return SKIP_BODY;
	}
}
