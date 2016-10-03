package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentOclcnumIterator theLegalDocument = (LegalDocumentOclcnumIterator)findAncestorWithClass(this, LegalDocumentOclcnumIterator.class);
			pageContext.getOut().print(theLegalDocument.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

