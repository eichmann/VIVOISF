package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterUpcIterator theConferencePoster = (ConferencePosterUpcIterator)findAncestorWithClass(this, ConferencePosterUpcIterator.class);
			pageContext.getOut().print(theConferencePoster.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for upc tag ");
		}
		return SKIP_BODY;
	}
}

