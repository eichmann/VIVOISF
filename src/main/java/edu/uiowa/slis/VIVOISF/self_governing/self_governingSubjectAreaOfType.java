package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingSubjectAreaOfIterator theself_governingSubjectAreaOfIterator = (self_governingSubjectAreaOfIterator)findAncestorWithClass(this, self_governingSubjectAreaOfIterator.class);
			pageContext.getOut().print(theself_governingSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

