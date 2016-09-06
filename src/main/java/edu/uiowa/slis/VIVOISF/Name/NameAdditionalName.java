package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameAdditionalName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameAdditionalName currentInstance = null;
	private static final Log log = LogFactory.getLog(NameAdditionalName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameAdditionalNameIterator theName = (NameAdditionalNameIterator)findAncestorWithClass(this, NameAdditionalNameIterator.class);
			pageContext.getOut().print(theName.getAdditionalName());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for additionalName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for additionalName tag ");
		}
		return SKIP_BODY;
	}
}

