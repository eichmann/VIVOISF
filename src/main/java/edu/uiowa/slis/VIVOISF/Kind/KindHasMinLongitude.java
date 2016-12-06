package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindHasMinLongitudeIterator theKind = (KindHasMinLongitudeIterator)findAncestorWithClass(this, KindHasMinLongitudeIterator.class);
			pageContext.getOut().print(theKind.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

