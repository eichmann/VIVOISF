package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			if (!theDocument.commitNeeded) {
				pageContext.getOut().print(theDocument.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Document for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			return theDocument.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Document for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			theDocument.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Document for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for abbreviation tag ");
		}
	}
}

