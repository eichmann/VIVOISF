package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalUri currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalUriIterator thePeriodical = (PeriodicalUriIterator)findAncestorWithClass(this, PeriodicalUriIterator.class);
			pageContext.getOut().print(thePeriodical.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for uri tag ");
		}
		return SKIP_BODY;
	}
}

