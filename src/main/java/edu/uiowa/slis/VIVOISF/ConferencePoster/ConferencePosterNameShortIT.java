package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameShortITIterator theConferencePoster = (ConferencePosterNameShortITIterator)findAncestorWithClass(this, ConferencePosterNameShortITIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

