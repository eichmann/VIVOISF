package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineCodenIterator theMagazine = (MagazineCodenIterator)findAncestorWithClass(this, MagazineCodenIterator.class);
			pageContext.getOut().print(theMagazine.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for coden tag ");
		}
		return SKIP_BODY;
	}
}

