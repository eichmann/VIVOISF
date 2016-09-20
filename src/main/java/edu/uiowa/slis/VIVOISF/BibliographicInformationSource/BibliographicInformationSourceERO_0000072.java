package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceERO_0000072 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceERO_0000072 currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceERO_0000072.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceERO_0000072Iterator theBibliographicInformationSource = (BibliographicInformationSourceERO_0000072Iterator)findAncestorWithClass(this, BibliographicInformationSourceERO_0000072Iterator.class);
			pageContext.getOut().print(theBibliographicInformationSource.getERO_0000072());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for ERO_0000072 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for ERO_0000072 tag ");
		}
		return SKIP_BODY;
	}
}

