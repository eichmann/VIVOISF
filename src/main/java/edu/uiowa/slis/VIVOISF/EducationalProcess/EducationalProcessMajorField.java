package edu.uiowa.slis.VIVOISF.EducationalProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EducationalProcessMajorField extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EducationalProcessMajorField currentInstance = null;
	private static final Log log = LogFactory.getLog(EducationalProcessMajorField.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EducationalProcessMajorFieldIterator theEducationalProcess = (EducationalProcessMajorFieldIterator)findAncestorWithClass(this, EducationalProcessMajorFieldIterator.class);
			pageContext.getOut().print(theEducationalProcess.getMajorField());
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for majorField tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for majorField tag ");
		}
		return SKIP_BODY;
	}
}

