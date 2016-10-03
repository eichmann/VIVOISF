package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationGtin14Iterator theLegislation = (LegislationGtin14Iterator)findAncestorWithClass(this, LegislationGtin14Iterator.class);
			pageContext.getOut().print(theLegislation.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

