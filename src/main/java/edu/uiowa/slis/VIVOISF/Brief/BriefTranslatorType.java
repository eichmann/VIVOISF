package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefTranslatorIterator theBriefTranslatorIterator = (BriefTranslatorIterator)findAncestorWithClass(this, BriefTranslatorIterator.class);
			pageContext.getOut().print(theBriefTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for translator tag ");
		}
		return SKIP_BODY;
	}
}

