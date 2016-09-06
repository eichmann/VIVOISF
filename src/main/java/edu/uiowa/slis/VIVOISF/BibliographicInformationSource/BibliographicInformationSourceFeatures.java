package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceFeaturesIterator theBibliographicInformationSourceFeaturesIterator = (BibliographicInformationSourceFeaturesIterator)findAncestorWithClass(this, BibliographicInformationSourceFeaturesIterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for features tag ");
		}
		return SKIP_BODY;
	}
}

