package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationFeaturesIterator theTranslationFeaturesIterator = (TranslationFeaturesIterator)findAncestorWithClass(this, TranslationFeaturesIterator.class);
			pageContext.getOut().print(theTranslationFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for features tag ");
		}
		return SKIP_BODY;
	}
}

