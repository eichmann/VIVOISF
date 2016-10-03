package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationIssuerIterator theTranslationIssuerIterator = (TranslationIssuerIterator)findAncestorWithClass(this, TranslationIssuerIterator.class);
			pageContext.getOut().print(theTranslationIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for issuer tag ");
		}
		return SKIP_BODY;
	}
}

