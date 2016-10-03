package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationPageEndIterator theLegislation = (LegislationPageEndIterator)findAncestorWithClass(this, LegislationPageEndIterator.class);
			pageContext.getOut().print(theLegislation.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

