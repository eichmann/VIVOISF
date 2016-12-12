package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasGeoIterator theKindHasGeoIterator = (KindHasGeoIterator)findAncestorWithClass(this, KindHasGeoIterator.class);
			pageContext.getOut().print(theKindHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

