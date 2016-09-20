package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameHasNameInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameHasNameInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NameHasNameInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NameHasNameInverseIterator theNameHasNameInverseIterator = (NameHasNameInverseIterator)findAncestorWithClass(this, NameHasNameInverseIterator.class);
			pageContext.getOut().print(theNameHasNameInverseIterator.getHasNameInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for hasName tag ");
		}
		return SKIP_BODY;
	}
}

