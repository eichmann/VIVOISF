package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			if (!theDocumentPart.commitNeeded) {
				pageContext.getOut().print(theDocumentPart.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			return theDocumentPart.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing DocumentPart for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			theDocumentPart.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for abbreviation tag ");
		}
	}
}

