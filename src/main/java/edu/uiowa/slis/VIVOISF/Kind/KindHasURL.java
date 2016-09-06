package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasURLIterator theKindHasURLIterator = (KindHasURLIterator)findAncestorWithClass(this, KindHasURLIterator.class);
			pageContext.getOut().print(theKindHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

