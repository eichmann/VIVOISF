package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceHasGlobalCountSourceInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceHasGlobalCountSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceHasGlobalCountSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSourceHasGlobalCountSourceInverseIterator theBibliographicInformationSourceHasGlobalCountSourceInverseIterator = (BibliographicInformationSourceHasGlobalCountSourceInverseIterator)findAncestorWithClass(this, BibliographicInformationSourceHasGlobalCountSourceInverseIterator.class);
			pageContext.getOut().print(theBibliographicInformationSourceHasGlobalCountSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for hasGlobalCountSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for hasGlobalCountSource tag ");
		}
		return SKIP_BODY;
	}
}

