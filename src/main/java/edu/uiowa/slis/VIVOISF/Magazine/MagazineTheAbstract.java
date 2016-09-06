package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineTheAbstractIterator theMagazine = (MagazineTheAbstractIterator)findAncestorWithClass(this, MagazineTheAbstractIterator.class);
			pageContext.getOut().print(theMagazine.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

