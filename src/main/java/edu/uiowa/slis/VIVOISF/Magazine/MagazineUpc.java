package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineUpcIterator theMagazine = (MagazineUpcIterator)findAncestorWithClass(this, MagazineUpcIterator.class);
			pageContext.getOut().print(theMagazine.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for upc tag ");
		}
		return SKIP_BODY;
	}
}

