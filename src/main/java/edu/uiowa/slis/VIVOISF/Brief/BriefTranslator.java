package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefTranslatorIterator theBriefTranslatorIterator = (BriefTranslatorIterator)findAncestorWithClass(this, BriefTranslatorIterator.class);
			pageContext.getOut().print(theBriefTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for translator tag ");
		}
		return SKIP_BODY;
	}
}

