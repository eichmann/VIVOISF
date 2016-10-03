package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsbn10Iterator thePeriodical = (PeriodicalIsbn10Iterator)findAncestorWithClass(this, PeriodicalIsbn10Iterator.class);
			pageContext.getOut().print(thePeriodical.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

