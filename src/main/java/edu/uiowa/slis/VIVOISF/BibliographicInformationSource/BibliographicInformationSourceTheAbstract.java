package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceTheAbstractIterator theBibliographicInformationSource = (BibliographicInformationSourceTheAbstractIterator)findAncestorWithClass(this, BibliographicInformationSourceTheAbstractIterator.class);
			pageContext.getOut().print(theBibliographicInformationSource.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

