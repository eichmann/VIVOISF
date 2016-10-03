package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollegeSuffixNameIterator theCollege = (CollegeSuffixNameIterator)findAncestorWithClass(this, CollegeSuffixNameIterator.class);
			pageContext.getOut().print(theCollege.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing College for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

