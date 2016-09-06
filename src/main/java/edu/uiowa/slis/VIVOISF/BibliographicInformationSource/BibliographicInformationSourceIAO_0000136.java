package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceIAO_0000136Iterator theBibliographicInformationSourceIAO_0000136Iterator = (BibliographicInformationSourceIAO_0000136Iterator)findAncestorWithClass(this, BibliographicInformationSourceIAO_0000136Iterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

