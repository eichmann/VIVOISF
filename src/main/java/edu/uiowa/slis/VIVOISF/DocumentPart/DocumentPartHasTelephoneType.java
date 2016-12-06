package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasTelephoneIterator theDocumentPartHasTelephoneIterator = (DocumentPartHasTelephoneIterator)findAncestorWithClass(this, DocumentPartHasTelephoneIterator.class);
			pageContext.getOut().print(theDocumentPartHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

