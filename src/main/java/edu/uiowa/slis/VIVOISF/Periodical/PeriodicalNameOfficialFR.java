package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameOfficialFRIterator thePeriodical = (PeriodicalNameOfficialFRIterator)findAncestorWithClass(this, PeriodicalNameOfficialFRIterator.class);
			pageContext.getOut().print(thePeriodical.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

