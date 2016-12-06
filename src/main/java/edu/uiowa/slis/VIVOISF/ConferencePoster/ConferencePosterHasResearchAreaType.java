package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasResearchAreaIterator theConferencePosterHasResearchAreaIterator = (ConferencePosterHasResearchAreaIterator)findAncestorWithClass(this, ConferencePosterHasResearchAreaIterator.class);
			pageContext.getOut().print(theConferencePosterHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

