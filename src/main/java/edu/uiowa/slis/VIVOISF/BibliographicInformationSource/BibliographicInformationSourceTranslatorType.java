package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceTranslatorIterator theBibliographicInformationSourceTranslatorIterator = (BibliographicInformationSourceTranslatorIterator)findAncestorWithClass(this, BibliographicInformationSourceTranslatorIterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for translator tag ");
		}
		return SKIP_BODY;
	}
}

