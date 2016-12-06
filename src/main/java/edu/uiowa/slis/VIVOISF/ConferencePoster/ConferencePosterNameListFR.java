package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameListFRIterator theConferencePoster = (ConferencePosterNameListFRIterator)findAncestorWithClass(this, ConferencePosterNameListFRIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

