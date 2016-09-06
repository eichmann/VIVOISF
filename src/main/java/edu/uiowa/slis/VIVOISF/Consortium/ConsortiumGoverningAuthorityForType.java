package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumGoverningAuthorityForIterator theConsortiumGoverningAuthorityForIterator = (ConsortiumGoverningAuthorityForIterator)findAncestorWithClass(this, ConsortiumGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theConsortiumGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

