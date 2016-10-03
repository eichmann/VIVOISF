package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineAsinIterator theMagazine = (MagazineAsinIterator)findAncestorWithClass(this, MagazineAsinIterator.class);
			pageContext.getOut().print(theMagazine.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for asin tag ");
		}
		return SKIP_BODY;
	}
}

