package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceERO_0000070Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceERO_0000070Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceERO_0000070Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceERO_0000070Iterator theBibliographicInformationSourceERO_0000070Iterator = (BibliographicInformationSourceERO_0000070Iterator)findAncestorWithClass(this, BibliographicInformationSourceERO_0000070Iterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceERO_0000070Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for ERO_0000070 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for ERO_0000070 tag ");
		}
		return SKIP_BODY;
	}
}

