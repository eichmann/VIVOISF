package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineIsbn10Iterator theMagazine = (MagazineIsbn10Iterator)findAncestorWithClass(this, MagazineIsbn10Iterator.class);
			pageContext.getOut().print(theMagazine.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

