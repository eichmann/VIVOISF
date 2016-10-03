package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConsortiumSuffixNameIterator theConsortium = (ConsortiumSuffixNameIterator)findAncestorWithClass(this, ConsortiumSuffixNameIterator.class);
			pageContext.getOut().print(theConsortium.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

