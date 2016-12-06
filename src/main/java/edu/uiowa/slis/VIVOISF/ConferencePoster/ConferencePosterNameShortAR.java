package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameShortARIterator theConferencePoster = (ConferencePosterNameShortARIterator)findAncestorWithClass(this, ConferencePosterNameShortARIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

