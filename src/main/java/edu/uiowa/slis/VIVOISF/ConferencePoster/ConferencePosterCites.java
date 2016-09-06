package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCitesIterator theConferencePosterCitesIterator = (ConferencePosterCitesIterator)findAncestorWithClass(this, ConferencePosterCitesIterator.class);
			pageContext.getOut().print(theConferencePosterCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for cites tag ");
		}
		return SKIP_BODY;
	}
}

