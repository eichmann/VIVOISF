package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocument theCollectedDocument = (CollectedDocument)findAncestorWithClass(this, CollectedDocument.class);
			if (!theCollectedDocument.commitNeeded) {
				pageContext.getOut().print(theCollectedDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CollectedDocument theCollectedDocument = (CollectedDocument)findAncestorWithClass(this, CollectedDocument.class);
			return theCollectedDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CollectedDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CollectedDocument theCollectedDocument = (CollectedDocument)findAncestorWithClass(this, CollectedDocument.class);
			theCollectedDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for label tag ");
		}
	}
}

