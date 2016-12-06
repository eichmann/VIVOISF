package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindHasMinLatitudeIterator theKind = (KindHasMinLatitudeIterator)findAncestorWithClass(this, KindHasMinLatitudeIterator.class);
			pageContext.getOut().print(theKind.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

