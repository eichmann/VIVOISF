package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocument theLegalDocument = (LegalDocument)findAncestorWithClass(this, LegalDocument.class);
			if (!theLegalDocument.commitNeeded) {
				pageContext.getOut().print(theLegalDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LegalDocument theLegalDocument = (LegalDocument)findAncestorWithClass(this, LegalDocument.class);
			return theLegalDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LegalDocument theLegalDocument = (LegalDocument)findAncestorWithClass(this, LegalDocument.class);
			theLegalDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for label tag ");
		}
	}
}

