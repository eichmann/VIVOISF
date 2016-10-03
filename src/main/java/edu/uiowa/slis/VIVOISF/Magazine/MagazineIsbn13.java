package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineIsbn13Iterator theMagazine = (MagazineIsbn13Iterator)findAncestorWithClass(this, MagazineIsbn13Iterator.class);
			pageContext.getOut().print(theMagazine.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

