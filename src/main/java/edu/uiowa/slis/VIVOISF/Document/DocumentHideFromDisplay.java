package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			if (!theDocument.commitNeeded) {
				pageContext.getOut().print(theDocument.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			return theDocument.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Document for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			theDocument.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hideFromDisplay tag ");
		}
	}
}

