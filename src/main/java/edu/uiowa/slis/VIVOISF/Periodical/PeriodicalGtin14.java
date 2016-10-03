package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalGtin14Iterator thePeriodical = (PeriodicalGtin14Iterator)findAncestorWithClass(this, PeriodicalGtin14Iterator.class);
			pageContext.getOut().print(thePeriodical.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

