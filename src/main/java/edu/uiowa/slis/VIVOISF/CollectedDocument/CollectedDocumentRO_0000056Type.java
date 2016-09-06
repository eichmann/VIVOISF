package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentRO_0000056Iterator theCollectedDocumentRO_0000056Iterator = (CollectedDocumentRO_0000056Iterator)findAncestorWithClass(this, CollectedDocumentRO_0000056Iterator.class);
			pageContext.getOut().print(theCollectedDocumentRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

