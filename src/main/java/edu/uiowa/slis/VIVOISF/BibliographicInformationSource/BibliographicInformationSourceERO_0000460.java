package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceERO_0000460 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceERO_0000460 currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceERO_0000460.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceERO_0000460Iterator theBibliographicInformationSourceERO_0000460Iterator = (BibliographicInformationSourceERO_0000460Iterator)findAncestorWithClass(this, BibliographicInformationSourceERO_0000460Iterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceERO_0000460Iterator.getERO_0000460());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for ERO_0000460 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for ERO_0000460 tag ");
		}
		return SKIP_BODY;
	}
}

