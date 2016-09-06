package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymInformationResourceSupportedByIterator theSynonymInformationResourceSupportedByIterator = (SynonymInformationResourceSupportedByIterator)findAncestorWithClass(this, SynonymInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theSynonymInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

