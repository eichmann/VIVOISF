package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindHasMaxLongitudeIterator theKind = (KindHasMaxLongitudeIterator)findAncestorWithClass(this, KindHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theKind.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

