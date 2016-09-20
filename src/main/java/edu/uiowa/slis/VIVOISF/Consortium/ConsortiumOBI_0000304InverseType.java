package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumOBI_0000304InverseIterator theConsortiumOBI_0000304InverseIterator = (ConsortiumOBI_0000304InverseIterator)findAncestorWithClass(this, ConsortiumOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theConsortiumOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

