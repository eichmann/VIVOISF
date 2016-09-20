package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceERO_0000034Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceERO_0000034Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceERO_0000034Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceERO_0000034Iterator theBibliographicInformationSourceERO_0000034Iterator = (BibliographicInformationSourceERO_0000034Iterator)findAncestorWithClass(this, BibliographicInformationSourceERO_0000034Iterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceERO_0000034Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for ERO_0000034 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for ERO_0000034 tag ");
		}
		return SKIP_BODY;
	}
}

