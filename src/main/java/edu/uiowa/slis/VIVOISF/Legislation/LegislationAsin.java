package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationAsinIterator theLegislation = (LegislationAsinIterator)findAncestorWithClass(this, LegislationAsinIterator.class);
			pageContext.getOut().print(theLegislation.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for asin tag ");
		}
		return SKIP_BODY;
	}
}

