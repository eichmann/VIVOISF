package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryInterviewerInverseIterator theCoreLaboratoryInterviewerInverseIterator = (CoreLaboratoryInterviewerInverseIterator)findAncestorWithClass(this, CoreLaboratoryInterviewerInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

