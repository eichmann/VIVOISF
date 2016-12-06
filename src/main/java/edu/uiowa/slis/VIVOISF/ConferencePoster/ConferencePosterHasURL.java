package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasURLIterator theConferencePosterHasURLIterator = (ConferencePosterHasURLIterator)findAncestorWithClass(this, ConferencePosterHasURLIterator.class);
			pageContext.getOut().print(theConferencePosterHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

