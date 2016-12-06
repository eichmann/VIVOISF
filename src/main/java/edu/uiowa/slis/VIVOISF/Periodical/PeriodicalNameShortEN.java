package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameShortENIterator thePeriodical = (PeriodicalNameShortENIterator)findAncestorWithClass(this, PeriodicalNameShortENIterator.class);
			pageContext.getOut().print(thePeriodical.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

