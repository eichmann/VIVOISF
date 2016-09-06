package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDoiIterator theConferencePoster = (ConferencePosterDoiIterator)findAncestorWithClass(this, ConferencePosterDoiIterator.class);
			pageContext.getOut().print(theConferencePoster.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for doi tag ");
		}
		return SKIP_BODY;
	}
}

