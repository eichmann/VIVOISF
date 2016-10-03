package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationIssuerIterator theLegislationIssuerIterator = (LegislationIssuerIterator)findAncestorWithClass(this, LegislationIssuerIterator.class);
			pageContext.getOut().print(theLegislationIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for issuer tag ");
		}
		return SKIP_BODY;
	}
}

