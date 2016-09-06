package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationInformationResourceSupportedByIterator theTranslationInformationResourceSupportedByIterator = (TranslationInformationResourceSupportedByIterator)findAncestorWithClass(this, TranslationInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theTranslationInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

