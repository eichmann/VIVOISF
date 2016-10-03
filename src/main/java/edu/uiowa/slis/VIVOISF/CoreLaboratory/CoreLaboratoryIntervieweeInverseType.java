package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryIntervieweeInverseIterator theCoreLaboratoryIntervieweeInverseIterator = (CoreLaboratoryIntervieweeInverseIterator)findAncestorWithClass(this, CoreLaboratoryIntervieweeInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

