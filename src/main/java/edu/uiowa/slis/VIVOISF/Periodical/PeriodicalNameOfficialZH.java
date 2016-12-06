package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameOfficialZHIterator thePeriodical = (PeriodicalNameOfficialZHIterator)findAncestorWithClass(this, PeriodicalNameOfficialZHIterator.class);
			pageContext.getOut().print(thePeriodical.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

