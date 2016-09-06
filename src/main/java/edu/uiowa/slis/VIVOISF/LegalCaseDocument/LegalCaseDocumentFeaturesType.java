package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentFeaturesIterator theLegalCaseDocumentFeaturesIterator = (LegalCaseDocumentFeaturesIterator)findAncestorWithClass(this, LegalCaseDocumentFeaturesIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for features tag ");
		}
		return SKIP_BODY;
	}
}

