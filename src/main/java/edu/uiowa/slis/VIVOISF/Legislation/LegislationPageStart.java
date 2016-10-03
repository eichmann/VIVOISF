package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationPageStartIterator theLegislation = (LegislationPageStartIterator)findAncestorWithClass(this, LegislationPageStartIterator.class);
			pageContext.getOut().print(theLegislation.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

