package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceRO_0000056Iterator theBibliographicInformationSourceRO_0000056Iterator = (BibliographicInformationSourceRO_0000056Iterator)findAncestorWithClass(this, BibliographicInformationSourceRO_0000056Iterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

