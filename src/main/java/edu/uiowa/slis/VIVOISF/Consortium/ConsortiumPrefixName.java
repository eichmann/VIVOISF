package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConsortiumPrefixNameIterator theConsortium = (ConsortiumPrefixNameIterator)findAncestorWithClass(this, ConsortiumPrefixNameIterator.class);
			pageContext.getOut().print(theConsortium.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

