package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryInterviewerIterator theCoreLaboratoryInterviewerIterator = (CoreLaboratoryInterviewerIterator)findAncestorWithClass(this, CoreLaboratoryInterviewerIterator.class);
			pageContext.getOut().print(theCoreLaboratoryInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

