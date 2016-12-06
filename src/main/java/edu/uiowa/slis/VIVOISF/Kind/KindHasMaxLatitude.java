package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindHasMaxLatitudeIterator theKind = (KindHasMaxLatitudeIterator)findAncestorWithClass(this, KindHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theKind.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

