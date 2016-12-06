package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasTelephoneIterator theDocumentPartHasTelephoneIterator = (DocumentPartHasTelephoneIterator)findAncestorWithClass(this, DocumentPartHasTelephoneIterator.class);
			pageContext.getOut().print(theDocumentPartHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

