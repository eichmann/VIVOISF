package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameOfficialITIterator thePeriodical = (PeriodicalNameOfficialITIterator)findAncestorWithClass(this, PeriodicalNameOfficialITIterator.class);
			pageContext.getOut().print(thePeriodical.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

