package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationInformationResourceSupportedByIterator theTranslationInformationResourceSupportedByIterator = (TranslationInformationResourceSupportedByIterator)findAncestorWithClass(this, TranslationInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theTranslationInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

