package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasSubjectAreaIterator theConferencePosterHasSubjectAreaIterator = (ConferencePosterHasSubjectAreaIterator)findAncestorWithClass(this, ConferencePosterHasSubjectAreaIterator.class);
			pageContext.getOut().print(theConferencePosterHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}
