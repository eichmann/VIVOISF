package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCitesIterator theConferencePaperCitesIterator = (ConferencePaperCitesIterator)findAncestorWithClass(this, ConferencePaperCitesIterator.class);
			pageContext.getOut().print(theConferencePaperCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for cites tag ");
		}
		return SKIP_BODY;
	}
}

