package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationRO_0000056Iterator theTranslationRO_0000056Iterator = (TranslationRO_0000056Iterator)findAncestorWithClass(this, TranslationRO_0000056Iterator.class);
			pageContext.getOut().print(theTranslationRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

