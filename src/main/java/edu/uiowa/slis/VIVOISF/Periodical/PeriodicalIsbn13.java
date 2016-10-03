package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsbn13Iterator thePeriodical = (PeriodicalIsbn13Iterator)findAncestorWithClass(this, PeriodicalIsbn13Iterator.class);
			pageContext.getOut().print(thePeriodical.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

