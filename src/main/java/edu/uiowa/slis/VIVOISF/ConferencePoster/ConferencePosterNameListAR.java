package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameListARIterator theConferencePoster = (ConferencePosterNameListARIterator)findAncestorWithClass(this, ConferencePosterNameListARIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

