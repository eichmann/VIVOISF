package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocument theLegalCaseDocument = (LegalCaseDocument)findAncestorWithClass(this, LegalCaseDocument.class);
			if (!theLegalCaseDocument.commitNeeded) {
				pageContext.getOut().print(theLegalCaseDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LegalCaseDocument theLegalCaseDocument = (LegalCaseDocument)findAncestorWithClass(this, LegalCaseDocument.class);
			return theLegalCaseDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalCaseDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LegalCaseDocument theLegalCaseDocument = (LegalCaseDocument)findAncestorWithClass(this, LegalCaseDocument.class);
			theLegalCaseDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for label tag ");
		}
	}
}

