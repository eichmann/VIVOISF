package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentOclcnumIterator theDocument = (DocumentOclcnumIterator)findAncestorWithClass(this, DocumentOclcnumIterator.class);
			pageContext.getOut().print(theDocument.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

