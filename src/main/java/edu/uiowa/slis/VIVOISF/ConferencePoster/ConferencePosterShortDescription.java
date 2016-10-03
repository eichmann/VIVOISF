package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterShortDescriptionIterator theConferencePoster = (ConferencePosterShortDescriptionIterator)findAncestorWithClass(this, ConferencePosterShortDescriptionIterator.class);
			pageContext.getOut().print(theConferencePoster.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

