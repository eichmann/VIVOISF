package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineUri currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineUriIterator theMagazine = (MagazineUriIterator)findAncestorWithClass(this, MagazineUriIterator.class);
			pageContext.getOut().print(theMagazine.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for uri tag ");
		}
		return SKIP_BODY;
	}
}

