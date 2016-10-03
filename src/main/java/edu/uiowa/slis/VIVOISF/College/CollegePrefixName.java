package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegePrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegePrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegePrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollegePrefixNameIterator theCollege = (CollegePrefixNameIterator)findAncestorWithClass(this, CollegePrefixNameIterator.class);
			pageContext.getOut().print(theCollege.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing College for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

