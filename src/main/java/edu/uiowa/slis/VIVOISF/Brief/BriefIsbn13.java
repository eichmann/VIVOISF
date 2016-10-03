package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefIsbn13Iterator theBrief = (BriefIsbn13Iterator)findAncestorWithClass(this, BriefIsbn13Iterator.class);
			pageContext.getOut().print(theBrief.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

