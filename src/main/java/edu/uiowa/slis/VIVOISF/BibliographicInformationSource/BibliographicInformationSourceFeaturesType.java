package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceFeaturesIterator theBibliographicInformationSourceFeaturesIterator = (BibliographicInformationSourceFeaturesIterator)findAncestorWithClass(this, BibliographicInformationSourceFeaturesIterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for features tag ");
		}
		return SKIP_BODY;
	}
}

