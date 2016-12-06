package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasTelephoneIterator theDocumentHasTelephoneIterator = (DocumentHasTelephoneIterator)findAncestorWithClass(this, DocumentHasTelephoneIterator.class);
			pageContext.getOut().print(theDocumentHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

