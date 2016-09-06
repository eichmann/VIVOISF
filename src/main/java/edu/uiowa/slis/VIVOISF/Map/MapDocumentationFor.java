package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(MapDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapDocumentationForIterator theMapDocumentationForIterator = (MapDocumentationForIterator)findAncestorWithClass(this, MapDocumentationForIterator.class);
			pageContext.getOut().print(theMapDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

