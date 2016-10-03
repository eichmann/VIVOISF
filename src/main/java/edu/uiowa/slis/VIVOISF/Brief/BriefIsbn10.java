package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefIsbn10Iterator theBrief = (BriefIsbn10Iterator)findAncestorWithClass(this, BriefIsbn10Iterator.class);
			pageContext.getOut().print(theBrief.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

