package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDescriptionIterator theConferencePoster = (ConferencePosterDescriptionIterator)findAncestorWithClass(this, ConferencePosterDescriptionIterator.class);
			pageContext.getOut().print(theConferencePoster.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for description tag ");
		}
		return SKIP_BODY;
	}
}

