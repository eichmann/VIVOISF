package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565GoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565GoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565GoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565GoverningAuthorityForIterator theERO_0000565GoverningAuthorityForIterator = (ERO_0000565GoverningAuthorityForIterator)findAncestorWithClass(this, ERO_0000565GoverningAuthorityForIterator.class);
			pageContext.getOut().print(theERO_0000565GoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

