package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasSubjectAreaIterator theConferencePaperHasSubjectAreaIterator = (ConferencePaperHasSubjectAreaIterator)findAncestorWithClass(this, ConferencePaperHasSubjectAreaIterator.class);
			pageContext.getOut().print(theConferencePaperHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

