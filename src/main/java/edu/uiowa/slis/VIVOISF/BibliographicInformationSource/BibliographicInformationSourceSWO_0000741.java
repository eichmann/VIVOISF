package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceSWO_0000741 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceSWO_0000741 currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceSWO_0000741.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceSWO_0000741Iterator theBibliographicInformationSourceSWO_0000741Iterator = (BibliographicInformationSourceSWO_0000741Iterator)findAncestorWithClass(this, BibliographicInformationSourceSWO_0000741Iterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceSWO_0000741Iterator.getSWO_0000741());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for SWO_0000741 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for SWO_0000741 tag ");
		}
		return SKIP_BODY;
	}
}

