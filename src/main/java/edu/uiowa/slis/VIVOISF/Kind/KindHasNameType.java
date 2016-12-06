package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasNameIterator theKindHasNameIterator = (KindHasNameIterator)findAncestorWithClass(this, KindHasNameIterator.class);
			pageContext.getOut().print(theKindHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasName tag ");
		}
		return SKIP_BODY;
	}
}

