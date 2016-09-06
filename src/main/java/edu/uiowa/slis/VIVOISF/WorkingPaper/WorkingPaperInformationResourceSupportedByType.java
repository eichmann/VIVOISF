package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperInformationResourceSupportedByIterator theWorkingPaperInformationResourceSupportedByIterator = (WorkingPaperInformationResourceSupportedByIterator)findAncestorWithClass(this, WorkingPaperInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theWorkingPaperInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

