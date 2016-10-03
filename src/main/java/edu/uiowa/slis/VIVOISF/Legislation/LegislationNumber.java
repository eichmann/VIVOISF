package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationNumberIterator theLegislation = (LegislationNumberIterator)findAncestorWithClass(this, LegislationNumberIterator.class);
			pageContext.getOut().print(theLegislation.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for number tag ");
		}
		return SKIP_BODY;
	}
}

