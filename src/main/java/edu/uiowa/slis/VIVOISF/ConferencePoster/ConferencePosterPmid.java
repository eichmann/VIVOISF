package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPmidIterator theConferencePoster = (ConferencePosterPmidIterator)findAncestorWithClass(this, ConferencePosterPmidIterator.class);
			pageContext.getOut().print(theConferencePoster.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for pmid tag ");
		}
		return SKIP_BODY;
	}
}

