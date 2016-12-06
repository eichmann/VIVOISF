package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasNameIterator theConferencePosterHasNameIterator = (ConferencePosterHasNameIterator)findAncestorWithClass(this, ConferencePosterHasNameIterator.class);
			pageContext.getOut().print(theConferencePosterHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasName tag ");
		}
		return SKIP_BODY;
	}
}

