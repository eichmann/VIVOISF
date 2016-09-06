package edu.uiowa.slis.VIVOISF.Internship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InternshipMajorField extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InternshipMajorField currentInstance = null;
	private static final Log log = LogFactory.getLog(InternshipMajorField.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InternshipMajorFieldIterator theInternship = (InternshipMajorFieldIterator)findAncestorWithClass(this, InternshipMajorFieldIterator.class);
			pageContext.getOut().print(theInternship.getMajorField());
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for majorField tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for majorField tag ");
		}
		return SKIP_BODY;
	}
}

