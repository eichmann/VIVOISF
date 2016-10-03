package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversitySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversitySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversitySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UniversitySuffixNameIterator theUniversity = (UniversitySuffixNameIterator)findAncestorWithClass(this, UniversitySuffixNameIterator.class);
			pageContext.getOut().print(theUniversity.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing University for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

