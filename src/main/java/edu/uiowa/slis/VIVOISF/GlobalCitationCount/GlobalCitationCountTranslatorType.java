package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountTranslatorIterator theGlobalCitationCountTranslatorIterator = (GlobalCitationCountTranslatorIterator)findAncestorWithClass(this, GlobalCitationCountTranslatorIterator.class);
			pageContext.getOut().print(theGlobalCitationCountTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for translator tag ");
		}
		return SKIP_BODY;
	}
}

