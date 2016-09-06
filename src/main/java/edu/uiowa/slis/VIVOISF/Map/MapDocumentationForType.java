package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapDocumentationForIterator theMapDocumentationForIterator = (MapDocumentationForIterator)findAncestorWithClass(this, MapDocumentationForIterator.class);
			pageContext.getOut().print(theMapDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

