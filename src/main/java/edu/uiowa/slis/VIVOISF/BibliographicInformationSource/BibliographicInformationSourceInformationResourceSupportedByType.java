package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceInformationResourceSupportedByIterator theBibliographicInformationSourceInformationResourceSupportedByIterator = (BibliographicInformationSourceInformationResourceSupportedByIterator)findAncestorWithClass(this, BibliographicInformationSourceInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

