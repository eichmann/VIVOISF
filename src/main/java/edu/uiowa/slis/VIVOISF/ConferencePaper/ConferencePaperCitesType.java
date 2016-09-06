package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCitesIterator theConferencePaperCitesIterator = (ConferencePaperCitesIterator)findAncestorWithClass(this, ConferencePaperCitesIterator.class);
			pageContext.getOut().print(theConferencePaperCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for cites tag ");
		}
		return SKIP_BODY;
	}
}

