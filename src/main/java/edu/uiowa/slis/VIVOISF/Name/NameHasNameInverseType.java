package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameHasNameInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameHasNameInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NameHasNameInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NameHasNameInverseIterator theNameHasNameInverseIterator = (NameHasNameInverseIterator)findAncestorWithClass(this, NameHasNameInverseIterator.class);
			pageContext.getOut().print(theNameHasNameInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for hasName tag ");
		}
		return SKIP_BODY;
	}
}

