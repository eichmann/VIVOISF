package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameFamilyName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameFamilyName currentInstance = null;
	private static final Log log = LogFactory.getLog(NameFamilyName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameFamilyNameIterator theName = (NameFamilyNameIterator)findAncestorWithClass(this, NameFamilyNameIterator.class);
			pageContext.getOut().print(theName.getFamilyName());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for familyName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for familyName tag ");
		}
		return SKIP_BODY;
	}
}

