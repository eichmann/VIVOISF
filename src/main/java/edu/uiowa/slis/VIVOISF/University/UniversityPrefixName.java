package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UniversityPrefixNameIterator theUniversity = (UniversityPrefixNameIterator)findAncestorWithClass(this, UniversityPrefixNameIterator.class);
			pageContext.getOut().print(theUniversity.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing University for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

