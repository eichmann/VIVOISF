package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasEmailIterator theKindHasEmailIterator = (KindHasEmailIterator)findAncestorWithClass(this, KindHasEmailIterator.class);
			pageContext.getOut().print(theKindHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

