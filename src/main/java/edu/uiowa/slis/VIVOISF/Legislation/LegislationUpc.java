package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationUpcIterator theLegislation = (LegislationUpcIterator)findAncestorWithClass(this, LegislationUpcIterator.class);
			pageContext.getOut().print(theLegislation.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for upc tag ");
		}
		return SKIP_BODY;
	}
}

