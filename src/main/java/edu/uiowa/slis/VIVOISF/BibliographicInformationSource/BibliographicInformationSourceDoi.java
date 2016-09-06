package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceDoiIterator theBibliographicInformationSource = (BibliographicInformationSourceDoiIterator)findAncestorWithClass(this, BibliographicInformationSourceDoiIterator.class);
			pageContext.getOut().print(theBibliographicInformationSource.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for doi tag ");
		}
		return SKIP_BODY;
	}
}

