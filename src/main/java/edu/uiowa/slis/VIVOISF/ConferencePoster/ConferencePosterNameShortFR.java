package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameShortFRIterator theConferencePoster = (ConferencePosterNameShortFRIterator)findAncestorWithClass(this, ConferencePosterNameShortFRIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

