package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameOfficialESIterator thePeriodical = (PeriodicalNameOfficialESIterator)findAncestorWithClass(this, PeriodicalNameOfficialESIterator.class);
			pageContext.getOut().print(thePeriodical.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

