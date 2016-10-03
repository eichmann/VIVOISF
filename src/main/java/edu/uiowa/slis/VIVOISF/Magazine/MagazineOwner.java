package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineOwnerIterator theMagazineOwnerIterator = (MagazineOwnerIterator)findAncestorWithClass(this, MagazineOwnerIterator.class);
			pageContext.getOut().print(theMagazineOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for owner tag ");
		}
		return SKIP_BODY;
	}
}

