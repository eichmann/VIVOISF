package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationShortTitleIterator theLegislation = (LegislationShortTitleIterator)findAncestorWithClass(this, LegislationShortTitleIterator.class);
			pageContext.getOut().print(theLegislation.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

