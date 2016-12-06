package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameListITIterator theConferencePoster = (ConferencePosterNameListITIterator)findAncestorWithClass(this, ConferencePosterNameListITIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

