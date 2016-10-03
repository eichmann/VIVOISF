package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineIdentifierIterator theMagazine = (MagazineIdentifierIterator)findAncestorWithClass(this, MagazineIdentifierIterator.class);
			pageContext.getOut().print(theMagazine.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for identifier tag ");
		}
		return SKIP_BODY;
	}
}

