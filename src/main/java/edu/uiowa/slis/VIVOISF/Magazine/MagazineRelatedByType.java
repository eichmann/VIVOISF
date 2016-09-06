package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineRelatedByIterator theMagazineRelatedByIterator = (MagazineRelatedByIterator)findAncestorWithClass(this, MagazineRelatedByIterator.class);
			pageContext.getOut().print(theMagazineRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

