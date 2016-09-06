package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentIAO_0000136Iterator theCollectedDocumentIAO_0000136Iterator = (CollectedDocumentIAO_0000136Iterator)findAncestorWithClass(this, CollectedDocumentIAO_0000136Iterator.class);
			pageContext.getOut().print(theCollectedDocumentIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

