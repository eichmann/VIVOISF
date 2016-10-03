package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapIssuerIterator theMapIssuerIterator = (MapIssuerIterator)findAncestorWithClass(this, MapIssuerIterator.class);
			pageContext.getOut().print(theMapIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for issuer tag ");
		}
		return SKIP_BODY;
	}
}

