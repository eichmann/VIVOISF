package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSubjectAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSubjectAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSubjectAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaSubjectAreaOfIterator theareaSubjectAreaOfIterator = (areaSubjectAreaOfIterator)findAncestorWithClass(this, areaSubjectAreaOfIterator.class);
			pageContext.getOut().print(theareaSubjectAreaOfIterator.getSubjectAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing area for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

