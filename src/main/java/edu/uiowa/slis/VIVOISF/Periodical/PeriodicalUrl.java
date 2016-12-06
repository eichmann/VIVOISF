package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalUrlIterator thePeriodical = (PeriodicalUrlIterator)findAncestorWithClass(this, PeriodicalUrlIterator.class);
			pageContext.getOut().print(thePeriodical.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for url tag ");
		}
		return SKIP_BODY;
	}
}

