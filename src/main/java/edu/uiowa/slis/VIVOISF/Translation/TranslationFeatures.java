package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationFeaturesIterator theTranslationFeaturesIterator = (TranslationFeaturesIterator)findAncestorWithClass(this, TranslationFeaturesIterator.class);
			pageContext.getOut().print(theTranslationFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for features tag ");
		}
		return SKIP_BODY;
	}
}

