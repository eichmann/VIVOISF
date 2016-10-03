package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterIdentifierIterator theConferencePoster = (ConferencePosterIdentifierIterator)findAncestorWithClass(this, ConferencePosterIdentifierIterator.class);
			pageContext.getOut().print(theConferencePoster.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for identifier tag ");
		}
		return SKIP_BODY;
	}
}

