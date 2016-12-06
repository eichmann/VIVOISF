package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFreetextKeywordIterator thePeriodical = (PeriodicalFreetextKeywordIterator)findAncestorWithClass(this, PeriodicalFreetextKeywordIterator.class);
			pageContext.getOut().print(thePeriodical.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

