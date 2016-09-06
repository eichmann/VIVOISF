package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardSubjectAreaOfIterator theAwardSubjectAreaOfIterator = (AwardSubjectAreaOfIterator)findAncestorWithClass(this, AwardSubjectAreaOfIterator.class);
			pageContext.getOut().print(theAwardSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

