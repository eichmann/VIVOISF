package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterTranslatorOfIterator theCenterTranslatorOfIterator = (CenterTranslatorOfIterator)findAncestorWithClass(this, CenterTranslatorOfIterator.class);
			pageContext.getOut().print(theCenterTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

