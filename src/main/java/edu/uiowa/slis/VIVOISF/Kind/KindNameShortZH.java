package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameShortZHIterator theKind = (KindNameShortZHIterator)findAncestorWithClass(this, KindNameShortZHIterator.class);
			pageContext.getOut().print(theKind.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

