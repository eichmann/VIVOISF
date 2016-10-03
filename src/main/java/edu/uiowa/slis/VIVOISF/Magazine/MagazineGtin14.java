package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineGtin14Iterator theMagazine = (MagazineGtin14Iterator)findAncestorWithClass(this, MagazineGtin14Iterator.class);
			pageContext.getOut().print(theMagazine.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

