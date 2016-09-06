package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceTranslatorIterator theReferenceSourceTranslatorIterator = (ReferenceSourceTranslatorIterator)findAncestorWithClass(this, ReferenceSourceTranslatorIterator.class);
			pageContext.getOut().print(theReferenceSourceTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for translator tag ");
		}
		return SKIP_BODY;
	}
}

