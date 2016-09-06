package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCitedByIterator theConferencePosterCitedByIterator = (ConferencePosterCitedByIterator)findAncestorWithClass(this, ConferencePosterCitedByIterator.class);
			pageContext.getOut().print(theConferencePosterCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

