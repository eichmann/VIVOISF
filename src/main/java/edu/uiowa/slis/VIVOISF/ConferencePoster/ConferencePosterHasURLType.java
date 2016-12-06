package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasURLIterator theConferencePosterHasURLIterator = (ConferencePosterHasURLIterator)findAncestorWithClass(this, ConferencePosterHasURLIterator.class);
			pageContext.getOut().print(theConferencePosterHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

