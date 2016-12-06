package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameOfficialENIterator thePeriodical = (PeriodicalNameOfficialENIterator)findAncestorWithClass(this, PeriodicalNameOfficialENIterator.class);
			pageContext.getOut().print(thePeriodical.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

